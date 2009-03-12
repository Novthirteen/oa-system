/* =====================================================================
 *
 * Copyright (c) Sourceforge INFORMATION TECHNOLOGY All rights reserved.
 *
 * =====================================================================
 */

package net.sourceforge.service.admin;


import java.util.List;

import net.sourceforge.model.admin.DataTransferParameter;
import net.sourceforge.model.admin.GlobalParameter;
import net.sourceforge.model.admin.Site;

/**
 * �������GlobalParameter�Ľӿ�
 * @author ych
 * @version 1.0 (Dec 14, 2005)
 */
public interface ParameterManager {

    /**
     * �����ݿ�ȡ��GlobalParameter
     * @return 
     */
    public GlobalParameter getGlobalParameter();
        
    /**
     * ����ָ����GlobalParameter�����GlobalMailReminder�б����ݿ�
     * @param globalParameter ָ����GlobalParameter����
     * @param reminderList ָ����GlobalMailReminder�����б�
     * @throws Exception
     */
    public void updateGlobalParameter(GlobalParameter globalParameter,List reminderList);

    /**
     * �����ݿ�ȡ��GlobalMailReminder�б�
     *
     */
    public List getGlobalMailReminderList();

    /**
     * ����Site�����ݿ�ȡ��DataTransferParameter
     * @param site ָ����Site����
     * @return
     */
    public DataTransferParameter getDataTransferParameter(Site site);
    
    /**
     * ����ָ����DataTransferParameter�����SiteMailReminder�б����ݿ�
     * @param dataTransferParameter ָ����DataTransferParameter����
     * @param reminderList ָ����SiteMailReminder�����б�
     * @throws Exception
     */
    public void updateSiteParameter(DataTransferParameter dataTransferParameter,List reminderList);
    
    /**
     * �����ݿ�ȡ��ָ��Site��SiteMailReminder�����б�
     * @param site ָ����Site����
     */
    public List getSiteMailReminderList(Site site);

}
