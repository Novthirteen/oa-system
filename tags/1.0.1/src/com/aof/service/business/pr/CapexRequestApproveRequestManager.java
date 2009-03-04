/* =====================================================================
 *
 * Copyright (c) Atos Origin INFORMATION TECHNOLOGY All rights reserved.
 *
 * =====================================================================
 */
package com.aof.service.business.pr;

import java.util.List;
import java.util.Map;

import com.aof.model.admin.User;
import com.aof.model.business.pr.CapexRequest;
import com.aof.model.business.pr.CapexRequestApproveRequest;
import com.aof.model.business.pr.query.CapexRequestApproveRequestQueryOrder;

/**
 * �������CapexRequestApproveRequest�Ľӿ�
 *
 * @author nicebean
 * @version 1.0 (2005-12-8)
 */
public interface CapexRequestApproveRequestManager {

    /**
     * �����ݿ�ȡ��ָ��approveRequestId��approver��CapexRequestApproveRequest
     * @param approveRequestId CapexRequestApproveRequest��approveRequestId
     * @param approver CapexRequestApproveRequest��approver
     * @return ����ָ����CapexRequestApproveRequest
     */
    public CapexRequestApproveRequest getCapexRequestApproveRequest(String approveRequestId, User approver);
    
    /**
     * �����ݿ�ȡ��ָ��approveRequestId��CapexRequestApproveRequest�б�
     * @param approveRequestId CapexRequestApproveRequest��approveRequestId
     * @return ����ָ����CapexRequestApproveRequest�б�
     */
    public List getCapexRequestApproveRequestListByApproveRequestId(String approveRequestId);

    /**
     * ����ָ����CapexRequestApproveRequest�������ݿ�
     * 
     * @param capexRequestApproveRequest
     *            Ҫ�����CapexRequestApproveRequest����
     * @return ������CapexRequestApproveRequest����
     */
    public CapexRequestApproveRequest insertCapexRequestApproveRequest(CapexRequestApproveRequest capexRequestApproveRequest);
    
    /**
     * ����ָ����CapexRequestApproveRequest�������ݿ�
     * 
     * @param capexRequestApproveRequest
     *            Ҫ���µ�CapexRequestApproveRequest����
     * @return ���º��CapexRequestApproveRequest����
     */
    public CapexRequestApproveRequest updateCapexRequestApproveRequest(CapexRequestApproveRequest capexRequestApproveRequest);

    /**
     * ���ط��ϲ�ѯ������CapexRequestApproveRequest�������
     * 
     * @param conditions
     *            ������ѯ����������ֵӳ���Map�����в�ѯ����Ӧ������CapexRequestApproveRequestQueryCondition���Ԥ���峣��
     * @return ���ϲ�ѯ������CapexRequestApproveRequest�������
     */
    public int getCapexRequestApproveRequestListCount(Map condtions);

    /**
     * ���ط��ϲ�ѯ������CapexRequestApproveRequest�����б�
     * 
     * @param conditions
     *            ������ѯ����������ֵӳ���Map�����в�ѯ����Ӧ������CapexRequestApproveRequestQueryCondition���Ԥ���峣��
     * @param pageNo
     *            �ڼ�ҳ����pageSizeΪҳ�Ĵ�С��pageSizeΪ-1ʱ���Ըò���
     * @param pageSize
     *            ҳ�Ĵ�С��-1��ʾ����ҳ
     * @param order
     *            ����������null��ʾ������
     * @param descend
     *            false��ʾ����true��ʾ����
     * @return ���ϲ�ѯ������CapexRequestApproveRequest�����б�
     */
    public List getCapexRequestApproveRequestList(Map condtions, int pageNo, int pageSize, CapexRequestApproveRequestQueryOrder order, boolean descend);
    
    /**
     * ͨ��ָ����CapexRequestApproveRequest
     * @param capexRequestApproveRequest ������CapexRequestApproveRequest
     */
    public void approveCapexRequestApproveRequest(CapexRequestApproveRequest capexRequestApproveRequest);
    
    /**
     * �ܾ�ָ����CapexRequestApproveRequest
     * @param capexRequestApproveRequest ������CapexRequestApproveRequest
     */
    public void rejectCapexRequestApproveRequest(CapexRequestApproveRequest capexRequestApproveRequest);

    /**
     * ͨ��ָ����CapexRequestApproveRequest������CapexRequest
     * @param capexRequestApproveRequest     ������CapexRequestApproveRequest
     * @param capexRequest                   Ҫ�����CapexRequest
     * @param capexRequestItemList
     */
    public void approveCapexRequestApproveRequestAndUpdateCapexRequest(CapexRequestApproveRequest capexRequestApproveRequest, CapexRequest capexRequest, List capexRequestItemList);
    
    
}
