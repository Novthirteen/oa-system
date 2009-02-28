/* =====================================================================
 *
 * Copyright (c) Atos Origin INFORMATION TECHNOLOGY All rights reserved.
 *
 * =====================================================================
 */

package com.aof.web.struts.action.business.rule;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.aof.model.metadata.RuleType;
import com.aof.web.struts.form.business.rule.RuleQueryForm;
import com.shcnc.struts.form.BeanForm;

/**
 * ����Rule��Action
 * @author nicebean
 * @version 1.0 (2005-11-14)
 */
public class RuleAction extends BaseRuleAction {
    /**
     * ��ѯCapex Approval Rule
     * 
     * @param mapping
     * @param form
     * @param request
     * @param response
     * @return ActionForward
     * @throws Exception
     */
    public ActionForward listCapexApproval(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {
        return list(mapping, (RuleQueryForm) form, request, response, RuleType.CAPEX_APPROVAL_RULES);
    }

    /**
     * ����Capex Approval Rule
     * 
     * @param mapping
     * @param form
     * @param request
     * @param response
     * @return ActionForward
     * @throws Exception
     */
    public ActionForward newCapexApproval(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {
        return newObject(mapping, request, RuleType.CAPEX_APPROVAL_RULES);
    }

    /**
     * ����������Capex Approval Rule
     * 
     * @param mapping
     * @param form
     * @param request
     * @param response
     * @return ActionForward
     * @throws Exception
     */
    public ActionForward insertCapexApproval(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {
        return insert(mapping, (BeanForm) form, request, RuleType.CAPEX_APPROVAL_RULES);
    }

    /**
     * �޸�Capex Approval Rule
     * 
     * @param mapping
     * @param form
     * @param request
     * @param response
     * @return ActionForward
     * @throws Exception
     */
    public ActionForward editCapexApproval(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {
        return edit(mapping, request, RuleType.CAPEX_APPROVAL_RULES);
    }
    
    /**
     * �޸�Capex Approval Rule
     * 
     * @param mapping
     * @param form
     * @param request
     * @param response
     * @return ActionForward
     * @throws Exception
     */
    public ActionForward editCapexApprovalWebDragAndDraw(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {
        return newObjectWebDragAndDraw(mapping, request, RuleType.CAPEX_APPROVAL_RULES);
    }

    /**
     * �����޸ĵ�Capex Approval Rule
     * 
     * @param mapping
     * @param form
     * @param request
     * @param response
     * @return ActionForward
     * @throws Exception
     */
    public ActionForward updateCapexApproval(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {
        return update(mapping, (BeanForm) form, request, RuleType.CAPEX_APPROVAL_RULES);
    }

    /**
     * ɾ��Capex Approval Rule
     * 
     * @param mapping
     * @param form
     * @param request
     * @param response
     * @return ActionForward
     * @throws Exception
     */
    public ActionForward deleteCapexApproval(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {
        return delete(mapping, request, RuleType.CAPEX_APPROVAL_RULES);
    }

    /**
     * ��ѯPR Approval Rule
     * 
     * @param mapping
     * @param form
     * @param request
     * @param response
     * @return ActionForward
     * @throws Exception
     */
    public ActionForward listPRApproval(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {
        return list(mapping, (RuleQueryForm) form, request, response, RuleType.PR_APPROVAL_RULES);
    }

    /**
     * ����PR Approval Rule
     * 
     * @param mapping
     * @param form
     * @param request
     * @param response
     * @return ActionForward
     * @throws Exception
     */
    public ActionForward newPRApproval(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {
        return newObject(mapping, request, RuleType.PR_APPROVAL_RULES);
    }

    /**
     * ����������PR Approval Rule
     * 
     * @param mapping
     * @param form
     * @param request
     * @param response
     * @return ActionForward
     * @throws Exception
     */
    public ActionForward insertPRApproval(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {
        return insert(mapping, (BeanForm) form, request, RuleType.PR_APPROVAL_RULES);
    }

    /**
     * �޸�PR Approval Rule
     * 
     * @param mapping
     * @param form
     * @param request
     * @param response
     * @return ActionForward
     * @throws Exception
     */
    public ActionForward editPRApproval(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {
        return edit(mapping, request, RuleType.PR_APPROVAL_RULES);
    }
    
    /**
     * �޸�PR Approval Rule
     * 
     * @param mapping
     * @param form
     * @param request
     * @param response
     * @return ActionForward
     * @throws Exception
     */
    public ActionForward editPRApprovalWebDragAndDraw(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {
        return newObjectWebDragAndDraw(mapping, request, RuleType.PR_APPROVAL_RULES);
    }

    /**
     * �����޸ĵ�PR Approval Rule
     * 
     * @param mapping
     * @param form
     * @param request
     * @param response
     * @return ActionForward
     * @throws Exception
     */
    public ActionForward updatePRApproval(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {
        return update(mapping, (BeanForm) form, request, RuleType.PR_APPROVAL_RULES);
    }

    /**
     * ɾ��PR Approval Rule
     * 
     * @param mapping
     * @param form
     * @param request
     * @param response
     * @return ActionForward
     * @throws Exception
     */
    public ActionForward deletePRApproval(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {
        return delete(mapping, request, RuleType.PR_APPROVAL_RULES);
    }

    /**
     * ��ѯPurchasing Rule
     * 
     * @param mapping
     * @param form
     * @param request
     * @param response
     * @return ActionForward
     * @throws Exception
     */
    public ActionForward listPurchasing(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {
        return list(mapping, (RuleQueryForm) form, request, response, RuleType.PURCHASING_RULES);
    }

    /**
     * ����Purchasing Rule
     * 
     * @param mapping
     * @param form
     * @param request
     * @param response
     * @return ActionForward
     * @throws Exception
     */
    public ActionForward newPurchasing(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {
        return newObject(mapping, request, RuleType.PURCHASING_RULES);
    }

    /**
     * ����������Purchasing Rule
     * 
     * @param mapping
     * @param form
     * @param request
     * @param response
     * @return ActionForward
     * @throws Exception
     */
    public ActionForward insertPurchasing(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {
        return insert(mapping, (BeanForm) form, request, RuleType.PURCHASING_RULES);
    }

    /**
     * �޸�Purchasing Rule
     * 
     * @param mapping
     * @param form
     * @param request
     * @param response
     * @return ActionForward
     * @throws Exception
     */
    public ActionForward editPurchasing(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {
        return edit(mapping, request, RuleType.PURCHASING_RULES);
    }
    
    /**
     * �޸�Purchasing Rule
     * 
     * @param mapping
     * @param form
     * @param request
     * @param response
     * @return ActionForward
     * @throws Exception
     */
    public ActionForward editPurchasingWebDragAndDraw(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {
        return newObjectWebDragAndDraw(mapping, request, RuleType.PURCHASING_RULES);
    }

    /**
     * �����޸ĵ�Purchasing Rule
     * 
     * @param mapping
     * @param form
     * @param request
     * @param response
     * @return ActionForward
     * @throws Exception
     */
    public ActionForward updatePurchasing(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {
        return update(mapping, (BeanForm) form, request, RuleType.PURCHASING_RULES);
    }

    /**
     * ɾ��Purchasing Rule
     * 
     * @param mapping
     * @param form
     * @param request
     * @param response
     * @return ActionForward
     * @throws Exception
     */
    public ActionForward deletePurchasing(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {
        return delete(mapping, request, RuleType.PURCHASING_RULES);
    }

    /**
     * ��ѯPurchasing Price Control Rule
     * 
     * @param mapping
     * @param form
     * @param request
     * @param response
     * @return ActionForward
     * @throws Exception
     */
    public ActionForward listPurchasingPriceControl(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        return list(mapping, (RuleQueryForm) form, request, response, RuleType.PURCHASING_PRICE_CONTROL_RULES);
    }

    /**
     * ����Purchasing Price Control Rule
     * 
     * @param mapping
     * @param form
     * @param request
     * @param response
     * @return ActionForward
     * @throws Exception
     */
    public ActionForward newPurchasingPriceControl(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        return newObject(mapping, request, RuleType.PURCHASING_PRICE_CONTROL_RULES);
    }

    /**
     * ����������Purchasing Price Control Rule
     * 
     * @param mapping
     * @param form
     * @param request
     * @param response
     * @return ActionForward
     * @throws Exception
     */
    public ActionForward insertPurchasingPriceControl(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        return insert(mapping, (BeanForm) form, request, RuleType.PURCHASING_PRICE_CONTROL_RULES);
    }

    /**
     * �޸�Purchasing Price Control Rule
     * 
     * @param mapping
     * @param form
     * @param request
     * @param response
     * @return ActionForward
     * @throws Exception
     */
    public ActionForward editPurchasingPriceControl(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        return edit(mapping, request, RuleType.PURCHASING_PRICE_CONTROL_RULES);
    }
    
    /**
     * �޸�Purchasing Price Control Rule
     * 
     * @param mapping
     * @param form
     * @param request
     * @param response
     * @return ActionForward
     * @throws Exception
     */
    public ActionForward editPurchasingPriceControlWebDragAndDraw(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        return newObjectWebDragAndDraw(mapping, request, RuleType.PURCHASING_PRICE_CONTROL_RULES);
    }

    /**
     * �����޸ĵ�Purchasing Price Control Rule
     * 
     * @param mapping
     * @param form
     * @param request
     * @param response
     * @return ActionForward
     * @throws Exception
     */
    public ActionForward updatePurchasingPriceControl(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        return update(mapping, (BeanForm) form, request, RuleType.PURCHASING_PRICE_CONTROL_RULES);
    }

    /**
     * ɾ��Purchasing Price Control Rule
     * 
     * @param mapping
     * @param form
     * @param request
     * @param response
     * @return ActionForward
     * @throws Exception
     */
    public ActionForward deletePurchasingPriceControl(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        return delete(mapping, request, RuleType.PURCHASING_PRICE_CONTROL_RULES);
    }

    /**
     * ��ѯPO Approval Rule
     * 
     * @param mapping
     * @param form
     * @param request
     * @param response
     * @return ActionForward
     * @throws Exception
     */
    public ActionForward listPOApproval(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {
        return list(mapping, (RuleQueryForm) form, request, response, RuleType.PO_APPROVAL_RULES);
    }

    /**
     * ����PO Approval Rule
     * 
     * @param mapping
     * @param form
     * @param request
     * @param response
     * @return ActionForward
     * @throws Exception
     */
    public ActionForward newPOApproval(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {
        return newObject(mapping, request, RuleType.PO_APPROVAL_RULES);
    }

    /**
     * ����������PO Approval Rule
     * 
     * @param mapping
     * @param form
     * @param request
     * @param response
     * @return ActionForward
     * @throws Exception
     */
    public ActionForward insertPOApproval(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {
        return insert(mapping, (BeanForm) form, request, RuleType.PO_APPROVAL_RULES);
    }

    /**
     * �޸�PO Approval Rule
     * 
     * @param mapping
     * @param form
     * @param request
     * @param response
     * @return ActionForward
     * @throws Exception
     */
    public ActionForward editPOApproval(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {
        return edit(mapping, request, RuleType.PO_APPROVAL_RULES);
    }
    
    /**
     * �޸�PO Approval Rule
     * 
     * @param mapping
     * @param form
     * @param request
     * @param response
     * @return ActionForward
     * @throws Exception
     */
    public ActionForward editPOApprovalWebDragAndDraw(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {
        return newObjectWebDragAndDraw(mapping, request, RuleType.PO_APPROVAL_RULES);
    }

    /**
     * �����޸ĵ�PO Approval Rule
     * 
     * @param mapping
     * @param form
     * @param request
     * @param response
     * @return ActionForward
     * @throws Exception
     */
    public ActionForward updatePOApproval(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {
        return update(mapping, (BeanForm) form, request, RuleType.PO_APPROVAL_RULES);
    }

    /**
     * ɾ��PO Approval Rule
     * 
     * @param mapping
     * @param form
     * @param request
     * @param response
     * @return ActionForward
     * @throws Exception
     */
    public ActionForward deletePOApproval(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {
        return delete(mapping, request, RuleType.PO_APPROVAL_RULES);
    }

    /**
     * ��ѯExpense Approval Rule
     * 
     * @param mapping
     * @param form
     * @param request
     * @param response
     * @return ActionForward
     * @throws Exception
     */
    public ActionForward listExpenseApproval(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {
        return list(mapping, (RuleQueryForm) form, request, response, RuleType.EXPENSE_APPROVAL_RULES);
    }

    /**
     * ����Expense Approval Rule
     * 
     * @param mapping
     * @param form
     * @param request
     * @param response
     * @return ActionForward
     * @throws Exception
     */
    public ActionForward newExpenseApproval(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {
        return newObject(mapping, request, RuleType.EXPENSE_APPROVAL_RULES);
    }

    /**
     * ����������Expense Approval Rule
     * 
     * @param mapping
     * @param form
     * @param request
     * @param response
     * @return ActionForward
     * @throws Exception
     */
    public ActionForward insertExpenseApproval(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        return insert(mapping, (BeanForm) form, request, RuleType.EXPENSE_APPROVAL_RULES);
    }

    /**
     * �޸�Expense Approval Rule
     * 
     * @param mapping
     * @param form
     * @param request
     * @param response
     * @return ActionForward
     * @throws Exception
     */
    public ActionForward editExpenseApproval(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {
        return edit(mapping, request, RuleType.EXPENSE_APPROVAL_RULES);
    }
    
    /**
     * �޸�Expense Approval Rule
     * 
     * @param mapping
     * @param form
     * @param request
     * @param response
     * @return ActionForward
     * @throws Exception
     */
    public ActionForward editExpenseApprovalWebDragAndDraw(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {
        return newObjectWebDragAndDraw(mapping, request, RuleType.EXPENSE_APPROVAL_RULES);
        //return edit(mapping, request, RuleType.EXPENSE_APPROVAL_RULES);
    }

    /**
     * �����޸ĵ�Expense Approval Rule
     * 
     * @param mapping
     * @param form
     * @param request
     * @param response
     * @return ActionForward
     * @throws Exception
     */
    public ActionForward updateExpenseApproval(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        return update(mapping, (BeanForm) form, request, RuleType.EXPENSE_APPROVAL_RULES);
    }

    /**
     * ɾ��Expense Approval Rule
     * 
     * @param mapping
     * @param form
     * @param request
     * @param response
     * @return ActionForward
     * @throws Exception
     */
    public ActionForward deleteExpenseApproval(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        return delete(mapping, request, RuleType.EXPENSE_APPROVAL_RULES);
    }

    /**
     * ��ѯExpense Claim Rule
     * 
     * @param mapping
     * @param form
     * @param request
     * @param response
     * @return ActionForward
     * @throws Exception
     */
    public ActionForward listExpenseClaim(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {
        return list(mapping, (RuleQueryForm) form, request, response, RuleType.EXPENSE_CLAIM_RULES);
    }

    /**
     * ����Expense Claim Rule
     * 
     * @param mapping
     * @param form
     * @param request
     * @param response
     * @return ActionForward
     * @throws Exception
     */
    public ActionForward newExpenseClaim(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {
        return newObject(mapping, request, RuleType.EXPENSE_CLAIM_RULES);
    }

    /**
     * ����������Expense Claim Rule
     * 
     * @param mapping
     * @param form
     * @param request
     * @param response
     * @return ActionForward
     * @throws Exception
     */
    public ActionForward insertExpenseClaim(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {
        return insert(mapping, (BeanForm) form, request, RuleType.EXPENSE_CLAIM_RULES);
    }

    /**
     * �޸�Expense Claim Rule
     * 
     * @param mapping
     * @param form
     * @param request
     * @param response
     * @return ActionForward
     * @throws Exception
     */
    public ActionForward editExpenseClaim(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {
        return edit(mapping, request, RuleType.EXPENSE_CLAIM_RULES);
    }
    
    /**
     * �޸�Expense Claim Rule
     * 
     * @param mapping
     * @param form
     * @param request
     * @param response
     * @return ActionForward
     * @throws Exception
     */
    public ActionForward editExpenseClaimWebDragAndDraw(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {
        return newObjectWebDragAndDraw(mapping, request, RuleType.EXPENSE_CLAIM_RULES);
    }

    /**
     * �����޸ĵ�Expense Claim Rule
     * 
     * @param mapping
     * @param form
     * @param request
     * @param response
     * @return ActionForward
     * @throws Exception
     */
    public ActionForward updateExpenseClaim(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {
        return update(mapping, (BeanForm) form, request, RuleType.EXPENSE_CLAIM_RULES);
    }

    /**
     * ɾ��Expense Claim Rule
     * 
     * @param mapping
     * @param form
     * @param request
     * @param response
     * @return ActionForward
     * @throws Exception
     */
    public ActionForward deleteExpenseClaim(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {
        return delete(mapping, request, RuleType.EXPENSE_CLAIM_RULES);
    }

    /**
     * ��ѯTravel Approval Rule
     * 
     * @param mapping
     * @param form
     * @param request
     * @param response
     * @return ActionForward
     * @throws Exception
     */
    public ActionForward listTravelApproval(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {
        return list(mapping, (RuleQueryForm) form, request, response, RuleType.TRAVEL_APPROVAL_RULES);
    }

    /**
     * ����Travel Approval Rule
     * 
     * @param mapping
     * @param form
     * @param request
     * @param response
     * @return ActionForward
     * @throws Exception
     */
    public ActionForward newTravelApproval(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {
        return newObject(mapping, request, RuleType.TRAVEL_APPROVAL_RULES);
    }

    /**
     * ����������Travel Approval Rule
     * 
     * @param mapping
     * @param form
     * @param request
     * @param response
     * @return ActionForward
     * @throws Exception
     */
    public ActionForward insertTravelApproval(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        return insert(mapping, (BeanForm) form, request, RuleType.TRAVEL_APPROVAL_RULES);
    }

    /**
     * �޸�Travel Approval Rule
     * 
     * @param mapping
     * @param form
     * @param request
     * @param response
     * @return ActionForward
     * @throws Exception
     */
    public ActionForward editTravelApproval(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {
        return edit(mapping, request, RuleType.TRAVEL_APPROVAL_RULES);
    }
    
    /**
     * �޸�Travel Approval Rule
     * 
     * @param mapping
     * @param form
     * @param request
     * @param response
     * @return ActionForward
     * @throws Exception
     */
    public ActionForward editTravelApprovalWebDragAndDraw(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {
        return newObjectWebDragAndDraw(mapping, request, RuleType.TRAVEL_APPROVAL_RULES);
    }

    /**
     * �����޸ĵ�Travel Approval Rule
     * 
     * @param mapping
     * @param form
     * @param request
     * @param response
     * @return ActionForward
     * @throws Exception
     */
    public ActionForward updateTravelApproval(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        return update(mapping, (BeanForm) form, request, RuleType.TRAVEL_APPROVAL_RULES);
    }

    /**
     * ɾ��Travel Approval Rule
     * 
     * @param mapping
     * @param form
     * @param request
     * @param response
     * @return ActionForward
     * @throws Exception
     */
    public ActionForward deleteTravelApproval(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        return delete(mapping, request, RuleType.TRAVEL_APPROVAL_RULES);
    }

}
