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
import com.aof.model.admin.UserDepartment;
import com.aof.model.admin.query.UserDepartmentQueryOrder;

/**
 * �������UserDepartment�Ľӿ�
 * 
 * @author nicebean
 * @version 1.0 (2005-11-12)
 */
public interface UserDepartmentDAO extends DAO {

    /**
     * �����ݿ��ȡָ����UserDepartment����
     * 
     * @param userId
     *            Ҫ��ȡ��UserDepartment�����user���Ե�id
     * @param departmentId
     *            Ҫ��ȡ��UserDepartment�����department���Ե�id
     * @return ����ָ����UserDepartment����
     */
    public UserDepartment getUserDepartment(Integer userId, Integer departmentId);

    /**
     * ����UserDepartment�������ݿ�
     * 
     * @param ud
     *            Ҫ������UserDepartment����
     * @return ������UserDepartment����
     */
    public UserDepartment saveUserDepartment(UserDepartment ud);

    /**
     * ����UserDepartment�������ݿ�
     * 
     * @param ud
     *            Ҫ���µ�UserDepartment����
     * @return ������UserDepartment����
     */
    public UserDepartment updateUserDepartment(UserDepartment ud);

    /**
     * �����ݿ�ɾ��ָ����UserDepartment����
     * 
     * @param ud
     *            Ҫɾ����UserDepartment����
     */
    public void removeUserDepartment(UserDepartment ud);

    /**
     * ���ط��ϲ�ѯ������UserDepartment�������
     * 
     * @param conditions
     *            ������ѯ����������ֵӳ���Map�����в�ѯ����Ӧ������UserDepartmentQueryCondition���Ԥ���峣��
     * @return ���ϲ�ѯ������UserDepartment�������
     */
    public int getUserDepartmentListCount(Map conditions);

    /**
     * ���ط��ϲ�ѯ������UserDepartment�����б�
     * 
     * @param conditions
     *            ������ѯ����������ֵӳ���Map�����в�ѯ����Ӧ������UserDepartmentQueryCondition���Ԥ���峣��
     * @param pageNo
     *            �ڼ�ҳ����pageSizeΪҳ�Ĵ�С��pageSizeΪ-1ʱ���Ըò���
     * @param pageSize
     *            ҳ�Ĵ�С��-1��ʾ����ҳ
     * @param order
     *            ����������null��ʾ������
     * @param descend
     *            false��ʾ����true��ʾ����
     * @return ���ϲ�ѯ������UserDepartment�����б�
     */
    public List getUserDepartmentList(Map conditions, int pageNo, int pageSize, UserDepartmentQueryOrder order, boolean descend);

}
