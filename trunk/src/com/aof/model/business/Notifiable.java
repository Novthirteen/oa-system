/* =====================================================================
 *
 * Copyright (c) Atos Origin INFORMATION TECHNOLOGY All rights reserved.
 *
 * =====================================================================
 */

package com.aof.model.business;

import java.util.Map;

import com.aof.model.admin.Site;


/**
 * ֧��֪ͨ�Ķ���Ӧ��ʵ�ָýӿ�
 * 
 * @author nicebean
 * @version 1.0 (2005-12-31)
 */
public interface Notifiable {

    /**
     * ��������֪ͨ�ö����Flow������
     * @return Flow������
     */
    public String getNotifyFlowName();

    public String getNotifyEmailTemplateName();

    public Map getNotifyEmailContext();
    
    public Site getLogSite();
    
}
