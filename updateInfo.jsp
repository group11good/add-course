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


<form action="<%=basePath%>updateById" method="post">
	
		姓名：<input type="text" name="clname" value="${message.clname}">
				<br>
				联系电话：<input type="text"  name="clphone" value="${message.clphone}">
				<br>
				身份证号:<input type="text"  name="clid"  value="${message.clid}">
				<br>
		客户编号：<input type="text"  name="clnumber" value="${message.clnumber}">
			 <br> 
		
			<input type="submit" value="修改"/>
</form>

</body>
</html>