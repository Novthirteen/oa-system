/* =====================================================================
 *
 * Copyright (c) Atos Origin INFORMATION TECHNOLOGY All rights reserved.
 *
 * =====================================================================
 */
package com.aof.service.admin;

import java.util.List;
import java.util.Map;

import com.aof.model.admin.Email;
import com.aof.model.admin.EmailBatch;
import com.aof.model.admin.Site;
import com.aof.model.admin.User;
import com.aof.model.admin.query.EmailQueryOrder;

/**
 * �������Email�Ľӿ�
 * 
 * @author ych
 * @version 1.0 (Nov 13, 2005)
 */
public interface EmailManager {
    
    public static final String EMAIL_ROLE_APPROVER = "Approver";
    public static final String EMAIL_ROLE_FINANCE = "Finance";
    public static final String EMAIL_ROLE_HOTEL_MAINTAINER = "Hotel Maintainer";
    public static final String EMAIL_ROLE_SUPPLIER_MAINTAINER = "Supplier Maintainer";
    public static final String EMAIL_ROLE_PURCHASER = "Purchaser";
    public static final String EMAIL_ROLE_REQUESTOR = "Requestor";
    public static final String EMAIL_ROLE_CREATOR = "Creator";
    public static final String EMAIL_ROLE_NOTIFIER = "Notifier";
    public static final String EMAIL_ROLE_CITY_MAINTAINER = "City Maintainer";
    public static final String EMAIL_ROLE_USER_MAINTAINER = "User Maintainer";
    public static final String EMAIL_ROLE_INSPECTOR = "Inspector";
    public static final String EMAIL_ROLE_RECEIVER = "Receiver";
    public static final String EMAIL_ROLE_DELEGATE_APPROVER = "Delegate Approver";

    /**
     * �����ݿ�ȡ��ָ��id��Email
     * 
     * @param id
     *            Email��id
     * @return ����ָ����Email
     * @
     */
    public Email getEmail(Integer id) ;

    /**
     * ����ָ����Email�������ݿ�
     * 
     * @param email
     *            Ҫ�����Email����
     * @return ������Email����
     * @
     */
    public Email insertEmail(Email email, String body) ;
    
    /**
     * ����ָ����Email�������ݿ�
     * 
     * @param email
     *            Ҫ�����Email����
     * @return ������Email����
     * @
     */
    public EmailBatch insertEmailBatch(EmailBatch emailBatch, String body) ;

    /**
     * ����ָ����Email�������ݿ�
     * 
     * @param email
     *            Ҫ���µ�Email����
     * @param body
     *            Ҫ���µ�Email�����body
     * 
     * @return ���º��Email����
     * @
     */

    public Email updateEmail(Email email) ;

    /**
     * ���ط��ϲ�ѯ������Email�������
     * 
     * @param conditions
     *            ������ѯ����������ֵӳ���Map�����в�ѯ����Ӧ������EmailQueryCondition���Ԥ���峣��
     * @return ���ϲ�ѯ������Email�������
     * @
     */
    public int getEmailListCount(Map condtions) ;

    /**
     * ���ط��ϲ�ѯ������Email�����б�
     * 
     * @param conditions
     *            ������ѯ����������ֵӳ���Map�����в�ѯ����Ӧ������EmailQueryCondition���Ԥ���峣��
     * @param pageNo
     *            �ڼ�ҳ����pageSizeΪҳ�Ĵ�С��pageSizeΪ-1ʱ���Ըò���
     * @param pageSize
     *            ҳ�Ĵ�С��-1��ʾ����ҳ
     * @param order
     *            ����������null��ʾ������
     * @param descend
     *            false��ʾ����true��ʾ����
     * @return ���ϲ�ѯ������Email�����б�
     * @
     */
    public List getEmailList(Map condtions, int pageNo, int pageSize, EmailQueryOrder order, boolean descend) ;

    /**
     * ��״̬Ϊ�ȴ����͵��ʼ�����
     * 
     */
    public void sendEmail();

    /**
     * ����Email�������ݿ�
     * 
     * @param from
     *            Email��from
     * @param to
     *            Email��to
     * @param subject
     *            Email��subject
     * @param body
     *            Email��body
     * @
     */
    public void insertEmail(Site site,String from, String to, String subject, String body) ;       
    
    public void insertEmailBatch(Site site,String from, String to, String body,String batchEmailTemplateName,String refNo, User user);
    
    public void insertEmail(Site site,String to,String templateLocation,Map context) ;
    
    public void insertEmailBatch(Site site,String to,String templateLocation,String refNo,Map context,String batchEmailTemplateName) ;
    
    public void deleteEmailBatch(String refNo);
    
    public void updateEmailBatch(EmailBatch emailBatch);
    
    public EmailBatch findNotSendEmailBatchByRefNo(String refNo);
    
    /**
     * �����������Email�������ݿ�
     * 
     */
    public void mailReminder();
    
    public void sendBatchEmail();
}
