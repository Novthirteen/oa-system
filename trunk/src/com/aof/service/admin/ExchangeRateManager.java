/* =====================================================================
 *
 * Copyright (c) Atos Origin INFORMATION TECHNOLOGY All rights reserved.
 *
 * =====================================================================
 */

package com.aof.service.admin;

import java.util.List;
import java.util.Map;

import com.aof.model.admin.Currency;
import com.aof.model.admin.ExchangeRate;
import com.aof.model.admin.Site;
import com.aof.model.admin.query.ExchangeRateQueryOrder;

/**
 * �������ExchangeRate�Ľӿ�
 * @author ych
 * @version 1.0 (Nov 13, 2005)
 */
public interface ExchangeRateManager {

    /**
     * �����ݿ�ȡ��ָ��id��ExchangeRate
     * 
     * @param id
     *            ExchangeRate��id
     * @return ����ָ����ExchangeRate
     */
    public ExchangeRate getExchangeRate(Integer id);

    /**
     * �����ݿ�ȡ��ָ��currency��site��ExchangeRate
     * 
     * @param currency
     *            ExchangeRate��currency
     * @param site
     *            ExchangeRate��site
     * 
     * @return ����ָ����ExchangeRate
     */
	public ExchangeRate getExchangeRate(Currency currency,Site site);
	
    /**
     * ����ָ����ExchangeRate�������ݿ�
     * 
     * @param exchangeRate
     *            Ҫ�����ExchangeRate����
     * @return ������ExchangeRate����
     * 
     */
    //public ExchangeRate insertExchangeRate(ExchangeRate exchangeRate) ;
    
    /**
     * ����ָ����ExchangeRate�������ݿ�
     * 
     * @param exchangeRate
     *            Ҫ���µ�ExchangeRate����
     * @return ���º��ExchangeRate����
     * 
     */
    //public ExchangeRate updateExchangeRate(ExchangeRate exchangeRate) ;

    /**
     * ����ָ����ExchangeRate�������ݿ�
     * 
     * @param exchangeRate
     *            Ҫ�����ExchangeRate����
     * @return ������ExchangeRate����
     * 
     */
    public ExchangeRate saveExchangeRate(ExchangeRate exchangeRate) ;

    /**
     * ���ط��ϲ�ѯ������ExchangeRate�������
     * 
     * @param conditions
     *            ������ѯ����������ֵӳ���Map�����в�ѯ����Ӧ������ExchangeRateQueryCondition���Ԥ���峣��
     * @return ���ϲ�ѯ������Currency�������
     * 
     */
    public int getExchangeRateListCount(Map condtions) ;

    /**
     * ���ط��ϲ�ѯ������ExchangeRate�����б�
     * 
     * @param conditions
     *            ������ѯ����������ֵӳ���Map�����в�ѯ����Ӧ������ExchangeRateQueryCondition���Ԥ���峣��
     * @param pageNo
     *            �ڼ�ҳ����pageSizeΪҳ�Ĵ�С��pageSizeΪ-1ʱ���Ըò���
     * @param pageSize
     *            ҳ�Ĵ�С��-1��ʾ����ҳ
     * @param order
     *            ����������null��ʾ������
     * @param descend
     *            false��ʾ����true��ʾ����
     * @return ���ϲ�ѯ������ExchangeRate�����б�
     * 
     */
    public List getExchangeRateList(Map condtions, int pageNo, int pageSize, ExchangeRateQueryOrder order, boolean descend) ;
    
    /**
     * ����ָ��site��ExchangeRate�����б�
     * @param site ExchangeRate��Site
     * @return ָ��site��ExchangeRate�����б�
     */
    public List getExchangeRateListBySite(Site site);
    
    /**
     * ����ָ��site��Currency״̬ΪEnabled��ExchangeRate�����б�
     * @param site ExchangeRate��Site
     * @return ָ��site��Currency״̬ΪEnabled��ExchangeRate�����б�
     */
    public List getEnabledExchangeRateListBySite(Site site);
    
    /**
     * ����ָ��site��Currency״̬ΪEnabled��ExchangeRate�����б�,����site��baseCurrency
     * @param site ExchangeRate��Site
     * @return ָ��site��Currency״̬ΪEnabled��ExchangeRate�����б�,����site��baseCurrency
     */
    public List getEnabledExchangeRateListBySiteIncludeBaseCurrency(Site site);
    
    /**
     * Ϊ������Site List�е�ÿ��Site���enabled��ExchangeRate�б�
     * @param sites ���site�б�
     */
    public void fillEnabledExchangeRateListBySiteListIncludeBaseCurrency(List siteList);
    
}
