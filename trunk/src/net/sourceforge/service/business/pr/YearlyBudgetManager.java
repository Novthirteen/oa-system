/* =====================================================================
 *
 * Copyright (c) Sourceforge INFORMATION TECHNOLOGY All rights reserved.
 *
 * =====================================================================
 */
package net.sourceforge.service.business.pr;

import java.util.Date;
import java.util.List;
import java.util.Map;

import net.sourceforge.model.admin.Department;
import net.sourceforge.model.admin.ExpenseCategory;
import net.sourceforge.model.admin.PurchaseCategory;
import net.sourceforge.model.admin.PurchaseSubCategory;
import net.sourceforge.model.admin.Site;
import net.sourceforge.model.admin.User;
import net.sourceforge.model.business.pr.YearlyBudget;
import net.sourceforge.model.business.pr.query.YearlyBudgetQueryOrder;
import net.sourceforge.model.metadata.BudgetType;

/**
 * service manager interface for domain model YearlyBudget
 * 
 * @author shilei
 * @version 1.0 (Nov 29, 2005)
 */
public interface YearlyBudgetManager {

    /**
     * get yearlyBudget by id
     * 
     * @param id
     * @return
     */
    public YearlyBudget getYearlyBudget(Integer id);

    /**
     * insert YearlyBudget
     * 
     * @param yearlyBudget
     * @return
     */
    public YearlyBudget insertYearlyBudget(YearlyBudget yearlyBudget, Department[] departments,User user);

    /**
     * update YearlyBudget update YearlyBudget
     * 
     * @param yearlyBudget
     * @return
     */
    public YearlyBudget updateYearlyBudget(YearlyBudget oldYb,YearlyBudget yearlyBudget, Department[] departments,User user);
    
    /**
     * get YearlyBudget Count according to conditions
     * 
     * @param conditions
     *            search condition
     * @return list count
     */
    public int getYearlyBudgetListCount(Map condtions);

    /**
     * get YearlyBudget according to conditions
     * 
     * @param conditions
     *            search condition
     * @param pageNo
     *            start page no(0 based), ignored if -1
     * @param pageSize
     *            page size, ignored if -1
     * @param order
     *            search order
     * @param descend
     *            asc or desc
     * @return YearlyBudget list
     */
    public List getYearlyBudgetList(Map condtions, int pageNo, int pageSize, YearlyBudgetQueryOrder order, boolean descend);

    /**
     * get Departments of yearlyBudget
     * 
     * @param yearlyBudget
     * @return
     */
    public Department[] getBudgetDepartments(YearlyBudget yearlyBudget);

    /**
     * get Yearly Budget By Code
     * 
     * @param code
     * @return
     */
    public YearlyBudget getYearlyBudgetByCode(String code);

    /**
     * get Yearly Budget Department List of yearlyBudget
     * 
     * @param yearlyBudget
     * @return
     */
    public List getYearlyBudgetDepartmentList(YearlyBudget yearlyBudget);

    /**
     * get Yearly Budget Department List according to conditions
     * 
     * @param conditions
     * @return
     */
    public List getYearlyBudgetDepartmentList(Map conditions);

    /**
     * freeze/unfreeze Yearly Budget
     * 
     * @param yearlyBudgetIds
     * @param toFreeze
     */
    public void freeze(Integer[] yearlyBudgetIds, boolean toFreeze,User user);

    /**
     * list histories of yb
     * 
     * @param yb
     * @return
     */
    public List listHistroy(YearlyBudget yb);

    /**
     * ����ָ����Site��PurchaseCategory��PurchaseSubCategory��Department
     * List�����غ��ʵ�YearlyBudget�б�
     * 
     * @param site
     *            Site�������pc����psc��Ϊnull���˲���������
     * @param pc
     *            PurchaseCategory�������psc��Ϊnull���˲���������
     * @param psc
     *            PurchaseSubCategory����
     * @param departmentList
     *            Department�����б�
     * @return ���ʵ�YearlyBudget�б�
     */
    public List getSuitableYearlyBudget(Site s, PurchaseCategory pc, PurchaseSubCategory psc, List departmentList,BudgetType budgetType, User user);
    
    public List getSuitableYearlyBudget(Site s, ExpenseCategory ec, List departmentList,BudgetType budgetType, Date effectiveDate, User user);
    
    /**
     * Ϊִ��Flow��д�������Ϣ (Department��PurchaseCategory��PurchaseSubCategory)
     * @param yb
     */
    public void setExtraInformationToYearlyBudgetForExecuteFlow(YearlyBudget yb);

    /**
     * ���� YearlyBudget��ִ��NotifyFlow
     * @param yb
     * @param ignoreAmountCondition
     */
    public void updateAndNotifyYearlyBudget(YearlyBudget yb, boolean ignoreAmountCondition);
    
    public void updateYearBudget(YearlyBudget yb);
    
    /**
     * can View YearlyBudget Amount
     * @param yb
     * @return
     */
    public boolean canViewYearlyBudgetAmount(YearlyBudget yb,User user);
    
    public boolean canViewExpenseBudgetAmount(YearlyBudget yb,User user);
}
