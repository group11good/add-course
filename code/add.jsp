<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="java.sql.*" %>
    <%request.setCharacterEncoding("utf-8");%>
    <%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";

%>
<jsp:useBean id="look" class="tom.jiafei.QueryBeanOne" scope="page" />
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body background="http://pic1.win4000.com/wallpaper/f/51bb074bc4e48.jpg"
style=" background-repeat:no-repeat ;
background-size:100% 100%; 
background-attachment: fixed;" 
text="#68228B" onload="setInterval('clock()',1000)">
 <jsp:getProperty  name= "look"  property="queryResult"  />
Add class  
  <form action="<%=basePath%>add2" method="post">
				course name：<input type="text" name="coursename">
				<br>
				course id：<input type="text" name="coid">
				<br>
				tuition fee:<input type="text" name="tuitionfee">
				<br>
				<input type="submit" value="submit">
			
		</form>
		
</body>
</html>