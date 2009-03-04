/* =====================================================================
 *
 * Copyright (c) Atos Origin INFORMATION TECHNOLOGY All rights reserved.
 *
 * =====================================================================
 */

package com.aof.model.business.pr;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import com.aof.model.Loggable;
import com.aof.model.admin.PurchaseSubCategory;
import com.aof.model.admin.Site;
import com.aof.model.business.Approvable;
import com.aof.model.business.BaseApproveRequest;
import com.aof.model.business.BasePurchaser;
import com.aof.model.business.Controllable;
import com.aof.model.business.Notifiable;
import com.aof.model.business.Purchasable;
import com.aof.model.metadata.PurchaseRequestStatus;
import com.aof.model.metadata.RuleType;
import com.aof.model.metadata.YesNo;

/**
 * A class that represents a row in the 'purchase_request' table.
 * 
 * @author nicebean
 * @version 1.0 (2005-12-01)
 */
public class PurchaseRequest extends AbstractPurchaseRequest implements Serializable, Approvable, Purchasable, Controllable, Notifiable, Loggable {
    private BigDecimal maxItemPrice;
    
    public BigDecimal getMaxItemPrice() {
        return maxItemPrice;
    }

    public void setMaxItemPrice(BigDecimal maxItemPrice) {
        this.maxItemPrice = maxItemPrice;
    }

    /**
     * Simple constructor of PurchaseRequest instances.
     */
    public PurchaseRequest() {
        this.setIsDelegate(YesNo.NO);
    }

    /**
     * Constructor of PurchaseRequest instances given a simple primary key.
     * 
     * @param id
     */
    public PurchaseRequest(String id) {
        super(id);
    }

    /* Add customized code below */
    private BigDecimal purchaseAmount;

    /**
     * @return Returns the purchaseAmount.
     */
    public BigDecimal getPurchaseAmount() {
        return purchaseAmount;
    }

    /**
     * @param purchaseAmount
     *            The purchaseAmount to set.
     */
    public void setPurchaseAmount(BigDecimal purchaseAmount) {
        this.purchaseAmount = purchaseAmount;
    }

    /**
     * ����CapexRequest�Ƿ�����޸ģ�DRAFT��REJECTED��״̬�ǿ����޸ĵ� => REJECTED״̬�����޸� 2007-12-21
     * 
     * @return true: �����޸�; false: �������޸�
     */
    public boolean isEditable() {
        return PurchaseRequestStatus.DRAFT.equals(this.getStatus());
    }

    /*
     * (non-Javadoc)
     * 
     * @see com.aof.model.business.Approvable#createNewApproveRequestObj()
     */
    public BaseApproveRequest createNewApproveRequestObj() {
        return new PurchaseRequestApproveRequest();
    }

    /*
     * (non-Javadoc)
     * 
     * @see com.aof.model.business.Approvable#getApproveFlowName()
     */
    public String getApproveFlowName() {
        return this.getDepartment().getSite().getId() + RuleType.PR_APPROVAL_RULES.getPrefixUrl();
    }

    /*
     * (non-Javadoc)
     * 
     * @see com.aof.model.business.Purchasable#createNewPurchaserObj()
     */
    public BasePurchaser createNewPurchaserObj() {
        PurchaseRequestPurchaser prp = new PurchaseRequestPurchaser();
        prp.setPurchaseRequest(this);
        return prp;
    }

    /*
     * (non-Javadoc)
     * 
     * @see com.aof.model.business.Purchasable#getPurchaseFlowName()
     */
    public String getPurchaseFlowName() {
        return this.getDepartment().getSite().getId() + RuleType.PURCHASING_RULES.getPrefixUrl();
    }

    /* (non-Javadoc)
     * @see com.aof.model.business.Controllable#getControlFlowName()
     */
    public String getControlFlowName() {
        return this.getDepartment().getSite().getId() + RuleType.PURCHASING_PRICE_CONTROL_RULES.getPrefixUrl();
    }

    /**
     * ����PurchaseRequest�����Ĳ���id (�������ɹ���)
     * 
     * @return ����id
     */
    public Integer getApproveDepartment() {
        if (this.getDepartment() != null) {
            return this.getDepartment().getId();
        }
        return null;
    }

    /**
     * ����PurchaseRequest�ı��ҽ�� (������)
     * 
     * @return ���ҽ��
     */
    public BigDecimal getApproveAmount() {
        return getAmount();
    }

    /**
     * ����PurchaseRequest������PurchaseCategory id (�������ɹ���)
     * 
     * @return PurchaseCategory id
     */
    public Integer getApprovePurchaseCategory() {
        PurchaseSubCategory psc = getPurchaseSubCategory();
        if (psc == null)
            return null;
        return psc.getPurchaseCategory().getId();
    }

    /**
     * ����PurchaseRequest������PurchaseSubCategory id (�������ɹ���)
     * 
     * @return PurchaseSubCategory id
     */
    public Integer getApprovePurchaseSubCategory() {
        PurchaseSubCategory psc = getPurchaseSubCategory();
        if (psc == null)
            return null;
        return psc.getId();
    }

    /**
     * ����purchseRequest��amount��������budget��capex���� (������)
     * 
     * @return 
     * ��ʹ��capex��purchseRequest, ����amount - capex.remainAmount
     * ��ʹ��other budget��purchaseRequest, ���� amount - yearlyBudget.remainAmount
     * ���򣬷���null
     *
     */
    public BigDecimal getApproveOverBudget() {
        if (getCapex() != null) {
            /*
             * �������(���ݿ��е�ֵ)�£�capex��actualAmount�Ѿ�����pr��amount��
             * over budget�Ǽ����pr���³���capex��remainAmount��ֵ��
             * ��ʱ��remainAmountӦ���ǲ�������pr��amount�ġ�
             * ���ǵ����������ʵ�ʵĳ���ֵ����capex��ǰremainAmount�ĸ�ֵ
             */
            return getCapex().getRemainAmount();
        }
        if (getYearlyBudget() != null) {
            /*
             * �������(���ݿ��е�ֵ)�£�budget��actualAmount�Ѿ�����pr��amount��
             * over budget�Ǽ����pr���³���budget��remainAmount��ֵ��
             * ��ʱ��remainAmountӦ���ǲ�������pr��amount�ġ�
             * ���ǵ����������ʵ�ʵĳ���ֵ����budget��ǰremainAmount�ĸ�ֵ
             */
            return getYearlyBudget().getRemainAmount();
        }
        return null;
    }

    /**
     * ����purchseRequest��amount��������budget��capex�����İٷֱ� (������)
     * 
     * @return 
     * ��ʹ��capex��purchseRequest, ����(amount - capex.remainAmount) / capex.amount * 100
     * ��ʹ��other budget��purchaseRequest, ���� (amount - yearlyBudget.remainAmount) / yearlyBudget.amount * 100
     * ���򣬷���null
     *
     */
    public BigDecimal getApproveOverBudgetPercentage() {
        BigDecimal amount = null;
        if (getCapex() != null) {
            amount = getCapex().getLastApprovedRequest().getAmount();
        } else if (getYearlyBudget() != null) {
            amount = getYearlyBudget().getAmount();
        } else {
            return null;
        }
        return getApproveOverBudget().multiply(new BigDecimal(100d)).divide(amount, BigDecimal.ROUND_HALF_EVEN);
        
    }

    /**
     * ����PR Purchase Amount - PR Approved Amount (������)
     * 
     * @return PR Purchase Amount - PR Approved Amount
     */
    public BigDecimal getDifferenceBetweenPurchaseAmountAndApprovedAmount() {
        return getPurchaseAmount().subtract(getAmount());
    }

    /**
     * ����(PR Purchase Amount - PR Approved Amount) / PR Approved Amount (������)
     * 
     * @return (PR Purchase Amount - PR Approved Amount) / PR Approved Amount
     */
    public BigDecimal getDifferencePercentageBetweenPurchaseAmountAndApprovedAmount() {
        BigDecimal amount = getAmount();
        return getPurchaseAmount().subtract(amount).multiply(new BigDecimal(100d)).divide(amount, BigDecimal.ROUND_HALF_EVEN);
    }

    public Integer getApproveDurationDay() {
        Date approveDate = getApproveDate();
        if (approveDate == null) return null;
        Date requestDate = getRequestDate();
        if (requestDate == null) return null;
        return new Integer((int)Math.ceil(((double)(approveDate.getTime() - requestDate.getTime())) / 86400000));
    }

    public YesNo getApproveWithBudget() {
         return (this.getCapex() != null || this.getYearlyBudget() != null) ? YesNo.YES : YesNo.NO;
    }
    
    /* (non-Javadoc)
     * @see com.aof.model.business.Notifiable#getNotifyFlowName()
     */
    public String getNotifyFlowName() {
        return this.getDepartment().getSite().getId() + RuleType.PURCHASE_REQUEST_FILTERS.getPrefixUrl();
    }

    public String getNotifyEmailTemplateName() {
        return "PRFilter.vm";
    }

    public Map getNotifyEmailContext() {
        Map context = new HashMap();
        context.put("pr", this);
        return context;
    }

    public Site getLogSite() {
        if(this.getDepartment()==null) return null;
        return this.getDepartment().getSite();
    }

    public String getLogTargetName() {
        return LOG_TARGET_NAME;

    }

    public String getLogTargetId() {
        return this.getId();
    }

    public String[][] getLogFieldInfo(String action) {
        return (String[][]) actionFieldInfo.get(action);
    }
    private static final String LOG_TARGET_NAME="PR";
    
    public static final String LOG_ACTION_SUBMIT = "Submit";
    public static final String LOG_ACTION_DELETE = "Delete";
    public static final String LOG_ACTION_WITHDRAW = "Withdraw";
    public static final String LOG_ACTION_APPROVE = "Approve";
    public static final String LOG_ACTION_REJECT = "Reject";
    
    
    private static final Map actionFieldInfo = new HashMap();
    static {
        actionFieldInfo.put(LOG_ACTION_SUBMIT, 
                new String[][] { 
                    { "Department", "department", "id" },
                    { "Requestor", "requestor", "name" },
                    { "PR Amount", "amount", null },
                    { "Base Currency", "currency", "code" },
                    { "Reference Yearly Budget Code", "yearlyBudget", "code" },
                    { "Reference Capex Code", "capex", "id" },
                    { "Purchase Category", "purchaseSubCategory.purchaseCategory", "description" },
                    { "Purchase Sub Category", "purchaseSubCategory", "description" },
        });
        actionFieldInfo.put(LOG_ACTION_APPROVE, 
                new String[][] { 
                    { "PR Amount", "amount", null },
        });
        actionFieldInfo.put(LOG_ACTION_DELETE, new String[][] { });
        actionFieldInfo.put(LOG_ACTION_WITHDRAW, new String[][] { });
        actionFieldInfo.put(LOG_ACTION_REJECT, 
                new String[][] {}
        );
    }

    public String getApprovalBatchEmailTemplateName() {
        return "PRApprovalBatch.vm";
    }
    
    public String getApprovalNotifyEmailTemplateName() {
        return "PRApproval.vm";
    }

    public String getApprovedNotifyEmailTemplateName() {
        return "PRApproved.vm";
    }

    public String getRejectedNotifyEmailTemplateName() {
        return "PRRejected.vm";
    }

    public Map getApprovalNotifyEmailContext() {
        Map context = new HashMap();
        context.put("pr", this);
        return context;
    }

    public Map getApprovedNotifyEmailContext() {
        Map context = new HashMap();
        context.put("pr", this);
        return context;
    }

    public Map getRejectedNotifyEmailContext() {
        Map context = new HashMap();
        context.put("pr", this);
        return context;
    }
    
    public void emailed(Date d)
    {
        this.setEmailDate(d);
        this.setEmailTimes(this.getEmailTimes()+1);
    }

    public String getRefNo() {
        return this.getId();
    }
}
