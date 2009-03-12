/* =====================================================================
 *
 * Copyright (c) Sourceforge INFORMATION TECHNOLOGY All rights reserved.
 *
 * =====================================================================
 */

package net.sourceforge.model.admin.query;

import org.apache.commons.lang.enums.Enum;

/**
 * SupplierHistory��ѯ������ö����
 * @author ych
 * @version 1.0 (Nov 13, 2005)
 */
public class SupplierHistoryQueryCondition extends Enum{

	public static final SupplierHistoryQueryCondition ID_EQ =
		 new SupplierHistoryQueryCondition("id_eq");
	
	protected SupplierHistoryQueryCondition(String value) {
		super(value);
	}
	
	public static SupplierHistoryQueryCondition getEnum(String value) {
        return (SupplierHistoryQueryCondition) getEnum(SupplierHistoryQueryCondition.class, value);
    }

}
