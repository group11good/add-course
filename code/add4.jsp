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
<body>
添加住宿信息  
  <form action="<%=basePath%>add4" method="post">
				客户编号：<input type="text" name="clnumber">
				<br>
				客房编号：<input type="text" name="ronumber">
				<br>
				入住时间:<input type="text" name="stintime">
				<br>
				离店时间:<input type="text" name="stouttime">
				<br>
				住宿编号:<input type="text" name="stnumber">
				<br>
				前台编号:<input type="text" name="user1id">
				<br>
				<input type="submit" value="提交">
			
		</form>
		
</body>
</html>