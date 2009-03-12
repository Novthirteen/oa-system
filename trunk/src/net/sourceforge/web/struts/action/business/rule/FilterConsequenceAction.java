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
import net.sourceforge.web.struts.form.admin.UserQueryForm;
import com.shcnc.struts.form.BeanForm;

/**
 * ����FilterConsequence��Action
 * @author nicebean
 * @version 1.0 (2005-11-14)
 */
public class FilterConsequenceAction extends BaseRuleConsequenceAction {
    /**
     * ����Yearly Budget Filter Consequence
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
     * ����������Yearly Budget Filter Consequence
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
     * �޸�Yearly Budget Filter Consequence
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
     * �����޸ĵ�Yearly Budget Filter Consequence
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
     * ɾ��Yearly Budget Filter Consequence
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
     * ѡ��Yearly Budget Filter Consequence User
     * @param mapping
     * @param form
     * @param request
     * @param response
     * @return ActionForward
     * @throws Exception
     */
    public ActionForward selectYearlyBudgetUser(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {
        return selectUser(mapping, (UserQueryForm) form, request, RuleType.YEARLY_BUDGET_FILTERS);
    }

    /**
     * ����Capex Filter Consequence
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
     * ����������Capex Filter Consequence
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
     * �޸�Capex Filter Consequence
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
     * �����޸ĵ�Capex Filter Consequence
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
     * ɾ��Capex Filter Consequence
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
     * ѡ��Capex Filter Consequence User
     * @param mapping
     * @param form
     * @param request
     * @param response
     * @return ActionForward
     * @throws Exception
     */
    public ActionForward selectCapexUser(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {
        return selectUser(mapping, (UserQueryForm) form, request, RuleType.CAPEX_FILTERS);
    }

    /**
     * ����Purchase Request Filter Consequence
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
     * ����������Purchase Request Filter Consequence
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
     * �޸�Purchase Request Filter Consequence
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
     * �����޸ĵ�Purchase Request Filter Consequence
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
     * ɾ��Purchase Request Filter Consequence
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
     * ѡ��Purchase Request Filter Consequence User
     * @param mapping
     * @param form
     * @param request
     * @param response
     * @return ActionForward
     * @throws Exception
     */
    public ActionForward selectPurchaseRequestUser(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {
        return selectUser(mapping, (UserQueryForm) form, request, RuleType.PURCHASE_REQUEST_FILTERS);
    }

    /**
     * ����Purchase Order Filter Consequence
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
     * ����������Purchase Order Filter Consequence
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
     * �޸�Purchase Order Filter Consequence
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
     * �����޸ĵ�Purchase Order Filter Consequence
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
     * ɾ��Purchase Order Filter Consequence
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
     * ѡ��Purchase Order Filter Consequence User
     * @param mapping
     * @param form
     * @param request
     * @param response
     * @return ActionForward
     * @throws Exception
     */
    public ActionForward selectPurchaseOrderUser(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {
        return selectUser(mapping, (UserQueryForm) form, request, RuleType.PURCHASE_ORDER_FILTERS);
    }

    /**
     * ����Expense Filter Consequence
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
     * ����������Expense Filter Consequence
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
     * �޸�Expense Filter Consequence
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
     * �����޸ĵ�Expense Filter Consequence
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
     * ɾ��Expense Filter Consequence
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
     * ѡ��Expense Filter Consequence User
     * @param mapping
     * @param form
     * @param request
     * @param response
     * @return ActionForward
     * @throws Exception
     */
    public ActionForward selectExpenseUser(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {
        return selectUser(mapping, (UserQueryForm) form, request, RuleType.EXPENSE_FILTERS);
    }

    /**
     * ����Travel Application Filter Consequence
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
     * ����������Travel Application Filter Consequence
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
     * �޸�Travel Application Filter Consequence
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
     * �����޸ĵ�Travel Application Filter Consequence
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
     * ɾ��Travel Application Filter Consequence
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

    /**
     * ѡ��Travel Application Filter Consequence User
     * @param mapping
     * @param form
     * @param request
     * @param response
     * @return ActionForward
     * @throws Exception
     */
    public ActionForward selectTravelApplicationUser(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {
        return selectUser(mapping, (UserQueryForm) form, request, RuleType.TRAVEL_APPLICATION_FILTERS);
    }

}
