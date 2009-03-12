/* =====================================================================
 *
 * Copyright (c) Sourceforge INFORMATION TECHNOLOGY All rights reserved.
 *
 * =====================================================================
 */

package net.sourceforge.dao.admin;

import java.util.List;
import java.util.Map;

import net.sourceforge.dao.DAO;
import net.sourceforge.model.admin.Department;
import net.sourceforge.model.admin.query.DepartmentQueryOrder;

/**
 * �������Department�Ľӿ�
 * 
 * @author nicebean
 * @version 1.0 (2005-11-11)
 */
public interface DepartmentDAO extends DAO {

    /**
     * �����ݿ�ȡ��ָ��id��Department����
     * 
     * @param id
     *            Department�����id
     * @return ����ָ����Department����
     */
    public Department getDepartment(Integer id);

    /**
     * ����Department�������ݿ�
     * 
     * @param department
     *            Ҫ�����Department����
     * @return ���ر�����Department����
     */
    public Department saveDepartment(Department department);

    /**
     * �����ݿ�ɾ��ָ��id��Department����
     * 
     * @param id
     *            Department�����id
     */
    public void removeDepartment(Integer id);

    /**
     * ���ط��ϲ�ѯ������Department�������
     * 
     * @param conditions
     *            ������ѯ����������ֵӳ���Map�����в�ѯ����Ӧ������DepartmentQueryCondition���Ԥ���峣��
     * @return ���ϲ�ѯ������Department�������
     */
    public int getDepartmentListCount(Map conditions);

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
    public List getDepartmentList(Map conditions, int pageNo, int pageSize, DepartmentQueryOrder order, boolean descend);

    /**
     * ���Site�����Departments����
     * 
     * @param siteList
     *            Ҫ����Site�б�
     * @param onlyEnabled
     *            true��ʾֻ���״̬Ϊ���õ�Department��false��ʾ���ȫ����Department
     */
    public void fillSiteDepartment(List siteList, boolean onlyEnabled);

}
