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
 * Created Fri Sep 23 18:15:32 CST 2005 by MyEclipse Hibernate Tool.
 */
package net.sourceforge.model.admin;

import java.io.Serializable;

/**
 * A class that represents a row in the t_user_role table. You can customize
 * the behavior of this class by editing the class, {@link UserRole()}.
 * WARNING: DO NOT EDIT THIS FILE. This is a generated file that is synchronized
 * by MyEclipse Hibernate tool integration.
 */
public abstract class AbstractUserRole implements Serializable {
    /**
     * The cached hash code value for this instance. Settting to 0 triggers
     * re-calculation.
     */
    private int hashValue = 0;
    
    /** identifier field */
    private Integer id;

    /** persistent field */
    private User user;

    /** persistent field */
    private Role role;

    /** persistent field */
    private Site grantedSite;

    /** persistent field */
    private Department grantedDepartment;

    /**
     * Simple constructor of AbstractUserRole instances.
     */
    public AbstractUserRole() {
    }

    /**
     * Constructor of AbstractUserRole instances given a simple primary
     * key.
     * 
     * @param id
     */
    public AbstractUserRole(Integer id) {
        this.setId(id);
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    /**
     * @return Returns the grantedDepartment.
     */
    public Department getGrantedDepartment() {
        return grantedDepartment;
    }

    /**
     * @param grantedDepartment
     *            The grantedDepartment to set.
     */
    public void setGrantedDepartment(Department grantedDepartment) {
        this.grantedDepartment = grantedDepartment;
    }

    /**
     * @return Returns the role.
     */
    public Role getRole() {
        return role;
    }

    /**
     * @param role
     *            The role to set.
     */
    public void setRole(Role role) {
        this.hashValue = 0;
        this.role = role;
    }

    /**
     * @return Returns the grantedSite.
     */
    public Site getGrantedSite() {
        return grantedSite;
    }

    /**
     * @param grantedSite
     *            The grantedSite to set.
     */
    public void setGrantedSite(Site grantedSite) {
        this.grantedSite = grantedSite;
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
        if (!(rhs instanceof UserRole)) return false;
        UserRole that = (UserRole) rhs;
        if (this.getId() == null) return that.getId() == null;
        return this.getId().equals(that.getId());
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
            int idValue = this.getId() == null ? 0 : this.getId().hashCode();
            result = result * 37 + idValue;
            this.hashValue = result;
        }
        return this.hashValue;
    }
}