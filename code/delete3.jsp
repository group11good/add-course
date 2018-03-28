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
<%--条件查询：
<form action="<%=basePath%>findByName" method="post">
	请输入需要查询的姓名：<input type="text" name="word"  >
	<input type="submit" value="查询">
</form>--%>

<table>
			<tr>
				<td>账号</td>
				<td>密码</td>
				<td>姓名</td>
				
			</tr>
		
		 <c:forEach items="${message}" var="us">
			<tr>
				<td>${us.user1id}</td>
				<td>${us.user1pass}</td>
				<td>${us.user1name}</td>
				
				 <td><button onclick="del3(${us.user1id})">删除</button></td> 
			</tr>
		</c:forEach>
	</table>
	
	<script type="text/javascript">
			function del3(user1id){
				var b= confirm("确定要删除"+user1id);
				if(b){
					window.location.href = "<%=basePath%>/del3?user1id="+user1id;//提交信息到Servlet
				}
			}
	</script>

</body>
</html>