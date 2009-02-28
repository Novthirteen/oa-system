/* =====================================================================
 *
 * Copyright (c) Atos Origin INFORMATION TECHNOLOGY All rights reserved.
 *
 * =====================================================================
 */

package com.aof.service.admin;

import java.util.List;
import java.util.Map;

import com.aof.model.admin.Department;
import com.aof.model.admin.Site;
import com.aof.model.admin.query.DepartmentQueryOrder;

/**
 * �������Department�Ľӿ�
 * 
 * @author nicebean
 * @version 1.0 (2005-11-14)
 */
public interface DepartmentManager {

    /**
     * �����ݿ�ȡ��ָ��id��Department����
     * 
     * @param id
     *            Department�����id
     * @return ����ָ����Department����
     * 
     */
    public Department getDepartment(Integer id) ;

    /**
     * ����Department�������ݿ�
     * 
     * @param department
     *            Ҫ�����Department����
     * @return ���ر�����Department����
     * 
     */
    public Department saveDepartment(Department department) ;

    /**
     * �����ݿ�ɾ��ָ��id��Department����
     * 
     * @param id
     *            Department�����id
     * 
     */
    public void removeDepartment(Integer id) ;

    /**
     * ���ط��ϲ�ѯ������Department�������
     * 
     * @param conditions
     *            ������ѯ����������ֵӳ���Map�����в�ѯ����Ӧ������DepartmentQueryCondition���Ԥ���峣��
     * @return ���ϲ�ѯ������Department�������
     * 
     */
    public int getDepartmentListCount(Map conditions) ;

    /**
     * ���ط��ϲ�ѯ������Department�����б�
     * 
     * @param conditions
     *            ������ѯ����������ֵӳ���Map�����в�ѯ����Ӧ������DepartmentQueryCondition���Ԥ���峣��
     * @param pageNo
     *            �ڼ�ҳ����pageSizeΪҳ�Ĵ�С��pageSizeΪ-1ʱ���Ըò���
     * @param pageSize
     *            ҳ�Ĵ�С��-1��ʾ����ҳ
     * @param order
     *            ����������null��ʾ������
     * @param descend
     *            false��ʾ����true��ʾ����
     * @return ���ϲ�ѯ������Department�����б�
     */
    public List getDepartmentList(Map conditions, int pageNo, int pageSize, DepartmentQueryOrder order, boolean descend) ;

    /**
     * ���������ڽ�����ʾָ��Site��Deparment��״�ṹ��XML����
     * 
     * @param siteId
     *            ָ��Site�����id
     * @return ����XML���ݵ�String
     * 
     */
    public String getDepartmentXmlBySite(Integer siteId) ;

    /**
     * ���Site�����Departments����
     * 
     * @param siteList
     *            Ҫ����Site�б�
     * @param onlyEnabled
     *            true��ʾֻ���״̬Ϊ���õ�Department��false��ʾ���ȫ����Department
     * 
     */
    public void fillDepartment(List siteList, boolean onlyEnabled) ;

    /**
     * ���Site�����Departments����
     * 
     * @param site
     *            Ҫ����Site����
     * @param onlyEnabled
     *            true��ʾֻ���״̬Ϊ���õ�Department��false��ʾ���ȫ����Department
     * 
     */
    public void fillDepartment(Site site, boolean onlyEnabled) ;

    /**
     * get enabled Department List Of Site
     * @param site
     * @return
     */
    public List getEnabledDepartmentTreeOfSite(Site site);

}
