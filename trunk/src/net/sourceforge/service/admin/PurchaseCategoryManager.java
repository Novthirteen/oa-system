/* =====================================================================
 *
 * Copyright (c) Sourceforge INFORMATION TECHNOLOGY All rights reserved.
 *
 * =====================================================================
 */
package net.sourceforge.service.admin;

import java.util.List;
import java.util.Map;

import net.sourceforge.model.admin.PurchaseCategory;
import net.sourceforge.model.admin.Site;
import net.sourceforge.model.admin.query.PurchaseCategoryQueryOrder;

/**
 * �������PurchaseCategory�Ľӿ�
 * 
 * @author ych
 * @version 1.0 (Nov 13, 2005)
 */
public interface PurchaseCategoryManager {

    /**
     * �����ݿ�ȡ��ָ��id��PurchaseCategory
     * 
     * @param id
     *            PurchaseCategory��id
     * @return ����ָ����PurchaseCategory
     * 
     */
    public PurchaseCategory getPurchaseCategory(Integer id);

    /**
     * ����ָ����PurchaseCategory�������ݿ�
     * 
     * @param purchaseCategory
     *            Ҫ�����PurchaseCategory����
     * @return ������PurchaseCategory����
     * 
     */
    public PurchaseCategory insertPurchaseCategory(PurchaseCategory purchaseCategory);

    /**
     * ����ָ����PurchaseCategory�������ݿ�
     * 
     * @param purchaseCategory
     *            Ҫ���µ�PurchaseCategory����
     * @return ���º��PurchaseCategory����
     * 
     */
    public PurchaseCategory updatePurchaseCategory(PurchaseCategory purchaseCategory);

    /**
     * ���ط��ϲ�ѯ������PurchaseCategory�������
     * 
     * @param conditions
     *            ������ѯ����������ֵӳ���Map�����в�ѯ����Ӧ������PurchaseCategoryQueryCondition���Ԥ���峣��
     * @return ���ϲ�ѯ������PurchaseCategory�������
     * 
     */
    public int getPurchaseCategoryListCount(Map condtions);

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
     * 
     */
    public List getPurchaseCategoryList(Map condtions, int pageNo, int pageSize, PurchaseCategoryQueryOrder order, boolean descend);

    /**
     * ����siteȡ��enabled��PurchaseCategory�б�
     * 
     * @param site
     *            PurchaseCategory��site
     * @return enabled��PurchaseCategory�б�
     * 
     */
    public List getEnabledPurchaseCategoryOfSite(Site site);

    /**
     * ����siteȡ��enabled��PurchaseCategory�б����Global����PurchaseCategory
     * 
     * @param site
     *            PurchaseCategory��site
     * @return enabled��PurchaseCategory�б�
     * 
     */
    public List getEnabledPurchaseCategoryOfSiteIncludeGlobal(Site site);
        
    /**
     * ����siteȡ��enabled��PurchaseCategory��PurchaseSubCategory�б�
     * 
     * @param site
     *            PurchaseCategory��site
     * @return enabled��PurchaseCategory��PurchaseSubCategory�б�
     * 
     */
    public List getEnabledPurchaseCategorySubCategoryOfSite(Site site);
    
    /**
     * ����siteȡ��enabled��PurchaseCategory��PurchaseSubCategory�б����Global����PurchaseCategory
     * 
     * @param site
     *            PurchaseCategory��site
     * @return enabled��PurchaseCategory��PurchaseSubCategory�б�
     * 
     */
    public List getEnabledPurchaseCategorySubCategoryOfSiteIncludeGlobal(Site site);
    

    /**
     * ȡ������enabled��Global��PurchaseCategory��PurchaseSubCategory�б�
     * 
     * @return ����enabled��PurchaseCategory��PurchaseSubCategory�б�
     * 
     */
    public List getEnabledPurchaseCategorySubCategoryOfGlobal();

    /**
     * Ϊ������Site List�е�ÿ��Site���enabled��PurchaseCategory��PurchaseSubCategory�б�
     * 
     * @param siteList
     *            Site������б�
     */
    public void fillEnabledPurchaseCategorySubCategoryForSiteList(List siteList);

}
