/* =====================================================================
 *
 * Copyright (c) Sourceforge INFORMATION TECHNOLOGY All rights reserved.
 *
 * =====================================================================
 */

package net.sourceforge.service.admin;

import java.util.List;
import java.util.Map;

import org.apache.struts.config.ModuleConfig;

import net.sourceforge.model.admin.Function;
import net.sourceforge.model.admin.query.FunctionQueryOrder;

/**
 * �������Function�Ľӿ�
 * 
 * @author nicebean
 * @version 1.0 (2005-11-14)
 */
public interface FunctionManager {

    /**
     * ���FunctionManager�Ƿ��Ѿ���ɳ�ʼ��
     * 
     * @return true��ʾ�Ѿ���ɣ�false��ʾ��δ��ʼ��
     */
    public boolean isInitiated();

    /**
     * ��ʼ��FunctionManager����ȡstruts��������Ϣ���������ݿ����Function��������Ϣ
     * 
     * @param config
     *            struts��ModuleConfig����
     * 
     */
    public void initiate(ModuleConfig config) ;

    /**
     * ����ָ�����͵�Function����
     * 
     * @param functionType
     *            Function���ͣ���struts-config�ж��壬ÿ������ֻ�ܸ���һ��ActionMapping
     * @return Function����
     * 
     */
    public Function getFunction(String functionType) ;

    /**
     * ����ָ��id��Function����
     * 
     * @param id
     *            Function�����id
     * @return Function����
     * 
     */
    public Function getFunction(Integer id) ;

    /**
     * ����Function�������ݿ⣬��description�ᱣ��
     * 
     * @param function
     *            Function����
     * @return ������Function����
     * 
     */
    public Function saveFunction(Function function) ;

    /**
     * ���ط��ϲ�ѯ������Function�������
     * 
     * @param conditions
     *            ������ѯ����������ֵӳ���Map�����в�ѯ����Ӧ������FunctionQueryCondition���Ԥ���峣��
     * @return ���ϲ�ѯ������Function�������
     * 
     */
    public int getFunctionListCount(Map condtions) ;

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
     * 
     */
    public List getFunctionList(Map condtions, int pageNo, int pageSize, FunctionQueryOrder order, boolean descend) ;

    /**
     * �������е�Function����
     * 
     * @return Function�����б�
     * 
     */
    public List getAllFunction() ;

}
