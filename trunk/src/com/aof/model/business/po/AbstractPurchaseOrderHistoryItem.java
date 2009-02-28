/* =====================================================================
 *
 * Copyright (c) Atos Origin INFORMATION TECHNOLOGY All rights reserved.
 *
 * =====================================================================
 */

package com.aof.model.business.po;

import java.io.Serializable;

/**
 * �������po_item_history���һ�м�¼
 */
public abstract class AbstractPurchaseOrderHistoryItem extends BasePurchaseOrderItem implements Serializable {

    private PurchaseOrderHistory purchaseOrderHistory;

    /**
     * ȱʡ���캯��
     */
    public AbstractPurchaseOrderHistoryItem() {
    }

    /**
     * ���������Ĺ��캯��
     * 
     * @param id
     */
    public AbstractPurchaseOrderHistoryItem(Integer id) {
        this.setId(id);
    }

    /**
     * @return Returns the purchaseOrderHistory.
     */
    public PurchaseOrderHistory getPurchaseOrderHistory() {
        return purchaseOrderHistory;
    }

    /**
     * @param purchaseOrderHistory
     *            The purchaseOrderHistory to set.
     */
    public void setPurchaseOrderHistory(PurchaseOrderHistory purchaseOrderHistory) {
        this.purchaseOrderHistory = purchaseOrderHistory;
    }

    /**
     * Implementation of the equals comparison on the basis of equality of the
     * primary key values.
     * 
     * @param rhs
     * @return boolean
     */
    public boolean equals(Object rhs) {
        if (rhs == null)
            return false;
        if (this == rhs)
            return true;
        if (!(rhs instanceof PurchaseOrderHistoryItem))
            return false;
        PurchaseOrderHistoryItem that = (PurchaseOrderHistoryItem) rhs;
        if (this.getId() != null)
            return this.getId().equals(that.getId());
        return that.getId() == null;
    }

}
