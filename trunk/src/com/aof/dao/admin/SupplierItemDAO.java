/* =====================================================================
 *
 * Copyright (c) Atos Origin INFORMATION TECHNOLOGY All rights reserved.
 *
 * =====================================================================
 */

package com.aof.dao.admin;

import java.util.List;
import java.util.Map;

import com.aof.model.admin.PurchaseSubCategory;
import com.aof.model.admin.Supplier;
import com.aof.model.admin.SupplierItem;
import com.aof.model.admin.query.SupplierItemQueryOrder;
/**
 * �������SupplierItem�Ľӿ�
 * @author ych
 * @version 1.0 (Nov 13, 2005)
 */
public interface SupplierItemDAO{
    
    /**
     * �����ݿ�ȡ��ָ��id��SupplierItem
     * 
     * @param id
     *            SupplierItem��id
     * @return ����ָ����SupplierItem
     */
	public SupplierItem getSupplierItem(Integer id);
	
    /**
     * ���ط��ϲ�ѯ������SupplierItem�������
     * 
     * @param conditions
     *            ������ѯ����������ֵӳ���Map�����в�ѯ����Ӧ������SupplierItemQueryCondition���Ԥ���峣��
     * @return ���ϲ�ѯ������SupplierItem�������
     */
	public int getSupplierItemListCount(Map conditions);
	
    /**
     * ���ط��ϲ�ѯ������SupplierItem�����б�
     * 
     * @param conditions
     *            ������ѯ����������ֵӳ���Map�����в�ѯ����Ӧ������SupplierItemQueryCondition���Ԥ���峣��
     * @param pageNo
     *            �ڼ�ҳ����pageSizeΪҳ�Ĵ�С��pageSizeΪ-1ʱ���Ըò���
     * @param pageSize
     *            ҳ�Ĵ�С��-1��ʾ����ҳ
     * @param order
     *            ����������null��ʾ������
     * @param descend
     *            false��ʾ����true��ʾ����
     * @return ���ϲ�ѯ������SupplierItem�����б�
     */
    public List getSupplierItemList(Map conditions, int pageNo, int pageSize, SupplierItemQueryOrder order, boolean descend);

    /**
     * ����ָ����SupplierItem�������ݿ�
     * 
     * @param supplierItem
     *            Ҫ�����SupplierItem����
     * @return ������SupplierItem����
     */
    public SupplierItem insertSupplierItem(SupplierItem supplierItem);
    
    /**
     * ����ָ����SupplierItem�������ݿ�
     * 
     * @param supplierItem
     *            Ҫ���µ�SupplierItem����
     * @return ���º��SupplierItem����
     */
    public SupplierItem updateSupplierItem(SupplierItem supplierItem);
    
    /**
     * ����ָ��supplier������SupplierItem�б�
     * @param supplier ��Ҫ����SupplierItem��supplier 
     * @return ָ��supplier������SupplierItem�б�
     */
    public List getSupplierItemListBySupplier(Supplier supplier);

    /**
     * �����ݿ��Ƴ�ָ��id��SupplierItem����
     * @param id ��Ҫ�Ƴ���SupplierItem��id
     */
    public void removeSupplierItem(Integer id) ;

    /**
     * ����ָ��supplier��SupplierItem�б�,������ЩSupplierItem��PurchaseCategory����Global������ɲ���������Supplier
     * 
     * @param supplier
     *            ��Ҫ����SupplierItem��supplier
     * @return ָ��supplier������SupplierItem�б�
     */
    public List getSupplierItemListConflictWithPromoteBySupplier(Supplier supplier);

    /**
     * 
     * @param supplierId
     * @param purchaseSubCategoryId
     * @param destPurchaseSubCategory
     */
    public void changePurchaseSubCategoryBySupplierAndPurchaseSubCategory(Integer supplierId, Integer purchaseSubCategoryId, PurchaseSubCategory destPurchaseSubCategory);

}
