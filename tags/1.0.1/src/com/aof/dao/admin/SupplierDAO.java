/* =====================================================================
 *
 * Copyright (c) Atos Origin INFORMATION TECHNOLOGY All rights reserved.
 *
 * =====================================================================
 */

package com.aof.dao.admin;

import java.util.Date;
import java.util.List;
import java.util.Map;

import com.aof.model.admin.Currency;
import com.aof.model.admin.GlobalMailReminder;
import com.aof.model.admin.PurchaseSubCategory;
import com.aof.model.admin.Site;
import com.aof.model.admin.Supplier;
import com.aof.model.admin.query.SupplierQueryOrder;

/**
 * �������Supplier�Ľӿ�
 * 
 * @author ych
 * @version 1.0 (Nov 13, 2005)
 */
public interface SupplierDAO {

    /**
     * �����ݿ�ȡ��ָ��id��Supplier
     * 
     * @param id
     *            Supplier��id
     * @return ����ָ����Supplier
     */
    public Supplier getSupplier(Integer id);

    /**
     * ���ط��ϲ�ѯ������Supplier�������
     * 
     * @param conditions
     *            ������ѯ����������ֵӳ���Map�����в�ѯ����Ӧ������SupplierQueryCondition���Ԥ���峣��
     * @return ���ϲ�ѯ������Supplier�������
     */
    public int getSupplierListCount(Map conditions);

    /**
     * ���ط��ϲ�ѯ������Supplier�����б�
     * 
     * @param conditions
     *            ������ѯ����������ֵӳ���Map�����в�ѯ����Ӧ������SupplierQueryCondition���Ԥ���峣��
     * @param pageNo
     *            �ڼ�ҳ����pageSizeΪҳ�Ĵ�С��pageSizeΪ-1ʱ���Ըò���
     * @param pageSize
     *            ҳ�Ĵ�С��-1��ʾ����ҳ
     * @param order
     *            ����������null��ʾ������
     * @param descend
     *            false��ʾ����true��ʾ����
     * @return ���ϲ�ѯ������Supplier�����б�
     */
    public List getSupplierList(Map conditions, int pageNo, int pageSize, SupplierQueryOrder order, boolean descend);

    /**
     * ����ָ����Supplier�������ݿ�
     * 
     * @param supplier
     *            Ҫ�����Supplier����
     * @return ������Supplier����
     */
    public Supplier insertSupplier(Supplier supplier);

    /**
     * ����ָ����Supplier�������ݿ�
     * 
     * @param supplier
     *            Ҫ���µ�Supplier����
     * @return ���º��Supplier����
     */
    public Supplier updateSupplier(Supplier supplier);

    /**
     * ��������Supplierʱ��Ҫ��code
     * 
     * @return ����Supplierʱ��Ҫ��code
     */
    public String getLastSupplierCode();

    /**
     * ��������code�Ƿ��Ѿ�ʹ��
     * 
     * @param code
     *            Supplier��Code
     * @param site
     *            Supplier��Site
     * @return true�Ѿ�ʹ�ã�false��δʹ��
     */
    public boolean isCodeUsed(String code, Site site);

    /**
     * Ϊָ����PurchaseSubCategory�����ʺ��ڲɹ���Supplier�б��б��е�Supplier�����items�����Ѿ�����˺��ʵ�SupplierItem����
     * �ʺ��ڲɹ�����ָ: 1��Supplier��SupplierItem��״̬��Ϊenabled;
     * 2��SupplierItem��purchaseSubCategory����Ϊָ����PurchaseSubCategory;
     * 3��SupplierItem��currency������site�Ļ��ʱ���ά������Ӧ�Ļ���
     * 
     * @param site
     *            ָ����Site����
     * @param psc
     *            ָ����PurchaseSubCategory����
     * @param exchangeRateList
     *            ָ����ExchangeRate������б�
     * @return Supplier�б�
     */
    public List getSuitableSupplierListForPurchase(Site site, PurchaseSubCategory psc, List exchangeRateList);

    /**
     * Ϊָ����Supplier,PurchaseSubCategory�����ʺ��ڲɹ���SupplierItem�б�
     * �ʺ��ڲɹ�����ָ: 1��SupplierItem��״̬��Ϊenabled;
     * 2��SupplierItem��purchaseSubCategory����Ϊָ����PurchaseSubCategory;
     * 3��SupplierItem��currency������currency
     * 
     * @param supplier
     * @param psc
     * @param currency
     * @return
     */
    public List getSuitableSupplierItemListForPurchase(Supplier supplier, PurchaseSubCategory psc, Currency currency);

    /**
     * ���ָ��site����Ҫemail���ѵ���δresponse��supplier�б�
     * @param site
     * @param time
     * @param gmr
     * @return
     */
    public List getSupplierMaintainerNotResponsedList(Site site, Date now, GlobalMailReminder gmr);
    
}
