/* =====================================================================
 *
 * Copyright (c) Sourceforge INFORMATION TECHNOLOGY All rights reserved.
 *
 * =====================================================================
 */

package net.sourceforge.service.business.rule;

import java.util.List;
import java.util.Map;
import java.util.Set;

import net.sourceforge.model.business.rule.Rule;
import net.sourceforge.model.business.rule.RuleCondition;
import net.sourceforge.model.business.rule.RuleConsequence;
import net.sourceforge.model.business.rule.query.RuleQueryOrder;
import net.sourceforge.model.metadata.ConditionType;
import net.sourceforge.model.metadata.RuleType;
import net.sourceforge.ruleengine.EngineRule;

/**
 * �������Rule�Ľӿ�
 * 
 * @author nicebean
 * @version 1.0 (2005-11-14)
 */
public interface RuleManager {

    /**
     * �����ݿ�ȡ��ָ��id��Rule����
     * 
     * @param id
     *            Rule�����id
     * @return Rule����
     */
    public Rule getRule(Integer id);

    /**
     * �����ݿ�ȡ��ָ��id��Rule���󣬲���ʼ��conditions��consequences����
     * 
     * @param id
     *            Rule�����id
     * @param loadLazyProperty
     *            true��ʾ��ʼ��conditions��consequences���ϣ�false�򲻳�ʼ��
     * @return Rule����
     */
    public Rule getRule(Integer id, boolean loadLazyProperty);

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
     * ��ȡָ����Site��Rule Type������״̬Ϊ���õ�Rule�����б�
     * 
     * @param siteId
     *            ָ��Site��id
     * @param type
     *            ָ����Rule Type
     * @return Rule������б�
     */
    public List getSiteEnabledRuleList(Integer siteId, RuleType type);

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
     * ����ָ��id��Rule��conditions��consequences��������Rule Engine��EngineRule
     * 
     * @param ruleId
     *            Rule�����id
     * @param er
     *            Ҫ���µ�EngineRule
     */
    public void updateEngineRuleForRule(Integer ruleId, EngineRule er);

    /**
     * ����ָ����Site Id��RuleType����������Rule����
     * 
     * @param siteId
     *            Site�����Id
     * @param rt
     *            RuleType
     * @return ����������Rule�����б�
     */
    /**
     * @param siteId
     * @param rt
     * @return
     */
    public List getEnabledRuleListForRuleType(Integer siteId, RuleType rt);

    public void saveRules(List list);
    
    public Rule saveRuleAll(Rule r);
    
    public void removeRules(Set ruleSet);
}
