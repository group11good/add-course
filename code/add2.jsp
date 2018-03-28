<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="java.sql.*" %>
    <%request.setCharacterEncoding("utf-8");%>
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
<body background="http://img15.3lian.com/2015/f1/6/d/10.jpg"
style=" background-repeat:no-repeat ;
background-size:100% 100%; 
background-attachment: fixed;" 
text="#68228B" onload="setInterval('clock()',1000)">
Add course information 
  <form action="<%=basePath%>add" method="post">
				course name：<input type="text" name="coname">
				<br>
				course id：<input type="text" name="coid">
				<br>
				academic year:<input type="text" name="acyear">
				<br>
				semester years:<input type="text" name="semester">
				<br>
				max people:<input type="text" name="max">
				<br>
				credit:<input type="text" name="credit">
				<br>
				teacher id:<input type="text" name="tid">
				<br>
				<input type="submit" value="提交">
			
		</form>
		
</body>
</html>