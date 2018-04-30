<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
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


<form action="<%=basePath%>updateById3" method="post">
	
		账号：<input type="text" name="user1id" value="${message.user1id}">
				<br>
				密码：<input type="text" name="user1pass" value="${message.user1pass}">
				<br>
				姓名:<input type="text" name="user1name" value="${message.user1name}">
				<br>
		
			<input type="submit" value="修改"/>
</form>

</body>
</html>