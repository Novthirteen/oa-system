/* =====================================================================
 *
 * Copyright (c) Sourceforge INFORMATION TECHNOLOGY All rights reserved.
 *
 * =====================================================================
 */

package net.sourceforge.model.business.pr;

/**
 * ������CapexRequest��Approve��ѯ��ʾ�б����
 * 
 * @author nicebean
 * @version 1.0 (2005-12-8)
 */
public class CapexRequestApproveRequestListView {

    private CapexRequest capexRequest;

    private CapexRequestApproveRequest capexRequestApproveRequest;

    /**
     * @return Returns the capexRequestApproveRequest.
     */
    public CapexRequestApproveRequest getCapexRequestApproveRequest() {
        return capexRequestApproveRequest;
    }

    /**
     * @param capexRequestApproveRequest
     *            The capexRequestApproveRequest to set.
     */
    public void setCapexRequestApproveRequest(CapexRequestApproveRequest capexRequestApproveRequest) {
        this.capexRequestApproveRequest = capexRequestApproveRequest;
    }

    /**
     * @return Returns the capexRequest.
     */
    public CapexRequest getCapexRequest() {
        return capexRequest;
    }

    /**
     * @param capexRequest
     *            The capexRequest to set.
     */
    public void setCapexRequest(CapexRequest capexRequest) {
        this.capexRequest = capexRequest;
    }

}
