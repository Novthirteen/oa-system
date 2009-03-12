/* =====================================================================
 *
 * Copyright (c) Sourceforge INFORMATION TECHNOLOGY All rights reserved.
 *
 * =====================================================================
 */
package net.sourceforge.dao.business.pr;

import java.util.List;
import java.util.Map;

import net.sourceforge.dao.business.BaseApproveRequestDAO;
import net.sourceforge.model.admin.User;
import net.sourceforge.model.business.pr.CapexRequest;
import net.sourceforge.model.business.pr.CapexRequestApproveRequest;
import net.sourceforge.model.business.pr.query.CapexRequestApproveRequestQueryOrder;

/**
 * �������CapexRequestApproveRequest�Ľӿ�

 * @author nicebean
 * @version 1.0 (2005-12-8)
 */
public interface CapexRequestApproveRequestDAO extends BaseApproveRequestDAO {

    /**
     * �����ݿ�ȡ��ָ��approveRequestId��approver��CapexRequestApproveRequest
     * @param approveRequestId CapexRequestApproveRequest��approveRequestId
     * @param approver CapexRequestApproveRequest��approver
     * @return ����ָ����CapexRequestApproveRequest
     */
    public CapexRequestApproveRequest getCapexRequestApproveRequest(String approveRequestId, User approver);    
	
    /**
     * �����ݿ�ȡ��ָ��approveRequestId��CapexRequestApproveRequest�б�
     * @param approveRequestId CapexRequestApproveRequest��approveRequestId
     * @return ����ָ����CapexRequestApproveRequest�б�
     */
    public List getCapexRequestApproveRequestListByApproveRequestId(String approveRequestId); 
    
    /**
     * ���ط��ϲ�ѯ������CapexRequestApproveRequest�������
     * 
     * @param conditions
     *            ������ѯ����������ֵӳ���Map�����в�ѯ����Ӧ������CapexRequestApproveRequestQueryCondition���Ԥ���峣��
     * @return ���ϲ�ѯ������CapexRequestApproveRequest�������
     */
	public int getCapexRequestApproveRequestListCount(Map conditions);
	
    /**
     * ���ط��ϲ�ѯ������CapexRequestApproveRequest�����б�
     * 
     * @param conditions
     *            ������ѯ����������ֵӳ���Map�����в�ѯ����Ӧ������CapexRequestApproveRequestQueryCondition���Ԥ���峣��
     * @param pageNo
     *            �ڼ�ҳ����pageSizeΪҳ�Ĵ�С��pageSizeΪ-1ʱ���Ըò���
     * @param pageSize
     *            ҳ�Ĵ�С��-1��ʾ����ҳ
     * @param order
     *            ����������null��ʾ������
     * @param descend
     *            false��ʾ����true��ʾ����
     * @return ���ϲ�ѯ������CapexRequestApproveRequest�����б�
     */
    public List getCapexRequestApproveRequestList(Map conditions, int pageNo, int pageSize, CapexRequestApproveRequestQueryOrder order, boolean descend);

    /**
     * ����ָ����CapexRequestApproveRequest�������ݿ�
     * 
     * @param capexRequestApproveRequest
     *            Ҫ�����CapexRequestApproveRequest����
     * @return ������CapexRequestApproveRequest����
     */
    public CapexRequestApproveRequest insertCapexRequestApproveRequest(CapexRequestApproveRequest capexRequestApproveRequest);
    
    /**
     * ����ָ����CapexRequestApproveRequest�������ݿ�
     * 
     * @param capexRequestApproveRequest
     *            Ҫ���µ�CapexRequestApproveRequest����
     * @return ���º��CapexRequestApproveRequest����
     */
    public CapexRequestApproveRequest updateCapexRequestApproveRequest(CapexRequestApproveRequest capexRequestApproveRequest);

    /**
     * 
     * @param capexRequest
     */
    public void deleteCapexRequestApproveRequestByCapexRequest(CapexRequest capexRequest);
    
}
