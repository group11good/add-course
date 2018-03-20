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
<body>
		
		<a href="add2.jsp"><button>添加</button></a>
		<a href="<%=basePath%>toDeleteJsp2"><button>删除</button></a> 
		<a href="<%=basePath%>toUpdateJsp2"><button>修改</button></a>
	
		
		<table>
			<tr>
				<td>房间号</td>
				<td>房间状态</td>
				<td>房间价格</td>
				<td>房间类型</td>
			</tr>
		

	</table>
	
	 <jsp:getProperty  name= "look"  property="queryResult"  />
	
</body>
</html>