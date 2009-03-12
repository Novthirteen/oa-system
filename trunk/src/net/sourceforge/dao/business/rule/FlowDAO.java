/* =====================================================================
 *
 * Copyright (c) Sourceforge INFORMATION TECHNOLOGY All rights reserved.
 *
 * =====================================================================
 */

package net.sourceforge.dao.business.rule;

import java.util.List;
import java.util.Map;

import net.sourceforge.dao.DAO;
import net.sourceforge.model.business.rule.Flow;
import net.sourceforge.model.business.rule.FlowRule;
import net.sourceforge.model.business.rule.query.FlowQueryOrder;

/**
 * �������Flow�Ľӿ�
 * 
 * @author nicebean
 * @version 1.0 (2005-11-14)
 */
public interface FlowDAO extends DAO {
    /**
     * �����ݿ�ȡ��ָ��id��Flow���󣬲��ҳ�ʼ������rules����
     * 
     * @param id
     *            Flow�����id
     * @param loadLazyProperty
     *            true��ʾ��ʼ��rules���ϣ�false�򲻳�ʼ��
     * @return Flow����
     */
    public Flow getFlow(Integer id, boolean loadLazyProperties);

    /**
     * ����Flow�������ݿ�
     * 
     * @param f
     *            Ҫ�����Flow����
     * @return ������Flow����
     */
    public Flow saveFlow(Flow f);

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
     * ȡ������ָ��id��Flow���������FlowRule
     * 
     * @param flowId
     *            Flow�����id
     * @return FlowRule������б�������seq��������
     */
    public List getRulesForFlow(Integer flowId);

    /**
     * ����FlowRule�������ݿ�
     * 
     * @param fr
     *            Ҫ������FlowRule����
     * @return ������FlowRule����
     */
    public void saveFlowRule(FlowRule fr);

    /**
     * �����ݿ�ɾ��ָ����FlowRule����
     * 
     * @param fr
     *            Ҫɾ����FlowRule����
     */
    public void removeFlowRule(FlowRule fr);
}
