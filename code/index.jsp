<%@ page contentType="text/html;charset=utf-8" %>
<% request.setCharacterEncoding("utf-8");%>
  <%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<HTML>
<BODY >
登录：账号/密码都为1111
 <form action="<%=basePath%>Login">
 	学号： <input type="text" name="studentNum">
 	     <br/>
 	密码：<input type="password" name="password">
 	     <br/>
 	     <input type="submit">
 </form>

</BODY></HTML>
