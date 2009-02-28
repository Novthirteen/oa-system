/* =====================================================================
 *
 * Copyright (c) Atos Origin INFORMATION TECHNOLOGY All rights reserved.
 *
 * =====================================================================
 */

package com.aof.service.admin;

import java.util.List;
import java.util.Map;

import com.aof.model.admin.Role;
import com.aof.model.admin.query.RoleQueryOrder;

/**
 * �������Role�Ľӿ�
 * @author nicebean
 * @version 1.0 (2005-11-14)
 */
public interface RoleManager {

    /**
     * �����ݿ�ȡ��ָ��id��Role����
     * 
     * @param id
     *            Role�����id
     * @return ����ָ����Role����
     * @throws Exception
     */
    public Role getRole(Integer id) throws Exception;

    /**
     * ����Role�������ݿ�
     * 
     * @param role
     *            Ҫ�����Role����
     * @return ���ر�����Role����
     * @throws Exception
     */
    public Role saveRole(Role role) throws Exception;

    /**
     * �����ݿ�ɾ��ָ��id��Role����
     * 
     * @param id
     *            Role�����id
     * @throws Exception
     */
    public void removeRole(Integer id) throws Exception;
    
    /**
     * ���ط��ϲ�ѯ������Role�������
     * 
     * @param conditions
     *            ������ѯ����������ֵӳ���Map�����в�ѯ����Ӧ������RoleQueryCondition���Ԥ���峣��
     * @return ���ϲ�ѯ������Role�������
     * @throws Exception
     */
    public int getRoleListCount(Map conditions) throws Exception;

    /**
     * ���ط��ϲ�ѯ������Role�����б�
     * 
     * @param conditions
     *            ������ѯ����������ֵӳ���Map�����в�ѯ����Ӧ������RoleQueryCondition���Ԥ���峣��
     * @param pageNo
     *            �ڼ�ҳ����pageSizeΪҳ�Ĵ�С��pageSizeΪ-1ʱ���Ըò���
     * @param pageSize
     *            ҳ�Ĵ�С��-1��ʾ����ҳ
     * @param order
     *            ����������null��ʾ������
     * @param descend
     *            false��ʾ����true��ʾ����
     * @return ���ϲ�ѯ������Role�����б�
     * @throws Exception
     */
    public List getRoleList(Map conditions, int pageNo, int pageSize, RoleQueryOrder order, boolean descend) throws Exception;

    /**
     * ȡ������Role���б�
     * @return  Role������б�
     * @throws Exception
     */
    public List getAllRoleList() throws Exception;

    /**
     * ȡ�÷����ָ��Role�����Function�����б�
     * 
     * @param role
     *            ָ����Role����
     * 
     * @return ���ط������Role�����Function�����б�
     * @throws Exception
     */
    public List getFunctionListByRole(Role role) throws Exception;
    
    /**
     * ����RoleFunction�������ݿ�
     * 
     * @param roleFunction
     *            Ҫ�����RoleFunction����
     * @return ���ر��浽���ݿ��RoleFunction����
     * @throws Exception
     */
    public void saveFunctionListForRole(Role role, List functionList) throws Exception;

}
