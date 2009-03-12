/* =====================================================================
 *
 * Copyright (c) Sourceforge INFORMATION TECHNOLOGY All rights reserved.
 *
 * =====================================================================
 */

package net.sourceforge.service.admin;

import java.util.List;
import java.util.Map;

import net.sourceforge.model.admin.Department;
import net.sourceforge.model.admin.Site;
import net.sourceforge.model.admin.query.DepartmentQueryOrder;

/**
 * 定义操作Department的接口
 * 
 * @author nicebean
 * @version 1.0 (2005-11-14)
 */
public interface DepartmentManager {

    /**
     * 从数据库取得指定id的Department对象
     * 
     * @param id
     *            Department对象的id
     * @return 返回指定的Department对象
     * 
     */
    public Department getDepartment(Integer id) ;

    /**
     * 保存Department对象到数据库
     * 
     * @param department
     *            要保存的Department对象
     * @return 返回保存后的Department对象
     * 
     */
    public Department saveDepartment(Department department) ;

    /**
     * 从数据库删除指定id的Department对象
     * 
     * @param id
     *            Department对象的id
     * 
     */
    public void removeDepartment(Integer id) ;

    /**
     * 返回符合查询条件的Department对象个数
     * 
     * @param conditions
     *            包含查询条件到条件值映射的Map，其中查询条件应该来自DepartmentQueryCondition类的预定义常量
     * @return 符合查询条件的Department对象个数
     * 
     */
    public int getDepartmentListCount(Map conditions) ;

    /**
     * 返回符合查询条件的Department对象列表
     * 
     * @param conditions
     *            包含查询条件到条件值映射的Map，其中查询条件应该来自DepartmentQueryCondition类的预定义常量
     * @param pageNo
     *            第几页，以pageSize为页的大小，pageSize为-1时忽略该参数
     * @param pageSize
     *            页的大小，-1表示不分页
     * @param order
     *            排序条件，null表示不排序
     * @param descend
     *            false表示升序，true表示降序
     * @return 符合查询条件的Department对象列表
     */
    public List getDepartmentList(Map conditions, int pageNo, int pageSize, DepartmentQueryOrder order, boolean descend) ;

    /**
     * 返回用于在界面显示指定Site的Deparment树状结构的XML数据
     * 
     * @param siteId
     *            指定Site对象的id
     * @return 包含XML数据的String
     * 
     */
    public String getDepartmentXmlBySite(Integer siteId) ;

    /**
     * 填充Site对象的Departments集合
     * 
     * @param siteList
     *            要填充的Site列表
     * @param onlyEnabled
     *            true表示只填充状态为可用的Department，false表示填充全部的Department
     * 
     */
    public void fillDepartment(List siteList, boolean onlyEnabled) ;

    /**
     * 填充Site对象的Departments集合
     * 
     * @param site
     *            要填充的Site对象
     * @param onlyEnabled
     *            true表示只填充状态为可用的Department，false表示填充全部的Department
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
