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
import com.aof.model.business.expense.ExpenseApproveRequest;
import com.aof.model.business.expense.query.ExpenseApproveRequestQueryOrder;
/**
 * �������ExpenseApproveRequest�Ľӿ�
 * @author ych
 * @version 1.0 (Nov 17, 2005)
 */
public interface ExpenseApproveRequestManager {

    /**
     * �����ݿ�ȡ��ָ��approveRequestId��approver��ExpenseApproveRequest
     * @param approveRequestId ExpenseApproveRequest��approveRequestId
     * @param approver ExpenseApproveRequest��approver
     * @return ����ָ����ExpenseApproveRequest
     */
    public ExpenseApproveRequest getExpenseApproveRequest(String approveRequestId, User approver);
    
    /**
     * �����ݿ�ȡ��ָ��approveRequestId��ExpenseApproveRequest�б�
     * @param approveRequestId ExpenseApproveRequest��approveRequestId
     * @return ����ָ����ExpenseApproveRequest�б�
     */
    public List getExpenseApproveRequestListByApproveRequestId(String approveRequestId);

    /**
     * ����ָ����ExpenseApproveRequest�������ݿ�
     * 
     * @param expenseApproveRequest
     *            Ҫ�����ExpenseApproveRequest����
     * @return ������ExpenseApproveRequest����
     */
    public ExpenseApproveRequest insertExpenseApproveRequest(ExpenseApproveRequest expenseApproveRequest);
    
    /**
     * ����ָ����ExpenseApproveRequest�������ݿ�
     * 
     * @param expenseApproveRequest
     *            Ҫ���µ�ExpenseApproveRequest����
     * @return ���º��ExpenseApproveRequest����
     */
    public ExpenseApproveRequest updateExpenseApproveRequest(ExpenseApproveRequest expenseApproveRequest);

    /**
     * ���ط��ϲ�ѯ������ExpenseApproveRequest�������
     * 
     * @param conditions
     *            ������ѯ����������ֵӳ���Map�����в�ѯ����Ӧ������ExpenseApproveRequestQueryCondition���Ԥ���峣��
     * @return ���ϲ�ѯ������ExpenseApproveRequest�������
     */
    public int getExpenseApproveRequestListCount(Map condtions);

    /**
     * ���ط��ϲ�ѯ������ExpenseApproveRequest�����б�
     * 
     * @param conditions
     *            ������ѯ����������ֵӳ���Map�����в�ѯ����Ӧ������ExpenseApproveRequestQueryCondition���Ԥ���峣��
     * @param pageNo
     *            �ڼ�ҳ����pageSizeΪҳ�Ĵ�С��pageSizeΪ-1ʱ���Ըò���
     * @param pageSize
     *            ҳ�Ĵ�С��-1��ʾ����ҳ
     * @param order
     *            ����������null��ʾ������
     * @param descend
     *            false��ʾ����true��ʾ����
     * @return ���ϲ�ѯ������ExpenseApproveRequest�����б�
     */
    public List getExpenseApproveRequestList(Map condtions, int pageNo, int pageSize, ExpenseApproveRequestQueryOrder order, boolean descend);
    
    /**
     * ͨ��ָ����ExpenseApproveRequest
     * @param expenseApproveRequest ������ExpenseApproveRequest
     * @param currentUser  ��ǰ�����ˣ����ڼ�¼log 
     */
    public void approveExpenseApproveRequest(ExpenseApproveRequest expenseApproveRequest, User currentUser);
    
    /**
     * �ܾ�ָ����ExpenseApproveRequest
     * @param expenseApproveRequest ������ExpenseApproveRequest
     * @param currentUser  ��ǰ�����ˣ����ڼ�¼log 
     */
    public void rejectExpenseApproveRequest(ExpenseApproveRequest expenseApproveRequest, User currentUser);

    /**
     * ͨ��ָ����ExpenseApproveRequest������Expense
     * @param expenseApproveRequest     ������ExpenseApproveRequest
     * @param expense                   Ҫ�����Expense
     * @param expenseRowList
     * @param rechargeList
     * @param currentUser  ��ǰ�����ˣ����ڼ�¼log 
     */
    public void approveExpenseApproveRequestAndUpdateExpense(ExpenseApproveRequest expenseApproveRequest, Expense expense, List expenseRowList, List rechargeList, User currentUser);
    
    
}
