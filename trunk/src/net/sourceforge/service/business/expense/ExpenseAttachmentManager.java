/* =====================================================================
 *
 * Copyright (c) Sourceforge INFORMATION TECHNOLOGY All rights reserved.
 *
 * =====================================================================
 */
package net.sourceforge.service.business.expense;

import java.io.InputStream;
import java.util.List;
import java.util.Map;

import net.sourceforge.model.business.expense.ExpenseAttachment;
import net.sourceforge.model.business.expense.query.ExpenseAttachmentQueryOrder;

/**
 * �������ExpenseAttachment�Ľӿ�
 * @author ych
 * @version 1.0 (Nov 23, 2005)
 */
public interface ExpenseAttachmentManager {
    /**
     * �����ݿ�ȡ��ָ��id��ExpenseAttachment
     * 
     * @param id
     *            ExpenseAttachment��id
     * @return ����ָ����ExpenseAttachment
     * 
     */
    public ExpenseAttachment getExpenseAttachment(Integer id);
    
    /**
     * �����ݿ�ɾ��ָ��id��ExpenseAttachment
     * 
     * @param id
     *            ExpenseAttachment��id
     * 
     */
    public void removeExpenseAttachment(Integer id);

    /**
     * ����ָ����ExpenseAttachment�������ݿ�
     * 
     * @param supplierContract
     *            Ҫ�����ExpenseAttachment����
     * @return ������ExpenseAttachment����
     * 
     */
    public ExpenseAttachment insertExpenseAttachment(ExpenseAttachment expenseAttachment) ;
    
    /**
     * ����ָ����ExpenseAttachment�������ݿ�
     * 
     * @param supplierContract
     *            Ҫ���µ�ExpenseAttachment����
     * @return ���º��ExpenseAttachment����
     * 
     */
    public ExpenseAttachment updateExpenseAttachment(ExpenseAttachment expenseAttachment);

    /**
     * ���ط��ϲ�ѯ������ExpenseAttachment�������
     * 
     * @param conditions
     *            ������ѯ����������ֵӳ���Map�����в�ѯ����Ӧ������ExpenseAttachmentQueryCondition���Ԥ���峣��
     * @return ���ϲ�ѯ������ExpenseAttachment�������
     * 
     */
    public int getExpenseAttachmentListCount(Map condtions);

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
     * 
     */
    public List getExpenseAttachmentList(Map condtions, int pageNo, int pageSize, ExpenseAttachmentQueryOrder order, boolean descend);
    
    /**
     * ����ָ����ExpenseAttachment�ļ�����
     * 
     * @param supplierContract
     *            ExpenseAttachment��id
     * @param inputStream
     *            ExpenseAttachment�ļ�������
     * @return ������ExpenseAttachment����
     */
    public ExpenseAttachment insertExpenseAttachment(ExpenseAttachment expenseAttachment, InputStream inputStream);

    /**
     * ����ָ��id��ExpenseAttachment�ļ�������
     * 
     * @param id
     *            ExpenseAttachment��id
     * @return ָ��id��ExpenseAttachment�ļ�������
     */
    public InputStream getExpenseAttachmentContent(Integer id);
    
}
