/* =====================================================================
 *
 * Copyright (c) Atos Origin INFORMATION TECHNOLOGY All rights reserved.
 *
 * =====================================================================
 */

package com.aof.dao.business.rule;

import java.util.List;
import java.util.Map;

import com.aof.dao.DAO;
import com.aof.model.business.rule.Rule;
import com.aof.model.business.rule.RuleCondition;
import com.aof.model.business.rule.RuleConsequence;
import com.aof.model.business.rule.query.RuleQueryOrder;
import com.aof.model.metadata.ConditionType;

/**
 * �������Rule�Ľӿ�
 * @author nicebean
 * @version 1.0 (2005-11-14)
 */
public interface RuleDAO extends DAO {

    /**
     * �����ݿ�ȡ��ָ��id��Rule���󣬲���ʼ��conditions��consequences����
     * 
     * @param id
     *            Rule�����id
     * @param loadLazyProperty
     *            true��ʾ��ʼ��conditions��consequences���ϣ�false�򲻳�ʼ��
     * @return Rule����
     */
    public Rule getRule(Integer id, boolean loadLazyProperties);
    
    /**
     * ����Rule�������ݿ�
     * 
     * @param r
     *            Ҫ�����Rule����
     * @return ������Rule����
     */
    public Rule saveRule(Rule r);
    
    /**
     * �����ݿ�ɾ��ָ��id��Rule����
     * 
     * @param id
     *            Rule�����id
     */
    public void removeRule(Integer id);
    
    /**
     * ���ط��ϲ�ѯ������Rule�������
     * 
     * @param conditions
     *            ������ѯ����������ֵӳ���Map�����в�ѯ����Ӧ������RuleQueryCondition���Ԥ���峣��
     * @return ���ϲ�ѯ������Rule�������
     */
    public int getRuleListCount(Map conditions);
    
    /**
     * ���ط��ϲ�ѯ������Rule�����б�
     * 
     * @param conditions
     *            ������ѯ����������ֵӳ���Map�����в�ѯ����Ӧ������RuleQueryCondition���Ԥ���峣��
     * @param pageNo
     *            �ڼ�ҳ����pageSizeΪҳ�Ĵ�С��pageSizeΪ-1ʱ���Ըò���
     * @param pageSize
     *            ҳ�Ĵ�С��-1��ʾ����ҳ
     * @param order
     *            ����������null��ʾ������
     * @param descend
     *            false��ʾ����true��ʾ����
     * @return ���ϲ�ѯ������Rule�����б�
     */
    public List getRuleList(Map conditions, int pageNo, int pageSize, RuleQueryOrder order, boolean descend);
    
    /**
     * ��ѯָ��id��Rule�Ƿ�Flow����
     * 
     * @param id
     *            Rule�����id
     * @return true��ʾָ����Rule��ĳ��Flow���ã�false��ʾû���κ�Flow�õ��˸�Rule
     */
    public boolean isRuleInUse(Integer id);

    /**
     * �����ݿ��ȡָ����RuleCondition����
     * 
     * @param ruleId
     *            Ҫ��ȡ��RuleCondition�����rule���Ե�id
     * @param ct
     *            Ҫ��ȡ��RuleCondition�����conditionType����
     * @return ����ָ����RuleCondition����
     */
    public RuleCondition getRuleCondition(Integer ruleId, ConditionType ct);

    /**
     * ����RuleCondition�������ݿ�
     * 
     * @param rc
     *            Ҫ������RuleCondition����
     * @return ������RuleCondition����
     */
    public RuleCondition saveRuleCondition(RuleCondition rc);

    /**
     * ����RuleCondition�������ݿ�
     * 
     * @param rc
     *            Ҫ���µ�RuleCondition����
     * @return ������RuleCondition����
     */
    public RuleCondition updateRuleCondition(RuleCondition rc);

    /**
     * �����ݿ�ɾ��RuleCondition����
     * 
     * @param rc
     *            Ҫɾ����RuleCondition����
     */
    public void removeRuleCondition(RuleCondition rc);

    /**
     * �����ݿ��ȡָ����RuleConsequence����
     * 
     * @param ruleId
     *            Ҫ��ȡ��RuleConsequence�����rule���Ե�id
     * @param userId
     *            Ҫ��ȡ��RuleConsequence�����user���Ե�id
     * @return ����ָ����RuleConsequence����
     */
    public RuleConsequence getRuleConsequence(Integer ruleId, Integer userId);

    /**
     * ����RuleConsequence�������ݿ�
     * 
     * @param rc
     *            Ҫ������RuleConsequence����
     * @return ������RuleConsequence����
     */
    public RuleConsequence saveRuleConsequence(RuleConsequence rc);

    /**
     * ����RuleConsequence�������ݿ�
     * 
     * @param rc
     *            Ҫ���µ�RuleConsequence����
     * @return ������RuleConsequence����
     */
    public RuleConsequence updateRuleConsequence(RuleConsequence rc);

    /**
     * �����ݿ�ɾ��RuleConsequence����
     * 
     * @param rc
     *            Ҫɾ����RuleConsequence����
     */
    public void removeRuleConsequence(RuleConsequence rc);

    /**
     * ��ѯָ��id��Rule�����consequences����������seqֵ
     * 
     * @param ruleId
     *            Rule�����id
     * @return ���consequences����Ϊ���򷵻�null�����򷵻�����seqֵ
     */
    public Integer getMaxConsequenceSeqNoForRuleId(Integer ruleId);
    
    /**
     * ȡ������ָ��id��Rule�������е�RuleCondition�б�
     * @param ruleId Rule�����id
     * @return RuleCondition�����б�
     */
    public List getConditionsForRuleId(Integer ruleId);

    /**
     * ȡ������ָ��id��Rule�������е�RuleConsequence�б�
     * @param ruleId Rule�����id
     * @return RuleConsequence�����б�
     */
    public List getConsequencesForRuleId(Integer ruleId);


}
