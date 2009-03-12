/* =====================================================================
 *
 * Copyright (c) Sourceforge INFORMATION TECHNOLOGY All rights reserved.
 *
 * =====================================================================
 */
package net.sourceforge.service.admin;

import java.util.List;
import java.util.Map;

import net.sourceforge.model.admin.Currency;
import net.sourceforge.model.admin.PurchaseSubCategory;
import net.sourceforge.model.admin.Site;
import net.sourceforge.model.admin.Supplier;
import net.sourceforge.model.admin.query.SupplierQueryOrder;

/**
 * �������Supplier�Ľӿ�
 * 
 * @author ych
 * @version 1.0 (Nov 13, 2005)
 */
public interface SupplierManager {

    /**
     * �����ݿ�ȡ��ָ��id��Supplier
     * 
     * @param id
     *            Supplier��id
     * @return ����ָ����Supplier
     * 
     */
    public Supplier getSupplier(Integer id);

    /**
     * ����ָ����Supplier�������ݿ�
     * 
     * @param supplier
     *            Ҫ�����Supplier����
     * @return ������Supplier����
     * 
     */
    public Supplier insertSupplier(Supplier supplier);

    /**
     * ����ָ����Supplier�������ݿ�
     * 
     * @param supplier
     *            Ҫ���µ�Supplier����
     * @return ���º��Supplier����
     * 
     */
    public Supplier updateSupplier(Supplier supplier);

    /**
     * ���ط��ϲ�ѯ������Supplier�������
     * 
     * @param conditions
     *            ������ѯ����������ֵӳ���Map�����в�ѯ����Ӧ������SupplierQueryCondition���Ԥ���峣��
     * @return ���ϲ�ѯ������Supplier�������
     * 
     */
    public int getSupplierListCount(Map condtions);

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
     * 
     */
    public List getSupplierList(Map condtions, int pageNo, int pageSize, SupplierQueryOrder order, boolean descend);

    /**
     * ȷ��ָ����Supplier
     * 
     * @param supplier
     *            ��Ҫȷ�ϵ�Supplier
     * 
     */
    public void confirmSupplier(Supplier supplier);

    /**
     * ȡ��ȷ��ָ����Supplier
     * 
     * @param supplier
     *            ��Ҫȡ��ȷ�ϵ�Supplier
     * 
     */
    public void cancelSupplier(Supplier supplier);

    /**
     * ��ָ��id��Supplier������������
     * 
     * @param id
     *            ��Ҫ�������������Supplier��id
     * @param promoteMessage
     *            ����������
     * 
     */
    public Supplier requestPromote(Integer id, String promoteMessage);

    /**
     * ��Ӧָ��id��Supplier��������
     * 
     * @param id
     *            ��ӦSupplier��id
     * 
     */
    public Supplier responsePromote(Integer id);

    /**
     * ����ָ����Supplier
     * 
     * @param supplier
     *            ��Ҫ������Supplier
     * 
     */
    public void promoteCreate(Supplier supplier);

    /**
     * ȡ������ָ����Supplier�Ĳ���
     * 
     * @param supplier
     *            ��Ҫȡ��������Supplier
     * 
     */
    public void promoteDelete(Supplier supplier);

    /**
     * �õ�ĳsite�����й�Ӧ��
     * 
     * @param site
     * @return
     */
    public List getEnabledAirTicketSuppliersForSiteAndIncludeGlobal(Site site);
    
    public List getEnabledNonAirTicketSuppliersForSiteAndIncludeGlobal(Site site);
    
    /**
     * �����Ƿ����ݿ�������ָ��Code��Site������
     * 
     * @param code
     *            Supplier��Code
     * @param site
     *            Supplier��Site
     * @return
     */
    public boolean isCodeUsed(String code, Site site);

    /**
     * Ϊָ����PurchaseSubCategory�����ʺ��ڲɹ���Supplier�б��б��е�Supplier�����items�����Ѿ�����˺��ʵ�SupplierItem����
     * �ʺ��ڲɹ�����ָ: 1��Supplier��SupplierItem��״̬��Ϊenabled;
     * 2��SupplierItem��purchaseSubCategory����Ϊָ����PurchaseSubCategory;
     * 3��SupplierItem��currency������ָ����exchangeRateList����
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
    public List getSuitableSupplierItemListForPurchase(Supplier supplier,PurchaseSubCategory psc,Currency currency);

}
