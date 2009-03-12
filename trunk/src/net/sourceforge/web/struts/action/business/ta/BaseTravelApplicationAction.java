/* =====================================================================
 *
 * Copyright (c) Sourceforge INFORMATION TECHNOLOGY All rights reserved.
 *
 * =====================================================================
 */

package net.sourceforge.web.struts.action.business.ta;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang.StringUtils;


import net.sourceforge.model.admin.Site;
import net.sourceforge.model.admin.User;
import net.sourceforge.model.business.ta.TravelApplication;
import net.sourceforge.model.metadata.EnabledDisabled;
import net.sourceforge.model.metadata.SingleReturn;
import net.sourceforge.model.metadata.TravelApplicationStatus;
import net.sourceforge.model.metadata.TravelApplicationUrgent;
import net.sourceforge.model.metadata.TravellingMode;

import net.sourceforge.service.admin.CurrencyManager;
import net.sourceforge.service.admin.DepartmentManager;
import net.sourceforge.service.admin.ExchangeRateManager;
import net.sourceforge.service.admin.SiteManager;
import net.sourceforge.service.business.ta.TravelApplicationApproveRequestManager;
import net.sourceforge.service.business.ta.TravelApplicationManager;
import net.sourceforge.web.struts.action.ServiceLocator;
import net.sourceforge.web.struts.action.business.RechargeAction;
import com.shcnc.hibernate.PersistentEnum;
import com.shcnc.struts.action.ActionException;
import com.shcnc.struts.form.BeanForm;
import com.shcnc.struts.form.converter.Converter;
import com.shcnc.struts.form.converter.ConverterLocator;
import com.shcnc.struts.form.converterLocators.DefaultConvertLocator;
import com.shcnc.struts.form.converters.DateConverter;

/**
 * ����TravelApplicationAction��TravelApplicationApproveRequestAction�Ĺ��÷���
 * @author nicebean
 * @version 1.0 (2005-11-29)
 */
public class BaseTravelApplicationAction extends RechargeAction {

    protected static DateConverter timeConverter;

    protected static DateConverter dateTimeConverter;

    static {
        timeConverter = new DateConverter();
        timeConverter.setFormat("HH:mm");

        dateTimeConverter = new DateConverter();
        dateTimeConverter.setFormat("yyyy/MM/dd HH:mm");
    }

    protected static ConverterLocator converterLocator = new ConverterLocator() {

        public Converter getConverter(Class clazz) {
            return DefaultConvertLocator.getInstance().getConverter(clazz);
        }

        public Converter getConverter(String convertId) {
            return null;
        }

        public Converter getConverter(Class clazz, String propName) {
            if (propName.equals("toTime") || propName.equals("fromTime"))
                return timeConverter;
            else
                return null;
        }

    };

    protected boolean isComboChange(HttpServletRequest request) {
        return !StringUtils.isEmpty(request.getParameter("combo_change"));
    }

    protected void processHotelPrice(TravelApplication ta, BeanForm taForm) {
        if (ta.getHotel() == null)
            taForm.set("hotel_id", "-1");
        if (ta.getPrice() == null)
            taForm.set("price_id", "-1");
    }

    protected void putEnumListToRequest(HttpServletRequest request) {
        request.setAttribute("X_ENABLEDDISABLEDLIST", PersistentEnum.getEnumList(EnabledDisabled.class));
        request.setAttribute("x_taStatusList", PersistentEnum.getEnumList(TravelApplicationStatus.class));
        request.setAttribute("x_taModeList", PersistentEnum.getEnumList(TravellingMode.class));
        request.setAttribute("x_singleOrReturnList", PersistentEnum.getEnumList(SingleReturn.class));
        request.setAttribute("x_urgentList", PersistentEnum.getEnumList(TravelApplicationUrgent.class));   
        putCurrencyListToRequest(request);
    }

    protected void putApproveListToRequest(TravelApplication ta, HttpServletRequest request) {
        TravelApplicationApproveRequestManager tm = ServiceLocator.getTravelApplicationApproveRequestManager(request);
        List approveList = tm.getTravelApplicationApproveRequestListByApproveRequestId(ta.getApproveRequestId());
        request.setAttribute("X_APPROVELIST", approveList);
    }
    
    protected String getTravelApplicationId(HttpServletRequest request)
    {
        return request.getParameter("id");
    }

    protected TravelApplication getTravelApplicationFromRequest(HttpServletRequest request) throws Exception {
        String id = getTravelApplicationId(request);
        TravelApplicationManager travelApplicationManager = ServiceLocator.getTravelApplicationManager(request);
        TravelApplication travelApplication = travelApplicationManager.getTravelApplication(id);
        if (travelApplication == null)
            throw new ActionException("travelApplication.notFound", id);
        return travelApplication;
    }
    
    protected void putTravelApplicationDetailsToRequest(TravelApplication ta, HttpServletRequest request) {
        TravelApplicationManager pm = ServiceLocator.getTravelApplicationManager(request);
        if (!isBack(request) ) {
            this.putAirTicketListToSession(pm.getAirTicketListWithDetails(ta),request);
        } 
        request.setAttribute("x_airTicketList", this.getAirTicketListFromSession(request));
        putApproveListToRequest(ta,request);
    }
    
    protected void putAirTicketListToSession(List itemList,HttpServletRequest request) {
        request.getSession().setAttribute(
                this.getAirTicketListAttributeName(request),itemList);
    }

    protected List getAirTicketListFromSession(HttpServletRequest request) {
        return (List) request.getSession().getAttribute(
                this.getAirTicketListAttributeName(request));
    }
    
    protected String getAirTicketListAttributeName(HttpServletRequest request)
    {
        String ta_id=this.getTravelApplicationId(request);
        if(ta_id==null) throw new ActionException("travelApplication.idNotSet");
        return "airTicketList_"+ta_id;
    }
    
    protected void setEditing(boolean isEdit,HttpServletRequest request)
    {
        request.setAttribute("x_edit", Boolean.valueOf(isEdit));
    }
    
    protected void putCurrencyListToRequest(HttpServletRequest request) {
        CurrencyManager cm=ServiceLocator.getCurrencyManager(request);
        List currencyList=cm.getAllEnabledCurrencyList();
        request.setAttribute("x_currencyList",currencyList);
    }
}