/* =====================================================================
 *
 * Copyright (c) Sourceforge INFORMATION TECHNOLOGY All rights reserved.
 *
 * =====================================================================
 */
package net.sourceforge.dao.admin.hibernate;

import java.util.List;
import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import net.sourceforge.dao.BaseDAOHibernate;
import net.sourceforge.dao.admin.TravelGroupDAO;
import net.sourceforge.dao.convert.LikeConvert;
import org.apache.commons.beanutils.PropertyUtils;

import net.sourceforge.model.admin.TravelGroup;
import net.sourceforge.model.admin.query.TravelGroupQueryCondition;
import net.sourceforge.model.admin.query.TravelGroupQueryOrder;

/**
 * hibernate implement for TravelGroupDAO
 * @author shilei
 * @version 1.0 (Nov 15, 2005)
 */
public class TravelGroupDAOHibernate extends BaseDAOHibernate implements TravelGroupDAO {
    private Log log = LogFactory.getLog(TravelGroupDAOHibernate.class);


    /* (non-Javadoc)
     * @see net.sourceforge.dao.admin.TravelGroupDAO#getTravelGroup(java.lang.Integer)
     */
    public TravelGroup getTravelGroup(Integer id){
        if (id == null) {
            if (log.isDebugEnabled()) log.debug("try to get TravelGroup with null id");
            return null;
        }
        return (TravelGroup) getHibernateTemplate().get(TravelGroup.class, id);
    }

    /* (non-Javadoc)
     * @see net.sourceforge.dao.admin.TravelGroupDAO#updateTravelGroup(net.sourceforge.model.admin.TravelGroup)
     */
    public TravelGroup updateTravelGroup(TravelGroup travelGroup) {
        Integer id = travelGroup.getId();
        if (id == null) {
            throw new RuntimeException("cannot save a travelGroup with null id");
        }
        TravelGroup oldTravelGroup = getTravelGroup(id);
        if (oldTravelGroup != null) {
        	try{
                PropertyUtils.copyProperties(oldTravelGroup,travelGroup);
        	}
        	catch(Exception e)
        	{
                throw new RuntimeException("copy error��"+e);
        	}
        	getHibernateTemplate().update(oldTravelGroup);	
        	return oldTravelGroup;
        }
        else
        {
        	throw new RuntimeException("travelGroup not found");
        }
    }

	/* (non-Javadoc)
	 * @see net.sourceforge.dao.admin.TravelGroupDAO#insertTravelGroup(net.sourceforge.model.admin.TravelGroup)
	 */
	public TravelGroup insertTravelGroup(TravelGroup travelGroup) {
       	getHibernateTemplate().save(travelGroup);
       	return travelGroup;
    }

    private final static String SQL_COUNT = "select count(*) from TravelGroup travelGroup";

    private final static String SQL = "from TravelGroup travelGroup";

    private final static Object[][] QUERY_CONDITIONS = {
    	/*id*/    
		{ TravelGroupQueryCondition.ID_EQ, "travelGroup.id = ?", null },

		/*keyPropertyList*/

		/*kmtoIdList*/

		/*mtoIdList*/
		{ TravelGroupQueryCondition.SITE_ID_EQ, "travelGroup.site.id = ?", null },

		/*property*/
		{ TravelGroupQueryCondition.NAME_LIKE, "travelGroup.name like ?", new LikeConvert() },
		{ TravelGroupQueryCondition.ENABLED_EQ, "travelGroup.enabled = ?", null },
    };
    
    private final static Object[][] QUERY_ORDERS = {
		/*id*/
        { TravelGroupQueryOrder.ID, "travelGroup.id" },

		/*property*/
        { TravelGroupQueryOrder.NAME, "travelGroup.name" },
        { TravelGroupQueryOrder.ENABLED, "travelGroup.enabled" },
    };
    
    /* (non-Javadoc)
     * @see net.sourceforge.dao.admin.TravelGroupDAO#getTravelGroupListCount(java.util.Map)
     */
    public int getTravelGroupListCount(final Map conditions) {
        return getListCount(conditions, SQL_COUNT, QUERY_CONDITIONS);
    }

    /* (non-Javadoc)
     * @see net.sourceforge.dao.admin.TravelGroupDAO#getTravelGroupList(java.util.Map, int, int, net.sourceforge.model.admin.query.TravelGroupQueryOrder, boolean)
     */
    public List getTravelGroupList(final Map conditions, final int pageNo, final int pageSize, final TravelGroupQueryOrder order, final boolean descend) {
        return getList(conditions, pageNo, pageSize, order, descend, SQL, QUERY_CONDITIONS, QUERY_ORDERS);
    }

}
