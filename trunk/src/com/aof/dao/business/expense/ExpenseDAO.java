/* =====================================================================
 *
 * Copyright (c) Atos Origin INFORMATION TECHNOLOGY All rights reserved.
 *
 * =====================================================================
 */
package com.aof.dao.business.expense;

import java.util.Date;
import java.util.List;
import java.util.Map;

import com.aof.model.admin.ExpenseSubCategory;
import com.aof.model.admin.SiteMailReminder;
import com.aof.model.business.expense.Expense;
import com.aof.model.business.expense.ExpenseApproveRequest;
import com.aof.model.business.expense.ExpenseCell;
import com.aof.model.business.expense.ExpenseClaim;
import com.aof.model.business.expense.ExpenseHistory;
import com.aof.model.business.expense.ExpenseHistoryCell;
import com.aof.model.business.expense.ExpenseHistoryRow;
import com.aof.model.business.expense.ExpenseRecharge;
import com.aof.model.business.expense.ExpenseRow;
import com.aof.model.business.expense.query.ExpenseQueryOrder;

/**
 * �������Expense�Ľӿ�
 * 
 * @author ych
 * @version 1.0 (Nov 19, 2005)
 */
public interface ExpenseDAO {

    /**
     * �����ݿ�ȡ��ָ��id��Expense
     * @param id
     * @return
     */
    public Expense getExpense(String id);

    /**
     * ���ط��ϲ�ѯ������Expense�������
     * 
     * @param conditions
     *            ������ѯ����������ֵӳ���Map�����в�ѯ����Ӧ������ExpenseQueryCondition���Ԥ���峣��
     * @return ���ϲ�ѯ������Expense�������
     */
    public int getExpenseListCount(Map conditions);

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
    public List getExpenseList(Map conditions, int pageNo, int pageSize, ExpenseQueryOrder order, boolean descend);

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
     * 
     * @param expense
     *            Ҫ���µ�Expense����
     * @return ���º��Expense����
     */
    public Expense updateExpense(Expense expense);

    /**
     * ��������Expenseʱ��Ҫ��primary key code
     * 
     * @return ����Expenseʱ��Ҫ��primary key code
     */
    public String getLastExpenseCode();


    /**
     * ���ָ��expense��ExpenseClaim�����б�
     * @param expense Ҫ��õ�ExpenseClaim�����expense 
     * @return ָ��Expense��ExpenseClaim�����б�
     */
    public List getExpenseClaimList(Expense expense);
    
    /**
     * ����ָ����ExpenseClaim�������ݿ�
     * 
     * @param ec
     *            Ҫ�����ExpenseClaim����
     */
    public void insertExpenseClaim(ExpenseClaim ec);


    /**
     * ����ָ��approveRequestId��Expense
     * 
     * @param approveRequestId
     *            Expense��approveRequestId
     * @return ָ��approveRequestId��Expense
     */
    public Expense getExpenseByApproveRequestId(String approveRequestId);

    /**
     * ����ָ����ExpenseApproveRequest�������ݿ�
     * 
     * @param ear
     *            Ҫ�����ExpenseApproveRequest����
     */
    public void saveExpenseApproveRequst(ExpenseApproveRequest ear);
    
    /**
     * ����ָ����ExpenseRecharge�������ݿ�
     * 
     * @param expenseRecharge
     *            Ҫ�����ExpenseRecharge����
     */
    public void saveExpenseRecharge(ExpenseRecharge expenseRecharge);
    
    /**
     * ����Expenseɾ�����ݿ���ExpenseRecharge����
     * @param expense ExpenseRecharge��Expense
     */
    public void deleteExpenseRechargeByExpense(Expense expense);
    
    /**
     * ����ָ����Expense�������ExpenseRecharge�б�
     * @param expense ExpenseRecharge��Expense����
     * @return
     */
    public List getExpenseRechargeListByExpense(Expense expense);
    
    /**
     * ����ָ����ExpenseRow�������ݿ�
     * 
     * @param expenseRow
     *            Ҫ�����ExpenseRow����
     */
    public void saveExpenseRow(ExpenseRow expenseRow);
    
    /**
     * ����Expenseɾ�����ݿ���ExpenseRecharge����
     * @param expense ExpenseRecharge��Expense
     */
    public void deleteExpenseRowByExpense(Expense expense);
    
    /**
     * ����ָ����Expense�������ExpenseRow�б�
     * @param expense ExpenseRow��Expense����
     * @return
     */
    public List getExpenseRowListByExpense(Expense expense);
    
    /**
     * ����ָ����ExpenseCell�������ݿ�
     * 
     * @param expenseCell
     *            Ҫ�����ExpenseCell����
     */
    public void saveExpenseCell(ExpenseCell expenseCell);
    
    /**
     * ����Expenseɾ�����ݿ���ExpenseRecharge����
     * @param expense ExpenseRecharge��Expense
     */
    public void deleteExpenseCellByExpense(Expense expense);

    /**
     * ����ָ����Expense�������ExpenseCell�б�
     * @param expense ExpenseCell��Expense����
     * @return
     */
    public List getExpenseCellListByExpense(Expense expense);
    
    /**
     * �����ݿ���ɾ��Expense����
     * @param expenseId Expense��Id
     */
    public void deleteExpense(String expenseId);

    /**
     * ����ָ����ExpenseHistory�������ݿ�
     * 
     * @param expenseHistory
     *            Ҫ�����ExpenseHistory����
     */
    public void saveExpenseHistory(ExpenseHistory expenseHistory);
    
    /**
     * �����ݿ���ɾ��ָ����ExpenseHistory����
     * @param expenseHistory ָ����ExpenseHistory����
     */
    public void deleteExpenseHistory(ExpenseHistory expenseHistory);
    
    /**
     * ����ָ����ExpenseHistoryRow�������ݿ�
     * 
     * @param expenseHistoryRow
     *            Ҫ�����ExpenseHistoryRow����
     */
    public void saveExpenseHistoryRow(ExpenseHistoryRow expenseHistoryRow);
    
    /**
     * �����ݿ���ɾ��ָ����ExpenseHistoryRow����
     * @param expenseHistoryRow ָ����ExpenseHistoryRow����
     */
    public void deleteExpenseHistoryRow(ExpenseHistoryRow expenseHistoryRow);

    /**
     * ����ָ����ExpenseHistoryCell�������ݿ�
     * 
     * @param expenseHistoryCell
     *            Ҫ�����ExpenseHistoryCell����
     */
    public void saveExpenseHistoryCell(ExpenseHistoryCell expenseHistoryCell);
    
    /**
     * �����ݿ���ɾ��ָ����ExpenseHistoryCell����
     * @param expenseHistoryCell ָ����ExpenseHistoryCell����
     */
    public void deleteExpenseHistoryCell(ExpenseHistoryCell expenseHistoryCell);
    
    /**
     * �����prefixΪ��ʼ�����Expense��id
     * @param prefix
     * @return
     */
    public String getMaxExpenseIdBeginWith(String prefix);
    
    /**
     * ����Expenseɾ�����ݿ���ExpenseHistory����
     * @param expense ExpenseHistory��Expense
     */
    public void deleteExpenseHistoryListByExpense(Expense expense);
    
    /**
     * ����Expenseɾ�����ݿ���ExpenseHistoryCell����
     * @param expense ExpenseHistoryCell��Expense
     */
    public void deleteExpenseHistoryCellListByExpense(Expense expense);
    
    /**
     * ����Expenseɾ�����ݿ���ExpenseHistoryRow����
     * @param expense ExpenseHistoryRow��Expense
     */
    public void deleteExpenseHistoryRowListByExpense(Expense expense);

    /**
     * ����Expenseɾ�����ݿ���ExpenseClaim����
     * @param expense ExpenseClaim��Expense
     */
    public void deleteExpenseClaimListByExpense(Expense expense);

    /**
     * getColumnDescription of expense
     * @param ep
     * @param esc
     * @return
     */
    public String getColumnDescription(Expense ep, ExpenseSubCategory esc);

    /**
     * get finance not responded Expense list
     * @param now
     * @param smr
     * @return Expense List
     */
    public List getFinanceNotRespondedExpenseList(Date now, SiteMailReminder smr);
    
    public List getExpenseCategoriesAndUserageAmountBySiteId(Integer siteId);
}
