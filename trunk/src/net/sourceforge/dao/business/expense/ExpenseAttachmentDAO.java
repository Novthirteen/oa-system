/* =====================================================================
 *
 * Copyright (c) Sourceforge INFORMATION TECHNOLOGY All rights reserved.
 *
 * =====================================================================
 */
package net.sourceforge.dao.business.expense;

import java.io.InputStream;
import java.util.List;
import java.util.Map;

import net.sourceforge.model.business.expense.Expense;
import net.sourceforge.model.business.expense.ExpenseAttachment;
import net.sourceforge.model.business.expense.query.ExpenseAttachmentQueryOrder;

/**
 * �������ExpenseAttachment�Ľӿ�
 * @author ych
 * @version 1.0 (Nov 23, 2005)
 */
public interface ExpenseAttachmentDAO{

    /**
     * �����ݿ�ȡ��ָ��id��ExpenseAttachment
     * 
     * @param id
     *            ExpenseAttachment��id
     * @return ����ָ����ExpenseAttachment
     */
    public ExpenseAttachment getExpenseAttachment(Integer id);
	
    /**
     * �����ݿ�ɾ��ָ��id��ExpenseAttachment
     * 
     * @param id
     *            ExpenseAttachment��id
     */
    public void deleteExpenseAttachment(Integer id);
    
    /**
     * ���ط��ϲ�ѯ������ExpenseAttachment�������
     * 
     * @param conditions
     *            ������ѯ����������ֵӳ���Map�����в�ѯ����Ӧ������ExpenseAttachmentQueryCondition���Ԥ���峣��
     * @return ���ϲ�ѯ������ExpenseAttachment�������
     */
	public int getExpenseAttachmentListCount(Map conditions);
	
     /**
     * ���ط��ϲ�ѯ������ExpenseAttachment�����б�
     * 
     * @param conditions
     *            ������ѯ����������ֵӳ���Map�����в�ѯ����Ӧ������ExpenseAttachmentQueryCondition���Ԥ���峣��
     * @param pageNo
     *            �ڼ�ҳ����pageSizeΪҳ�Ĵ�С��pageSizeΪ-1ʱ���Ըò���
     * @param pageSize
     *            ҳ�Ĵ�С��-1��ʾ����ҳ
     * @param order
     *            ����������null��ʾ������
     * @param descend
     *            false��ʾ����true��ʾ����
     * @return ���ϲ�ѯ������ExpenseAttachment�����б�
     */
    public List getExpenseAttachmentList(Map conditions, int pageNo, int pageSize, ExpenseAttachmentQueryOrder order, boolean descend);

    /**
     * ����ָ����ExpenseAttachment�������ݿ�
     * 
     * @param ExpenseAttachment
     *            Ҫ�����ExpenseAttachment����
     * @return ������ExpenseAttachment����
     */
    public ExpenseAttachment insertExpenseAttachment(ExpenseAttachment expenseAttachment);
    
    /**
     * ����ָ����ExpenseAttachment�������ݿ�
     * 
     * @param ExpenseAttachment
     *            Ҫ���µ�ExpenseAttachment����
     * @return ���º��ExpenseAttachment����
     */
    public ExpenseAttachment updateExpenseAttachment(ExpenseAttachment expenseAttachment);

    /**
     * ����ָ��id��ExpenseAttachment����
     * 
     * @param id
     *            ExpenseAttachment��id
     * @param inputStream
     *            ExpenseAttachment������
     */
    public void saveExpenseAttachmentContent(Integer id, InputStream inputStream);

    /**
     * ����ָ��id��ExpenseAttachment������
     * 
     * @param id
     *            ExpenseAttachment��id
     * @return ָ��id��ExpenseAttachment������
     */
    public InputStream getExpenseAttachmentContent(Integer id);
    
    /**
     * ɾ��ָ��Expense������ExpenseAttachment
     * @param expense ExpenseAttachment��expense
     */
    public void deleteExpenseAttachmentByExpense(Expense expense);
    
}
