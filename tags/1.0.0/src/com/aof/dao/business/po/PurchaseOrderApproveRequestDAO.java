/* =====================================================================
 *
 * Copyright (c) Atos Origin INFORMATION TECHNOLOGY All rights reserved.
 *
 * =====================================================================
 */
package com.aof.dao.business.po;

import java.util.List;
import java.util.Map;

import com.aof.dao.business.BaseApproveRequestDAO;
import com.aof.model.admin.User;
import com.aof.model.business.po.PurchaseOrder;
import com.aof.model.business.po.PurchaseOrderApproveRequest;
import com.aof.model.business.po.query.PurchaseOrderApproveRequestQueryOrder;

/**
 * �������PurchaseOrderApproveRequest�Ľӿ�

 * @author nicebean
 * @version 1.0 (2005-12-22)
 */
public interface PurchaseOrderApproveRequestDAO extends BaseApproveRequestDAO {

    /**
     * �����ݿ�ȡ��ָ��approveRequestId��approver��PurchaseOrderApproveRequest
     * @param approveRequestId PurchaseOrderApproveRequest��approveRequestId
     * @param approver PurchaseOrderApproveRequest��approver
     * @return ����ָ����PurchaseOrderApproveRequest
     */
    public PurchaseOrderApproveRequest getPurchaseOrderApproveRequest(String approveRequestId, User approver);    
	
    /**
     * �����ݿ�ȡ��ָ��approveRequestId��PurchaseOrderApproveRequest�б�
     * @param approveRequestId PurchaseOrderApproveRequest��approveRequestId
     * @return ����ָ����PurchaseOrderApproveRequest�б�
     */
    public List getPurchaseOrderApproveRequestListByApproveRequestId(String approveRequestId); 
    
    /**
     * ���ط��ϲ�ѯ������PurchaseOrderApproveRequest�������
     * 
     * @param conditions
     *            ������ѯ����������ֵӳ���Map�����в�ѯ����Ӧ������PurchaseOrderApproveRequestQueryCondition���Ԥ���峣��
     * @return ���ϲ�ѯ������PurchaseOrderApproveRequest�������
     */
	public int getPurchaseOrderApproveRequestListCount(Map conditions);
	
    /**
     * ���ط��ϲ�ѯ������PurchaseOrderApproveRequest�����б�
     * 
     * @param conditions
     *            ������ѯ����������ֵӳ���Map�����в�ѯ����Ӧ������PurchaseOrderApproveRequestQueryCondition���Ԥ���峣��
     * @param pageNo
     *            �ڼ�ҳ����pageSizeΪҳ�Ĵ�С��pageSizeΪ-1ʱ���Ըò���
     * @param pageSize
     *            ҳ�Ĵ�С��-1��ʾ����ҳ
     * @param order
     *            ����������null��ʾ������
     * @param descend
     *            false��ʾ����true��ʾ����
     * @return ���ϲ�ѯ������PurchaseOrderApproveRequest�����б�
     */
    public List getPurchaseOrderApproveRequestList(Map conditions, int pageNo, int pageSize, PurchaseOrderApproveRequestQueryOrder order, boolean descend);

    /**
     * ����ָ����PurchaseOrderApproveRequest�������ݿ�
     * 
     * @param purchaseOrderApproveRequest
     *            Ҫ�����PurchaseOrderApproveRequest����
     * @return ������PurchaseOrderApproveRequest����
     */
    public PurchaseOrderApproveRequest insertPurchaseOrderApproveRequest(PurchaseOrderApproveRequest purchaseOrderApproveRequest);
    
    /**
     * ����ָ����PurchaseOrderApproveRequest�������ݿ�
     * 
     * @param purchaseOrderApproveRequest
     *            Ҫ���µ�PurchaseOrderApproveRequest����
     * @return ���º��PurchaseOrderApproveRequest����
     */
    public PurchaseOrderApproveRequest updatePurchaseOrderApproveRequest(PurchaseOrderApproveRequest purchaseOrderApproveRequest);

    /**
     * delete PurchaseOrderApproveRequest By PurchaseOrder
     * @param purchaseOrder
     */
    public void deletePurchaseOrderApproveRequestByPurchaseOrder(PurchaseOrder purchaseOrder);
    
}
