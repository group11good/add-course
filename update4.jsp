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


<table>
			<tr>
				<td>客户编号</td>
				<td>客房编号</td>
				<td>入住时间</td>
				<td>离店时间</td>
				<td>住宿编号</td>
				<td>前台编号</td>
			</tr>
		
		<c:forEach items="${message}" var="st">
			<tr>
				<td>${st.clnumber}</td>
				<td>${st.ronumber}</td>
				<td>${st.stintime}</td>
				<td>${st.stouttime}</td>
				<td>${st.stnumber}</td>
				<td>${st.user1id}</td>
				<td><a href="<%=basePath%>updateInfo4?stnumber=${st.stnumber}"> <button>修改</button></a></td> 
			</tr>
		</c:forEach>
	</table>

</body>
</html>