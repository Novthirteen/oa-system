/* =====================================================================
 *
 * Copyright (c) Atos Origin INFORMATION TECHNOLOGY All rights reserved.
 *
 * =====================================================================
 */
package com.aof.service.admin;

import java.util.List;
import java.util.Map;

import com.aof.model.Loggable;
import com.aof.model.admin.SystemLog;
import com.aof.model.admin.User;
import com.aof.model.admin.query.SystemLogQueryOrder;

/**
 * �������SystemLog�Ľӿ�
 * 
 * @author nicebean
 * @version 1.0 (2006-02-15)
 */
public interface SystemLogManager {

    /**
     * �����ݿ�ȡ��ָ��id��SystemLog
     * 
     * @param id
     *            SystemLog��id
     * @return ����ָ����SystemLog
     */
    public SystemLog getSystemLog(Integer id) ;

    /**
     * ����ָ����SystemLog�������ݿ�
     * 
     * @param systemLog
     *            Ҫ�����SystemLog����
     * @return ������SystemLog����
     */
    public SystemLog insertSystemLog(SystemLog systemLog) ;

    /**
     * ���ط��ϲ�ѯ������SystemLog�������
     * 
     * @param conditions
     *            ������ѯ����������ֵӳ���Map�����в�ѯ����Ӧ������SystemLogQueryCondition���Ԥ���峣��
     * @return ���ϲ�ѯ������SystemLog�������
     */
    public int getSystemLogListCount(Map condtions) ;

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
     * @return ���ϲ�ѯ������Email�����б�
     */
    public List getSystemLogList(Map condtions, int pageNo, int pageSize, SystemLogQueryOrder order, boolean descend) ;

    /**
     * ����log
     * @param oldTarget
     * @param newTarget
     */
    public void generateLog(final Loggable oldTarget, final Loggable newTarget, String action, User currentUser);

}
