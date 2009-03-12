/* =====================================================================
 *
 * Copyright (c) Sourceforge INFORMATION TECHNOLOGY All rights reserved.
 *
 * =====================================================================
 */

package net.sourceforge.model.business.po;

import java.io.Serializable;

import net.sourceforge.model.business.BaseRecharge;

/**
 * �������t_po_item_recharge���һ�м�¼
 */
public abstract class AbstractPurchaseOrderItemRecharge extends BaseRecharge implements Serializable {
    private PurchaseOrderItem purchaseOrderItem;

    /**
     * ȱʡ���캯��
     */
    public AbstractPurchaseOrderItemRecharge() {
    }

    /**
     * ���������Ĺ��캯��
     * 
     * @param id
     */
    public AbstractPurchaseOrderItemRecharge(Integer id) {
        this.setId(id);
    }

    /**
     * @return Returns the purchaseOrderItem.
     */
    public PurchaseOrderItem getPurchaseOrderItem() {
        return purchaseOrderItem;
    }

    /**
     * @param purchaseOrderItem
     *            The purchaseOrderItem to set.
     */
    public void setPurchaseOrderItem(PurchaseOrderItem purchaseOrderItem) {
        this.purchaseOrderItem = purchaseOrderItem;
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
        if (!(rhs instanceof PurchaseOrderItemRecharge))
            return false;
        PurchaseOrderItemRecharge that = (PurchaseOrderItemRecharge) rhs;
        if (this.getId() != null)
            return this.getId().equals(that.getId());
        return that.getId() == null;
    }

}
