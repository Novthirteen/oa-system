/* =====================================================================
 *
 * Copyright (c) Sourceforge INFORMATION TECHNOLOGY All rights reserved.
 *
 * =====================================================================
 */

package net.sourceforge.model.business.ta;

import java.io.Serializable;

import net.sourceforge.model.admin.User;

/**
 * �������t_ta_approve���һ�м�¼
 */
public class TravelApplicationApproveRequest extends AbstractTravelApplicationApproveRequest implements Serializable {

    /**
     * ȱʡ���캯��
     */
    public TravelApplicationApproveRequest() {
    }

    /**
     * ���������Ĺ��캯��
     * 
     * @param id
     * @param approver
     */
    public TravelApplicationApproveRequest(String id, User approver) {
        super(id, approver);
    }

    /* Add customized code below */

}
