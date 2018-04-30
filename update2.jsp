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
				<td>房间号</td>
				<td>房间状态</td>
				<td>房间价格</td>
				<td>房间类型</td>
			</tr>
		
		<c:forEach items="${message}" var="ro">
			<tr>
				<td>${ro.ronumber}</td>
				<td>${ro.rostate}</td>
				<td>${ro.roprice}</td>
				<td>${ro.rotype}</td>
				<td><a href="<%=basePath%>updateInfo2?ronumber=${ro.ronumber}"> <button>修改</button></a></td> 
			</tr>
		</c:forEach>
	</table>

</body>
</html>