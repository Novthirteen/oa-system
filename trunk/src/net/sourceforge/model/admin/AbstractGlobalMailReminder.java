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
 * Created Thu Oct 11 15:04:41 CST 2005 by MyEclipse Hibernate Tool.
 */
package net.sourceforge.model.admin;

import java.io.Serializable;

import net.sourceforge.model.metadata.GlobalMailReminderType;

/**
 * A class that represents a row in the t_global_mail_rem table. You can
 * customize the behavior of this class by editing the class,
 * {@link GlobalMailReminder()}. WARNING: DO NOT EDIT THIS FILE. This is a
 * generated file that is synchronized by MyEclipse Hibernate tool integration.
 */
public abstract class AbstractGlobalMailReminder implements Serializable {

    /**
     * The cached hash code value for this instance. Settting to 0 triggers
     * re-calculation.
     */
    private int hashValue = 0;

    /** identifier field */
    private GlobalMailReminderType type;

    /** persistent field */
    private int dueDay;

    /** persistent field */
    private int intervalDay;

    /** persistent field */
    private int maxTime;

    /**
     * Simple constructor of AbstractGlobalMailReminder instances.
     */
    public AbstractGlobalMailReminder() {
    }

    /**
     * Constructor of AbstractGlobalMailReminder instances given a simple
     * primary key.
     */
    public AbstractGlobalMailReminder(GlobalMailReminderType type) {
        this.type = type;
    }

    public GlobalMailReminderType getType() {
        return this.type;
    }

    public void setType(GlobalMailReminderType type) {
        this.hashValue = 0;
        this.type = type;
    }

    public int getDueDay() {
        return this.dueDay;
    }

    public void setDueDay(int dueDay) {
        this.dueDay = dueDay;
    }

    public int getIntervalDay() {
        return this.intervalDay;
    }

    public void setIntervalDay(int intervalDay) {
        this.intervalDay = intervalDay;
    }

    public int getMaxTime() {
        return this.maxTime;
    }

    public void setMaxTime(int maxTime) {
        this.maxTime = maxTime;
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
        if (!(rhs instanceof GlobalMailReminder))
            return false;
        GlobalMailReminder that = (GlobalMailReminder) rhs;
        if (this.getType() != null)
            return this.getType().equals(that.getType());
        return that.getType() == null;
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
            int typeValue = this.getType() == null ? 0 : this.getType().hashCode();
            result = result * 37 + typeValue;
            this.hashValue = result;
        }
        return this.hashValue;
    }

}
