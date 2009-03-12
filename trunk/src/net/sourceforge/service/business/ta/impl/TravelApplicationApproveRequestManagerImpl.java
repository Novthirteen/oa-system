/* =====================================================================
 *
 * Copyright (c) Sourceforge INFORMATION TECHNOLOGY All rights reserved.
 *
 * =====================================================================
 */
package net.sourceforge.service.business.ta.impl;

import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import net.sourceforge.dao.business.ta.AirTicketDAO;
import net.sourceforge.dao.business.ta.TravelApplicationApproveRequestDAO;
import net.sourceforge.model.admin.User;
import net.sourceforge.model.business.ta.AirTicket;
import net.sourceforge.model.business.ta.TravelApplication;
import net.sourceforge.model.business.ta.TravelApplicationApproveRequest;
import net.sourceforge.model.business.ta.query.TravelApplicationApproveRequestQueryOrder;
import net.sourceforge.model.metadata.ApproveStatus;
import net.sourceforge.model.metadata.ApproverDelegateType;
import net.sourceforge.model.metadata.TravellingMode;
import net.sourceforge.service.BaseManager;
import net.sourceforge.service.admin.SystemLogManager;
import net.sourceforge.service.business.ApproveRelativeEmailManager;
import net.sourceforge.service.business.ta.TravelApplicationApproveRequestManager;
import net.sourceforge.service.business.ta.TravelApplicationManager;

/**
 * TravelApplicationApproveRequestManager��ʵ��
 * @author ych
 * @version 1.0 (Nov 17, 2005)
 */
public class TravelApplicationApproveRequestManagerImpl extends BaseManager implements TravelApplicationApproveRequestManager {

    private TravelApplicationApproveRequestDAO dao;
    
    private TravelApplicationManager travelApplicationManager; 
    
    private SystemLogManager systemLogManager;  
    
    private AirTicketDAO airTicketDAO;
    
    private ApproveRelativeEmailManager approveRelativeEmailManager;

    public void setAirTicketDAO(AirTicketDAO airTicketDAO) {
        this.airTicketDAO = airTicketDAO;
    }

    public void setTravelApplicationApproveRequestDAO(TravelApplicationApproveRequestDAO dao) {
        this.dao = dao;
    }
    
    public void setTravelApplicationManager(TravelApplicationManager travelApplicationManager) {
        this.travelApplicationManager = travelApplicationManager;
    }

    public void setApproveRelativeEmailManager(ApproveRelativeEmailManager approveRelativeEmailManager) {
        this.approveRelativeEmailManager = approveRelativeEmailManager;
    }

    public List getTravelApplicationApproveRequestListByApproveRequestId(String requestId) {
        return dao.getTravelApplicationApproveRequestListByApproveRequestId(requestId);
    }


    public TravelApplicationApproveRequest getTravelApplicationApproveRequest(String id, User approver) {
        return dao.getTravelApplicationApproveRequest(id,approver);
    }

    public TravelApplicationApproveRequest updateTravelApplicationApproveRequest(TravelApplicationApproveRequest travelApplicationApproveRequest) {
        return dao.updateTravelApplicationApproveRequest(travelApplicationApproveRequest);
    }
    
    public TravelApplicationApproveRequest insertTravelApplicationApproveRequest(TravelApplicationApproveRequest travelApplicationApproveRequest) {
        return dao.insertTravelApplicationApproveRequest(travelApplicationApproveRequest);
    }
    

    public int getTravelApplicationApproveRequestListCount(Map conditions)  {
        return dao.getTravelApplicationApproveRequestListCount(conditions);
    }

    public List getTravelApplicationApproveRequestList(Map conditions, int pageNo, int pageSize, TravelApplicationApproveRequestQueryOrder order, boolean descend)  {
        return dao.getTravelApplicationApproveRequestList(conditions, pageNo, pageSize, order, descend);
    }

    
    public void approveTravelApplicationApproveRequest(TravelApplicationApproveRequest travelApplicationApproveRequest,User user) {
        travelApplicationApproveRequest.setStatus(ApproveStatus.APPROVED);
        travelApplicationApproveRequest.setApproveDate(new Date());
        dao.updateTravelApplicationApproveRequest(travelApplicationApproveRequest);
        TravelApplicationApproveRequest nextApprove=getNextTravelApplicationApproveRequest(travelApplicationApproveRequest);
        TravelApplication travelApplication = travelApplicationManager.getTravelApplicationByApproveRequestId(travelApplicationApproveRequest.getApproveRequestId());
        
        //add by Jackey 2007-10-15, for not sending batch mail when approver approved travelApplication.
        approveRelativeEmailManager.UnsendApprovedEmailBatch(travelApplication);    
        
        if (nextApprove!=null) {
            nextApprove.setStatus(ApproveStatus.WAITING_FOR_APPROVE);
            nextApprove.setYourTurnDate(new Date());
            nextApprove = dao.updateTravelApplicationApproveRequest(nextApprove);
            approveRelativeEmailManager.sendApprovalEmail(travelApplication, ApproverDelegateType.TRAVEL_APPLICATION_APPROVER, nextApprove);
        } else {
            if (travelApplication!=null) {
                travelApplicationManager.approveTravelApplication(travelApplication,user);
            }
            
        }
        
        if(travelApplication.getApproveTravellingMode().equals(TravellingMode.AIR))
        {
            AirTicket at=airTicketDAO.getAirTicketByTravelApplication(travelApplication);
            if(at==null)
                systemLogManager.generateLog(null,travelApplication,TravelApplication.LOG_ACTION_APPROVE,user);
            else
                systemLogManager.generateLog(null,at,AirTicket.LOG_ACTION_APPROVE,user);
        }
        else
            systemLogManager.generateLog(null,travelApplication,TravelApplication.LOG_ACTION_APPROVE,user);
    }
    
    public void rejectTravelApplicationApproveRequest(TravelApplicationApproveRequest travelApplicationApproveRequest, User user) {
        travelApplicationApproveRequest.setStatus(ApproveStatus.REJECTED);
        travelApplicationApproveRequest.setApproveDate(new Date());
        dao.updateTravelApplicationApproveRequest(travelApplicationApproveRequest);
        TravelApplication travelApplication = travelApplicationManager.getTravelApplicationByApproveRequestId(travelApplicationApproveRequest.getApproveRequestId());
        
        //add by Jackey 2007-10-15, for not sending batch mail when approver rejected travelApplication.
        approveRelativeEmailManager.UnsendApprovedEmailBatch(travelApplication);
        
        if (travelApplication!=null) {
            travelApplicationManager.rejectTravelApplication(travelApplication, user, travelApplicationApproveRequest.getComment());
        }
    }

    private TravelApplicationApproveRequest getNextTravelApplicationApproveRequest(TravelApplicationApproveRequest travelApplicationApproveRequest) {
        List approveList=getTravelApplicationApproveRequestListByApproveRequestId(travelApplicationApproveRequest.getApproveRequestId());
        Iterator itor=approveList.iterator();
        while (itor.hasNext()) {
            TravelApplicationApproveRequest approve=(TravelApplicationApproveRequest) itor.next();
            if (approve.getApprover().equals(travelApplicationApproveRequest.getApprover())) {
                if (itor.hasNext()) {
                    return (TravelApplicationApproveRequest) itor.next();
                } else {
                    return null;
                }
            }
        }
        return null;
    }

    public void approveTravelApplicationApproveRequestAndUpdateTravelApplication(TravelApplicationApproveRequest travelApplicationApproveRequest, TravelApplication travelApplication,User user) {
        travelApplicationManager.updateTravelApplication(travelApplication);
        approveTravelApplicationApproveRequest(travelApplicationApproveRequest,user);
    }

    public void setSystemLogManager(SystemLogManager systemLogManager) {
        this.systemLogManager = systemLogManager;
    }
}
