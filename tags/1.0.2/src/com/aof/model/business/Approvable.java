/* =====================================================================
 *
 * Copyright (c) Atos Origin INFORMATION TECHNOLOGY All rights reserved.
 *
 * =====================================================================
 */

package com.aof.model.business;

import java.util.Map;

import com.aof.model.admin.Site;
import com.aof.model.admin.User;

/**
 * ֧�������Ķ���Ӧ��ʵ�ָýӿ�
 * 
 * @author nicebean
 * @version 1.0 (2005-11-25)
 */
public interface Approvable {

    /**
     * �����µ�ApproveRequest���󡣱��磬��Expense��Ӧ����ExpenseApproveRequest����
     * 
     * @return BaseApproveRequest�����Ӧ����ʵ��
     */
    public BaseApproveRequest createNewApproveRequestObj();
    
    /**
     * ���ض����������
     * @return User����
     */
    public User getRequestor();
    
    /**
     * �������������ö����Flow������
     * @return Flow������
     */
    public String getApproveFlowName();

    public String getApprovalBatchEmailTemplateName();
    
    public String getApprovalNotifyEmailTemplateName();

    public Map getApprovalNotifyEmailContext();

    public String getApprovedNotifyEmailTemplateName();

    public Map getApprovedNotifyEmailContext();

    public String getRejectedNotifyEmailTemplateName();

    public Map getRejectedNotifyEmailContext();
    
    public Site getLogSite();
    
    public String getApproveRequestId();
    
    public String getRefNo();
    
    public User getCreator();

}
