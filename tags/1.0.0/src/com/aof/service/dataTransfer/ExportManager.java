/* =====================================================================
 *
 * Copyright (c) Atos Origin INFORMATION TECHNOLOGY All rights reserved.
 *
 * =====================================================================
 */
package com.aof.service.dataTransfer;

import com.aof.model.admin.DataTransferParameter;

/**
 * ����ERP����ת���ĵ����ļ��ӿ�
 * @author ych
 * @version 1.0 (Dec 22, 2005)
 */
public interface ExportManager {
    
    public void exportFile(DataTransferParameter para) throws Exception ;
    
    
}
