/* =====================================================================
 *
 * Copyright (c) Atos Origin INFORMATION TECHNOLOGY All rights reserved.
 *
 * =====================================================================
 */
package com.aof.dao.admin;

import java.util.List;

import com.aof.model.admin.Currency;
import com.aof.model.admin.Customer;
import com.aof.model.admin.ExchangeRate;
import com.aof.model.admin.ExpenseCategory;
import com.aof.model.admin.ExpenseSubCategory;
import com.aof.model.admin.PurchaseType;
import com.aof.model.admin.Site;
import com.aof.model.admin.Supplier;
import com.aof.model.business.expense.Expense;
import com.aof.model.business.po.PurchaseOrder;
import com.aof.model.business.po.PurchaseOrderItem;
import com.aof.model.business.po.PurchaseOrderItemReceipt;

/**
 * 
 * @author ych
 * @version 1.0 (Dec 20, 2005)
 */
public interface DataTransferDAO {
    /**
     * ���DataTransferParameter���б�
     * 
     * @return DataTransferParameter���б�
     */
    public List getDataTransferParameterList();

    /**
     * ȡ��ָ��Site���Ѿ�final confirmed��δ������PurchaseOrder�б�
     * 
     * @param site
     *            ָ����Site
     * @return
     */
    public List getPOList(Site site);

    /**
     * ȡ��ָ��PurchaseOrder��PurchaseOrderItem�б�
     * 
     * @param po
     *            ָ����PurchaseOrder
     * @return
     */
    public List getPOItemList(PurchaseOrder po);

    /**
     * ȡ��ָ��PurchaseOrderItem��PurchaseOrderItemRecharge�б�
     * 
     * @param poItem
     *            ָ����PurchaseOrderItem
     * @return
     */
    public List getPOItemRecharge(PurchaseOrderItem poItem);

    public List getPOItemReceiptList(Site site);

    public List getExpenseList(Site site);

    public List getExpenseDetailList(Expense expense);

    public List getExpenseRechargeList(Expense expense);

    public List getSupplierList(Site site);

    public List getDepartmentList(Site site);

    public List getCountryList(Site site);
    
    public List getPurchaseTypeCodeList(Site site);
    
    public List getCustomerList(Site site);
    
    public List getExchangeRateList(Site site);
    
    public List getExpenseCategoryList(Site site);
    
    public List getExpenseSubCategoryList(Site site);
    
    public Currency getCurrency(String code);
    
    public ExpenseCategory getExpenseCategory(Site site,String code);
    
    public ExpenseSubCategory getExpenseSubCategory(ExpenseCategory expenseCategory,String code);

    public void updatePurchaseOrder(PurchaseOrder po);

    public void updatePurchaseOrderItemReceipt(PurchaseOrderItemReceipt receipt);

    public void updateExpense(Expense expense);

    public void updateSupplier(Supplier supplier);
    
    public void updatePurchaseType(PurchaseType purchaseType,boolean insert);
    
    public void updateExchangeRate(ExchangeRate exchangeRate,boolean insert);
    
    public void updateExpenseCategory(ExpenseCategory expenseCategory,boolean insert);
    
    public void updateExpenseSubCategory(ExpenseSubCategory expenseSubCategory,boolean insert);
    
    public void updateCustomer(Customer customer,boolean insert);
}
