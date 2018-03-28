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
<body background="http://img.hb.aicdn.com/094a2d7fb8988d62abf9bec28ff4fe6880048bdde23-kAbw8l_fw658"
style=" background-repeat:no-repeat ;
background-size:100% 100%; 
background-attachment: fixed;" 
text="#68228B" onload="setInterval('clock()',1000)">
Registered   
  <form action="<%=basePath%>add3" method="post">
				user   id:<input type="text" name="user1id">
				<br>
				password :<input type="text" name="user1pass">
				<br>
				user name:<input type="text" name="user1name">
				<br>
				<input type="submit" value="submit">
			
		</form>
		
</body>
</html>