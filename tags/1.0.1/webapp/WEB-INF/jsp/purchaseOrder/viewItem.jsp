<%@ page language="java" contentType="text/html; charset=utf-8"%>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html"%>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean"%>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic"%>
<%@ taglib uri="/WEB-INF/c.tld" prefix="c"%>
<jsp:include page="../recharge/view.jsp"/>
<jsp:include page="itemAttachmentList.jsp"/>
<c:if test="${x_recharged}">
<script>
	setTotalAmount(${x_poi.amount});
</script>
</c:if>