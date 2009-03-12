package net.sourceforge.dao.admin.hibernate;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import net.sourceforge.dao.BaseDAOHibernate;
import net.sourceforge.dao.admin.ProjectCodeDAO;
import net.sourceforge.model.admin.ProjectCode;
import net.sourceforge.model.admin.Site;
import net.sourceforge.model.admin.query.ProjectCodeQueryCondition;
import net.sourceforge.model.admin.query.ProjectCodeQueryOrder;
import net.sourceforge.model.metadata.EnabledDisabled;

public class ProjectCodeDAOHibernate extends BaseDAOHibernate implements ProjectCodeDAO {
    private Log log = LogFactory.getLog(ProjectCodeDAOHibernate.class);

    private final static String QUERY_STATEMENT = "from ProjectCode projectCode ";

    private final static Object[][] QUERY_CONDITIONS = { { ProjectCodeQueryCondition.ID_EQ, "projectCode.id = ?", null },
            { ProjectCodeQueryCondition.SITE_ID_EQ, "projectCode.site.id = ?", null },
            { ProjectCodeQueryCondition.ENABLED_EQ, "projectCode.enabled = ?", null }, };

    private final static Object[][] QUERY_ORDERS = { { ProjectCodeQueryOrder.ID, "projectCode.id" }, };

    public List getEnabledProjectCodeListBySite(Site site) {

        Map conds = new HashMap();
        conds.put(ProjectCodeQueryCondition.SITE_ID_EQ, site.getId());
        conds.put(ProjectCodeQueryCondition.ENABLED_EQ, EnabledDisabled.ENABLED.getEnumCode());

        return getList(conds, 0, -1, ProjectCodeQueryOrder.ID, false, QUERY_STATEMENT, QUERY_CONDITIONS, QUERY_ORDERS);
    }

    public ProjectCode getProjectCode(Integer id) {
        if (id == null) {
            if (log.isDebugEnabled())
                log.debug("try to get City with null id");
            return null;
        }
        return (ProjectCode) getHibernateTemplate().get(ProjectCode.class, id);
    }

}
