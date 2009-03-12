/* =====================================================================
 *
 * Copyright (c) Sourceforge INFORMATION TECHNOLOGY All rights reserved.
 *
 * =====================================================================
 */

package net.sourceforge.ruleengine;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Stack;

import net.sourceforge.utils.RWLock;
import com.shcnc.utils.BeanHelper;

/**
 * Rule Engine�е�Flow
 * 
 * @author nicebean
 * @version 1.0 (2005-11-15)
 */
public class EngineFlow {
    boolean canUse;

    ThreadLocal locking;

    private List rules;

    private RWLock lock;

    private Map externalIdToRules;

    /**
     * Ĭ�Ϲ��캯���� �����µ�FlowӦͨ��EngineWorkspaceʵ����createFlow���С�
     */
    EngineFlow() {
        canUse = false;
        locking = new ThreadLocal();
        rules = new ArrayList();
        lock = new RWLock();
        externalIdToRules = new HashMap();
    }

    /**
     * ɾ��Flow�е�����Rule��֮ǰӦ�õ���lockForUpdate()������Flow������
     * 
     */
    public void clearRules() {
        if (locking.get() == null)
            throw new RuntimeException("Lock flow before clear rules.");
        rules.clear();
        externalIdToRules.clear();
        canUse = false;
        for (Iterator itor = rules.iterator(); itor.hasNext();) {
            ((EngineRule) itor.next()).flow = null;
        }
    }

    /**
     * ���Rule��Flow��֮ǰӦ�õ���lockForUpdate()������Flow������
     * 
     * @param r
     *            Ҫ��ӵ�Rule
     */
    public void addRule(EngineRule r) {
        if (locking.get() == null)
            throw new RuntimeException("Lock flow before add rule.");
        rules.add(r);
        Object externalId = r.getExternalId();
        Set s = (Set) externalIdToRules.get(externalId);
        if (s == null) {
            s = new HashSet();
            externalIdToRules.put(externalId, s);
        }
        s.add(r);
        canUse = false;
    }

    /**
     * ��ȡ���ⲿId����������EngineRule
     * 
     * @param externalId
     *            �ⲿId
     * @return ��������ָ���ⲿId��EngineRule����
     */
    public Set getRulesByExternalId(Object externalId) {
        return (Set) externalIdToRules.get(externalId);
    }

    /**
     * Ϊ�˸��¶���ס��Flow ���ø÷������̱߳��뱣֤releaseLock()���Ժ�ִ�С�
     */
    public void lockForUpdate() {
        if (locking.get() != null)
            return;
        lock.getWriteLock();
        locking.set(Boolean.TRUE);
    }

    /**
     * ��ɸ��º��Flow����
     */
    public void releaseLock() {
        if (locking.get() == null)
            return;
        locking.set(null);
        lock.releaseLock();
    }

    private final int EXECUTE_RESULT_INIT = 0;
    private final int EXECUTE_RESULT_PASS = 1;
    private final int EXECUTE_RESULT_FAIL = 2;
    private final int EXECUTE_RESULT_TEMP_FAIL = 3;
    
    /**
     * ִ��Flow ���Flow֮ǰû����֤����������֤��֮���ں���Rule�й��޸ģ����Զ���֤����ȷ�ԡ� ֻ����֤ͨ����Flow����ִ�С�
     * 
     * @param target
     *            �ύ��Flow��Rule�Ƚϵ�Ŀ��
     * @return ִ�н��
     */
    public List execute(Object target) {
        if (locking.get() != null)
            throw new RuntimeException("Cannot execute rules when flow is locked.");
        lock.getReadLock();
        try {
            if (!canUse) {
                canUse = (validateRules(rules) == 0);
            }
            if (!canUse)
                throw new RuntimeException("Validate rules failed, cannot execute flow");

            if (target == null)
                throw new RuntimeException("Cannot execute flow on null target");

            List result = new ArrayList();
            EngineRule currentRule = (EngineRule) rules.get(0);
            while (currentRule != null) {
                int executeResult = EXECUTE_RESULT_INIT;
                for (Iterator itor = currentRule.getConditions().iterator(); itor.hasNext();) {
                    EngineCondition condition = (EngineCondition) itor.next();
                    Object ruleResult = null;
                    try {
                        ruleResult = BeanHelper.getBeanPropertyValue(target, condition.getCompareSource());
                    } catch (RuntimeException e) {
                        Throwable t = e.getCause();
                        if (t instanceof InvocationTargetException && ((InvocationTargetException)t).getTargetException() instanceof FailRuleWhenAllConditionThrowMeException) {
                            if (executeResult == EXECUTE_RESULT_INIT) {
                                executeResult = EXECUTE_RESULT_TEMP_FAIL;
                            }
                            continue;
                        }
                        throw e;
                    }
                    int comparePassCondition = condition.getComparePassCondition();
                    Object compareTarget = condition.getCompareTarget();
                    if (ruleResult == null) {
                        if (comparePassCondition == EngineCondition.COMPARE_PASS_CONDITION_EQUAL && compareTarget == null) {
                            executeResult = EXECUTE_RESULT_PASS;
                            continue;
                        }
                        if (comparePassCondition == EngineCondition.COMPARE_PASS_CONDITION_NOT_EQUAL && compareTarget != null) {
                            executeResult = EXECUTE_RESULT_PASS;
                            continue;
                        }
                    } else {
                        if (ruleResult instanceof Comparable) {
                            int compareResult = ((Comparable) ruleResult).compareTo(compareTarget);
                            switch (comparePassCondition) {
                            case EngineCondition.COMPARE_PASS_CONDITION_EQUAL:
                                if (compareResult == 0) {
                                    executeResult = EXECUTE_RESULT_PASS;
                                    continue;
                                }
                                break;
                            case EngineCondition.COMPARE_PASS_CONDITION_NOT_EQUAL:
                                if (compareResult != 0) {
                                    executeResult = EXECUTE_RESULT_PASS;
                                    continue;
                                }
                                break;
                            case EngineCondition.COMPARE_PASS_CONDITION_GREATER_EQUAL:
                                if (compareResult >= 0) {
                                    executeResult = EXECUTE_RESULT_PASS;
                                    continue;
                                }
                                break;
                            case EngineCondition.COMPARE_PASS_CONDITION_GREATER_THAN:
                                if (compareResult > 0) {
                                    executeResult = EXECUTE_RESULT_PASS;
                                    continue;
                                }
                                break;
                            case EngineCondition.COMPARE_PASS_CONDITION_LESS_EQUAL:
                                if (compareResult <= 0) {
                                    executeResult = EXECUTE_RESULT_PASS;
                                    continue;
                                }
                                break;
                            case EngineCondition.COMPARE_PASS_CONDITION_LESS_THAN:
                                if (compareResult < 0) {
                                    executeResult = EXECUTE_RESULT_PASS;
                                    continue;
                                }
                                break;
                            }
                        } else if (ruleResult instanceof Collection) {
                            switch (comparePassCondition) {
                            case EngineCondition.COMPARE_PASS_CONDITION_EQUAL:
                                boolean found = false;
                                for (Iterator itor2 = ((Collection)ruleResult).iterator(); itor2.hasNext();) {
                                    Object element = itor2.next();
                                    if (element == null) {
                                        if (compareTarget != null) continue;
                                    } else {
                                        if (!element.equals(compareTarget)) continue;
                                    }
                                    found = true;
                                    break;
                                }
                                if (found) {
                                    executeResult = EXECUTE_RESULT_PASS;
                                    continue;
                                }
                                break;
                            }
                        } else {
                            switch (comparePassCondition) {
                            case EngineCondition.COMPARE_PASS_CONDITION_EQUAL:
                                if (ruleResult.equals(compareTarget)) {
                                    executeResult = EXECUTE_RESULT_PASS;
                                    continue;
                                }
                                break;
                            case EngineCondition.COMPARE_PASS_CONDITION_NOT_EQUAL:
                                if (!ruleResult.equals(compareTarget)) {
                                    executeResult = EXECUTE_RESULT_PASS;
                                    continue;
                                }
                                break;
                            }
                        }
                    }
                    executeResult = EXECUTE_RESULT_FAIL;
                    break;
                }
                Object consequences = null;
                if (executeResult == EXECUTE_RESULT_PASS || executeResult == EXECUTE_RESULT_INIT) {
                    consequences = currentRule.getConsequencesPass();
                    currentRule = currentRule.nextRulePass;
                } else {
                    consequences = currentRule.getConsequencesFail();
                    currentRule = currentRule.nextRuleFail;
                }
                if (consequences != null) {
                    if (consequences instanceof Collection) {
                        result.addAll((Collection)consequences);
                    } else {
                        result.add(consequences);
                    }
                }
            }
            return result;
        } finally {
            lock.releaseLock();
        }
    }

    /**
     * ���rules�а����Ĺ��������Ƿ���ȷ
     * 
     * @param rules
     *            List contains Rule object
     * @return -1 loop found -2 bad rule seq -3 ruls is empty 0 pass
     */
    public static int validateRules(List rules) {
        int ruleCount = rules.size();
        if (ruleCount == 0)
            return -3;

        Stack stack = new Stack();
        EngineRule[] ruleArray = new EngineRule[ruleCount];
        ruleArray[0] = (EngineRule) rules.get(0);
        stack.push(ruleArray[0]);

        while (!stack.isEmpty()) {
            EngineRule r = (EngineRule) stack.pop();
            int nextSeq = r.getNextSeqPass();
            if (nextSeq > ruleCount - 1)
                return -2;
            if (nextSeq <= 0) {
                r.nextRulePass = null;
            } else {
                EngineRule nr = ruleArray[nextSeq];
                if (nr == null) {
                    nr = (EngineRule) rules.get(nextSeq);
                    ruleArray[nextSeq] = nr;
                    nr.inDegree = 1;
                    stack.push(nr);
                } else {
                    nr.inDegree++;
                }
                r.nextRulePass = nr;
            }

            nextSeq = r.getNextSeqFail();
            if (nextSeq > ruleCount - 1)
                return -2;
            if (nextSeq <= 0) {
                r.nextRuleFail = null;
            } else {
                EngineRule nr = ruleArray[nextSeq];
                if (nr == null) {
                    nr = (EngineRule) rules.get(nextSeq);
                    ruleArray[nextSeq] = nr;
                    nr.inDegree = 1;
                    stack.push(nr);
                } else {
                    nr.inDegree++;
                }
                r.nextRuleFail = nr;
            }
        }

        stack.push(ruleArray[0]);
        while (!stack.isEmpty()) {
            EngineRule r = (EngineRule) stack.pop();
            EngineRule nr = r.nextRulePass;
            if (nr != null) {
                nr.inDegree--;
                if (nr.inDegree == 0)
                    stack.push(nr);
            }
            nr = r.nextRuleFail;
            if (nr != null) {
                nr.inDegree--;
                if (nr.inDegree == 0)
                    stack.push(nr);
            }
        }

        for (int i = 1; i < ruleCount; i++) {
            EngineRule r = ruleArray[i];
            if (r != null) {
                if (r.inDegree > 0)
                    return -1;
            }
        }
        return 0;
    }

}
