/* =====================================================================
 *
 * Copyright (c) Sourceforge INFORMATION TECHNOLOGY All rights reserved.
 *
 * =====================================================================
 */

package net.sourceforge.service.admin;

import java.util.List;

import net.sourceforge.model.admin.PurchaseType;
import net.sourceforge.model.admin.Site;

/**
 * service manager interface for domain model city
 * 
 * @author shilei
 * @version 1.0 (Nov 15, 2005)
 */
public interface PurchaseTypeManager {

    /**
     * �����ݿ�ȡ��ָ��id��PurchaseType
     * 
     * @param id
     *            PurchaseType��id
     * @return ����ָ����PurchaseType
     */
    public PurchaseType getPurchaseType(String code);

    /**
     * get Enabled PurchaseType List of site
     * @param site
     * @return
     */
    public List getEnabledPurchaseTypeList(Site site);
}
