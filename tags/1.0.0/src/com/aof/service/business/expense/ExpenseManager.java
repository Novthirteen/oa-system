/* =====================================================================
 *
 * Copyright (c) Atos Origin INFORMATION TECHNOLOGY All rights reserved.
 *
 * =====================================================================
 */
package com.aof.service.business.expense;

import java.util.List;
import java.util.Map;

import com.aof.model.admin.User;
import com.aof.model.business.expense.Expense;
import com.aof.model.business.expense.query.ExpenseQueryOrder;

/**
 * �������Expense�Ľӿ�
 * @author ych
 * @version 1.0 (Nov 19, 2005)
 */
public interface ExpenseManager {

    /**
     * �����ݿ�ȡ��ָ��id��Expense
     * @param id
     * @return
     */
    public Expense getExpense(String id);

    /**
     * ����ָ����Expense�������ݿ�
     * 
     * @param expense
     *            Ҫ�����Expense����
     * @return ������Expense����
     */
    public Expense insertExpense(Expense expense);
    
    /**
     * ����ָ����Expense�������ݿ�
     * @param expense
     * @param expenseRowList
     * @param expenseRechargeList
     * @return
     */
    public Expense updateExpense(Expense expense,List expenseRowList,List expenseRechargeList);

    /**
     * ����ָ����Expense�������ݿ�
     * @param expense Ҫ���µ�Expense����
     * @param expenseRowList 
     * @param expenseRechargeList
     * @param approveRequestList
     * @param isDraft �Ƿ�ݸ�
     * @param currentUser ��ǰ�����ˣ����ڼ�¼log
     * @return
     */
    public Expense updateExpense(Expense expense,List expenseRowList,List expenseRechargeList,//List approveRequestList,
            boolean isDraft, User currentUser);

    /**
     * ���ط��ϲ�ѯ������Expense�������
     * 
     * @param conditions
     *            ������ѯ����������ֵӳ���Map�����в�ѯ����Ӧ������ExpenseQueryCondition���Ԥ���峣��
     * @return ���ϲ�ѯ������Expense�������
     */
    public int getExpenseListCount(Map condtions);
    
    /**
     * ���ط��ϲ�ѯ������Expense�����б�
     * 
     * @param conditions
     *            ������ѯ����������ֵӳ���Map�����в�ѯ����Ӧ������ExpenseQueryCondition���Ԥ���峣��
     * @param pageNo
     *            �ڼ�ҳ����pageSizeΪҳ�Ĵ�С��pageSizeΪ-1ʱ���Ըò���
     * @param pageSize
     *            ҳ�Ĵ�С��-1��ʾ����ҳ
     * @param order
     *            ����������null��ʾ������
     * @param descend
     *            false��ʾ����true��ʾ����
     * @return ���ϲ�ѯ������Expense�����б�
     */
    public List getExpenseList(Map condtions, int pageNo, int pageSize, ExpenseQueryOrder order, boolean descend);
    
    /**
     * ����ָ��approveRequestId��Expense
     * @param approveRequestId Expense��approveRequestId
     * @return ָ��approveRequestId��Expense
     */
    public Expense getExpenseByApproveRequestId(String approveRequestId);

    /**
     * Expense���������
     * @param expenseId
     *      ���������
     * @param ecList
     *      Expense Claim list
     * @param rechargeList     
     * @param currentUser  ��ǰ�����ˣ����ڼ�¼log
     */
    //public void finalConfirm(String expenseId, YesNo isRecharge, List ecList,List rechargeList, User currentUser);
    
    /**
     * Expense���������
     * @param expense
     *      ������
     * @param expenseRowList
     *      ��������ϸ
     * @param rechargeList
     *      ��̯��ϸ
     * @param ecList
     *      Expense Claim list
     * @param currentUser  ��ǰ�����ˣ����ڼ�¼log
     */
    public void finalConfirm(Expense expense, List expenseRowList, List rechargeList, List ecList, User currentUser);

    /**
     * Expense���������
     * @param expenseId
     *      ���������
     */
    public void finalClaim(String expenseId);

    /**
     * ���ָ��expense��ExpenseClaim�����б�
     * @param expense Ҫ��õ�ExpenseClaim�����expense 
     * @return ָ��Expense��ExpenseClaim�����б�
     */
    public List getExpenseClaimList(Expense expense);
    
    /**
     * ���Expense
     * @param expense
     * @param currentUser ��ǰ�����ˣ����ڼ�¼log
     * @param comment ��ע�����ڷ���email
     */
    public void rejectExpense(Expense expense, User currentUser, String comment);
    
    /**
     * ����Expense���ExpenseRow��ExpenseCell�б�
     * @param expense
     * @param enabledExpenseSubCategoryList
     * @return
     */
    public List getExpenseRowCellList(Expense expense,List enabledExpenseSubCategoryList);
    
    /**
     * ����Expense���ExpenseRecharge�б�
     * @param expense
     * @return
     */
    public List getExpenseRechargeListByExpense(Expense expense);
    
    /**
     * �����ݿ�ɾ��ָ����Expense����
     * @param expense
     * @param currentUser ��ǰ�����ˣ����ڼ�¼log
     */
    public void removeExpense(Expense expense, User currentUser);

    /**
     * ���ر�������
     * @param expense
     * @param currentUser ��ǰ�����ˣ����ڼ�¼log  
     */
    public void withDrawExpense(Expense expense, User currentUser);

    /**
     * ����ͨ����������
     * @param expense
     */
    public void approveExpense(Expense expense);
    
    /**
     * ����Expense
     * @param copyExpense Ŀ��expense
     * @param srcExpense Դexpense
     * @return ���ظ��Ƶ�Expense
     * @throws Exception 
     */
    public Expense copyExpense(Expense copyExpense,Expense srcExpense) throws Exception;

    /**
     * Final Confirm ʱ���Expense
     * @param ep
     * @param currentUser ��ǰ�����ˣ����ڼ�¼log
     * @param comment ��ע�����ڷ���email
     */
    public void rejectExpenseByFinalConfirm(Expense ep, User currentUser, String comment);
    
    /**
     * Final Claim ʱ���Expense
     * @param ep
     * @param currentUser ��ǰ�����ˣ����ڼ�¼log
     * @param comment ��ע�����ڷ���email
     */
    public void rejectExpenseByFinalClaim(Expense ep, User currentUser, String comment);

    public List getExpenseCategoriesAndUserageAmountBySiteId(Integer siteId);

}
