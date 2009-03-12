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
 * Created Fri Sep 23 17:32:12 CST 2005 by MyEclipse Hibernate Tool.
 */
package net.sourceforge.model.admin;

import java.io.Serializable;

import net.sourceforge.model.metadata.RoleType;

/**
 * A class that represents a row in the t_role table. 
 * You can customize the behavior of this class by editing the class, {@link TRole()}.
 * WARNING: DO NOT EDIT THIS FILE. This is a generated file that is synchronized
 * by MyEclipse Hibernate tool integration.
 */
public abstract class AbstractRole 
    implements Serializable
{
    /** The cached hash code value for this instance.  Settting to 0 triggers re-calculation. */
    private int hashValue = 0;

    /** The composite primary key value. */
    private java.lang.Integer id;

    /** The value of the simple name property. */
    private java.lang.String name;

    /** The value of the simple description property. */
    private java.lang.String description;

    /** The value of the simple type property. */
    private RoleType type;

    /**
     * Simple constructor of AbstractRole instances.
     */
    public AbstractRole()
    {
    }

    /**
     * Constructor of AbstractRole instances given a simple primary key.
     * @param id
     */
    public AbstractRole(java.lang.Integer id)
    {
        this.setId(id);
    }

    

    /**
	 * @return Returns the description.
	 */
	public java.lang.String getDescription() {
		return description;
	}

	/**
	 * @param description The description to set.
	 */
	public void setDescription(java.lang.String description) {
		this.description = description;
	}

	/**
	 * @return Returns the id.
	 */
	public java.lang.Integer getId() {
		return id;
	}

	/**
	 * @param id The id to set.
	 */
	public void setId(java.lang.Integer id) {
		this.hashValue=0;
		this.id = id;
	}

	/**
	 * @return Returns the name.
	 */
	public java.lang.String getName() {
		return name;
	}

	/**
	 * @param name The name to set.
	 */
	public void setName(java.lang.String name) {
		this.name = name;
	}

	/**
	 * @return Returns the type.
	 */
	public RoleType getType() {
		return type;
	}

	/**
	 * @param type The type to set.
	 */
	public void setType(RoleType type) {
		this.type = type;
	}

	/**
     * Implementation of the equals comparison on the basis of equality of the primary key values.
     * @param rhs
     * @return boolean
     */
    public boolean equals(Object rhs)
    {
    	if (rhs == null) return false;
        if (this == rhs) return true;
        if (!(rhs instanceof Role)) return false;
        Role that = (Role) rhs;
        if (this.getId() != null) return this.getId().equals(that.getId());
        return that.getId() == null;
    }

    /**
     * Implementation of the hashCode method conforming to the Bloch pattern with
     * the exception of array properties (these are very unlikely primary key types).
     * @return int
     */
    public int hashCode()
    {
        if (this.hashValue == 0)
        {
            int result = 17;
            int roleIdValue = this.getId() == null ? 0 : this.getId().hashCode();
            result = result * 37 + roleIdValue;
            this.hashValue = result;
        }
        return this.hashValue;
    }
}
