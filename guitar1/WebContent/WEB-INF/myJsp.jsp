<%@page import="org.apache.struts2.ServletActionContext"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>

<script type="text/javascript">
	
</script>
</head>
<body>
	<div>
		<s:form name="formGuitar" action="guitar_searchAll" 
			method="post" theme="simple">
		Please input the price：<br/>
		<input type="text" name="price" value="<%=(request.getParameter("price")==null)
		?"":request.getParameter("price")%>"/><br/>
		Please input the builder：<br/>
		<input type="text" name="builder" value="<%=(request.getParameter("builder")==null)
		?"":request.getParameter("builder")%>"/><br/>
		Please input the type：<br/>
		<input type="text" name="type" value="<%=(request.getParameter("type")==null)
		?"":request.getParameter("type")%>"/><br/>
		<input type="submit"  value="查询"/>
		</s:form>
	</div>
	<div>
		<div>
			记录总条数为：<%=request.getAttribute("findAllSize") %>
		</div>
		<div>
		<table border="1">
	       <tr>
	           <td>序号</td>
	           <td>价格</td>
	           <td>创建者</td>
	           <td>模型种类</td>
	           <td>类型</td>
	           <td>后板材质</td>
	           <td>前板材质</td>
	       </tr>
	        	<s:iterator value="#request.findAll" var="u">
				<tr>
				<td height="30"><s:property value="#u.serialNumber"/></td>
				<td><s:property value="#u.price"/></a></td>
				<td><s:property value="#u.builder"/></td>
				<td><s:property value="#u.model"/></td>
				<td><s:property value="#u.type"/></td>
				<td><s:property value="#u.backWood"/></td>
				<td><s:property value="#u.topWood"/></td>
				</tr>
				</s:iterator>
	   	</table>
	   	</div>
	</div>
</body>
</html>