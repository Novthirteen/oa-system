/* =====================================================================
 *
 * Copyright (c) Atos Origin INFORMATION TECHNOLOGY All rights reserved.
 *
 * =====================================================================
 */

package com.aof.service.admin;

import java.util.List;
import java.util.Map;
import java.util.Set;

import com.aof.model.admin.Department;
import com.aof.model.admin.Function;
import com.aof.model.admin.Site;
import com.aof.model.admin.User;
import com.aof.model.admin.UserDepartment;
import com.aof.model.admin.UserRole;
import com.aof.model.admin.UserSite;
import com.aof.model.admin.query.UserQueryOrder;

/**
 * �������User�Ľӿ�
 * 
 * @author nicebean
 * @version 1.0 (2005-11-14)
 */
public interface UserManager {

    /**
     * �����ݿ�ȡ��ָ��id��User����
     * 
     * @param id
     *            User�����id
     * @return ����ָ����User����
     * 
     */
    public User getUser(Integer id) ;

    /**
     * ����User�������ݿ�
     * 
     * @param user
     *            Ҫ�����User����
     * @return ������User����
     * 
     */
    public User saveUser(User user) ;

    /**
     * �����ݿ�ɾ��ָ��id��User����
     * 
     * @param id
     *            User�����id
     * 
     */
    public void removeUser(Integer id) ;

    /**
     * ��ѯָ��loginName��User����
     * 
     * @param loginName
     *            User�����loginName
     * @return ������ڣ�������Ӧ��User���󣬷��򷵻�null
     * 
     */
    public User getUserByLoginName(String loginName) ;

    /**
     * ���ط��ϲ�ѯ������User�������
     * 
     * @param conditions
     *            ������ѯ����������ֵӳ���Map�����в�ѯ����Ӧ������UserQueryCondition���Ԥ���峣��
     * @return ���ϲ�ѯ������User�������
     * 
     */
    public int getUserListCount(Map conditions) ;

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
     * 
     */
    public List getUserList(Map conditions, int pageNo, int pageSize, UserQueryOrder order, boolean descend) ;

    /**
     * ����ָ��User�����UserSite�б�
     * 
     * @param user
     *            User����
     * @return ����UserSite������б�����ÿ��UserSite�����user����Ϊָ����User����
     * 
     */
    public List getUserSiteListByUser(User user) ;

    /**
     * ����ָ��User�����UserDepartment�б�
     * 
     * @param user
     *            User����
     * @return ����UserDepartment������б�����ÿ��UserDepartment�����user����Ϊָ����User����
     * 
     */
    public List getUserDepartmentListByUser(User user) ;

    /**
     * ����ָ��User������ָ��Site��UserDepartment�б�
     * 
     * @param user
     *            User����
     * @param site
     *            Site����
     * @return ����UserDepartment������б�����ÿ��UserDepartment�����user����Ϊָ����User����department���Ե�site����Ϊָ����Site
     * 
     */
    public List getUserDepartmentListByUserAndSite(User user, Site site) ;

    /**
     * �����ݿ��ȡָ����UserSite����
     * 
     * @param userId
     *            Ҫ��ȡ��UserSite�����user���Ե�id
     * @param siteId
     *            Ҫ��ȡ��UserSite�����site���Ե�id
     * @return ����ָ����UserSite����
     * 
     */
    public UserSite getUserSite(Integer userId, Integer siteId) ;

    /**
     * ����UserSite�������ݿ�
     * 
     * @param us
     *            Ҫ������UserSite����
     * @return ������UserSite����
     * 
     */
    public UserSite saveUserSite(UserSite us) ;

    /**
     * ����UserSite�������ݿ�
     * 
     * @param us
     *            Ҫ���µ�UserSite����
     * @return ������UserSite����
     * 
     */
    public UserSite updateUserSite(UserSite us) ;

    /**
     * �����ݿ�ɾ��ָ����UserSite����
     * 
     * @param us
     *            Ҫɾ����UserSite����
     * 
     */
    public void removeUserSite(UserSite us) ;

    /**
     * �����ݿ��ȡָ����UserDepartment����
     * 
     * @param userId
     *            Ҫ��ȡ��UserDepartment�����user���Ե�id
     * @param departmentId
     *            Ҫ��ȡ��UserDepartment�����department���Ե�id
     * @return ����ָ����UserDepartment����
     * 
     */
    public UserDepartment getUserDepartment(Integer userId, Integer departmentId) ;

    /**
     * ����UserDepartment�������ݿ�
     * 
     * @param ud
     *            Ҫ������UserDepartment����
     * @return ������UserDepartment����
     * 
     */
    public UserDepartment saveUserDepartment(UserDepartment ud) ;

    /**
     * ����UserDepartment�������ݿ�
     * 
     * @param ud
     *            Ҫ���µ�UserDepartment����
     * @return ������UserDepartment����
     * 
     */
    public UserDepartment updateUserDepartment(UserDepartment ud) ;

    /**
     * �����ݿ�ɾ��ָ����UserDepartment����
     * 
     * @param ud
     *            Ҫɾ����UserDepartment����
     * 
     */
    public void removeUserDepartment(UserDepartment ud) ;

    /**
     * �����ݿ�ȡ��UserRole�����б�����ÿ��UserRole�����user���Ե���ָ����User����
     * 
     * @param u
     *            ָ����User����
     * @return ����UserRole�����б�
     * 
     */
    public List getUserRoleListByUser(User user) ;

    /**
     * �����ݿ�ȡ��UserRole�����б�����ÿ��UserRole�����user���Ե���ָ����User������role���԰���ָ����Function����
     * 
     * @param user
     *            ָ����User����
     * @param function
     *            ָ����Function����
     * @return ����UserRole�����б�
     * 
     */
    public List getUserRoleListByUserAndFunction(User user, Function function) ;

    /**
     * �����ݿ�ȡ��ָ��id��UserRole����
     * 
     * @param id
     *            UserRole�����id
     * @return ����ָ����UserRole����
     * 
     */
    public UserRole getUserRole(Integer id) ;

    /**
     * ����ָ����UserRole�������ݿ�
     * 
     * @param ur
     *            Ҫ�����UserRole����
     * @return ������UserRole����
     * 
     */
    public UserRole saveUserRole(UserRole ur) ;

    /**
     * �����ݿ�ɾ��ָ����UserRole����
     * 
     * @param ur
     *            Ҫɾ����UserRole����
     * 
     */
    public void removeUserRole(UserRole ur) ;

    /**
     * ȡ��ָ��User����Ȩʹ��ָ��Function������Site�б�ֻ�б�������Site��Ȩ�޵�Site�Ż�����ڴ��б��С�
     * 
     * @param user
     *            ָ����User����
     * @param function
     *            ָ����Function����
     * @return Site������б�
     * 
     */
    public List getGrantedSiteList(User user, Function function) ;
    
    
    
    /**
     * ȡ����ָ��Function��������ȨUser�б�ֻ�б�������Global��Ȩ�޵�User�Ż�����ڴ��б��С�
     * 
     * @param function
     *            ָ����Function����
     * @return User������б�
     */
    public List getEnabledUserList(Function function);

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
     * 
     */
    public boolean hasSitePower(Site site, User user, Function function) ;

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
     * 
     */
    public boolean hasDepartmentPower(Department department, User user, Function function) ;

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
     * 
     */
    public List getGrantedSiteDeparmentList(User currentUser, Function function) ;

    /**
     * ��ѯָ����User��ָ����Function�Ƿ���Global��Ȩ�ޡ�����б�ʾ��User�ڴ�Function�ڿɷ��ʵ�Site��Department��������
     * 
     * @param user
     *            ָ����User����
     * @param function
     *            ָ����Function����
     * @return true��ʾ��Ȩ�ޣ�false��ʾû��
     * 
     */
    public boolean hasGlobalPower(User user, Function function) ;

    /**
     * ȡ��ָ��User����ʹ�õ�Menu���󼯺�
     * 
     * @param user
     *            ָ����User����
     * @return Menu����ļ���
     * 
     */
    public Set getGrantedMenuSet(User user) ;

    /**
     * ����ָ��User�����UserSite�б�ÿ��UserSite�����site���Ե�״̬Ҫ���ǿ��ã���departments������getEnabledUserDepartmentList(User
     * user, Site site)�Ľ�����
     * 
     * User����
     * 
     * @return ����UserSite������б�����ÿ��UserSite�����user����Ϊָ����User������site���Ե�״̬Ϊ����
     * 
     */
    public List getEnabledSiteDepartmentListOfUser(User user) ;

    /**
     * ����ָ��User�����UserSite�б�ÿ��UserSite�����site���Ե�״̬Ҫ���ǿ���
     * 
     * @param user
     *            User����
     * @return ����UserSite������б�����ÿ��UserSite�����user����Ϊָ����User������site���Ե�״̬Ϊ����
     * 
     */
    public List getEnabledUserSiteList(User user) ;

    /**
     * ����ָ��User�����UserSite�б�ÿ��UserSite�����site���Ե�״̬Ҫ���ǿ���,����ÿ��UserSite��������˿��õ�UserDepartment�б�,UserSite��Site���������Enable��ExpenseCategory
     * 
     * @param user
     *            User����
     * @return ����UserSite������б�����ÿ��UserSite�����user����Ϊָ����User����site���Ե�״̬Ϊ���ã�������˿��õ�UserDepartment�б�,UserSite��Site���������Enable��ExpenseCategory
     * 
     */
    public List getEnabledUserSiteListWithDepartmentsAndExpenseCategory(User user);
    
    /**
     * ����ָ��User������ָ��Site��UserDepartment�б�ÿ��UserDepartment�����department���Ե�״̬Ҫ���ǿ���
     * 
     * @param user
     *            User����
     * @param site
     *            Site����
     * @return ����UserDepartment������б�����ÿ��UserDepartment�����user����Ϊָ����User����department���Ե�site����Ϊָ����Site����״̬Ϊ����
     * 
     */
    public List getEnabledUserDepartmentList(User user, Site site) ;

    /**
     * ȡ��ָ��User����Ȩʹ��ָ��Function������Site�б�
     * 
     * @param user
     *            ָ����User����
     * @param function
     *            ָ����Function����
     * @return Site������б�
     * 
     */
    public List getSiteOfGrantedSiteDeparmentList(User user, Function function) ;

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
     * 
     */
    public List getGrantedDepartmentListOfSite(User user, Site site, Function function) ;

    /**
     * ��ȡָ��Department������״̬Ϊ���õ�User���б�
     * 
     * @param department
     *            Department����
     * @return User������б�
     * 
     */
    public List getEnabledUserListOfDepartment(Department department) ;

    /**
     * ��ѯָ��operator��ָ����user��Function�Ƿ���Ȩ�ޡ�
     * @param user 
     * @param operator
     * @param function
     * @return true��ʾ��Ȩ�ޣ�false��ʾû��
     */
    public boolean hasUserPower(User user, User currentUser, Function function) ;

    /**
     * ȡ�ö�ָ��function,site��Ȩ�޵���Ч�û��б�
     * @param f
     * @param site
     * @return
     */
    public List getEnabledUserList(Function f, Site site);
    public List getEnabledUserList(Function f, Department dep);

    /**
     * get Enabled SiteDepartment Tree Of User
     * @param currentUser
     * @return
     */
    public List getEnabledSiteDepartmentTreeOfUser(User currentUser);

    /**
     * get Enabled Site List Of User
     * @param currentUser
     * @return
     */
    public List getEnabledSiteListOfUser(User currentUser);

    

    public void fillUserRole(List userList);

    public List getUserRoleList(Map conditions, UserQueryOrder order, boolean isDesc);
}
