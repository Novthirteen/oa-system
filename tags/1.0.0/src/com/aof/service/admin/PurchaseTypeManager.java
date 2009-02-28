/* =====================================================================
 *
 * Copyright (c) Atos Origin INFORMATION TECHNOLOGY All rights reserved.
 *
 * =====================================================================
 */

package com.aof.service.admin;

import java.util.List;

import com.aof.model.admin.PurchaseType;
import com.aof.model.admin.Site;

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
