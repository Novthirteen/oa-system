/* =====================================================================
 *
 * Copyright (c) Sourceforge INFORMATION TECHNOLOGY All rights reserved.
 *
 * =====================================================================
 */

package net.sourceforge.model.business;


/**
 * ֧�ֲɹ��Ķ���Ӧ��ʵ�ָýӿ�
 * 
 * @author nicebean
 * @version 1.0 (2005-12-16)
 */
public interface Purchasable {

    /**
     * �����µ�Purchaser���󡣱��磬��PurchaseRequest��Ӧ����PurchaseRequestPurchaser����
     * 
     * @return BasePurchaser�����Ӧ����ʵ��
     */
    public BasePurchaser createNewPurchaserObj();
    
    /**
     * �������ڲɹ��ö����Flow������
     * @return Flow������
     */
    public String getPurchaseFlowName();
    
}
