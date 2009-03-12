/* =====================================================================
 *
 * Copyright (c) Sourceforge INFORMATION TECHNOLOGY All rights reserved.
 *
 * =====================================================================
 */
package net.sourceforge.dao.business.pr;

import java.util.List;
import java.util.Map;

import net.sourceforge.dao.business.BaseApproveRequestDAO;
import net.sourceforge.model.admin.User;
import net.sourceforge.model.business.pr.PurchaseRequest;
import net.sourceforge.model.business.pr.PurchaseRequestApproveRequest;
import net.sourceforge.model.business.pr.query.PurchaseRequestApproveRequestQueryOrder;

/**
 * �������PurchaseRequestApproveRequest�Ľӿ�

 * @author nicebean
 * @version 1.0 (2005-12-15)
 */
public interface PurchaseRequestApproveRequestDAO extends BaseApproveRequestDAO {

    /**
     * �����ݿ�ȡ��ָ��approveRequestId��approver��PurchaseRequestApproveRequest
     * @param approveRequestId PurchaseRequestApproveRequest��approveRequestId
     * @param approver PurchaseRequestApproveRequest��approver
     * @return ����ָ����PurchaseRequestApproveRequest
     */
    public PurchaseRequestApproveRequest getPurchaseRequestApproveRequest(String approveRequestId, User approver);    
	
    /**
     * �����ݿ�ȡ��ָ��approveRequestId��PurchaseRequestApproveRequest�б�
     * @param approveRequestId PurchaseRequestApproveRequest��approveRequestId
     * @return ����ָ����PurchaseRequestApproveRequest�б�
     */
    public List getPurchaseRequestApproveRequestListByApproveRequestId(String approveRequestId); 
    
    /**
     * ���ط��ϲ�ѯ������PurchaseRequestApproveRequest�������
     * 
     * @param conditions
     *            ������ѯ����������ֵӳ���Map�����в�ѯ����Ӧ������PurchaseRequestApproveRequestQueryCondition���Ԥ���峣��
     * @return ���ϲ�ѯ������PurchaseRequestApproveRequest�������
     */
	public int getPurchaseRequestApproveRequestListCount(Map conditions);
	
    /**
     * ���ط��ϲ�ѯ������PurchaseRequestApproveRequest�����б�
     * 
     * @param conditions
     *            ������ѯ����������ֵӳ���Map�����в�ѯ����Ӧ������PurchaseRequestApproveRequestQueryCondition���Ԥ���峣��
     * @param pageNo
     *            �ڼ�ҳ����pageSizeΪҳ�Ĵ�С��pageSizeΪ-1ʱ���Ըò���
     * @param pageSize
     *            ҳ�Ĵ�С��-1��ʾ����ҳ
     * @param order
     *            ����������null��ʾ������
     * @param descend
     *            false��ʾ����true��ʾ����
     * @return ���ϲ�ѯ������PurchaseRequestApproveRequest�����б�
     */
    public List getPurchaseRequestApproveRequestList(Map conditions, int pageNo, int pageSize, PurchaseRequestApproveRequestQueryOrder order, boolean descend);

    /**
     * ����ָ����PurchaseRequestApproveRequest�������ݿ�
     * 
     * @param purchaseRequestApproveRequest
     *            Ҫ�����PurchaseRequestApproveRequest����
     * @return ������PurchaseRequestApproveRequest����
     */
    public PurchaseRequestApproveRequest insertPurchaseRequestApproveRequest(PurchaseRequestApproveRequest purchaseRequestApproveRequest);
    
    /**
     * ����ָ����PurchaseRequestApproveRequest�������ݿ�
     * 
     * @param purchaseRequestApproveRequest
     *            Ҫ���µ�PurchaseRequestApproveRequest����
     * @return ���º��PurchaseRequestApproveRequest����
     */
    public PurchaseRequestApproveRequest updatePurchaseRequestApproveRequest(PurchaseRequestApproveRequest purchaseRequestApproveRequest);

    /**
     * 
     * @param purchaseRequest
     */
    public void deletePurchaseRequestApproveRequestByPurchaseRequest(PurchaseRequest purchaseRequest);
    
}
