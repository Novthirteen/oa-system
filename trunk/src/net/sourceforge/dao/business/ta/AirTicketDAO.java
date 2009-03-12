/* =====================================================================
 *
 * Copyright (c) Sourceforge INFORMATION TECHNOLOGY All rights reserved.
 *
 * =====================================================================
 */
package net.sourceforge.dao.business.ta;

import java.util.List;
import java.util.Map;

import net.sourceforge.model.admin.Site;
import net.sourceforge.model.business.ta.AirTicket;
import net.sourceforge.model.business.ta.AirTicketRecharge;
import net.sourceforge.model.business.ta.TravelApplication;
import net.sourceforge.model.business.ta.query.AirTicketQueryOrder;

/**
 * DAO interface for domain model AirTicket
 * 
 * @author shi1
 * @version 1.0 (Nov 25, 2005)
 */
public interface AirTicketDAO {

    /**
     * ����idȡ�û�Ʊ
     * @param id
     * @return
     */
    public AirTicket getAirTicket(Integer id);

    /**
     * ȡ�öԻ�Ʊ�Ĳ�ѯ�������
     * @param condtions
     * @return
     */
    public int getAirTicketListCount(Map conditions);

    /**
     * ����������ѯ��Ʊ
     * @param condtions
     *      ��ѯ����
     * @param pageNo
     *      ҳ���(��0��ʼ,-1�����)
     * @param pageSize
     *      ÿҳ��Ŀ��,-1�����
     * @param order
     *      ��������
     * @param descend
     *      �Ƿ���
     * @return ��ѯ���
     */
    public List getAirTicketList(Map conditions, int pageNo, int pageSize, AirTicketQueryOrder order, boolean descend);

    /**
     * ��ѯ�Ѿ�����PO_ITEM�Ļ�Ʊ
     * @param condtions
     *      ��ѯ����
     * @return ��ѯ���
     */
    public List getReceivedAirTicketList(Map conditions);

    /**
     * �½���Ʊ
     * @param airTicket
     * @return
     */
    public AirTicket insertAirTicket(AirTicket airTicket);

    /**
     * ���»�Ʊ
     * @param airTicket
     * @return
     */
    public AirTicket updateAirTicket(AirTicket airTicket);

    /**
     * ɾ����Ʊ
     * @param at
     */
    public void deleteAirTicket(AirTicket at);

    /**
     * ����Air Ticket Recharge
     * @param atr
     */
    public void insertAirTicketRecharge(AirTicketRecharge atr);

    /**
     * ȡ��ָ��AirTicket�����AirTicketRecharge�б�
     * 
     * @param at
     *            AirTicket����
     * @return ��AirTicket������ص�AirTicketRecharge�����б�
     */
    public List getAirTicketRechargeList(AirTicket at);

    /**
     * ��ѯSite�ͻ�Ʊ�����û�н���PO��po_item id
     * 
     * @param s
     *            Site
     * @return ��ѯ���
     */
    public List getSiteReceivedAirTicketPoItemIdList(Site s);

    /**
     * get ta's air ticket
     * @param travelApplication
     * @return
     */
    public AirTicket getAirTicketByTravelApplication(TravelApplication travelApplication);

    public void deleteAirTicket(Integer id);

}
