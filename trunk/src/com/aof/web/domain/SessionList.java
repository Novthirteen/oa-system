/* =====================================================================
 *
 * Copyright (c) Atos Origin INFORMATION TECHNOLOGY All rights reserved.
 *
 * =====================================================================
 */

/**
 * @author ych
 * @version 1.0 (2005-10-08)
 */
package com.aof.web.domain;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import com.aof.model.admin.Site;
import com.aof.model.admin.User;
import com.aof.service.admin.UserManager;
import com.aof.utils.RWLock;
import com.aof.utils.SessionTempFile;
import com.aof.web.struts.action.ServiceLocator;
import com.aof.web.struts.action.admin.BasicAction;


/**
 * ���ౣ��Session�б�
 * @author ych
 * @version 1.0 (2005-10-8)
 */
public class SessionList {
	
	private static final List sessionList=new ArrayList();
    
    private static int totalUserVisitCount = 0;
    
    public static void resetTotalUserVisitCount() {
        totalUserVisitCount = 0;
    }
    
    public static int getTotalUserVisitCount() {
        return totalUserVisitCount;
    }
	
	public static final RWLock lock=new RWLock();
	
	
	/**
	 * ��sessionList���һ��session
	 * @param session
	 */
	public static void addSession(HttpSession session) {
		lock.getWriteLock();
		if (!sessionList.contains(session)) {
			if (session.getAttribute(BasicAction.LOGIN_USER_KEY)!=null) {
                //User user = (User) session.getAttribute(BasicAction.LOGIN_USER_KEY);
                //user.getPrimarySite();
				sessionList.add(session);
                totalUserVisitCount++;
            }
		}	
		lock.releaseLock();
	}
	
	/**
	 * ��sessionList�Ƴ�һ��session
	 * @param session
	 */
	public static void removeSession(HttpSession session) {
		lock.getWriteLock();
		if (sessionList.contains(session)) { 
			sessionList.remove(session);
            SessionTempFile.clearTempFile(session);
        }
		lock.releaseLock();
	}
	
	/**
	 * ȡ��sessionList
	 * @return List
	 */
	public static List getSessionList() {
		return sessionList;
	}
	
	/**
	 * ����site��sessionList��ȡ��session�б� 
	 * @param request 
	 * @param Site
	 * @return List
	 */
	public static List getSessionListBySite(Site site, HttpServletRequest request) {
		List retList=new ArrayList();
        UserManager um=ServiceLocator.getUserManager(request);
		for (int index=0;index<sessionList.size();index++) {
			try {
				HttpSession session=(HttpSession)sessionList.get(index);
				User loginUser=(User)session.getAttribute(BasicAction.LOGIN_USER_KEY);
                if (um.getUserSite(loginUser.getId(),site.getId())!=null)
					retList.add(session);
			} catch (Exception e) {}
		}
		return retList;
	}
	
	
}
