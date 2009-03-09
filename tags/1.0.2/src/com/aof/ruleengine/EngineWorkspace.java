/* =====================================================================
 *
 * Copyright (c) Atos Origin INFORMATION TECHNOLOGY All rights reserved.
 *
 * =====================================================================
 */

package com.aof.ruleengine;

import java.util.HashMap;
import java.util.Map;

/**
 * Rule Engine ����������������һϵ�й�����Flow
 * 
 * @author nicebean
 * @version 1.0 (2005-11-15)
 */
public class EngineWorkspace {
    private Map flows;

    /**
     * Ĭ�Ϲ��캯��������һ���µĹ�����
     */
    public EngineWorkspace() {
        flows = new HashMap();
    }

    /**
     * ͨ��Flow�����ֲ�ѯ�������е�Flow
     * 
     * @param name
     *            Flow������
     * @return �����ֵ�Flow����������ڷ���null
     */
    public EngineFlow getFlow(String name) {
        return (EngineFlow) flows.get(name);
    }

    /**
     * �ӹ��������Ƴ�ָ�����ֵ�Flow
     * 
     * @param name
     *            Flow������
     * @return ���Ƴ���Flow����������ڷ���null
     */
    public EngineFlow removeFlow(String name) {
        EngineFlow ef = getFlow(name);
        if (ef == null) return null;
        ef.lockForUpdate();
        try {
            flows.remove(name);
        } finally {
            ef.releaseLock();
        }
        return ef;
    }

    /**
     * �ڹ������д���ָ�����ֵ�Flow�����ָ���������Ѿ����ڣ�����Exception
     * 
     * @param name
     *            Flow������
     * @return �´�����Flow
     */
    public EngineFlow createFlow(String name) {
        if (flows.containsKey(name))
            throw new RuntimeException("Flow '" + name + "' already existed");
        EngineFlow f = new EngineFlow();
        flows.put(name, f);
        return f;
    }
}
