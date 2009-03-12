/* =====================================================================
 *
 * Copyright (c) Sourceforge INFORMATION TECHNOLOGY All rights reserved.
 *
 * =====================================================================
 */

package net.sourceforge.dao.admin;

import java.util.List;
import java.util.Map;

import net.sourceforge.model.admin.SystemLog;
import net.sourceforge.model.admin.query.SystemLogQueryOrder;

/**
 * �������SystemLog�Ľӿ�
 * @author nicebean
 * @version 1.0 (2006-02-15)
 */
public interface SystemLogDAO{

    /**
     * �����ݿ�ȡ��ָ��id��SystemLog
     * 
     * @param id
     *            SystemLog��id
     * @return ����ָ����SystemLog
     */
    public SystemLog getSystemLog(Integer id);
	
    /**
     * ���ط��ϲ�ѯ������SystemLog�������
     * 
     * @param conditions
     *            ������ѯ����������ֵӳ���Map�����в�ѯ����Ӧ������SystemLogQueryCondition���Ԥ���峣��
     * @return ���ϲ�ѯ������SystemLog�������
     */
	public int getSystemLogListCount(Map conditions);
	
    /**
     * ���ط��ϲ�ѯ������SystemLog�����б�
     * 
     * @param conditions
     *            ������ѯ����������ֵӳ���Map�����в�ѯ����Ӧ������SystemLogQueryCondition���Ԥ���峣��
     * @param pageNo
     *            �ڼ�ҳ����pageSizeΪҳ�Ĵ�С��pageSizeΪ-1ʱ���Ըò���
     * @param pageSize
     *            ҳ�Ĵ�С��-1��ʾ����ҳ
     * @param order
     *            ����������null��ʾ������
     * @param descend
     *            false��ʾ����true��ʾ����
     * @return ���ϲ�ѯ������SystemLog�����б�
     */
    public List getSystemLogList(Map conditions, int pageNo, int pageSize, SystemLogQueryOrder order, boolean descend);

    /**
     * ����ָ����SystemLog�������ݿ�
     * 
     * @param systemLog
     *            Ҫ�����SystemLog����
     * @return ������SystemLog����
     */
    public SystemLog insertSystemLog(SystemLog systemLog);
    
}
