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


<form action="<%=basePath%>updateById2" method="post">
	
		房间号：<input type="text" name="ronumber" value="${message.ronumber}">
				<br>
				房间状态：<input type="text"  name="rostate" value="${message.rostate}">
				<br>
				房间价格:<input type="text"  name="roprice]"  value="${message.roprice}">
				<br>
		房间类型：<input type="text"  name="rotype" value="${message.rotype}">
			 <br> 
		
			<input type="submit" value="修改"/>
</form>

</body>
</html>