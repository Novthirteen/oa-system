/* =====================================================================
 *
 * Copyright (c) Sourceforge INFORMATION TECHNOLOGY All rights reserved.
 *
 * =====================================================================
 */
package net.sourceforge.service.business.ta;

import java.util.List;
import java.util.Map;

import net.sourceforge.model.admin.User;
import net.sourceforge.model.business.ta.TravelApplication;
import net.sourceforge.model.business.ta.TravelApplicationApproveRequest;
import net.sourceforge.model.business.ta.query.TravelApplicationApproveRequestQueryOrder;

/**
 * �������TravelApplicationApproveRequest�Ľӿ�
 * 
 * @author ych
 * @version 1.0 (Nov 17, 2005)
 */
public interface TravelApplicationApproveRequestManager {

    /**
     * �����ݿ�ȡ��ָ��approveRequestId��approver��TravelApplicationApproveRequest
     * 
     * @param approveRequestId
     *            TravelApplicationApproveRequest��approveRequestId
     * @param approver
     *            TravelApplicationApproveRequest��approver
     * @return ����ָ����TravelApplicationApproveRequest
     */
    public TravelApplicationApproveRequest getTravelApplicationApproveRequest(String approveRequestId, User approver);

    /**
     * �����ݿ�ȡ��ָ��approveRequestId��TravelApplicationApproveRequest�б�
     * 
     * @param approveRequestId
     *            TravelApplicationApproveRequest��approveRequestId
     * @return ����ָ����TravelApplicationApproveRequest�б�
     */
    public List getTravelApplicationApproveRequestListByApproveRequestId(String approveRequestId);

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

    /**
     * ���ط��ϲ�ѯ������TravelApplicationApproveRequest�������
     * 
     * @param conditions
     *            ������ѯ����������ֵӳ���Map�����в�ѯ����Ӧ������TravelApplicationApproveRequestQueryCondition���Ԥ���峣��
     * @return ���ϲ�ѯ������TravelApplicationApproveRequest�������
     */
    public int getTravelApplicationApproveRequestListCount(Map condtions);

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
    public List getTravelApplicationApproveRequestList(Map condtions, int pageNo, int pageSize, TravelApplicationApproveRequestQueryOrder order, boolean descend);

    /**
     * ͨ��ָ����TravelApplicationApproveRequest
     * 
     * @param travelApplicationApproveRequest
     *            ������TravelApplicationApproveRequest
     */
    public void approveTravelApplicationApproveRequest(TravelApplicationApproveRequest travelApplicationApproveRequest,User user);

    /**
     * ����ָ����TravelApplicationApproveRequest
     * 
     * @param travelApplicationApproveRequest
     *            ������TravelApplicationApproveRequest
     */
    public void rejectTravelApplicationApproveRequest(TravelApplicationApproveRequest travelApplicationApproveRequest,User user);

    /**
     * ͨ��ָ����TravelApplicationApproveRequest������TravelApplication
     * 
     * @param travelApplicationApproveRequest
     *            ������TravelApplicationApproveRequest
     * @param travelApplication
     *            Ҫ�����TravelApplication
     */
    public void approveTravelApplicationApproveRequestAndUpdateTravelApplication(TravelApplicationApproveRequest travelApplicationApproveRequest,
            TravelApplication travelApplication,User user);
}
