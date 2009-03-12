/* =====================================================================
 *
 * Copyright (c) Sourceforge INFORMATION TECHNOLOGY All rights reserved.
 *
 * =====================================================================
 */

package net.sourceforge.dao.admin;

import java.util.List;
import java.util.Map;

import net.sourceforge.model.admin.Email;
import net.sourceforge.model.admin.EmailBatch;
import net.sourceforge.model.admin.query.EmailQueryOrder;

/**
 * �������Email�Ľӿ�
 * @author ych
 * @version 1.0 (Nov 13, 2005)
 */
public interface EmailDAO{

    /**
     * �����ݿ�ȡ��ָ��id��Email
     * 
     * @param id
     *            Email��id
     * @return ����ָ����Email
     */
    public Email getEmail(Integer id);
    
    public EmailBatch getEmailBatch(Integer id);
    
    public String getEmailBody(Integer id);
    
    public List getAllUnSendEmailBatch();

    public String getEmailBatchBody(Integer id);
	
    /**
     * ���ط��ϲ�ѯ������Email�������
     * 
     * @param conditions
     *            ������ѯ����������ֵӳ���Map�����в�ѯ����Ӧ������EmailQueryCondition���Ԥ���峣��
     * @return ���ϲ�ѯ������Email�������
     */
	public int getEmailListCount(Map conditions);
	
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
     */
    public List getEmailList(Map conditions, int pageNo, int pageSize, EmailQueryOrder order, boolean descend);

    /**
     * ����ָ����Email�������ݿ�
     * 
     * @param email
     *            Ҫ�����Email����
     * @return ������Email����
     */
    public Email insertEmail(Email email);
    
    /**
     * ����ָ����Email�������ݿ�
     * 
     * @param email
     *            Ҫ�����Email����
     * @return ������Email����
     */
    public EmailBatch insertEmailBatch(EmailBatch emailBatch);
    
    /**
     * ����Email��body
     * @param id
     *            Ҫ�����Email��id
     * @param body
     */
    public void saveEmailBody(Integer id, String body);
    
    /**
     * ����Email��body
     * @param id
     *            Ҫ�����Email��id
     * @param body
     */
    public void saveEmailBatchBody(Integer id, String body);
    
    /**
     * ����ָ����Email�������ݿ�
     * 
     * @param email
     *            Ҫ���µ�Email����
     * @return ���º��Email����
     */
    public Email updateEmail(Email email);
    
    public EmailBatch updateEmailBatch(EmailBatch emailBatch);
    
    /**
     * ���صȴ����͵�Email�����б�
     * @return �ȴ����͵�Email�����б�
     */
    public List getWaitToSendEmailList();
    
    public void deleteEmailBatch(String refNo);
    
    public EmailBatch findNotSendEmailBatchByRefNo(String refNo);
}
