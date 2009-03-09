/* =====================================================================
 *
 * Copyright (c) Atos Origin INFORMATION TECHNOLOGY All rights reserved.
 *
 * =====================================================================
 */

package com.aof.dao.admin;

import java.util.List;
import java.util.Set;

import com.aof.model.admin.DataTransferParameter;
import com.aof.model.admin.GlobalMailReminder;
import com.aof.model.admin.GlobalParameter;
import com.aof.model.admin.Site;
import com.aof.model.metadata.GlobalMailReminderType;
/**
 * �������Global��Site��Parameter�Ľӿ�
 * @author ych
 * @version 1.0 (Dec 14, 2005)
 */
public interface ParameterDAO{

    /**
     * �����ݿ�ȡ��GlobalParameter
     * @return 
     */
    public GlobalParameter getGlobalParameter();
	
    /**
     * ����ָ����GlobalParameter�����ݿ�
     * @param globalParameter
     * @return
     */
    public GlobalParameter updateGlobalParameter(GlobalParameter globalParameter);

    /**
     * �����ݿ�ȡ��GlobalMailReminder�б�
     *
     */
    public List getGlobalMailReminderList();
    
    /**
     * ����GlobalMailReminder�����б����ݿ�
     * @param reminderList GlobalMailReminder�����б�
     */
    public void updateGlobalMailReminder(List reminderList);
    
    /**
     * �����ݿ�ȡ��ָ��Site��DataTransferParameter
     * @param site ָ����Site
     * @return
     */
    public DataTransferParameter getDataTransferParameter(Site site);
    
    /**
     * ����ָ����DataTransferParameter�����ݿ�
     * @param dataTransferParameter
     * @return
     */
    public DataTransferParameter updateDataTransferParameter(DataTransferParameter dataTransferParameter);
    
    /**
     * ����SiteMailReminder�����б����ݿ�
     * @param site ָ����site
     * @param reminderList SiteMailReminder�����б�
     */
    public void updateSiteMailReminder(Site site,List reminderList);

    /**
     * �����ݿ�ȡ��ָ��Site��SiteMailReminder�б�
     * @param site ָ����Site
     * @return
     */
    public List getSiteMailReminderList(Site site);
    
    public Set getEnabledSiteSetWithMailReminders();
    
    /**
     * ��ȡָ�����͵�GlobalMailReminder
     * @param type
     * @return
     */
    public GlobalMailReminder getGlobalMailReminder(GlobalMailReminderType type);
}
