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
<h1>Login</h1>
<hr>
	<form action="yanz.jsp" method="post">
<table border="1">

<tr>
<td>Login ID:</td>
<td><input type="text" name="user2id"></td>
</tr>
<tr>
	<td>Login password:</td>
<td><input type="password" name="user2pass"></td>
</tr>
<tr>
<td colspan="2"><input type="submit" value="login"> <input
type="reset" value="reset"></td>
</tr>
</table>
</form>
	</center>
</body>
</html>