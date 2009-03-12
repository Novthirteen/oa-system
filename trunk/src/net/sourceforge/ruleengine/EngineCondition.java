/* =====================================================================
 *
 * Copyright (c) Sourceforge INFORMATION TECHNOLOGY All rights reserved.
 *
 * =====================================================================
 */

package net.sourceforge.ruleengine;

/**
 * Rule Engine�е�Condition������һ��Rule�е�һ���Ƚ�����
 * 
 * @author nicebean
 * @version 1.0 (2005-11-15)
 */
public class EngineCondition {
    /**
     * �ȽϹ���С��
     */
    public static final int COMPARE_PASS_CONDITION_LESS_THAN = 1;

    /**
     * �ȽϹ���С�ڵ���
     */
    public static final int COMPARE_PASS_CONDITION_LESS_EQUAL = 2;

    /**
     * �ȽϹ��򣺴��ڵ���
     */
    public static final int COMPARE_PASS_CONDITION_GREATER_EQUAL = 3;

    /**
     * �ȽϹ��򣺴���
     */
    public static final int COMPARE_PASS_CONDITION_GREATER_THAN = 4;

    /**
     * �ȽϹ��򣺵���
     */
    public static final int COMPARE_PASS_CONDITION_EQUAL = 5;

    /**
     * �ȽϹ��򣺲�����
     */
    public static final int COMPARE_PASS_CONDITION_NOT_EQUAL = 6;

    private String compareSource;

    private Object compareTarget;

    private int comparePassCondition;

    /**
     * ���캯��
     */
    EngineCondition(String compareSource, int comparePassCondition, Object compareTarget) {
        this.compareSource = compareSource;
        
        switch (comparePassCondition) {
        case COMPARE_PASS_CONDITION_LESS_THAN:
        case COMPARE_PASS_CONDITION_LESS_EQUAL:
        case COMPARE_PASS_CONDITION_GREATER_EQUAL:
        case COMPARE_PASS_CONDITION_GREATER_THAN:
        case COMPARE_PASS_CONDITION_EQUAL:
        case COMPARE_PASS_CONDITION_NOT_EQUAL:
            break;
        default:
            throw new RuntimeException("Compare pass condition code " + comparePassCondition + " is not supported");
        }
        this.comparePassCondition = comparePassCondition;
        
        this.compareTarget = compareTarget;
    }

    /**
     * @return Returns the comparePassCondition.
     */
    public int getComparePassCondition() {
        return comparePassCondition;
    }

    /**
     * @return Returns the compareSource.
     */
    public String getCompareSource() {
        return compareSource;
    }

    /**
     * @return Returns the compareTarget.
     */
    public Object getCompareTarget() {
        return compareTarget;
    }

}
