<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ page import="java.sql.*"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<!DOCTYPE html>
<html>
<head>
<title>登录页面</title>
<meta charset="utf-8">
</head>
<body background="http://a2.att.hudong.com/38/59/300001054794129041591416974_950.jpg"
style=" background-repeat:no-repeat ;
background-size:100% 100%; 
background-attachment: fixed;" 
text="#68228B" onload="setInterval('clock()',1000)">

	<center>
<h1>Login </h1>
<hr>
	<form action="yanz1.jsp" method="post">
<table border="1">

<tr>
<td>Login id:</td>
<td><input type="text" name="user1id"></td>
</tr>
<tr>
	<td>Login password:</td>
<td><input type="password" name="user1pass"></td>
</tr>
<tr>
<td colspan="2"><input type="submit" value="login"></td>


</tr>
</table>

</form>
<a href="add3.jsp"><button>Registered</button>

</tr></a>
</table>

	</center>
	
</body>
</html>