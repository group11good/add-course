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
				<td>姓名</td>
				<td>联系电话</td>
				<td>身份证号</td>
				<td>客户编号</td>
			</tr>
		
		<c:forEach items="${message}" var="cl">
			<tr>
				<td>${cl.clname}</td>
				<td>${cl.clphone}</td>
				<td>${cl.clid}</td>
				<td>${cl.clnumber}</td>
				<td><a href="<%=basePath%>updateInfo?clnumber=${cl.clnumber}"> <button>修改</button></a></td> 
			</tr>
		</c:forEach>
	</table>

</body>
</html>