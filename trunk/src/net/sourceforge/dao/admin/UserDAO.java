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
import net.sourceforge.model.admin.Function;
import net.sourceforge.model.admin.Site;
import net.sourceforge.model.admin.User;
import net.sourceforge.model.admin.UserRole;
import net.sourceforge.model.admin.query.UserQueryOrder;

/**
 * �������User�Ľӿ�
 * 
 * @author nicebean
 * @version 1.0 (2005-11-12)
 */
public interface UserDAO extends DAO {

    /**
     * �����ݿ�ȡ��ָ��id��User����
     * 
     * @param id
     *            User�����id
     * @return ����ָ����User����
     */
    public User getUser(Integer id);

    /**
     * ����User�������ݿ�
     * 
     * @param user
     *            Ҫ�����User����
     * @return ������User����
     */
    public User saveUser(User user);

    /**
     * �����ݿ�ɾ��ָ��id��User����
     * 
     * @param id
     *            User�����id
     */
    public void removeUser(Integer id);

    /**
     * ���ط��ϲ�ѯ������User�������
     * 
     * @param conditions
     *            ������ѯ����������ֵӳ���Map�����в�ѯ����Ӧ������UserQueryCondition���Ԥ���峣��
     * @return ���ϲ�ѯ������User�������
     */
    public int getUserListCount(Map conditions);

    /**
     * ���ط��ϲ�ѯ������User�����б�
     * 
     * @param conditions
     *            ������ѯ����������ֵӳ���Map�����в�ѯ����Ӧ������UserQueryCondition���Ԥ���峣��
     * @param pageNo
     *            �ڼ�ҳ����pageSizeΪҳ�Ĵ�С��pageSizeΪ-1ʱ���Ըò���
     * @param pageSize
     *            ҳ�Ĵ�С��-1��ʾ����ҳ
     * @param order
     *            ����������null��ʾ������
     * @param descend
     *            false��ʾ����true��ʾ����
     * @return ���ϲ�ѯ������User�����б�
     */
    public List getUserList(Map conditions, int pageNo, int pageSize, UserQueryOrder order, boolean descend);

    /**
     * �����ݿ�ȡ��UserRole�����б�����ÿ��UserRole�����user���Ե���ָ����User����
     * 
     * @param u
     *            ָ����User����
     * @return ����UserRole�����б�
     */
    public List getUserRoleListByUser(User u);

    /**
     * �����ݿ�ȡ��UserRole�����б�����ÿ��UserRole�����user���Ե���ָ����User������role���԰���ָ����Function����
     * 
     * @param user
     *            ָ����User����
     * @param function
     *            ָ����Function����
     * @return ����UserRole�����б�
     */
    public List getUserRoleListByUserAndFunction(User user, Function function);

    /**
     * �����ݿ�ȡ��ָ��id��UserRole����
     * 
     * @param id
     *            UserRole�����id
     * @return ����ָ����UserRole����
     */
    public UserRole getUserRole(Integer id);

    /**
     * ����ָ����UserRole�������ݿ�
     * 
     * @param ur
     *            Ҫ�����UserRole����
     * @return ������UserRole����
     */
    public UserRole saveUserRole(UserRole ur);

    /**
     * �����ݿ�ɾ��ָ����UserRole����
     * 
     * @param ur
     *            Ҫɾ����UserRole����
     */
    public void removeUserRole(UserRole ur);

    /**
     * ȡ��ָ��User����Ȩʹ��ָ��Function������Site�б�ֻ�б�������Site��Ȩ�޵�Site�Ż�����ڴ��б��С�
     * 
     * @param user
     *            ָ����User����
     * @param function
     *            ָ����Function����
     * @return Site������б�
     */
    public List getGrantedSiteList(User user, Function function);
    
    
    
    /**
     * ��ѯָ��User��ָ����Site��Function�Ƿ���Site��Ȩ�ޡ�����б�ʾ��User�ڴ�Function�ڿɷ��ʵ�Department��������
     * 
     * @param site
     *            ָ����Site����
     * @param user
     *            ָ����User����
     * @param function
     *            ָ����Function����
     * @return true��ʾ��Site��Ȩ�ޣ�false��ʾû��
     */
    public boolean hasSitePower(Site site, User user, Function function);

    /**
     * ȡ��ָ��User����Ȩʹ��ָ��Function������Site�б��б��е�ÿ��Site�����departments�������Ѿ�����˱���Ȩ��Department����
     * ע��Ϊ����ʾ��Ҫ���ͱ���ȨDepartment�����йص�Parent
     * DepartmentҲ���ڼ����У��������Ƿ��б���Ȩ����ˣ��ü����е�Department����ʵ���Ƿ��б���Ȩ��Ӧͨ����granted���Ի�ã�true��ʾ����Ȩ��false��ʾû�С�
     * 
     * @param user
     *            ָ����User����
     * @param function
     *            ָ����Function����
     * @return Site������б�
     */
    public List getGrantedSiteDeparmentList(User user, Function function);

    /**
     * ��ѯָ��User��ָ����Department��Function�Ƿ���Ȩ�ޡ�
     * 
     * @param department
     *            ָ����Department����
     * @param user
     *            ָ����User����
     * @param function
     *            ָ����Function����
     * @return true��ʾ��Ȩ�ޣ�false��ʾû��
     */
    public boolean hasDepartmentPower(Department department, User user, Function function);

    /**
     * ��ѯָ����User��ָ����Function�Ƿ���Global��Ȩ�ޡ�����б�ʾ��User�ڴ�Function�ڿɷ��ʵ�Site��Department��������
     * 
     * @param user
     *            ָ����User����
     * @param function
     *            ָ����Function����
     * @return true��ʾ��Ȩ�ޣ�false��ʾû��
     */
    public boolean hasGlobalPower(User user, Function function);

    /**
     * ȡ��ָ��User����ʹ�õ�Menu�����б�
     * 
     * @param user
     *            ָ����User����
     * @return Menu������б�
     */
    public List getGrantedMenuList(User user);

    /**
     * ȡ��ָ��User����Ȩʹ��ָ��Function������Site�б�
     * 
     * @param user
     *            ָ����User����
     * @param function
     *            ָ����Function����
     * @return Site������б�
     */
    public List getSiteOfGrantedSiteDeparmentList(User user, Function function);

    /**
     * ȡ��ָ��User��ָ��Site����Ȩʹ��ָ��Function������Department�б�
     * ע��Ϊ����ʾ��Ҫ���ͱ���ȨDepartment�����йص�Parent
     * DepartmentҲ�����б��У��������Ƿ��б���Ȩ����ˣ����б��е�Department����ʵ���Ƿ��б���Ȩ��Ӧͨ����granted���Ի�ã�true��ʾ����Ȩ��false��ʾû�С�
     * 
     * @param user
     *            ָ����User����
     * @param site
     *            ָ����Site����
     * @param function
     *            ָ����Function����
     * @return Site������б�
     */
    public List getGrantedDeparmentListOfSite(User user, Site site, Function function);

    /**
     * ��ѯָ��operator��ָ����user��Function�Ƿ���Ȩ�ޡ�
     * @param user 
     * @param operator
     * @param function
     * @return true��ʾ��Ȩ�ޣ�false��ʾû��
     */
    public boolean hasUserPower(User user, User operator, Function function);

    /**
     * ȡ��ָ����ȨSite����ָ��Function��������ȨUser�б�
     * 
     * @param grantedSite
     *            ָ����Site����
     * @param function
     *            ָ����Function����
     * @return User������б�
     */
    public List getEnabledUserList(Function function, Site grantedSite);
    public List getEnabledUserList(Function function, Department grantedDep);
    
    /**
     * ȡ����ָ��Function��������ȨUser�б�ֻ�б�������Global��Ȩ�޵�User�Ż�����ڴ��б��С�
     * 
     * @param function
     *            ָ����Function����
     * @return User������б�
     */
    public List getEnabledUserList(Function function);



}
