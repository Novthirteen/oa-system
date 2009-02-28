/* =====================================================================
 *
 * Copyright (c) Atos Origin INFORMATION TECHNOLOGY All rights reserved.
 *
 * =====================================================================
 */

package com.aof.service.admin;

import java.io.InputStream;
import java.util.List;
import java.util.Map;

import com.aof.model.admin.Site;
import com.aof.model.admin.query.SiteQueryOrder;

/**
 * �������Site�Ľӿ�
 * 
 * @author nicebean
 * @version 1.0 (2005-11-14)
 */
public interface SiteManager {

    /**
     * �����ݿ�ȡ��ָ��id��Site����
     * 
     * @param id
     *            Site�����id
     * @return ����ָ����Site����
     * 
     */
    public Site getSite(Integer id) ;

    /**
     * ����Site�������ݿ�
     * 
     * @param site
     *            Ҫ�����Site����
     * @return ���ر�����Site����
     * 
     */
    public Site saveSite(Site site) ;

    /**
     * ����Site�����logoͼ�굽���ݿ�
     * 
     * @param site
     *            Ҫ�����Site����
     * @param in
     *            ���Ի�ȡlogoͼ�����ݵ�
     * @return ���ر�����Site����
     * 
     */
    public Site saveSite(Site site, InputStream in) ;

    /**
     * �����ݿ�ɾ��ָ��id��Site����
     * 
     * @param id
     *            Site�����id
     * 
     */
    public void removeSite(Integer id) ;

    /**
     * ���ط��ϲ�ѯ������Site�������
     * 
     * @param conditions
     *            ������ѯ����������ֵӳ���Map�����в�ѯ����Ӧ������SiteQueryCondition���Ԥ���峣��
     * @return ���ϲ�ѯ������Site�������
     * 
     */
    public int getSiteListCount(Map conditions) ;

    /**
     * ���ط��ϲ�ѯ������Site�����б�
     * 
     * @param conditions
     *            ������ѯ����������ֵӳ���Map�����в�ѯ����Ӧ������SiteQueryCondition���Ԥ���峣��
     * @param pageNo
     *            �ڼ�ҳ����pageSizeΪҳ�Ĵ�С��pageSizeΪ-1ʱ���Ըò���
     * @param pageSize
     *            ҳ�Ĵ�С��-1��ʾ����ҳ
     * @param order
     *            ����������null��ʾ������
     * @param descend
     *            false��ʾ����true��ʾ����
     * @return ���ϲ�ѯ������Site�����б�
     * 
     */
    public List getSiteList(Map conditions, int pageNo, int pageSize, SiteQueryOrder order, boolean descend) ;

    /**
     * ��������״̬Ϊ���õ�Site�����б�
     * 
     * @return Site������б�
     * 
     */
    public List getAllEnabledSiteList() ;

    /**
     * ��������״̬Ϊ���û���idΪָ��������Site�����б�
     * 
     * @param id
     *            Ҫ������Site�����id
     * @return Site������б�
     * 
     */
    public List getAllEnabledSiteListAndIncludeThis(Integer id) ;

    /**
     * ��ѯָ��id��Site�����Ƿ���logo
     * 
     * @param id
     *            Site�����id
     * @return ����true��ʾ��logo��falseû��logo
     * 
     */
    public boolean isSiteHasLogo(Integer id) ;

    /**
     * ȡ�ö�ȡָ��id��Site����logo���ݵ�InputStream
     * 
     * @param id
     *            Site�����id
     * @return ���ظ�Site����logo��InputStream�����Site����û��logo���򷵻�null
     * 
     */
    public InputStream getSiteLogo(final Integer id) ;

    /**
     * ����ָ��id��Site�����logo
     * 
     * @param id
     *            Site�����id
     * @param in
     *            ���Զ�ȡlogo���ݵ�InputStream
     * 
     */
    public void saveSiteLogo(final Integer id, final InputStream in) ;

}
