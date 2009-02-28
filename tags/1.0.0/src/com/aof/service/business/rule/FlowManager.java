/* =====================================================================
 *
 * Copyright (c) Atos Origin INFORMATION TECHNOLOGY All rights reserved.
 *
 * =====================================================================
 */
package com.aof.service.business.rule;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.aof.model.business.Approvable;
import com.aof.model.business.Controllable;
import com.aof.model.business.Notifiable;
import com.aof.model.business.Purchasable;
import com.aof.model.business.rule.Flow;
import com.aof.model.business.rule.FlowRule;
import com.aof.model.business.rule.query.FlowQueryOrder;
import com.aof.model.metadata.RuleType;
import com.aof.ruleengine.EngineRule;

/**
 * �������Flow�Ľӿ�
 * 
 * @author nicebean
 * @version 1.0 (2005-11-10)
 */
public interface FlowManager {
    /**
     * �����ݿ�ȡ��ָ��id��Flow����
     * 
     * @param id
     *            Flow�����id
     * @return Flow����
     */
    public Flow getFlow(Integer id);

    /**
     * �����ݿ�ȡ��ָ��id��Flow���󣬲��ҳ�ʼ������rules����
     * 
     * @param id
     *            Flow�����id
     * @param loadLazyProperty
     *            true��ʾ��ʼ��rules���ϣ�false�򲻳�ʼ��
     * @return Flow����
     */
    public Flow getFlow(Integer id, boolean loadLazyProperty);

    /**
     * ����Flow�������ݿ�
     * 
     * @param f
     *            Ҫ�����Flow����
     * @return ����Flow��������顣
     *         ���ܺ���1��2��Ԫ�أ����е�һ��Ԫ���Ǳ��浽���ݿ��Flow���󣬵ڶ���Ԫ������һ����Ӱ���Flow����
     *         ���籣��һ��״̬��ENABLED��Flow����ʱ���Ὣ���ݿ������е���һ��״̬ΪENABLED��Flow��ΪDISABLED��
     *         ���û��Ӱ������Flow�������齫ֻ����һ��Ԫ�ء�
     */
    public Flow[] saveFlow(Flow f);

    /**
     * ����Flow�������ص�FlowRule���󼯺ϵ����ݿ�
     * 
     * @param f
     *            Ҫ�����Flow����
     * @param flowRules
     *            Ҫ�����FlowRule���󼯺ϣ��ò���Ϊnullʱ�ȼ���saveFlow(Flow f)
     * @return ����Flow��������顣
     *         ���ܺ���1��2��Ԫ�أ����е�һ��Ԫ���Ǳ��浽���ݿ��Flow���󣬵ڶ���Ԫ������һ����Ӱ���Flow����
     *         ���籣��һ��״̬��ENABLED��Flow����ʱ���Ὣ���ݿ������е���һ��״̬ΪENABLED��Flow��ΪDISABLED��
     *         ���û��Ӱ������Flow�������齫ֻ����һ��Ԫ�ء�
     */
    public Flow[] saveFlow(Flow f, Set flowRules);

    /**
     * �����ݿ�ɾ��ָ��id��Flow����
     * 
     * @param id
     *            Flow�����id
     */
    public void removeFlow(Integer id);

    /**
     * ���ط��ϲ�ѯ������Flow�������
     * 
     * @param conditions
     *            ������ѯ����������ֵӳ���Map�����в�ѯ����Ӧ������FlowQueryCondition���Ԥ���峣��
     * @return ���ϲ�ѯ������Flow�������
     */
    public int getFlowListCount(Map conditions);

    /**
     * ���ط��ϲ�ѯ������Flow�����б�
     * 
     * @param conditions
     *            ������ѯ����������ֵӳ���Map�����в�ѯ����Ӧ������FlowQueryCondition���Ԥ���峣��
     * @param pageNo
     *            �ڼ�ҳ����pageSizeΪҳ�Ĵ�С��pageSizeΪ-1ʱ���Ըò���
     * @param pageSize
     *            ҳ�Ĵ�С��-1��ʾ����ҳ
     * @param order
     *            ����������null��ʾ������
     * @param descend
     *            false��ʾ����true��ʾ����
     * @return ���ϲ�ѯ������Flow�����б�
     */
    public List getFlowList(Map conditions, int pageNo, int pageSize, FlowQueryOrder order, boolean descend);

    /**
     * ����ָ��Site�������״̬Ϊ���õ�Flow����
     * 
     * @param siteId
     *            ָ��Site��id
     * @param type
     *            Flow���
     * @return Flow�������û�з��������ģ�����null
     */
    public Flow getSiteEnabledFlow(Integer siteId, RuleType type);

    /**
     * ���flowRules�а����Ĺ��������Ƿ���ȷ
     * 
     * @param flowRules
     *            ����FlowRule����ļ���, �ü��ϵ�Iterator����������ġ�
     * @return -1: ����ȷ�����ֻ�· -2:
     *         ����ȷ�������д��ڷǷ���Seqֵ�����ڶ����nextSeqPass��nextSeqFailֵ���ڵ��ڼ��ϵ�size -3:
     *         ����ȷ�������ǿյ� 0: ��ȷ�����ͨ��
     */
    public int validateRules(Collection flowRules);

    /**
     * ΪFlowRule��������Rule Engine��EngineRule����
     * 
     * @param fr
     *            FlowRule����
     * @return ������EngineRule����
     */
    public EngineRule createEngineRuleForFlowRule(FlowRule fr);

    /**
     * Ϊָ����site��Flow�����EngineFlow��
     * �÷���ʹָ����Flow���µ�����״̬���������ݿ���������ݼ����ܴ����µ�EngineFlowҲ����ɾ�����е�EngineFlow
     * 
     * @param siteId
     *            Site�����Id
     * @param rt
     *            Flow���
     */
    public void constructEngineFlow(Integer siteId, RuleType rt);

    /**
     * Ϊ�����Ķ���ִ������Flow��������Ӧ�Ľ��
     * 
     * @param target
     *            �ύ��Flow��Rule�Ƚϵ�Ŀ�꣬Ŀ��Ӧ��ʵ����Approvable�ӿ�
     * @return ����target�Ĳ�ͬ��������Ӧ��ApproveRequest�����б�
     * @throws ExecuteFlowEmptyResultException
     *             ִ�н��Ϊ��ʱ�׳����쳣
     * @throws NoAvailableFlowToExecuteException
     *             û�п���ִ�е�Flowʱ�׳����쳣
     */
    public List executeApproveFlow(Approvable target) throws ExecuteFlowEmptyResultException, NoAvailableFlowToExecuteException;

    /**
     * Ϊ�����Ķ���ִ�вɹ�Flow��������Ӧ�Ľ��
     * 
     * @param target
     *            �ύ��Flow��Rule�Ƚϵ�Ŀ�꣬Ŀ��Ӧ��ʵ����Controllable�ӿ�
     * @return ����target�Ĳ�ͬ��������Ӧ��Purchaser�����б�
     * @throws ExecuteFlowEmptyResultException
     *             ִ�н��Ϊ��ʱ�׳����쳣
     * @throws NoAvailableFlowToExecuteException
     *             û�п���ִ�е�Flowʱ�׳����쳣
     */
    public List executePurchaseFlow(Purchasable target) throws ExecuteFlowEmptyResultException, NoAvailableFlowToExecuteException;

    /**
     * Ϊ�����Ķ���ִ�����Flow��������Ӧ�Ľ��
     * 
     * @param target
     *            �ύ��Flow��Rule�Ƚϵ�Ŀ�꣬Ŀ��Ӧ��ʵ����Controllable�ӿ�
     * @return true��ʾ���ͨ����false��ʾ��ͨ��
     * @throws ExecuteFlowEmptyResultException
     *             ִ�н��Ϊ��ʱ�׳����쳣
     * @throws NoAvailableFlowToExecuteException
     *             û�п���ִ�е�Flowʱ�׳����쳣
     */
    public boolean executeControlFlow(Controllable target) throws NoAvailableFlowToExecuteException;

    /**
     * Ϊ�����Ķ���ִ��֪ͨFlow
     * 
     * @param target
     *            �ύ��Flow��Rule�Ƚϵ�Ŀ�꣬Ŀ��Ӧ��ʵ����Notifiable�ӿ�
     */
    public void executeNotifyFlow(Notifiable target);
    
    public void saveFlowRules(Set flowRuleSet);
}
