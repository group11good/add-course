<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ page import="java.sql.*"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<html>
<head>
<title></title>
</head>
<body>
	<%!private static String driver = "com.mysql.jdbc.Driver";
	private static String url = "jdbc:mysql://localhost:3306/web";
	private static String username = "root";
	private static String password = "961115";%>
	<%
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		boolean flag = false;
		String name = null;
	%>
	<%
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url, username, password);
			String sql = "SELECT name FROM user2 WHERE user2id=? AND user2pass=?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, request.getParameter("user2id"));
			pstmt.setString(2, request.getParameter("user2pass"));
			rs = pstmt.executeQuery();
			if (rs.next()) {
				name = rs.getString(1);
				flag = true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				rs.close();
				pstmt.close();
				conn.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	%>
	<%
		if (flag) {
	%>
	<jsp:forward page="show3.jsp"/>
		
	<%
		} else {
	%>
	<jsp:forward page="denl.jsp" />
	<%
		}
	%>
</body>
</html>