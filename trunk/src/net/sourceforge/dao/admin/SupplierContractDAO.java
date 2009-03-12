/* =====================================================================
 *
 * Copyright (c) Sourceforge INFORMATION TECHNOLOGY All rights reserved.
 *
 * =====================================================================
 */

package net.sourceforge.dao.admin;

import java.io.InputStream;
import java.util.List;
import java.util.Map;

import net.sourceforge.model.admin.SupplierContract;
import net.sourceforge.model.admin.query.SupplierContractQueryOrder;

/**
 * �������SupplierContract�Ľӿ�
 * 
 * @author ych
 * @version 1.0 (Nov 13, 2005)
 */
public interface SupplierContractDAO {

    /**
     * �����ݿ�ȡ��ָ��id��SupplierContract
     * 
     * @param id
     *            SupplierContract��id
     * @return ����ָ����SupplierContract
     */
    public SupplierContract getSupplierContract(Integer id);

    /**
     * ���ط��ϲ�ѯ������SupplierContract�������
     * 
     * @param conditions
     *            ������ѯ����������ֵӳ���Map�����в�ѯ����Ӧ������SupplierContractQueryCondition���Ԥ���峣��
     * @return ���ϲ�ѯ������SupplierContract�������
     */
    public int getSupplierContractListCount(Map conditions);

    /**
     * ���ط��ϲ�ѯ������SupplierContract�����б�
     * 
     * @param conditions
     *            ������ѯ����������ֵӳ���Map�����в�ѯ����Ӧ������SupplierContractQueryCondition���Ԥ���峣��
     * @param pageNo
     *            �ڼ�ҳ����pageSizeΪҳ�Ĵ�С��pageSizeΪ-1ʱ���Ըò���
     * @param pageSize
     *            ҳ�Ĵ�С��-1��ʾ����ҳ
     * @param order
     *            ����������null��ʾ������
     * @param descend
     *            false��ʾ����true��ʾ����
     * @return ���ϲ�ѯ������SupplierContract�����б�
     */
    public List getSupplierContractList(Map conditions, int pageNo, int pageSize, SupplierContractQueryOrder order, boolean descend);

    /**
     * ����ָ����SupplierContract�������ݿ�
     * 
     * @param supplierContract
     *            Ҫ�����SupplierContract����
     * @return ������SupplierContract����
     */
    public SupplierContract insertSupplierContract(SupplierContract supplierContract);

    /**
     * ����ָ����SupplierContract�������ݿ�
     * 
     * @param supplierContract
     *            Ҫ���µ�SupplierContract����
     * @return ���º��SupplierContract����
     */
    public SupplierContract updateSupplierContract(SupplierContract supplierContract);

    /**
     * ����ָ��id��SupplierContract�ļ�����
     * 
     * @param id
     *            SupplierContract��id
     * @param inputStream
     *            SupplierContract�ļ�������
     */
    public void saveSupplierContractContent(Integer id, InputStream inputStream);

    /**
     * ����ָ��id��SupplierContract�ļ�������
     * 
     * @param id
     *            SupplierContract��id
     * @return ָ��id��SupplierContract�ļ�������
     */
    public InputStream getSupplierContractContent(Integer id);
}
