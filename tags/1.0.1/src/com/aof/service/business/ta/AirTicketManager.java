/* =====================================================================
 *
 * Copyright (c) Atos Origin INFORMATION TECHNOLOGY All rights reserved.
 *
 * =====================================================================
 */

package com.aof.service.business.ta;

import java.util.Collection;
import java.util.List;
import java.util.Map;

import com.aof.model.admin.Site;
import com.aof.model.admin.User;
import com.aof.model.business.ta.AirTicket;
import com.aof.model.business.ta.TravelApplication;
import com.aof.model.business.ta.query.AirTicketQueryOrder;

/**
 * service interface for domain model air ticket
 * 
 * @author shi1
 * @version 1.0 (Nov 25, 2005)
 */
public interface AirTicketManager {

    /**
     * ����id�õ���Ʊ
     * 
     * @param id
     * @return
     */
    public AirTicket getAirTicket(Integer id);

    /**
     * �½���Ʊ
     * 
     * @param airTicket
     * @return
     */
    public AirTicket insertAirTicket(AirTicket airTicket);

    /**
     * ���»�Ʊ
     * 
     * @param airTicket
     * @return
     */
    public AirTicket updateAirTicket(AirTicket airTicket);
    
    public void deleteAirTicket(Integer id, String taId);

    /**
     * ȡ�öԻ�Ʊ�Ĳ�ѯ�������
     * 
     * @param condtions
     * @return
     */
    public int getAirTicketListCount(Map condtions);

    /**
     * ����������ѯ��Ʊ
     * 
     * @param condtions
     *            ��ѯ����
     * @param pageNo
     *            ҳ���(��0��ʼ,-1�����)
     * @param pageSize
     *            ÿҳ��Ŀ��,-1�����
     * @param order
     *            ��������
     * @param descend
     *            �Ƿ���
     * @return ��ѯ���
     */
    public List getAirTicketList(Map condtions, int pageNo, int pageSize, AirTicketQueryOrder order, boolean descend);

    /**
     * ȡ�ó�������Ļ�Ʊ
     * 
     * @param ta
     * @return
     */
    public AirTicket getTravelApplicationAirTicket(TravelApplication ta);

    /**
     * ȡ��ָ��AirTicket�����AirTicketRecharge�б�
     * 
     * @param at
     *            AirTicket����
     * @return ��AirTicket������ص�AirTicketRecharge�����б�
     */
    public List getAirTicketRechargeList(AirTicket at);

    /**
     * ��ѯ�Ѿ�����PO_ITEM�Ļ�Ʊ
     * 
     * @param condtions
     *            ��ѯ����
     * @return ��ѯ���
     */
    public List getReceivedAirTicketList(Map conditions);

    /**
     * ��ѯSite�ͻ�Ʊ�����û�н���PO��po_item id
     * 
     * @param s
     *            Site
     * @return ��ѯ���
     */
    public List getSiteReceivedAirTicketPoItemIdList(Site s);

    /**
     * ���ṩ��po_item id
     * list����һ�����߶��PO����ͬsupplier��exchangeRate��po_item��������һ��PO�У�������ЩPO����ָ����site��
     * �����������б�֤��Щidָ���po_item��received air ticket��������������ָ����site
     * ��������������Щpo_item��û�к����е�PO�й�ϵ��
     * 
     * @param s
     *            site
     * @param currentyUser
     *            creator of created po
     * @param ids
     *            collection contains po_item id
     */
    public void createMergePO(Site s, User currenyUser, Collection ids);

}
