/* =====================================================================
 *
 * Copyright (c) Sourceforge INFORMATION TECHNOLOGY All rights reserved.
 *
 * =====================================================================
 */
package net.sourceforge.model.business.pr.query;

import net.sourceforge.model.business.query.BaseApproveQueryCondition;

/**
 * CapexRequestApproveRequest��ѯ������ö����
 * 
 * @author nicebean
 * @version 1.0 (2005-12-8)
 */
public class CapexRequestApproveRequestQueryCondition extends BaseApproveQueryCondition {

    public static final CapexRequestApproveRequestQueryCondition CODE_LIKE = new CapexRequestApproveRequestQueryCondition("code_like");

    public static final CapexRequestApproveRequestQueryCondition TITLE_LIKE = new CapexRequestApproveRequestQueryCondition("title_like");

    //public static final CapexRequestApproveRequestQueryCondition STATUS_EQ = new CapexRequestApproveRequestQueryCondition("status_eq");

    public static final CapexRequestApproveRequestQueryCondition STATUS_NEQ = new CapexRequestApproveRequestQueryCondition("status_neq");

    public static final CapexRequestApproveRequestQueryCondition SUBMIT_DATE_BT = new CapexRequestApproveRequestQueryCondition("submit_date_bt");

    protected CapexRequestApproveRequestQueryCondition(String value) {
        super(value);
    }

    public static CapexRequestApproveRequestQueryCondition getEnum(String value) {
        return (CapexRequestApproveRequestQueryCondition) getEnum(CapexRequestApproveRequestQueryCondition.class, value);
    }

}
