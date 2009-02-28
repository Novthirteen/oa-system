/* =====================================================================
 *
 * Copyright (c) Atos Origin INFORMATION TECHNOLOGY All rights reserved.
 *
 * =====================================================================
 */

package com.aof.model.business.po;

import java.io.Serializable;

import com.aof.model.BaseAttachmentContent;

/**
 * �������po_attach���е�һ��(��file_content��)
 * 
 * @author nicebean
 * @version 1.0 (2005-12-14)
 */
public abstract class AbstractPurchaseOrderAttachmentContent extends BaseAttachmentContent implements Serializable {

    /** default constructor */
    public AbstractPurchaseOrderAttachmentContent() {
    }

    /** minimal constructor */
    public AbstractPurchaseOrderAttachmentContent(Integer id) {
        super(id);
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
        if (!(rhs instanceof PurchaseOrderAttachmentContent))
            return false;
        PurchaseOrderAttachmentContent that = (PurchaseOrderAttachmentContent) rhs;
        if (this.getId() != null)
            return this.getId().equals(that.getId());
        return that.getId() == null;
    }

}
