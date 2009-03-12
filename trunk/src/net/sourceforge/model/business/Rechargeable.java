/* =====================================================================
 *
 * Copyright (c) Sourceforge INFORMATION TECHNOLOGY All rights reserved.
 *
 * =====================================================================
 */

package net.sourceforge.model.business;

import net.sourceforge.model.metadata.YesNo;

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
