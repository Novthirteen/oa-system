/* =====================================================================
 *
 * Copyright (c) Atos Origin INFORMATION TECHNOLOGY All rights reserved.
 *
 * =====================================================================
 */
package com.aof.service.admin;

import java.util.List;
import java.util.Map;

import com.aof.model.admin.PurchaseCategory;
import com.aof.model.admin.PurchaseSubCategory;
import com.aof.model.admin.query.PurchaseSubCategoryQueryOrder;

/**
 * �������PurchaseSubCategory�Ľӿ�
 * 
 * @author ych
 * @version 1.0 (Nov 13, 2005)
 */
public interface PurchaseSubCategoryManager {

    /**
     * �����ݿ�ȡ��ָ��id��PurchaseSubCategory
     * 
     * @param id
     *            PurchaseSubCategory��id
     * @return ����ָ����PurchaseSubCategory
     * 
     */
    public PurchaseSubCategory getPurchaseSubCategory(Integer id);

    /**
     * ����ָ����PurchaseSubCategory�������ݿ�
     * 
     * @param purchaseSubCategory
     *            Ҫ�����PurchaseSubCategory����
     * @return ������PurchaseSubCategory����
     * 
     */
    public PurchaseSubCategory insertPurchaseSubCategory(PurchaseSubCategory purchaseSubCategory);

    /**
     * ����ָ����PurchaseSubCategory�������ݿ�
     * 
     * @param purchaseSubCategory
     *            Ҫ���µ�PurchaseSubCategory����
     * @return ���º��PurchaseSubCategory����
     * 
     */
    public PurchaseSubCategory updatePurchaseSubCategory(PurchaseSubCategory purchaseSubCategory);

    /**
     * ���ط��ϲ�ѯ������PurchaseSubCategory�������
     * 
     * @param conditions
     *            ������ѯ����������ֵӳ���Map�����в�ѯ����Ӧ������PurchaseSubCategoryQueryCondition���Ԥ���峣��
     * @return ���ϲ�ѯ������PurchaseSubCategory�������
     * 
     */
    public int getPurchaseSubCategoryListCount(Map condtions);

    /**
     * ���ط��ϲ�ѯ������PurchaseSubCategory�����б�
     * 
     * @param conditions
     *            ������ѯ����������ֵӳ���Map�����в�ѯ����Ӧ������PurchaseSubCategoryQueryCondition���Ԥ���峣��
     * @param pageNo
     *            �ڼ�ҳ����pageSizeΪҳ�Ĵ�С��pageSizeΪ-1ʱ���Ըò���
     * @param pageSize
     *            ҳ�Ĵ�С��-1��ʾ����ҳ
     * @param order
     *            ����������null��ʾ������
     * @param descend
     *            false��ʾ����true��ʾ����
     * @return ���ϲ�ѯ������PurchaseSubCategory�����б�
     * 
     */
    public List getPurchaseSubCategoryList(Map condtions, int pageNo, int pageSize, PurchaseSubCategoryQueryOrder order, boolean descend);

    /**
     * ����ָ��PurchaseCategory������enabled��PurchaseSubCategory�����б�
     * 
     * @param category
     *            ָ����PurchaseCategory
     * @return ����enabled��PurchaseSubCategory�����б�
     */
    public List getEnabledPurchaseSubCategoryOfPurchaseCategory(PurchaseCategory category);
}
