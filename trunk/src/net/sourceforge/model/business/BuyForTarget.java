/* =====================================================================
 *
 * Copyright (c) Sourceforge INFORMATION TECHNOLOGY All rights reserved.
 *
 * =====================================================================
 */

package net.sourceforge.model.business;

import net.sourceforge.model.admin.Department;
import net.sourceforge.model.admin.User;

/**
 * ֧������buy for����Ķ���Ӧ��ʵ�ָýӿ�
 * 
 * @author nicebean
 * @version 1.0 (2005-12-12)
 */
public interface BuyForTarget extends Rechargeable {

    /**
     * ���ض����buyForUser����
     * 
     * @return buyForUser����
     */
    public User getBuyForUser();

    /**
     * ���ö����buyForUser����
     * 
     * @param buyForUser
     *            buyForUser����
     */
    public void setBuyForUser(User buyForUser);

    /**
     * ���ض����buyForDepartment����
     * 
     * @return buyForDepartment����
     */
    public Department getBuyForDepartment();

    /**
     * ���ö����buyForDepartment����
     * 
     * @param buyForDepartment
     *            buyForDepartment����
     */
    public void setBuyForDepartment(Department buyForDepartment);

}
