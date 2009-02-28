/* =====================================================================
 *
 * Copyright (c) Atos Origin INFORMATION TECHNOLOGY All rights reserved.
 *
 * =====================================================================
 */

package com.aof.model.business;

import java.io.Serializable;

import com.aof.model.admin.User;

/**
 * �����������pr_authorized_purchaser���е�һ��
 * 
 * @author nicebean
 * @version 1.0 (2005-12-16)
 */
public abstract class BasePurchaser implements Serializable {
    /**
     * The cached hash code value for this instance. Settting to 0 triggers
     * re-calculation.
     */
    private int hashValue = 0;

    /** identifier field */
    private Integer id;

    /** persistent field */
    private User purchaser;

    /** default constructor */
    public BasePurchaser() {
    }

    /** minimal constructor */
    public BasePurchaser(Integer id) {
        setId(id);
    }

    /**
     * @return Returns the id.
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     *            The id to set.
     */
    protected void setId(Integer id) {
        this.hashValue = 0;
        this.id = id;
    }

    /**
     * @return Returns the purchaser.
     */
    public User getPurchaser() {
        return purchaser;
    }

    /**
     * @param purchaser
     *            The purchaser to set.
     */
    public void setPurchaser(User purchaser) {
        this.purchaser = purchaser;
    }

    /**
     * ��ͬ������Ӧ��ͬ��table������Ӧ��������ʵ���Լ���equals������
     * 
     * @param rhs
     * @return boolean
     */
    public abstract boolean equals(Object rhs);

    /**
     * Implementation of the hashCode method conforming to the Bloch pattern
     * with the exception of array properties (these are very unlikely primary
     * key types).
     * 
     * @return int
     */
    public int hashCode() {
        if (this.hashValue == 0) {
            int result = 17;
            int idValue = this.getId() == null ? 0 : this.getId().hashCode();
            result = result * 37 + idValue;
            this.hashValue = result;
        }
        return this.hashValue;
    }

}
