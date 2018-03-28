<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
  <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
  <% request.setCharacterEncoding("utf-8");%>
  <%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<jsp:useBean id="look" class="tom.jiafei.Person" scope="page" />
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body background="http://img15.3lian.com/2015/f1/6/d/10.jpg"
style=" background-repeat:no-repeat ;
background-size:100% 100%; 
background-attachment: fixed;" 
text="#68228B" onload="setInterval('clock()',1000)">
		
	
	
	 <jsp:getProperty  name= "look"  property="queryResult"  />
	 <a href="show.jsp"><button>Return</button></a>
</body>
</html>