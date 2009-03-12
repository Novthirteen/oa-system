/* =====================================================================
 *
 * Copyright (c) Sourceforge INFORMATION TECHNOLOGY All rights reserved.
 *
 * =====================================================================
 */

package net.sourceforge.service.admin;

import java.util.List;
import java.util.Map;

import net.sourceforge.model.admin.ExpenseSubCategory;
import net.sourceforge.model.admin.query.ExpenseSubCategoryQueryOrder;

/**
 * service manager interface for domain model ExpenseSubCategory
 * 
 * @author shilei
 * @version 1.0 (Nov 15, 2005)
 */
public interface ExpenseSubCategoryManager {

    /**
     * �����ݿ�ȡ��ָ��id��Expense Sub Category
     * 
     * @param id
     *            ExpenseCategory��id
     * @return ����ָ����Expense Category
     */
    public ExpenseSubCategory getExpenseSubCategory(Integer id);

    /**
     * insert Expense Sub Category to database
     * 
     * @param expenseSubCategory
     *            the Expense Category inserted
     * @return the Expense Sub Category inserted
     */
    public ExpenseSubCategory insertExpenseSubCategory(ExpenseSubCategory expenseSubCategory);

    /**
     * update Expense Sub Category to datebase
     * 
     * @param expenseSubCategory
     *            the Expense Sub Category updated
     * @return the Expense Sub Category updated
     */
    public ExpenseSubCategory updateExpenseSubCategory(ExpenseSubCategory expenseSubCategory);

    /**
     * get getExpense Sub Category Count according to conditions
     * 
     * @param conditions
     *            search condition
     * @return list count
     */
    public int getExpenseSubCategoryListCount(Map condtions);

    /**
     * get Expense Sub Category List according to conditions
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
     * @return Expense Sub Category list
     */
    public List getExpenseSubCategoryList(Map condtions, int pageNo, int pageSize, ExpenseSubCategoryQueryOrder order, boolean descend);

    /**
     * get Expense Sub Category of designated ExpenseCategory
     * @param expenseCategory_id
     *      id of ExpenseCategory
     * @return list of Expense Sub Category
     */
    public List getChildrenOfExpenseCategory(Integer expenseCategory_id);

    /**
     * get enabled Expense Sub Category of designated ExpenseCategory
     * @param expenseCategory_id
     *      id of ExpenseCategory
     * @returnlist of Expense Sub Category
     */
    public List getEnabledChildrenOfExpenseCategory(Integer expenseCategory_id);

}
