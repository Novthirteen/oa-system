/* =====================================================================
 *
 * Copyright (c) Sourceforge INFORMATION TECHNOLOGY All rights reserved.
 *
 * =====================================================================
 */

package net.sourceforge.web.struts.action.business.rule;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import net.sourceforge.model.metadata.RuleType;
import com.shcnc.struts.form.BeanForm;

/**
 * ����FilterCondition��Action
 * @author nicebean
 * @version 1.0 (2005-12-27)
 */
public class FilterConditionAction extends BaseRuleConditionAction {
    /**
     * ��ѯYearly Budget Filter Condition
     * @param mapping
     * @param form
     * @param request
     * @param response
     * @return ActionForward
     * @throws Exception
     */
    public ActionForward listYearlyBudget(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {
        return list(mapping, request, response, RuleType.YEARLY_BUDGET_FILTERS);
    }
    
    /**
     * ����Yearly Budget Filter Condition
     * @param mapping
     * @param form
     * @param request
     * @param response
     * @return ActionForward
     * @throws Exception
     */
    public ActionForward newYearlyBudget(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {
        return newObject(mapping, request, RuleType.YEARLY_BUDGET_FILTERS, null);
    }

    /**
     * ����������Yearly Budget Filter Condition
     * @param mapping
     * @param form
     * @param request
     * @param response
     * @return ActionForward
     * @throws Exception
     */
    public ActionForward insertYearlyBudget(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {
        return insert(mapping, (BeanForm)form, request, RuleType.YEARLY_BUDGET_FILTERS, null);
    }

    /**
     * �޸�Yearly Budget Filter Condition
     * @param mapping
     * @param form
     * @param request
     * @param response
     * @return ActionForward
     * @throws Exception
     */
    public ActionForward editYearlyBudget(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {
        return edit(mapping, request, RuleType.YEARLY_BUDGET_FILTERS, null);
    }

    /**
     * �����޸ĵ�Yearly Budget Filter Condition
     * @param mapping
     * @param form
     * @param request
     * @param response
     * @return ActionForward
     * @throws Exception
     */
    public ActionForward updateYearlyBudget(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {
        return update(mapping, (BeanForm)form, request, RuleType.YEARLY_BUDGET_FILTERS, null);
    }

    /**
     * ɾ��Yearly Budget Filter Condition
     * @param mapping
     * @param form
     * @param request
     * @param response
     * @return ActionForward
     * @throws Exception
     */
    public ActionForward deleteYearlyBudget(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {
        return delete(mapping, request, RuleType.YEARLY_BUDGET_FILTERS, null);
    }

    /**
     * ��ѯCapex Filter Condition
     * @param mapping
     * @param form
     * @param request
     * @param response
     * @return ActionForward
     * @throws Exception
     */
    public ActionForward listCapex(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {
        return list(mapping, request, response, RuleType.CAPEX_FILTERS);
    }
    
    /**
     * ����Capex Filter Condition
     * @param mapping
     * @param form
     * @param request
     * @param response
     * @return ActionForward
     * @throws Exception
     */
    public ActionForward newCapex(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {
        return newObject(mapping, request, RuleType.CAPEX_FILTERS, null);
    }

    /**
     * ����������Capex Filter Condition
     * @param mapping
     * @param form
     * @param request
     * @param response
     * @return ActionForward
     * @throws Exception
     */
    public ActionForward insertCapex(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {
        return insert(mapping, (BeanForm)form, request, RuleType.CAPEX_FILTERS, null);
    }

    /**
     * �޸�Capex Filter Condition
     * @param mapping
     * @param form
     * @param request
     * @param response
     * @return ActionForward
     * @throws Exception
     */
    public ActionForward editCapex(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {
        return edit(mapping, request, RuleType.CAPEX_FILTERS, null);
    }

    /**
     * �����޸ĵ�Capex Filter Condition
     * @param mapping
     * @param form
     * @param request
     * @param response
     * @return ActionForward
     * @throws Exception
     */
    public ActionForward updateCapex(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {
        return update(mapping, (BeanForm)form, request, RuleType.CAPEX_FILTERS, null);
    }

    /**
     * ɾ��Capex Filter Condition
     * @param mapping
     * @param form
     * @param request
     * @param response
     * @return ActionForward
     * @throws Exception
     */
    public ActionForward deleteCapex(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {
        return delete(mapping, request, RuleType.CAPEX_FILTERS, null);
    }

    /**
     * ��ѯPurchase Request Filter Condition
     * @param mapping
     * @param form
     * @param request
     * @param response
     * @return ActionForward
     * @throws Exception
     */
    public ActionForward listPurchaseRequest(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {
        return list(mapping, request, response, RuleType.PURCHASE_REQUEST_FILTERS);
    }
    
    /**
     * ����Purchase Request Filter Condition
     * @param mapping
     * @param form
     * @param request
     * @param response
     * @return ActionForward
     * @throws Exception
     */
    public ActionForward newPurchaseRequest(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {
        return newObject(mapping, request, RuleType.PURCHASE_REQUEST_FILTERS, null);
    }

    /**
     * ����������Purchase Request Filter Condition
     * @param mapping
     * @param form
     * @param request
     * @param response
     * @return ActionForward
     * @throws Exception
     */
    public ActionForward insertPurchaseRequest(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {
        return insert(mapping, (BeanForm)form, request, RuleType.PURCHASE_REQUEST_FILTERS, null);
    }

    /**
     * �޸�Purchase Request Filter Condition
     * @param mapping
     * @param form
     * @param request
     * @param response
     * @return ActionForward
     * @throws Exception
     */
    public ActionForward editPurchaseRequest(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {
        return edit(mapping, request, RuleType.PURCHASE_REQUEST_FILTERS, null);
    }

    /**
     * �����޸ĵ�Purchase Request Filter Condition
     * @param mapping
     * @param form
     * @param request
     * @param response
     * @return ActionForward
     * @throws Exception
     */
    public ActionForward updatePurchaseRequest(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {
        return update(mapping, (BeanForm)form, request, RuleType.PURCHASE_REQUEST_FILTERS, null);
    }

    /**
     * ɾ��Purchase Request Filter Condition
     * @param mapping
     * @param form
     * @param request
     * @param response
     * @return ActionForward
     * @throws Exception
     */
    public ActionForward deletePurchaseRequest(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {
        return delete(mapping, request, RuleType.PURCHASE_REQUEST_FILTERS, null);
    }

    /**
     * ��ѯPurchase Order Filter Condition
     * @param mapping
     * @param form
     * @param request
     * @param response
     * @return ActionForward
     * @throws Exception
     */
    public ActionForward listPurchaseOrder(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {
        return list(mapping, request, response, RuleType.PURCHASE_ORDER_FILTERS);
    }
    
    /**
     * ����Purchase Order Filter Condition
     * @param mapping
     * @param form
     * @param request
     * @param response
     * @return ActionForward
     * @throws Exception
     */
    public ActionForward newPurchaseOrder(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {
        return newObject(mapping, request, RuleType.PURCHASE_ORDER_FILTERS, null);
    }

    /**
     * ����������Purchase Order Filter Condition
     * @param mapping
     * @param form
     * @param request
     * @param response
     * @return ActionForward
     * @throws Exception
     */
    public ActionForward insertPurchaseOrder(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {
        return insert(mapping, (BeanForm)form, request, RuleType.PURCHASE_ORDER_FILTERS, null);
    }

    /**
     * �޸�Purchase Order Filter Condition
     * @param mapping
     * @param form
     * @param request
     * @param response
     * @return ActionForward
     * @throws Exception
     */
    public ActionForward editPurchaseOrder(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {
        return edit(mapping, request, RuleType.PURCHASE_ORDER_FILTERS, null);
    }

    /**
     * �����޸ĵ�Purchase Order Filter Condition
     * @param mapping
     * @param form
     * @param request
     * @param response
     * @return ActionForward
     * @throws Exception
     */
    public ActionForward updatePurchaseOrder(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {
        return update(mapping, (BeanForm)form, request, RuleType.PURCHASE_ORDER_FILTERS, null);
    }

    /**
     * ɾ��Purchase Order Filter Condition
     * @param mapping
     * @param form
     * @param request
     * @param response
     * @return ActionForward
     * @throws Exception
     */
    public ActionForward deletePurchaseOrder(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {
        return delete(mapping, request, RuleType.PURCHASE_ORDER_FILTERS, null);
    }

    /**
     * ��ѯExpense Filter Condition
     * @param mapping
     * @param form
     * @param request
     * @param response
     * @return ActionForward
     * @throws Exception
     */
    public ActionForward listExpense(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {
        return list(mapping, request, response, RuleType.EXPENSE_FILTERS);
    }
    
    /**
     * ����Expense Filter Condition
     * @param mapping
     * @param form
     * @param request
     * @param response
     * @return ActionForward
     * @throws Exception
     */
    public ActionForward newExpense(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {
        return newObject(mapping, request, RuleType.EXPENSE_FILTERS, null);
    }

    /**
     * ����������Expense Filter Condition
     * @param mapping
     * @param form
     * @param request
     * @param response
     * @return ActionForward
     * @throws Exception
     */
    public ActionForward insertExpense(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {
        return insert(mapping, (BeanForm)form, request, RuleType.EXPENSE_FILTERS, null);
    }

    /**
     * �޸�Expense Filter Condition
     * @param mapping
     * @param form
     * @param request
     * @param response
     * @return ActionForward
     * @throws Exception
     */
    public ActionForward editExpense(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {
        return edit(mapping, request, RuleType.EXPENSE_FILTERS, null);
    }

    /**
     * �����޸ĵ�Expense Filter Condition
     * @param mapping
     * @param form
     * @param request
     * @param response
     * @return ActionForward
     * @throws Exception
     */
    public ActionForward updateExpense(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {
        return update(mapping, (BeanForm)form, request, RuleType.EXPENSE_FILTERS, null);
    }

    /**
     * ɾ��Expense Filter Condition
     * @param mapping
     * @param form
     * @param request
     * @param response
     * @return ActionForward
     * @throws Exception
     */
    public ActionForward deleteExpense(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {
        return delete(mapping, request, RuleType.EXPENSE_FILTERS, null);
    }

    /**
     * ��ѯTravel Application Filter Condition
     * @param mapping
     * @param form
     * @param request
     * @param response
     * @return ActionForward
     * @throws Exception
     */
    public ActionForward listTravelApplication(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {
        return list(mapping, request, response, RuleType.TRAVEL_APPLICATION_FILTERS);
    }
    
    /**
     * ����Travel Application Filter Condition
     * @param mapping
     * @param form
     * @param request
     * @param response
     * @return ActionForward
     * @throws Exception
     */
    public ActionForward newTravelApplication(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {
        return newObject(mapping, request, RuleType.TRAVEL_APPLICATION_FILTERS, null);
    }

    /**
     * ����������Travel Application Filter Condition
     * @param mapping
     * @param form
     * @param request
     * @param response
     * @return ActionForward
     * @throws Exception
     */
    public ActionForward insertTravelApplication(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {
        return insert(mapping, (BeanForm)form, request, RuleType.TRAVEL_APPLICATION_FILTERS, null);
    }

    /**
     * �޸�Travel Application Filter Condition
     * @param mapping
     * @param form
     * @param request
     * @param response
     * @return ActionForward
     * @throws Exception
     */
    public ActionForward editTravelApplication(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {
        return edit(mapping, request, RuleType.TRAVEL_APPLICATION_FILTERS, null);
    }

    /**
     * �����޸ĵ�Travel Application Filter Condition
     * @param mapping
     * @param form
     * @param request
     * @param response
     * @return ActionForward
     * @throws Exception
     */
    public ActionForward updateTravelApplication(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {
        return update(mapping, (BeanForm)form, request, RuleType.TRAVEL_APPLICATION_FILTERS, null);
    }

    /**
     * ɾ��Travel Application Filter Condition
     * @param mapping
     * @param form
     * @param request
     * @param response
     * @return ActionForward
     * @throws Exception
     */
    public ActionForward deleteTravelApplication(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {
        return delete(mapping, request, RuleType.TRAVEL_APPLICATION_FILTERS, null);
    }


}
