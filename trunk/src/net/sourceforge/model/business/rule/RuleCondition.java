/* =====================================================================
 *
 * Copyright (c) Sourceforge INFORMATION TECHNOLOGY All rights reserved.
 *
 * =====================================================================
 */

/*
 * Created Fri Sep 23 14:47:57 CST 2005 by MyEclipse Hibernate Tool.
 */
package net.sourceforge.model.business.rule;

import java.io.Serializable;

import net.sourceforge.model.metadata.ConditionType;

/**
 * �������rule_condition���һ�м�¼
 */
public class RuleCondition extends AbstractRuleCondition implements Serializable {
    /**
     * Simple constructor of RuleCondition instances.
     */
    public RuleCondition() {
    }

    /**
     * Constructor of RuleCondition instances given a simple primary key.
     * 
     * @param id
     */
    public RuleCondition(Rule rule, ConditionType type) {
        super(rule, type);
    }

    /* Add customized code below */
    private String displayValue;

    /**
     * ��ȡRule Condition����ʾֵ
     * @return String
     */
    public String getDisplayValue() {
        return displayValue == null ? getValue() : displayValue;
    }

    /**
     * ����Rule Condition����ʾֵ
     * @param displayValue
     */
    public void setDisplayValue(String displayValue) {
        this.displayValue = displayValue;
    }

}
