<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>


<table>
			<tr>
				<td>course name</td>
				<td>course id</td>
				<td>academic year</td>
				<td>semester</td>
				<td>max people</td>
				<td>credit</td>
				<td>teacher id</td>
			</tr>
		
		<c:forEach items="${message}" var="c">
			<tr>
				<td>${c.coname}</td>
				<td>${c.coid}</td>
				<td>${c.acyear}</td>
				<td>${c.semester}</td>
				<td>${c.max}</td>
				<td>${c.credit}</td>
				<td>${c.tid}</td>
				
				 <td><button onclick="del(${c.coid})">删除</button></td> 
			</tr>
		</c:forEach>
	</table>
	
	<script type="text/javascript">
			function del(coid){
				var b= confirm("确定要删除"+coid);
				if(b){
					window.location.href = "<%=basePath%>/del?coid="+coid;//提交信息到Servlet
				}
			}
	</script>

</body>
</html>