/* =====================================================================
 *
 * Copyright (c) Atos Origin INFORMATION TECHNOLOGY All rights reserved.
 *
 * =====================================================================
 */

package com.aof.dao.admin;

import java.util.List;
import java.util.Map;

import com.aof.model.admin.PurchaseCategory;
import com.aof.model.admin.query.PurchaseCategoryQueryOrder;

/**
 * �������PurchaseCategory�Ľӿ�
 * @author ych
 * @version 1.0 (Nov 13, 2005)
 */
public interface PurchaseCategoryDAO{

    /**
     * �����ݿ�ȡ��ָ��id��PurchaseCategory
     * 
     * @param id
     *            PurchaseCategory��id
     * @return ����ָ����PurchaseCategory
     */
    public PurchaseCategory getPurchaseCategory(Integer id);
	
    /**
     * ���ط��ϲ�ѯ������PurchaseCategory�������
     * 
     * @param conditions
     *            ������ѯ����������ֵӳ���Map�����в�ѯ����Ӧ������PurchaseCategoryQueryCondition���Ԥ���峣��
     * @return ���ϲ�ѯ������PurchaseCategory�������
     */
	public int getPurchaseCategoryListCount(Map conditions);
	
    /**
     * ���ط��ϲ�ѯ������PurchaseCategory�����б�
     * 
     * @param conditions
     *            ������ѯ����������ֵӳ���Map�����в�ѯ����Ӧ������PurchaseCategoryQueryCondition���Ԥ���峣��
     * @param pageNo
     *            �ڼ�ҳ����pageSizeΪҳ�Ĵ�С��pageSizeΪ-1ʱ���Ըò���
     * @param pageSize
     *            ҳ�Ĵ�С��-1��ʾ����ҳ
     * @param order
     *            ����������null��ʾ������
     * @param descend
     *            false��ʾ����true��ʾ����
     * @return ���ϲ�ѯ������PurchaseCategory�����б�
     */
    public List getPurchaseCategoryList(Map conditions, int pageNo, int pageSize, PurchaseCategoryQueryOrder order, boolean descend);

    /**
     * ����ָ����PurchaseCategory�������ݿ�
     * 
     * @param purchaseCategory
     *            Ҫ�����PurchaseCategory����
     * @return ������PurchaseCategory����
     */
    public PurchaseCategory insertPurchaseCategory(PurchaseCategory purchaseCategory);
    
    /**
     * ����ָ����PurchaseCategory�������ݿ�
     * 
     * @param purchaseCategory
     *            Ҫ���µ�PurchaseCategory����
     * @return ���º��PurchaseCategory����
     */
    public PurchaseCategory updatePurchaseCategory(PurchaseCategory purchaseCategory);

}
