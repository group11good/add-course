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
				<td>账号</td>
				<td>密码</td>
				<td>姓名</td>
			</tr>
		
		<c:forEach items="${message}" var="us">
			<tr>
				<td>${us.user1id}</td>
				<td>${us.user1pass}</td>
				<td>${us.user1name}</td>
				<td><a href="<%=basePath%>updateInfo3?user1id=${us.user1id}"> <button>修改</button></a></td> 
			</tr>
		</c:forEach>
	</table>

</body>
</html>