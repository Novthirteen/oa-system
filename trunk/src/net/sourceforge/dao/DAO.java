/* =====================================================================
 *
 * Copyright (c) Sourceforge INFORMATION TECHNOLOGY All rights reserved.
 *
 * =====================================================================
 */

package net.sourceforge.dao;

/**
 * ����DAOӦ���ṩ�ķ���
 * 
 * @author nicebean
 * @version 1.0 (2005-11-11)
 */
public interface DAO {

    /**
     * �����ݿ����»�ȡָ���Ķ���
     * 
     * @param o
     *            ��Ҫ���»�ȡ�Ķ���
     * @return ���»�ȡ�Ķ���
     */
    public Object refreshObject(Object o);

    /**
     * ����������ݿ� - insert
     * 
     * @param o
     *            Ҫ����Ķ���
     */
    public void saveObject(Object o);

    /**
     * ���¶������ݿ� - update
     * 
     * @param o
     *            Ҫ���µĶ���
     */
    public void updateObject(Object o);

    /**
     * �����ݿ�ɾ������
     * 
     * @param o
     *            Ҫɾ���Ķ���
     */
    public void removeObject(Object o);
}
