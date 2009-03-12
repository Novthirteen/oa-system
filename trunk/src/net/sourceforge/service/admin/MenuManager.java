/* =====================================================================
 *
 * Copyright (c) Sourceforge INFORMATION TECHNOLOGY All rights reserved.
 *
 * =====================================================================
 */

package net.sourceforge.service.admin;

import java.util.List;
import java.util.Locale;
import java.util.Map;

import net.sourceforge.model.admin.Menu;
import net.sourceforge.model.admin.query.MenuQueryOrder;

/**
 * ����MenuManagerӦ�ö���ķ���
 * 
 * @author nicebean
 * @version 1.0 (2005-11-14)
 */
public interface MenuManager {
    /**
     * �����ݿ�ȡ��ָ��id��Menu����
     * 
     * @param id
     *            Menu�����id
     * @return ����ָ����Menu����
     */
    public Menu getMenu(Integer id) ;

    /**
     * ����Menu�������ݿ�
     * 
     * @param menu
     *            Ҫ�����Menu����
     * @return ���ر�����Menu����
     */
    public Menu saveMenu(Menu menu) ;

    /**
     * �����ݿ�ɾ��ָ��id��Menu����
     * 
     * @param id
     *            Menu�����id
     */
    public void removeMenu(Integer id) ;

    /**
     * ���ط��ϲ�ѯ������Menu�������
     * 
     * @param conditions
     *            ������ѯ����������ֵӳ���Map�����в�ѯ����Ӧ������MenuQueryCondition���Ԥ���峣��
     * @return ���ϲ�ѯ������Menu�������
     */
    public int getMenuListCount(Map conditions) ;

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
    public List getMenuList(Map conditions, int pageNo, int pageSize, MenuQueryOrder order, boolean descend) ;

    /**
     * ����������ʾMenu��״�ṹ��XML����
     * 
     * @param locale
     *            ����
     * @return ����XML���ݵ�String
     */
    public String getMenuXml(Locale locale) ;

}
