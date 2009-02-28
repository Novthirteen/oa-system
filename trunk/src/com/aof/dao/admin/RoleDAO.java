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
import com.aof.model.admin.Role;
import com.aof.model.admin.RoleFunction;
import com.aof.model.admin.query.RoleQueryOrder;

/**
 * �������Role�Ľӿ�
 * 
 * @author nicebean
 * @version 1.0 (2005-11-11)
 */
public interface RoleDAO extends DAO {

    /**
     * �����ݿ�ȡ��ָ��id��Role����
     * 
     * @param id
     *            Role�����id
     * @return ����ָ����Role����
     */
    public Role getRole(Integer id);

    /**
     * ����Role�������ݿ�
     * 
     * @param role
     *            Ҫ�����Role����
     * @return ���ر�����Role����
     */
    public Role saveRole(Role role);

    /**
     * �����ݿ�ɾ��ָ��id��Role����
     * 
     * @param id
     *            Role�����id
     */
    public void removeRole(Integer id);

    /**
     * ���ط��ϲ�ѯ������Role�������
     * 
     * @param conditions
     *            ������ѯ����������ֵӳ���Map�����в�ѯ����Ӧ������RoleQueryCondition���Ԥ���峣��
     * @return ���ϲ�ѯ������Role�������
     */
    public int getRoleListCount(Map conditions);

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
     */
    public List getRoleList(Map conditions, int pageNo, int pageSize, RoleQueryOrder order, boolean descend);

    /**
     * ȡ�÷����ָ��Role�����Function�����б�
     * 
     * @param role
     *            ָ����Role����
     * 
     * @return ���ط������Role�����Function�����б�
     */
    public List getFunctionListByRole(Role role);

    /**
     * ����RoleFunction�������ݿ�
     * 
     * @param roleFunction
     *            Ҫ�����RoleFunction����
     * @return ���ر��浽���ݿ��RoleFunction����
     */
    public RoleFunction saveRoleFunction(RoleFunction roleFunction);

    /**
     * �����ݿ�ɾ��ָ����RoleFunction����
     * 
     * @param roleFunction
     *            Ҫɾ����RoleFunction����
     */
    public void removeRoleFunction(RoleFunction roleFunction);
}
