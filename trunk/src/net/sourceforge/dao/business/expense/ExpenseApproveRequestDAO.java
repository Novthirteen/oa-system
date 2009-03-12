/* =====================================================================
 *
 * Copyright (c) Sourceforge INFORMATION TECHNOLOGY All rights reserved.
 *
 * =====================================================================
 */
package net.sourceforge.dao.business.expense;

import java.util.List;
import java.util.Map;

import net.sourceforge.dao.business.BaseApproveRequestDAO;
import net.sourceforge.model.admin.User;
import net.sourceforge.model.business.expense.Expense;
import net.sourceforge.model.business.expense.ExpenseApproveRequest;
import net.sourceforge.model.business.expense.query.ExpenseApproveRequestQueryOrder;

/**
 * �������ExpenseApproveRequest�Ľӿ�
 * @author ych
 * @version 1.0 (Nov 18, 2005)
 */
public interface ExpenseApproveRequestDAO extends BaseApproveRequestDAO {

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
     * ���ط��ϲ�ѯ������ExpenseApproveRequest�������
     * 
     * @param conditions
     *            ������ѯ����������ֵӳ���Map�����в�ѯ����Ӧ������ExpenseApproveRequestQueryCondition���Ԥ���峣��
     * @return ���ϲ�ѯ������ExpenseApproveRequest�������
     */
	public int getExpenseApproveRequestListCount(Map conditions);
	
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
    public List getExpenseApproveRequestList(Map conditions, int pageNo, int pageSize, ExpenseApproveRequestQueryOrder order, boolean descend);

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
     * ɾ��ָ��Expense��ExpenseApproveRequest����
     * @param expense
     */
    public void deleteExpenseApproveRequestByExpense(Expense expense);
    
}
