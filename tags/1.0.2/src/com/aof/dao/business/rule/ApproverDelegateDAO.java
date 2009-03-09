/* =====================================================================
 *
 * Copyright (c) Atos Origin INFORMATION TECHNOLOGY All rights reserved.
 *
 * =====================================================================
 */
package com.aof.dao.business.rule;

import java.util.List;
import java.util.Map;

import com.aof.model.business.rule.ApproverDelegate;
import com.aof.model.business.rule.query.ApproverDelegateQueryOrder;
import com.aof.model.metadata.ApproverDelegateType;

/**
 * dao interface for domain model ApproverDelegate
 * 
 * @author shilei
 * @version 1.0 (Nov 15, 2005)
 */
public interface ApproverDelegateDAO {

    /**
     * �����ݿ�ȡ��ָ��id��Approver Delegate
     * 
     * @param id
     *            Approver Delegate��id
     * @return ����ָ����Approver Delegate
     */
    public ApproverDelegate getApproverDelegate(Integer id);

    /**
     * get Approver Delegate List Count according to conditions
     * 
     * @param conditions
     *            search condition
     * @return list count
     */
    public int getApproverDelegateListCount(Map conditions);

    /**
     * get Approver Delegate List according to conditions
     * 
     * @param conditions
     *            search condition
     * @param pageNo
     *            start page no(0 based), ignored if is -1
     * @param pageSize
     *            page size, ignored if is -1
     * @param order
     *            search order
     * @param descend
     *            asc or desc
     * @return Approver Delegate list
     */
    public List getApproverDelegateList(Map conditions, int pageNo, int pageSize, ApproverDelegateQueryOrder order, boolean descend);

    /**
     * insert approver Delegate to db
     * 
     * @param approverDelegate
     *            the approver Delegate inserted
     * @return the approver Delegate updated
     */
    public ApproverDelegate insertApproverDelegate(ApproverDelegate approverDelegate);

    /**
     * update approver Delegate to db
     * 
     * @param approverDelegate
     *            the approver Delegate updated
     * @return the approver Delegate updated
     */
    public ApproverDelegate updateApproverDelegate(ApproverDelegate approverDelegate);
    
    /**
     * �ж��Ƿ���ί��������
     * @param approverDelegateType ��������
     * @param originalApproverId ԭ������
     * @param delegateApproverId ί��������
     * @return �Ƿ���true,���򷵻�false
     */
    public boolean isDelegateApprover(ApproverDelegateType approverDelegateType, Integer originalApproverId, Integer delegateApproverId);

}
