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


<form action="<%=basePath%>updateById4" method="post">
	
		客户编号：<input type="text" name="clnumber" value="${message.clnumber}">
				<br>
				客房编号：<input type="text" name="ronumber" value="${message.ronumber}">
				<br>
				入住时间:<input type="text" name="stintime" value="${message.stintime}">
				<br>
				离店时间:<input type="text" name="stouttime" value="${message.stouttime}">
				<br>
				住宿编号:<input type="text" name="stnumber" value="${message.stnumber}">
				<br>
				前台编号:<input type="text" name="user1id" value="${message.user1id}">
				<br>
		
			
		
			<input type="submit" value="修改"/>
</form>

</body>
</html>