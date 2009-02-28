/* =====================================================================
 *
 * Copyright (c) Atos Origin INFORMATION TECHNOLOGY All rights reserved.
 *
 * =====================================================================
 */

package com.aof.service.business.ta;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

import com.aof.model.admin.User;
import com.aof.model.business.ta.AirTicket;
import com.aof.model.business.ta.TravelApplication;
import com.aof.model.business.ta.query.TravelApplicationQueryOrder;

/**
 * service manager for domain model travel application
 * @author shi1
 * @version 1.0 (Nov 23, 2005)
 */
public interface TravelApplicationManager {

    /**
     * get Travel Application by id
     * @param id
     *      id of travel application
     * @return TravelApplication object
     */
    public TravelApplication getTravelApplication(String id) ;

    /**
     * insert new Travel Application to db
     * @param travelApplication
     *      the Travel Application inserted
     * @param approveRequestList
     *      approve Request List
     * @return the Travel Application inserted
     */
    public TravelApplication insertTravelApplication(TravelApplication travelApplication,List approveRequestList,boolean isDraft,User user) ;
    
    /**
     * ���³�������
     * @param travelApplication
     * @return
     */
    public TravelApplication updateTravelApplication(TravelApplication travelApplication) ;

    /**
     * ���³�������
     * @param travelApplication
     * @param approveRequestList
     * @param isDraft
     * @return
     */
    public TravelApplication updateTravelApplication(TravelApplication travelApplication,List approveRequestList,boolean isDraft,User user) ;

    /**
     * ȡ�öԳ�������Ĳ�ѯ�������
     * @param condtions
     * @return
     */
    public int getTravelApplicationListCount(Map condtions) ;

    /**
     * ����������ѯ��������
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
    public List getTravelApplicationList(Map condtions, int pageNo, int pageSize, TravelApplicationQueryOrder order, boolean descend) ;
    
    /**
     * ����ָ��approveRequestId��TravelApplication
     * @param approveRequestId TravelApplication��approveRequestId
     * @return ָ��approveRequestId��TravelApplication
     */
    public TravelApplication getTravelApplicationByApproveRequestId(String approveRequestId);

    /**
     * ����������Ӧ�Ĳɹ�
     * @param ta
     *      ��������
     * @param at
     *      ��Ʊ
     * @param airTicketRechargeList
     *      ��ƱRecharge List
     * @param booker
     *      Ԥ����
     * @param confirmed
     */
    public void book(TravelApplication ta, List atList,User user) ;
    
    

    /**
     * ȡ����Ʊ
     * @param airTicketId
     * @param price
     */
    public AirTicket cancelAirTicket(Integer airTicketId,BigDecimal price,User user) ;
    
    /**
     * ɾ����Ʊ
     * @param airTicketId
     */
    public void deleteAirTicket(Integer airTicketId);
    
    /**
     * ȷ�ϻ�Ʊ
     * @param atId
     */
    public AirTicket confirmAirTicket(Integer atId) ;

    /**
     * ɾ����������
     * @param ta
     */
    public void deleteTravelApplication(TravelApplication ta,User user);

    /**
     * �ܾ���������
     * @param travelApplication
     */
    public void rejectTravelApplication(TravelApplication travelApplication, User user, String comment);

    public void assignBooker(String taId, User booker);
    
    public void withdrawTravelApplication(TravelApplication ta,User user);

    /**
     * ����ͨ����������
     * @param travelApplication
     */
    public void approveTravelApplication(TravelApplication travelApplication,User user);

    public List getAirTicketListWithDetails(TravelApplication ta);

    public List getAirTicketList(TravelApplication ta);

    public AirTicket getAirTicketWithDetails(Integer id);

    public TravelApplication updateAirTickets(String taId,List airTicketList,User user);

    public TravelApplication updateAirTickets(String taId,List airTicketList,boolean setIsOnTravel,User user);
    
}
