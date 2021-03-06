<%@ page language="java" contentType="text/html; charset=utf-8"%>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html"%>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean"%>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic"%>
<%@ taglib uri="/WEB-INF/c.tld" prefix="c"%>
<%@ taglib uri="/WEB-INF/page.tld" prefix="page"%>
<script>
	function selectDelegate()
	{
		with (document.approverDelegateForm)
		{
			var title="approverDelegate.selectDelegate.title";
			var url="selectDelegateApprover${x_postfix}.do?type="+type.value+
				"&originalApprover_id="+originalApprover_id.value;
			var v=dialogAction(url,title,500,400);
			if (v) {

				document.all.delegateApprover.innerHTML=v["name"];
				delegateApprover_id.value=v["id"];
				delegateApprover_name.value=v["name"];
			};
		}
			
	}
	
	function validateForm(form)
	{
		if(!validateApproverDelegateForm(form))
		{
			return false;
		}
		
		with (document.approverDelegateForm)
		{
			if(fromDate.value>toDate.value)
			{
				toDate.focus();
				alert("<bean:message key="approverDelegate.fromDateAfterToDate"/>");
				return false;
			}
	
			if(fromDate.value<="${x_today}")
			{
				fromDate.focus();
				alert("<bean:message key="approverDelegate.fromDate.notAfterToday" />");
				return false;
			}
			if(toDate.value<="${x_today}")
			{
				toDate.focus();
				alert("<bean:message key="approverDelegate.toDate.notAfterToday" />");
				return false;
			}

		}
		
	}
</script>
<html:javascript formName="approverDelegateForm" staticJavascript="false"/>
<html:form action="/insertApproverDelegate${x_postfix}" onsubmit="return validateForm(this)">
	<html:hidden property="type" />
	<table width=90% border=0 cellpadding=4 cellspacing=0>
		<tr>
			<td style="color:red"><html:messages id="x_message">
			${x_message}<br>
			</html:messages>
			</td>
		</tr>
		<tr>
			<td class="bluetext"><bean:message key="approverDelegate.id" />:</td>
			<td>(<bean:message key="common.id.generateBySystem" />)</td>
		</tr>
		<tr>
			<td class="bluetext"><bean:message key="approverDelegate.originalApprover.id" />:</td>
			<td>
				<html:hidden property="originalApprover_id" />
				<html:hidden property="originalApprover_name" />
				<bean:write name="approverDelegateForm" property="originalApprover_name"/>
			</td>
		</tr>			
		<tr>
			<td class="bluetext"><bean:message key="approverDelegate.delegateApprover.id" />:</td>
			<td>
				<span id="delegateApprover"></span>
				<html:hidden property="delegateApprover_id" />&nbsp;
				<a href="javascript:selectDelegate()"><img src="images/select.gif" width="16" height="16" border="0"/></a>
				<html:hidden property="delegateApprover_name" /><span class="required">*</span>
			</td>
		</tr>			
		<tr>
			<td class="bluetext"><bean:message key="approverDelegate.fromDate" />:</td>
			<td><html:text property="fromDate" size="6" maxlength="10"/>
			<a onclick="event.cancelBubble=true;" 
					href="javascript:showCalendar('dimg1',false,'fromDate',null,null,'approverDelegateForm')">
					<img align="absmiddle" border="0" id="dimg1" src="images/datebtn.gif"/></a>
			<span class="required">*</span></td>
		</tr>			
		<tr>
			<td class="bluetext"><bean:message key="approverDelegate.toDate" />:</td>
			<td><html:text property="toDate" size="6" maxlength="10"/>
				<a onclick="event.cancelBubble=true;" 
					href="javascript:showCalendar('dimg2',false,'toDate',null,null,'approverDelegateForm')">
					<img align="absmiddle" border="0" id="dimg2" src="images/datebtn.gif"/></a>
			<span class="required">*</span></td>
		</tr>			

		<tr>
			<td colspan="2" align="right">
				<logic:empty name="x_fromBefore">
					<html:submit>
						<bean:message key="all.save" />
					</html:submit>
				</logic:empty>		
				&nbsp;<input type="button"
				value="<bean:message key="all.cancel"/>"
				onclick="window.parent.close();" />					
			</td>
		</tr>
	</table>
</html:form>
