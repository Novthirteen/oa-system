/* =====================================================================
 *
 * Copyright (c) Atos Origin INFORMATION TECHNOLOGY All rights reserved.
 *
 * =====================================================================
 */
package com.aof.dao.business.ta;

import java.util.List;
import java.util.Map;

import com.aof.dao.business.BaseApproveRequestDAO;
import com.aof.model.admin.User;
import com.aof.model.business.ta.TravelApplicationApproveRequest;
import com.aof.model.business.ta.query.TravelApplicationApproveRequestQueryOrder;

/**
 * �������TravelApplicationApproveRequest�Ľӿ�
 * @author ych
 * @version 1.0 (Nov 18, 2005)
 */
public interface TravelApplicationApproveRequestDAO extends BaseApproveRequestDAO {

    /**
     * �����ݿ�ȡ��ָ��approveRequestId��approver��TravelApplicationApproveRequest
     * @param approveRequestId TravelApplicationApproveRequest��approveRequestId
     * @param approver TravelApplicationApproveRequest��approver
     * @return ����ָ����TravelApplicationApproveRequest
     */
    public TravelApplicationApproveRequest getTravelApplicationApproveRequest(String approveRequestId, User approver);    
	
    /**
     * �����ݿ�ȡ��ָ��approveRequestId��TravelApplicationApproveRequest�б�
     * @param approveRequestId TravelApplicationApproveRequest��approveRequestId
     * @return ����ָ����TravelApplicationApproveRequest�б�
     */
    public List getTravelApplicationApproveRequestListByApproveRequestId(String approveRequestId); 
    
    /**
     * ���ط��ϲ�ѯ������TravelApplicationApproveRequest�������
     * 
     * @param conditions
     *            ������ѯ����������ֵӳ���Map�����в�ѯ����Ӧ������TravelApplicationApproveRequestQueryCondition���Ԥ���峣��
     * @return ���ϲ�ѯ������TravelApplicationApproveRequest�������
     */
	public int getTravelApplicationApproveRequestListCount(Map conditions);
	
    /**
     * ���ط��ϲ�ѯ������TravelApplicationApproveRequest�����б�
     * 
     * @param conditions
     *            ������ѯ����������ֵӳ���Map�����в�ѯ����Ӧ������TravelApplicationApproveRequestQueryCondition���Ԥ���峣��
     * @param pageNo
     *            �ڼ�ҳ����pageSizeΪҳ�Ĵ�С��pageSizeΪ-1ʱ���Ըò���
     * @param pageSize
     *            ҳ�Ĵ�С��-1��ʾ����ҳ
     * @param order
     *            ����������null��ʾ������
     * @param descend
     *            false��ʾ����true��ʾ����
     * @return ���ϲ�ѯ������TravelApplicationApproveRequest�����б�
     */
    public List getTravelApplicationApproveRequestList(Map conditions, int pageNo, int pageSize, TravelApplicationApproveRequestQueryOrder order, boolean descend);

    /**
     * ����ָ����TravelApplicationApproveRequest�������ݿ�
     * 
     * @param travelApplicationApproveRequest
     *            Ҫ�����TravelApplicationApproveRequest����
     * @return ������TravelApplicationApproveRequest����
     */
    public TravelApplicationApproveRequest insertTravelApplicationApproveRequest(TravelApplicationApproveRequest travelApplicationApproveRequest);
    
    /**
     * ����ָ����TravelApplicationApproveRequest�������ݿ�
     * 
     * @param travelApplicationApproveRequest
     *            Ҫ���µ�TravelApplicationApproveRequest����
     * @return ���º��TravelApplicationApproveRequest����
     */
    public TravelApplicationApproveRequest updateTravelApplicationApproveRequest(TravelApplicationApproveRequest travelApplicationApproveRequest);

}
