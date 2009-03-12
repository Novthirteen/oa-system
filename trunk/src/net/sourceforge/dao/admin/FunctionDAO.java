/* =====================================================================
 *
 * Copyright (c) Sourceforge INFORMATION TECHNOLOGY All rights reserved.
 *
 * =====================================================================
 */

package net.sourceforge.dao.admin;

import java.util.List;
import java.util.Map;

import net.sourceforge.dao.DAO;
import net.sourceforge.model.admin.Function;
import net.sourceforge.model.admin.query.FunctionQueryOrder;

/**
 * �������Function�Ľӿ�
 * 
 * @author nicebean
 * @version 1.0 (2005-11-11)
 */
public interface FunctionDAO extends DAO {

    /**
     * ��ϵͳ���ú����ݿ�ȡ��ָ��id��Function����
     * 
     * @param id
     *            Function�����id
     * @return ����ָ��id��Function����
     */
    public Function getFunction(Integer id);

    /**
     * ����Function�������ݿ�(������name��description)
     * 
     * @param function
     *            Ҫ�����Function����
     * @return �����Function����
     */
    public Function saveFunction(Function function);

    /**
     * ���ط��ϲ�ѯ������Function�������
     * 
     * @param conditions
     *            ������ѯ����������ֵӳ���Map�����в�ѯ����Ӧ������FunctionQueryCondition���Ԥ���峣��
     * @return ���ϲ�ѯ������Function�������
     */
    public int getFunctionListCount(Map conditions);

    /**
     * ���ط��ϲ�ѯ������Function�����б�
     * 
     * @param conditions
     *            ������ѯ����������ֵӳ���Map�����в�ѯ����Ӧ������FunctionQueryCondition���Ԥ���峣��
     * @param pageNo
     *            �ڼ�ҳ����pageSizeΪҳ�Ĵ�С��pageSizeΪ-1ʱ���Ըò���
     * @param pageSize
     *            ҳ�Ĵ�С��-1��ʾ����ҳ
     * @param order
     *            ����������null��ʾ������
     * @param descend
     *            false��ʾ����true��ʾ����
     * @return ���ϲ�ѯ������Function�����б�
     */
    public List getFunctionList(Map conditions, int pageNo, int pageSize, FunctionQueryOrder order, boolean descend);

}
