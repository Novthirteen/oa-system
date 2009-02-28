/* =====================================================================
 *
 * Copyright (c) Atos Origin INFORMATION TECHNOLOGY All rights reserved.
 *
 * =====================================================================
 */

package com.aof.model.business;

import com.aof.model.metadata.YesNo;

/**
 * ֧��Recharge�Ķ���Ӧ��ʵ�ָýӿ�
 * 
 * @author nicebean
 * @version 1.0 (2005-11-24)
 */
public interface Rechargeable {

    /**
     * �����µ�Recharge���󡣱��磬��Expense��Ӧ����ExpenseRecharge���󣬲�����setExpense
     * 
     * @return BaseRecharge�����Ӧ����ʵ��
     */
    public BaseRecharge createNewRechargeObj();
    
    /**
     * ���ض����Ƿ���recharge
     * @return YesNo.YES: ��; YesNo.NO: ��
     */
    public YesNo getIsRecharge();
    
    /**
     * ���ö����Ƿ���recharge
     * @param canRecharge YesNo����
     */
    public void setIsRecharge(YesNo isRecharge);
}
