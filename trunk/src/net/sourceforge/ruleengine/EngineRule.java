/* =====================================================================
 *
 * Copyright (c) Sourceforge INFORMATION TECHNOLOGY All rights reserved.
 *
 * =====================================================================
 */

package net.sourceforge.ruleengine;

import java.util.ArrayList;
import java.util.List;

/**
 * Rule Engine�е�Rule
 * 
 * @author nicebean
 * @version 1.0 (2005-11-15)
 */
public class EngineRule {

    private Object externalId;

    private int nextSeqPass;

    private int nextSeqFail;

    private List conditions;

    private Object consequencesPass;

    private Object consequencesFail;

    int inDegree;

    EngineRule nextRulePass;

    EngineRule nextRuleFail;

    EngineFlow flow;

    /**
     * ���캯��
     * 
     * @param externalId
     *            �͸�EngineRule��Ӧ���ⲿId����¼�ⲿId�Ա����ⲿRule�����仯ʱ����ȷ����ЩEngineRule��Ҫ����
     */
    public EngineRule(Object externalId) {
        this.externalId = externalId;
        conditions = new ArrayList();
        nextSeqPass = -1;
        nextSeqFail = -1;
        flow = null;
    }

    /**
     * ȡ�ø�EngineRule��Ӧ���ⲿId
     * 
     * @return �ⲿId
     */
    public Object getExternalId() {
        return externalId;
    }

    /**
     * ɾ�����е�Condition
     * 
     */
    public void clearConditions() {
        if (flow != null && flow.locking.get() == null)
            throw new RuntimeException("Lock flow before clear rule condition.");
        conditions.clear();
    }

    /**
     * ���Condition��Rule
     * 
     * @param compareSource
     *            ������target�õ������ȽϵĽ����property�ַ���
     * @param comparePassCondition
     *            �Ƚ�ͨ����������Ӧ��ȡֵΪEngineConditionԤ����ĳ���
     * @param compareTarget
     *            �ȽϵĶ���
     */
    public void addCondition(String compareSource, int comparePassCondition, Object compareTarget) {
        if (flow != null && flow.locking.get() == null)
            throw new RuntimeException("Lock flow before add rule condition.");
        EngineCondition condition = new EngineCondition(compareSource, comparePassCondition, compareTarget);
        conditions.add(condition);
    }

    /**
     * @return Returns the conditions.
     */
    List getConditions() {
        return conditions;
    }

    /**
     * @return Returns the consequencesPass.
     */
    Object getConsequencesPass() {
        return consequencesPass;
    }

    /**
     * @param consequencesPass
     *            The consequencesPass to set.
     */
    public void setConsequencesPass(Object consequencesPass) {
        if (flow != null && flow.locking.get() == null)
            throw new RuntimeException("Lock flow before change rule consequence.");
        this.consequencesPass = consequencesPass;
    }

    /**
     * @return Returns the consequencesFail.
     */
    public Object getConsequencesFail() {
        return consequencesFail;
    }

    /**
     * @param consequencesFail
     *            The consequencesFail to set.
     */
    public void setConsequencesFail(Object consequencesFail) {
        if (flow != null && flow.locking.get() == null)
            throw new RuntimeException("Lock flow before change rule consequence.");
        this.consequencesFail = consequencesFail;
    }

    /**
     * @return Returns the nextSeqFail.
     */
    public int getNextSeqFail() {
        return nextSeqFail;
    }

    /**
     * @param nextSeqFail
     *            The nextSeqFail to set.
     */
    public void setNextSeqFail(int nextSeqFail) {
        if (flow != null && flow.locking.get() == null)
            throw new RuntimeException("Lock flow before change next seq when fail.");
        if (this.nextSeqFail != nextSeqFail) {
            this.nextSeqFail = nextSeqFail;
            if (flow != null)
                flow.canUse = false;
        }
    }

    /**
     * @return Returns the nextSeqPass.
     */
    public int getNextSeqPass() {
        return nextSeqPass;
    }

    /**
     * @param nextSeqPass
     *            The nextSeqPass to set.
     */
    public void setNextSeqPass(int nextSeqPass) {
        if (flow != null && flow.locking.get() == null)
            throw new RuntimeException("Lock flow before change next seq when pass.");
        if (this.nextSeqPass != nextSeqPass) {
            this.nextSeqPass = nextSeqPass;
            if (flow != null)
                flow.canUse = false;
        }
    }

}
