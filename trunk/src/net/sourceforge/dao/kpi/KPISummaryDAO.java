package net.sourceforge.dao.kpi;

import java.util.List;
import java.util.Map;

import net.sourceforge.model.admin.Site;
import net.sourceforge.model.kpi.KPIExpenseCategorySummary;
import net.sourceforge.model.kpi.KPIPurchaseCategorySummary;
import net.sourceforge.model.kpi.KPISummary;
import net.sourceforge.model.kpi.query.KPISummaryQueryOrder;

public interface KPISummaryDAO {

    public KPISummary getKPISummary(Integer id);
        
    public KPISummary insertKPISummary(KPISummary kpiSummary);

    public KPISummary updateKPISummary(KPISummary kpiSummary);
    
    public void deleteKPISummary(KPISummary kpiSummary);
    
    public KPIPurchaseCategorySummary getKPIPurchaseCategorySummary(Integer id);
    
    public KPIPurchaseCategorySummary insertKPIPurchaseCategorySummary(KPIPurchaseCategorySummary kpiPurchaseCategorySummary);

    public KPIPurchaseCategorySummary updateKPIPurchaseCategorySummary(KPIPurchaseCategorySummary kpiPurchaseCategorySummary);
    
    public void deleteKPIPurchaseCategorySummary(KPIPurchaseCategorySummary kpiPurchaseCategorySummary);
    
    public KPIExpenseCategorySummary getKPIExpenseCategorySummary(Integer id);
    
    public KPIExpenseCategorySummary insertKPIExpenseCategorySummary(KPIExpenseCategorySummary kpiExpenseCategorySummary);

    public KPIExpenseCategorySummary updateKPIExpenseCategorySummary(KPIExpenseCategorySummary kpiExpenseCategorySummary);
    
    public void deleteKPIExpenseCategorySummary(KPIExpenseCategorySummary kpiExpenseCategorySummary);
    
    public List getKPISummaryList(Map conditions, int pageNo, int pageSize, KPISummaryQueryOrder order, boolean descend);
    
    public List getTop5KPIExpenseCategorySummary(Site site);
    
    public List getTop5KPIPurchaseCategorySummary(Site site);
}
