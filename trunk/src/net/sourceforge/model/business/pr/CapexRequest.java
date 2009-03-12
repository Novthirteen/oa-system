/* =====================================================================
 *
 * Copyright (c) Sourceforge INFORMATION TECHNOLOGY All rights reserved.
 *
 * =====================================================================
 */

package net.sourceforge.model.business.pr;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import net.sourceforge.model.Loggable;
import net.sourceforge.model.admin.Site;
import net.sourceforge.model.business.Approvable;
import net.sourceforge.model.business.BaseApproveRequest;
import net.sourceforge.model.metadata.CapexRequestStatus;
import net.sourceforge.model.metadata.RuleType;
import net.sourceforge.model.metadata.YesNo;

/**
 * A class that represents a row in the 'capex_request' table.
 * 
 * @author nicebean
 * @version 1.0 (2005-11-19)
 */
public class CapexRequest extends AbstractCapexRequest implements Serializable, Approvable, Loggable {
    /**
     * Default value of reference currency
     */
    public static String DEFALUT_REFERENCE_CURRENCY = "EUR";
    
    /**
     * Default value of Activity
     */
    public static String DEFALUT_ACTIVITY = "Ceramics";
    
    /**
     * Simple constructor of CapexRequest instances.
     */
    public CapexRequest() {
    }

    /**
     * Constructor of CapexRequest instances given a simple primary key.
     * 
     * @param id
     */
    public CapexRequest(Integer id) {
        super(id);
    }

    /* Add customized code below */

    /**
     * ����CapexRequest�Ƿ�����޸ģ�DRAFT��REJECTED��״̬�ǿ����޸ĵ� => REJECTED״̬�����޸� 2007-12-21
     * 
     * @return true: �����޸�; false: �������޸�
     */
    public boolean isEditable() {
        return CapexRequestStatus.DRAFT.equals(this.getStatus());
    }

    /*
     * (non-Javadoc)
     * 
     * @see net.sourceforge.model.business.Approvable#createNewApproveRequestObj()
     */
    public BaseApproveRequest createNewApproveRequestObj() {
        return new CapexRequestApproveRequest();
    }

    /*
     * (non-Javadoc)
     * 
     * @see net.sourceforge.model.business.Approvable#getApproveFlowName()
     */
    public String getApproveFlowName() {
        return getCapex().getSite().getId() + RuleType.CAPEX_APPROVAL_RULES.getPrefixUrl();
    }

    /**
     * ��������Capex�����Department Id�б� (������)
     * 
     * @return ����Department����Id�ļ���
     */
    public Collection getApproveDepartment() {
        return getCapex().getApproveDepartment();
    }

    /**
     * ����amount����(������)
     * 
     * @return amount
     */
    public BigDecimal getApproveAmount() {
        return getAmount();
    }

    /**
     * ����CapexRequest��amount��������yearlyBudget��remainAmount�Ĳ�ֵ(������)
     * 
     * @return amount - capex.yearlyBudget.remainAmount, if capex is without yearly budget will return null.
     */
    public BigDecimal getApproveOverBudget() {
        /*
         * �������(���ݿ��е�ֵ)�£�budget��actualAmount�Ѿ�����capex request��amount��
         * over budget�Ǽ����capex request���³���budget��remainAmount��ֵ��
         * ��ʱ��remainAmountӦ���ǲ�������capex request��amount�ġ�
         * ���ǵ����������ʵ�ʵĳ���ֵ����budget��ǰremainAmount�ĸ�ֵ
         */
        /*
         * modify by Jackey 2006-3-16
         * for support nonbudget capex
         */
        if (getCapex().getYearlyBudget() != null) {
            return getCapex().getYearlyBudget().getRemainAmount().negate();
        }
        
        return null;
    }

    /**
     * ����CapexRequest��amount��������yearlyBudget��remainAmount�Ĳ�ֵռyearlyBudget��amount�ٷֱ�(������)
     * 
     * @return (amount - capex.yearlyBudget.remainAmount) * 100 / capex.yearlyBudget.amount, if capex is without yearly budget will return null.
     */
    public BigDecimal getApproveOverBudgetPercentage() {
        /*
         * modify by Jackey 2006-3-16
         * for support nonbudget capex
         */
        if (getApproveOverBudget() != null) {
            return getApproveOverBudget().multiply(new BigDecimal(100d)).divide(getCapex().getYearlyBudget().getAmount(), BigDecimal.ROUND_HALF_EVEN);
        }
        
        return null;
    }
    
    /**
     * ��������Capex�����PurchaseCategory Id�б� (������)
     * 
     * @return ����PurchaseCategory����Id�ļ���
     */
    public Collection getApprovePurchaseCategory() {
        return getCapex().getApprovePurchaseCategory();
    }

    /**
     * ��������Capex�����PurchaseSubCategory Id�б� (������)
     * 
     * @return ����PurchaseSubCategory����Id�ļ���
     */
    public Collection getApprovePurchaseSubCategory() {
        return getCapex().getApprovePurchaseSubCategory();
    }
    
    public YesNo getApproveWithBudget() {
        return getCapex().getApproveWithBudget();
    }

    /*
     * ���´��봦��log 
     *
     */
    public static final String LOG_ACTION_INITIAL_SUBMIT = "Initial Submit";
    public static final String LOG_ACTION_INCREASE_SUBMIT = "Increase Submit";
    public static final String LOG_ACTION_DELETE = "Delete";
    public static final String LOG_ACTION_WITHDRAW = "Withdraw";
    public static final String LOG_ACTION_APPROVE = "Approve";
    public static final String LOG_ACTION_REJECT = "Reject";
    
    private static final Map actionFieldInfo = new HashMap();
    
    static {
        actionFieldInfo.put(LOG_ACTION_INITIAL_SUBMIT, 
                new String[][] { 
                    { "Department", "capex.capexDepartments", "id" },
                    { "Requestor", "requestor", "name" },
                    { "Capex Amount", "amount", null },
                    { "Base Currency", "capex.currency", "name" },
                    { "Reference Budget Code", "capex.yearlyBudget", "code" },
                    { "Purchase Category", "capex.purchaseCategory", "description" },
                    { "Purchase Sub Category", "capex.purchaseSubCategory", "description" },
        });
        actionFieldInfo.put(LOG_ACTION_INCREASE_SUBMIT, 
                new String[][] { 
                    { "Capex Amount", "amount", null },
        });
        actionFieldInfo.put(LOG_ACTION_DELETE, new String[][] { });
        actionFieldInfo.put(LOG_ACTION_WITHDRAW, new String[][] { });
        actionFieldInfo.put(LOG_ACTION_APPROVE, 
                new String[][] { 
                    { "Capex Amount", "amount", null },
        });
        actionFieldInfo.put(LOG_ACTION_REJECT, new String[][] { });
        
    }
    
    public Site getLogSite() {
        return this.getCapex().getSite();
    }

    public String getLogTargetName() {
        return "Capex";
    }

    public String getLogTargetId() {
        return this.getCapex().getId();
    }

    public String[][] getLogFieldInfo(String action) {
        return (String[][]) actionFieldInfo.get(action);
    }
    
    /* add by jackey for caculate total capex amount
     * 
     * capex total amount is not caculate from item list any more
     * but instead by sum of capital expenditure amount and other expenses related amount
     * and asset disposal amount
     * */
    public BigDecimal getTotalAmount() {
        return this.getCapexCapitalizedAmount()
        .add(this.getOtherExpenseAmount()
                .add(this.getAssetDisposalAmount()));
    }
    
    public String getApprovalBatchEmailTemplateName() {
        return "CapexApprovalBatch.vm";
    }
    
    public String getApprovalNotifyEmailTemplateName() {
        return "CapexApproval.vm";
    }

    public String getApprovedNotifyEmailTemplateName() {
        return "CapexApproved.vm";
    }

    public String getRejectedNotifyEmailTemplateName() {
        return "CapexRejected.vm";
    }

    public Map getApprovalNotifyEmailContext() {
        Map context = new HashMap();
        context.put("capexRequest", this);
        return context;
    }

    public Map getApprovedNotifyEmailContext() {
        Map context = new HashMap();
        context.put("capexRequest", this);
        return context;
    }

    public Map getRejectedNotifyEmailContext() {
        Map context = new HashMap();
        context.put("capexRequest", this);
        return context;
    }
    
    public String getRefNo() {
        return this.getCapex().getId();
    }
}
