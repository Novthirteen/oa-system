/* =====================================================================
 *
 * Copyright (c) Atos Origin INFORMATION TECHNOLOGY All rights reserved.
 *
 * =====================================================================
 */

package com.aof.dao.admin;

import java.util.List;
import java.util.Map;

import com.aof.dao.DAO;
import com.aof.model.admin.UserSite;
import com.aof.model.admin.query.UserSiteQueryOrder;

/**
 * ����UserSiteӦ���ṩ�ķ���
 * @author nicebean
 * @version 1.0 (2005-11-12)
 */
public interface UserSiteDAO extends DAO {

    /**
     * �����ݿ��ȡָ����UserSite����
     * 
     * @param userId
     *            Ҫ��ȡ��UserSite�����user���Ե�id
     * @param siteId
     *            Ҫ��ȡ��UserSite�����site���Ե�id
     * @return ����ָ����UserSite����
     */
    public UserSite getUserSite(Integer userId, Integer siteId);

    /**
     * ����UserSite�������ݿ�
     * 
     * @param us
     *            Ҫ������UserSite����
     * @return ������UserSite����
     */
    public UserSite saveUserSite(UserSite us);
    
    /**
     * ����UserSite�������ݿ�
     * 
     * @param us
     *            Ҫ���µ�UserSite����
     * @return ������UserSite����
     */
    public UserSite updateUserSite(UserSite us);
    
    /**
     * �����ݿ�ɾ��ָ����UserSite����
     * 
     * @param us
     *            Ҫɾ����UserSite����
     */
    public void removeUserSite(UserSite us);

    /**
     * ���ط��ϲ�ѯ������UserSite�������
     * 
     * @param conditions
     *            ������ѯ����������ֵӳ���Map�����в�ѯ����Ӧ������UserSiteQueryCondition���Ԥ���峣��
     * @return ���ϲ�ѯ������UserSite�������
     */
    public int getUserSiteListCount(Map conditions);
    
    /**
     * ���ط��ϲ�ѯ������UserSite�����б�
     * 
     * @param conditions
     *            ������ѯ����������ֵӳ���Map�����в�ѯ����Ӧ������UserSiteQueryCondition���Ԥ���峣��
     * @param pageNo
     *            �ڼ�ҳ����pageSizeΪҳ�Ĵ�С��pageSizeΪ-1ʱ���Ըò���
     * @param pageSize
     *            ҳ�Ĵ�С��-1��ʾ����ҳ
     * @param order
     *            ����������null��ʾ������
     * @param descend
     *            false��ʾ����true��ʾ����
     * @return ���ϲ�ѯ������UserSite�����б�
     */
    public List getUserSiteList(Map conditions, int pageNo, int pageSize, UserSiteQueryOrder order, boolean descend);
    
}
