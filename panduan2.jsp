<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>数据接收页面</title>
</head>
<body>
<%
request.setCharacterEncoding("utf-8");
String name = request.getParameter("juese");   
if(name.equals("student")){%>  
<jsp:forward page="denl.jsp"/> 
<% }  
else if(name.equals("teacher")){  %> 
<jsp:forward page="den2.jsp"/> 
   
<% }%>  
</body>
</html>