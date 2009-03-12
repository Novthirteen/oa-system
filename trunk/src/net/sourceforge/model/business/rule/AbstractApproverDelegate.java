/* =====================================================================
 *
 * Copyright (c) Sourceforge INFORMATION TECHNOLOGY All rights reserved.
 *
 * =====================================================================
 */

/*
 * WARNING: DO NOT EDIT THIS FILE. This is a generated file that is synchronized
 * by MyEclipse Hibernate tool integration.
 *
 * Created Thu Sep 22 15:04:41 CST 2005 by MyEclipse Hibernate Tool.
 */
package net.sourceforge.model.business.rule;

import java.io.Serializable;
import java.util.Date;

import net.sourceforge.model.admin.User;
import net.sourceforge.model.metadata.ApproverDelegateType;

/**
 * A class that represents a row in the t_approver_delegate table. You can
 * customize the behavior of this class by editing the class,
 * {@link ApproverDelegate()}. WARNING: DO NOT EDIT THIS FILE. This is a
 * generated file that is synchronized by MyEclipse Hibernate tool integration.
 */
public abstract class AbstractApproverDelegate implements Serializable {
    /**
     * The cached hash code value for this instance. Settting to 0 triggers
     * re-calculation.
     */
    private int hashValue = 0;

    /** The composite primary key value. */
    private Integer id;

    private ApproverDelegateType type;

    private User originalApprover;

    private User delegateApprover;

    private Date fromDate;

    private Date toDate;

    /**
     * Simple constructor of AbstractApproverDelegate instances.
     */
    public AbstractApproverDelegate() {
    }

    /**
     * Constructor of AbstractApproverDelegate instances given a simple primary key.
     * 
     * @param id
     */
    public AbstractApproverDelegate(Integer id) {
        this.setId(id);
    }

    /**
     * Return the simple primary key value that identifies this object.
     * 
     * @return Integer
     */
    public Integer getId() {
        return id;
    }

    /**
     * Set the simple primary key value that identifies this object.
     * 
     * @param id
     */
    public void setId(Integer id) {
        this.hashValue = 0;
        this.id = id;
    }


    /**
     * @return Returns the delegateApprover.
     */
    public User getDelegateApprover() {
        return delegateApprover;
    }

    /**
     * @param delegateApprover The delegateApprover to set.
     */
    public void setDelegateApprover(User delegateApprover) {
        this.delegateApprover = delegateApprover;
    }

    /**
     * @return Returns the fromDate.
     */
    public Date getFromDate() {
        return fromDate;
    }

    /**
     * @param fromDate The fromDate to set.
     */
    public void setFromDate(Date fromDate) {
        this.fromDate = fromDate;
    }

    /**
     * @return Returns the originalApprover.
     */
    public User getOriginalApprover() {
        return originalApprover;
    }

    /**
     * @param originalApprover The originalApprover to set.
     */
    public void setOriginalApprover(User originalApprover) {
        this.originalApprover = originalApprover;
    }

    /**
     * @return Returns the toDate.
     */
    public Date getToDate() {
        return toDate;
    }

    /**
     * @param toDate The toDate to set.
     */
    public void setToDate(Date toDate) {
        this.toDate = toDate;
    }

    /**
     * @return Returns the type.
     */
    public ApproverDelegateType getType() {
        return type;
    }

    /**
     * @param type The type to set.
     */
    public void setType(ApproverDelegateType type) {
        this.type = type;
    }

    /**
     * Implementation of the equals comparison on the basis of equality of the
     * primary key values.
     * 
     * @param rhs
     * @return boolean
     */
    public boolean equals(Object rhs) {
        if (rhs == null) return false;
        if (this == rhs) return true;
        if (!(rhs instanceof ApproverDelegate)) return false;
        ApproverDelegate that = (ApproverDelegate) rhs;
        if (this.getId() != null) return this.getId().equals(that.getId());
        return that.getId() == null;
    }

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
            int siteIdValue = this.getId() == null ? 0 : this.getId().hashCode();
            result = result * 37 + siteIdValue;
            this.hashValue = result;
        }
        return this.hashValue;
    }
}
