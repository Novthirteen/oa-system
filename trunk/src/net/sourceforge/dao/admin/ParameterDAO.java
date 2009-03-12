/* =====================================================================
 *
 * Copyright (c) Sourceforge INFORMATION TECHNOLOGY All rights reserved.
 *
 * =====================================================================
 */

package net.sourceforge.dao.admin;

import java.util.List;
import java.util.Set;

import net.sourceforge.model.admin.DataTransferParameter;
import net.sourceforge.model.admin.GlobalMailReminder;
import net.sourceforge.model.admin.GlobalParameter;
import net.sourceforge.model.admin.Site;
import net.sourceforge.model.metadata.GlobalMailReminderType;
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
