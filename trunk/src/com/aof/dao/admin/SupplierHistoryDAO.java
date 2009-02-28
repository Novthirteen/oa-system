/* =====================================================================
 *
 * Copyright (c) Atos Origin INFORMATION TECHNOLOGY All rights reserved.
 *
 * =====================================================================
 */

package com.aof.dao.admin;

import java.util.List;
import java.util.Map;

import com.aof.model.admin.Supplier;
import com.aof.model.admin.SupplierHistory;
import com.aof.model.admin.query.SupplierHistoryQueryOrder;

/**
 * �������SupplierHistory�Ľӿ�
 * 
 * @author ych
 * @version 1.0 (Nov 13, 2005)
 */
public interface SupplierHistoryDAO {

    /**
     * �����ݿ�ȡ��ָ��id��SupplierHistory
     * 
     * @param id
     *            SupplierHistory��id
     * @return ����ָ����SupplierHistory
     */
    public SupplierHistory getSupplierHistory(Integer id);

    /**
     * ���ط��ϲ�ѯ������SupplierHistory�������
     * 
     * @param conditions
     *            ������ѯ����������ֵӳ���Map�����в�ѯ����Ӧ������SupplierHistoryQueryCondition���Ԥ���峣��
     * @return ���ϲ�ѯ������SupplierHistory�������
     */
    public int getSupplierHistoryListCount(Map conditions);

    /**
     * ���ط��ϲ�ѯ������SupplierHistory�����б�
     * 
     * @param conditions
     *            ������ѯ����������ֵӳ���Map�����в�ѯ����Ӧ������SupplierHistoryQueryCondition���Ԥ���峣��
     * @param pageNo
     *            �ڼ�ҳ����pageSizeΪҳ�Ĵ�С��pageSizeΪ-1ʱ���Ըò���
     * @param pageSize
     *            ҳ�Ĵ�С��-1��ʾ����ҳ
     * @param order
     *            ����������null��ʾ������
     * @param descend
     *            false��ʾ����true��ʾ����
     * @return ���ϲ�ѯ������SupplierHistory�����б�
     */
    public List getSupplierHistoryList(Map conditions, int pageNo, int pageSize, SupplierHistoryQueryOrder order, boolean descend);

    /**
     * ����ָ����SupplierHistory�������ݿ�
     * 
     * @param supplierHistory
     *            Ҫ�����SupplierHistory����
     * @return ������SupplierHistory����
     */
    public SupplierHistory insertSupplierHistory(SupplierHistory supplierHistory);

    /**
     * ����ָ����SupplierHistory�������ݿ�
     * 
     * @param supplierHistory
     *            Ҫ���µ�SupplierHistory����
     * @return ���º��SupplierHistory����
     */
    public SupplierHistory updateSupplierHistory(SupplierHistory supplierHistory);

    /**
     * ��Supplier��Ϣ����һ�ݵ�SupplierHistory
     * 
     * @param supplier
     *            ��Ҫ���Ƶ�Supplier
     */
    public void copySupplier(Supplier supplier) ;

}