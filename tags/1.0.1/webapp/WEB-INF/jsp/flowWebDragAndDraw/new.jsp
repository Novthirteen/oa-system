<%@ page language="java" contentType="text/html; charset=utf-8"%>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html"%>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean"%>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic"%>
<%@ taglib uri="/WEB-INF/c.tld" prefix="c"%>
<div id="main1" class="main" style="visibility:visible" >
<html:form action="insert${X_RULETYPE.prefixUrl}FlowWebDragAndDraw.do"
	onsubmit="return validateForm(this);">
	<html:hidden property="id" />
	<html:hidden property="site_id" />
	<input type="hidden" name="ruleType" value="${X_RULETYPE.enumCode}"/>
	<table>
		<tr>
			<td>
				<bean:message key="flow.site" />
				:
			</td>
			<td>
				<bean:write name="flowForm" property="site_name" />
			</td>
		</tr>
		
		<tr>
			<td>
				<bean:message key="flow.description" />
				:
			</td>
			<td>
				
				<html:text property="description" size="60" />
				<span class="required">*</span>
			</td>
		</tr>
		<tr>
			<td>
				<bean:message key="flow.enabled" />
				:
			</td>
			<td>
				<html:select property="enabled">
					<c:if test="${sessionScope.LOGIN_USER.locale=='en'}">
						<html:options collection="X_ENABLEDDISABLEDLIST"
							property="enumCode" labelProperty="engShortDescription" />
					</c:if>
					<c:if test="${sessionScope.LOGIN_USER.locale!='en'}">
						<html:options collection="X_ENABLEDDISABLEDLIST"
							property="enumCode" labelProperty="chnShortDescription" />
					</c:if>
				</html:select>
			</td>
		</tr>
		<tr style="display:none">
			<td>
				<textarea name="flowXml"></textarea>
			</td>
		</tr>
	</table>
</html:form>
</div>
<div id="panelDraghandle" style="left:10px;" onClick="hideOrShowPane();event.cancelBubble=true;" class="panelDrag" onDraging="setPanelPosition()" align="center"><bean:message key="workFlow.controlPanel" /></div>
<div id="panel1" style="left:10px;" class="panel" style="visibility:visible" onMouseDown="hidePropertiesPane();event.cancelBubble=true;" onMouseUp="event.cancelBubble=true;" onMouseMove="event.cancelBubble=true">
	<button id="rangeBt" onClick="beginSelectRange();" title="<bean:message key="workFlow.selectRange" />" style="width:38px" ><img src="includes/image/range.png" /></button>	
	<button id="arrowBt" style="border:solid 2px red;width:38px" onClick="_detachEventWhenRange();_unlockAll();_clearSelectedArray();showRangeBt();"  title="<bean:message key="workFlow.selectSingle" />"><img src="includes/image/icon_arrow.png" /></button>	
	<hr size="1"/>
	<button onClick="beginCreateNode(1);" title="Start"><img src="includes/image/1.png" /><bean:message key="workFlow.startNode" /></button>	
	<button onClick="beginCreateNode(2);" title="TaskNode" ><img src="includes/image/2.png" /><bean:message key="workFlow.normalNode" /></button>
	<button onClick="beginCreateLine();" title="Transition" onEndWork="selectState=0;"><img src="includes/image/trans.png" /><bean:message key="workFlow.line" /></button>
	<hr size="1" />
	<button onClick="deleteGraphElement();"><img src="includes/image/icon_delete.png" /><bean:message key="workFlow.deleteSelected" /></button>
	<hr  size="1"/>
	<button onClick="saveFlow()"><img src="includes/image/icon_save.png" /><bean:message key="workFlow.saveFlow" /></button>
</div>

<div id="hip" interval="-1" style="behavior:url(includes/htc/snhip.htc)"></div>
<iframe id="props" name="props" src="edit${X_RULETYPE.prefixUrl}RuleWebDragAndDraw.do?site_id=<%=request.getParameter("site_id")%>" scrolling="auto" frameborder="0" style="position:absolute;width:420px;height:555px;left:1px;visibility:hidden;z-index:10003" ></iframe>
<iframe id="decision" name="decision" src="includes/jsp/flowWebDragAndDraw/setDecision.jsp" scrolling="none" frameborder="0" style="position:absolute;width:68px;height:28px;visibility:hidden" ></iframe>


<iframe id="frmSave" src="about:blank" style="display:none"></iframe>  <!--实现保存-->
<div id="_test"></div>
<div id="marginDiv" style="position:absolute;width:300px;text-align:right;top:2000px;left:2000px;color:#999999;overflow:auto;font-size:12px;">Made by shennan(amushen@yahoo.com.cn)</div>
<script>
init();
function initAllNode() {
}
function initAllLine() {
}
</script>
