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
import net.sourceforge.model.admin.query.CurrencyQueryOrder;

/**
 * �������Currency�Ľӿ�
 * @author ych
 * @version 1.0 (Nov 13, 2005)
 */
public interface CurrencyManager {
	
    /**
     * �����ݿ�ȡ��ָ��code��Currency
     * 
     * @param code
     *            Currency��code
     * @return ����ָ����Currency
     * 
     */
	public Currency getCurrency(String code) ;
    
    /**
     * ���ط��ϲ�ѯ������Currency�������
     * 
     * @param conditions
     *            ������ѯ����������ֵӳ���Map�����в�ѯ����Ӧ������CurrencyQueryCondition���Ԥ���峣��
     * @return ���ϲ�ѯ������Currency�������
     * 
     */
	public int getCurrencyListCount(Map conditions) ;

    /**
     * ���ط��ϲ�ѯ������Currency�����б�
     * 
     * @param conditions
     *            ������ѯ����������ֵӳ���Map�����в�ѯ����Ӧ������CurrencyQueryCondition���Ԥ���峣��
     * @param pageNo
     *            �ڼ�ҳ����pageSizeΪҳ�Ĵ�С��pageSizeΪ-1ʱ���Ըò���
     * @param pageSize
     *            ҳ�Ĵ�С��-1��ʾ����ҳ
     * @param order
     *            ����������null��ʾ������
     * @param descend
     *            false��ʾ����true��ʾ����
     * @return ���ϲ�ѯ������Currency�����б�
     * 
     */
    public List getCurrencyList(Map conditions, int pageNo, int pageSize, CurrencyQueryOrder order, boolean descend) ;
    
    /**
     * ����ָ����Currency�������ݿ�
     * 
     * @param currency
     *            Ҫ�����Currency����
     * @return ������Currency����
     * 
     */
    public Currency insertCurrency(Currency currency) ;
    
    /**
     * ����ָ����Currency�������ݿ�
     * 
     * @param currency
     *            Ҫ���µ�Currency����
     * @return ���º��Currency����
     * 
     */
    public Currency updateCurrency(Currency currency) ;
    
    /**
     * ��������enabled��Currency�б�
     * @return ����enabled��Currency�б�
     * 
     */
    public List getAllEnabledCurrencyList() ;

    /**
     * ��������enabled��Currency�б����ָ��code��Currency
     * @param code Currency��code
     * @return ����enabled��Currency�б����ָ��code��Currency
     * 
     */
    public List getAllEnabledCurrencyListAndIncludeThis(String code) ;

}
