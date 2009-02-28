/* =====================================================================
 *
 * Copyright (c) Atos Origin INFORMATION TECHNOLOGY All rights reserved.
 *
 * =====================================================================
 */

package com.aof.dao.admin;

import java.util.List;
import java.util.Map;

import com.aof.dao.DAO;
import com.aof.model.admin.Menu;
import com.aof.model.admin.query.MenuQueryOrder;

/**
 * �������Menu�Ľӿ�
 * 
 * @author nicebean
 * @version 1.0 (2005-11-11)
 */
public interface MenuDAO extends DAO {

    /**
     * �����ݿ�ȡ��ָ��id��Menu����
     * 
     * @param id
     *            Menu�����id
     * @return ����ָ����Menu����
     */
    public Menu getMenu(Integer id);

    /**
     * ����Menu�������ݿ�
     * 
     * @param menu
     *            Ҫ�����Menu����
     * @return ���ر�����Menu����
     */
    public Menu saveMenu(Menu menu);

    /**
     * �����ݿ�ɾ��ָ��id��Menu����
     * 
     * @param id
     *            Menu�����id
     */
    public void removeMenu(Integer id);

    /**
     * ���ط��ϲ�ѯ������Menu�������
     * 
     * @param conditions
     *            ������ѯ����������ֵӳ���Map�����в�ѯ����Ӧ������MenuQueryCondition���Ԥ���峣��
     * @return ���ϲ�ѯ������Menu�������
     */
    public int getMenuListCount(Map conditions);

    /**
     * ���ط��ϲ�ѯ������Menu�����б�
     * 
     * @param conditions
     *            ������ѯ����������ֵӳ���Map�����в�ѯ����Ӧ������MenuQueryCondition���Ԥ���峣��
     * @param pageNo
     *            �ڼ�ҳ����pageSizeΪҳ�Ĵ�С��pageSizeΪ-1ʱ���Ըò���
     * @param pageSize
     *            ҳ�Ĵ�С��-1��ʾ����ҳ
     * @param order
     *            ����������null��ʾ������
     * @param descend
     *            false��ʾ����true��ʾ����
     * @return ���ϲ�ѯ������Menu�����б�
     */
    public List getMenuList(Map conditions, int pageNo, int pageSize, MenuQueryOrder order, boolean descend);

}
