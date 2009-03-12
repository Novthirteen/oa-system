/* =====================================================================
 *
 * Copyright (c) Sourceforge INFORMATION TECHNOLOGY All rights reserved.
 *
 * =====================================================================
 */

package net.sourceforge.web.domain;

import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

/**
 * �������Session�Ĵ���������
 * @author ych
 * @version 1.0 (2005-10-9)
 */
public class SessionListener implements HttpSessionListener {

	/**
     * ��Session����ʱ���� 
	 */
	public void sessionCreated(HttpSessionEvent event) {

	}

    /**
     * ��Session����ʱ����
     */
	public void sessionDestroyed(HttpSessionEvent event) {
		SessionList.removeSession(event.getSession());
	}

}
