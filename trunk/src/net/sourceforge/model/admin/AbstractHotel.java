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
 * Created Fri Sep 23 13:36:35 CST 2005 by MyEclipse Hibernate Tool.
 */
package net.sourceforge.model.admin;

import java.io.Serializable;
import java.util.Date;

import net.sourceforge.model.metadata.EnabledDisabled;
import net.sourceforge.model.metadata.HotelLevel;
import net.sourceforge.model.metadata.HotelPromoteStatus;

/**
 * A class that represents a row in the t_hotel table. 
 * You can customize the behavior of this class by editing the class, {@link Hotel()}.
 * WARNING: DO NOT EDIT THIS FILE. This is a generated file that is synchronized
 * by MyEclipse Hibernate tool integration.
 */

public abstract class AbstractHotel 
    implements Serializable
{
    /** The cached hash code value for this instance.  Settting to 0 triggers re-calculation. */
    private int hashValue = 0;

    /** The composite primary key value. */
    private java.lang.Integer id;

    /** The value of the currency association. */
    private Currency currency;

    /** The value of the city association. */
    private City city;
    
    private Site site;


    /** The value of the simple hotelName property. */
    private java.lang.String name;


    /** The value of the simple address property. */
    private java.lang.String address;

    /** The value of the simple description property. */
    private java.lang.String description;

    /** The value of the simple telephone property. */
    private java.lang.String telephone;

    /** The value of the simple fax property. */
    private java.lang.String fax;

    /** The value of the simple level property. */
    private HotelLevel level;

    /** The value of the simple conStaDate property. */
    private Date contractStartDate;

    /** The value of the simple conExpDate property. */
    private Date contractExpireDate;

    /** The value of the simple promoteStatus property. */
    private HotelPromoteStatus promoteStatus;

    /** The value of the simple promoteMessage property. */
    private String promoteMessage;

    /** The value of the simple promoteDate property. */
    private Date promoteDate;

    /** The value of the simple enabled property. */
    private EnabledDisabled enabled;

    private Date emailDate;
    
    private int emailTimes = 0;
    
    private String email;
    
    private String contact;
    
    private String specialService;
    
    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Simple constructor of AbstractHotel instances.
     */
    public AbstractHotel()
    {
    }

    /**
     * Constructor of AbstractHotel instances given a simple primary key.
     * @param id
     */
    public AbstractHotel(java.lang.Integer id)
    {
        this.setId(id);
    }

    
    /**
     * @return Returns the emailDate.
     */
    public Date getEmailDate() {
        return emailDate;
    }

    /**
     * @param emailDate The emailDate to set.
     */
    public void setEmailDate(Date emailDate) {
        this.emailDate = emailDate;
    }

    /**
     * @return Returns the emailTimes.
     */
    public int getEmailTimes() {
        return emailTimes;
    }

    /**
     * @param emailTimes The emailTimes to set.
     */
    public void setEmailTimes(int emailTimes) {
        this.emailTimes = emailTimes;
    }

    /**
     * Return the simple primary key value that identifies this object.
     * @return java.lang.Integer
     */
    public java.lang.Integer getId()
    {
        return id;
    }

    /**
     * Set the simple primary key value that identifies this object.
     * @param id
     */
    public void setId(java.lang.Integer id)
    {
        this.hashValue = 0;
        this.id = id;
    }

        /**
     * Return the value of the address column.
     * @return String
     */
    public String getAddress()
    {
        return this.address;
    }

    /**
     * Set the value of the address column.
     * @param address
     */
    public void setAddress(String address)
    {
        this.address = address;
    }

    
    /**
     * Return the value of the description column.
     * @return String
     */
    public String getDescription()
    {
        return this.description;
    }

    /**
     * Set the value of the description column.
     * @param description
     */
    public void setDescription(String description)
    {
        this.description = description;
    }

    
    /**
     * Return the value of the fax column.
     * @return String
     */
    public String getFax()
    {
        return this.fax;
    }

    /**
     * Set the value of the fax column.
     * @param fax
     */
    public void setFax(String fax)
    {
        this.fax = fax;
    }

    
    /**
     * Return the value of the promote_status column.
     * @return HotelPromoteStatus
     */
    public HotelPromoteStatus getPromoteStatus()
    {
        return this.promoteStatus;
    }

    /**
     * Set the value of the promote_status column.
     * @param promoteStatus
     */
    public void setPromoteStatus(HotelPromoteStatus promoteStatus)
    {
        this.promoteStatus = promoteStatus;
    }

    /**
     * Return the value of the promote_msg column.
     * @return String
     */
    public String getPromoteMessage()
    {
        return this.promoteMessage;
    }

    /**
     * Set the value of the promote_msg column.
     * @param promoteMessage
     */
    public void setPromoteMessage(String promoteMessage)
    {
        this.promoteMessage = promoteMessage;
    }
    
    /**
     * Return the value of the promote_date column.
     * @return Date
     */
    public Date getPromoteDate()
    {
        return this.promoteDate;
    }

    /**
     * Set the value of the promote_date column.
     * @param promoteDate
     */
    public void setPromoteDate(Date promoteDate)
    {
        this.promoteDate = promoteDate;
    }
    
	/**
	 * @return Returns the city.
	 */
	public City getCity() {
		return city;
	}

	/**
	 * @param city The city to set.
	 */
	public void setCity(City city) {
		this.city = city;
	}

	/**
	 * @return Returns the contractExpireDate.
	 */
	public Date getContractExpireDate() {
		return contractExpireDate;
	}

	/**
	 * @param contractExpireDate The contractExpireDate to set.
	 */
	public void setContractExpireDate(Date contractExpireDate) {
		this.contractExpireDate = contractExpireDate;
	}

	/**
	 * @return Returns the contractStartDate.
	 */
	public Date getContractStartDate() {
		return contractStartDate;
	}

	/**
	 * @param contractStartDate The contractStartDate to set.
	 */
	public void setContractStartDate(Date contractStartDate) {
		this.contractStartDate = contractStartDate;
	}

	/**
	 * @return Returns the currency.
	 */
	public Currency getCurrency() {
		return currency;
	}

	/**
	 * @param currency The currency to set.
	 */
	public void setCurrency(Currency currency) {
		this.currency = currency;
	}

	/**
	 * @return Returns the enabled.
	 */
	public EnabledDisabled getEnabled() {
		return enabled;
	}

	/**
	 * @param enabled The enabled to set.
	 */
	public void setEnabled(EnabledDisabled enabled) {
		this.enabled = enabled;
	}

	/**
	 * @return Returns the level.
	 */
	public HotelLevel getLevel() {
		return level;
	}

	/**
	 * @param level The level to set.
	 */
	public void setLevel(HotelLevel level) {
		this.level = level;
	}

	/**
	 * @return Returns the name.
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name The name to set.
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return Returns the site.
	 */
	public Site getSite() {
		return site;
	}

	/**
	 * @param site The site to set.
	 */
	public void setSite(Site site) {
		this.site = site;
	}

	/**
	 * @return Returns the telephone.
	 */
	public String getTelephone() {
		return telephone;
	}

	/**
	 * @param telephone The telephone to set.
	 */
	public void setTelephone(String telephone) {
		this.telephone = telephone;
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
        if (!(rhs instanceof Hotel)) return false;
        Hotel that = (Hotel) rhs;
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
            int hotelIdValue = this.getId() == null ? 0 : this.getId().hashCode();
            result = result * 37 + hotelIdValue;
            this.hashValue = result;
        }
        return this.hashValue;
    }

    /**
     * @return Returns the specialService.
     */
    public String getSpecialService() {
        return specialService;
    }

    /**
     * @param specialService The specialService to set.
     */
    public void setSpecialService(String specialService) {
        this.specialService = specialService;
    }
    
}
