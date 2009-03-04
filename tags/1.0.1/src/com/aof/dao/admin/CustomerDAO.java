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
import com.aof.model.admin.Customer;
import com.aof.model.admin.query.CustomerQueryOrder;

/**
 * �������Customer�Ľӿ�
 * 
 * @author nicebean
 * @version 1.0 (2005-11-23)
 */
public interface CustomerDAO extends DAO {

    /**
     * �����ݿ�ȡ��ָ��id��Customer����
     * 
     * @param code
     *            Customer�����code
     * @return ����ָ����Customer����
     */
    public Customer getCustomer(String code);

    /**
     * ���ط��ϲ�ѯ������Customer�������
     * 
     * @param conditions
     *            ������ѯ����������ֵӳ���Map�����в�ѯ����Ӧ������CustomerQueryCondition���Ԥ���峣��
     * @return ���ϲ�ѯ������Customer�������
     */
    public int getCustomerListCount(Map conditions);

    /**
     * ���ط��ϲ�ѯ������Customer�����б�
     * 
     * @param conditions
     *            ������ѯ����������ֵӳ���Map�����в�ѯ����Ӧ������CustomerQueryCondition���Ԥ���峣��
     * @param pageNo
     *            �ڼ�ҳ����pageSizeΪҳ�Ĵ�С��pageSizeΪ-1ʱ���Ըò���
     * @param pageSize
     *            ҳ�Ĵ�С��-1��ʾ����ҳ
     * @param order
     *            ����������null��ʾ������
     * @param descend
     *            false��ʾ����true��ʾ����
     * @return ���ϲ�ѯ������Customer�����б�
     */
    public List getCustomerList(Map conditions, int pageNo, int pageSize, CustomerQueryOrder order, boolean descend);

}
