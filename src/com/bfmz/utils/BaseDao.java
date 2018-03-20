package com.bfmz.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class BaseDao {
	
    private static String driver="com.mysql.jdbc.Driver";
    private static String url="jdbc:mysql://localhost:3306/web?characterEncoding=utf8";
    private static String user="root";
    private static String password="961115";
    
    /***
     * 杩炴帴鏁版嵁搴撶殑鏂规硶
     * @return
     * @throws ClassNotFoundException
     * @throws SQLException
     */
    public static Connection getCon() throws ClassNotFoundException, SQLException{
        Class.forName(driver);//鍔犺浇鏁版嵁搴撻┍鍔�
        System.out.println("娴嬭瘯鍔犺浇鏁版嵁搴撴垚鍔�");
        Connection con=DriverManager.getConnection(url, user, password);
        System.out.println("娴嬭瘯鏁版嵁搴撻摼鎺ユ垚鍔�");
        return con;
    }
    
    /***
     * 鍏抽棴鏁版嵁搴撶殑鏂规硶
     * @param con
     * @param ps
     * @param rs
     */
    public static void close(Connection con,PreparedStatement ps,ResultSet rs){
        if(rs!=null){//鍏抽棴璧勬簮锛岄伩鍏嶅嚭鐜板紓甯�
            try {
                rs.close();
            } catch (SQLException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        if(ps!=null){
            try {
                ps.close();
            } catch (SQLException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        if(con!=null){
            try {
                con.close();
            } catch (SQLException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
}
