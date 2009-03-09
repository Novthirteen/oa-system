/* =====================================================================
 *
 * Copyright (c) Atos Origin INFORMATION TECHNOLOGY All rights reserved.
 *
 * =====================================================================
 */

package com.aof.model.business.po;

import java.io.Serializable;

import com.aof.model.admin.User;

/**
 * �������po_approve���һ�м�¼
 */
public class PurchaseOrderApproveRequest extends AbstractPurchaseOrderApproveRequest implements Serializable {

    /**
     * ȱʡ���캯��
     */
    public PurchaseOrderApproveRequest() {
    }

    /**
     * ���������Ĺ��캯��
     * 
     * @param id
     * @param approver
     */
    public PurchaseOrderApproveRequest(String id, User approver) {
        super(id, approver);
    }

    /* Add customized code below */

}
