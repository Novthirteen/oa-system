/* =====================================================================
 *
 * Copyright (c) Atos Origin INFORMATION TECHNOLOGY All rights reserved.
 *
 * =====================================================================
 */
package com.aof.dao.business.pr;

import java.util.Date;
import java.util.List;
import java.util.Map;

import com.aof.model.admin.ExpenseCategory;
import com.aof.model.admin.PurchaseCategory;
import com.aof.model.admin.PurchaseSubCategory;
import com.aof.model.admin.Site;
import com.aof.model.admin.User;
import com.aof.model.business.pr.YearlyBudget;
import com.aof.model.business.pr.YearlyBudgetHistory;
import com.aof.model.business.pr.YearlyBudgetHistoryDepartment;
import com.aof.model.business.pr.query.YearlyBudgetQueryOrder;
import com.aof.model.metadata.BudgetType;

/**
 * dao interface for domain model yearlyBudget
 * @author shilei
 * @version 1.0 (Nov 29, 2005)
 */
public interface YearlyBudgetDAO {

    /**
     * get yearlyBudget by id
     * @param id
     *      id of yearlyBudget
     * @return
     */
    public YearlyBudget getYearlyBudget(Integer id);

    /**
     * get Yearly Budget List Count according to conditions
     * @param conditions
     *      query conditions
     * @return count of Yearly BudgetList
     */
    public int getYearlyBudgetListCount(Map conditions);

    /**
     * get Yearly Budget List by conditions
     * 
     * @param conditions
     *            search condition
     * @param pageNo
     *            start page no(0 based), ignored if is -1
     * @param pageSize
     *            page size, ignored if is -1
     * @param order
     *            search order
     * @param descend
     *            asc or desc
     * @return Yearly Budget list
     */
    public List getYearlyBudgetList(Map conditions, int pageNo, int pageSize, YearlyBudgetQueryOrder order, boolean descend);

    /**
     * insert YearlyBudget
     * @param yearlyBudget
     * @return
     */
    public YearlyBudget insertYearlyBudget(YearlyBudget yearlyBudget);

    /**
     * update YearlyBudget
     * @param yearlyBudget
     * @return
     */
    public YearlyBudget updateYearlyBudget(YearlyBudget yearlyBudget);

    

    /**
     * insert Yearly Budget History
     * @param ybh
     * @return
     */
    public YearlyBudgetHistory insertYearlyBudgetHistory(YearlyBudgetHistory ybh);

    /**
     * insert Yearly Budget History Department
     * @param ybhd
     */
    public void insertYearlyBudgetHistoryDepartment(YearlyBudgetHistoryDepartment ybhd);

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
    public List getSuitableYearlyBudget(Site site, PurchaseCategory pc, PurchaseSubCategory psc,
            List departmentList,BudgetType budgetType);


    public List getSuitableYearlyBudget(Site s, ExpenseCategory ec, List departmentList,BudgetType budgetType, Date effectiveDate);
}
