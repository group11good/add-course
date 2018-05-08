package com.Bean;
import java.sql.*;
public class AAA
{   String databaseName="";        //数据库名称
    String tableName="";           //表的名字
    String user=""       ;         //用户
    String secret="" ;            //密码 
    StringBuffer queryResult;     //查询结果
    public AAA()
    {  queryResult=new StringBuffer();
       try{  Class.forName("com.mysql.jdbc.Driver");
          }
       catch(Exception e){} 
    }
    public void setDatabaseName(String s)
    {  databaseName=s.trim();
    }
    public String getDatabaseName()
    {  return databaseName;
    }
    public void setTableName(String s)
    {  tableName=s.trim();
    }
    public String getTableName()
    {  return tableName;
    }
    public void setSecret(String s)
    {  secret=s.trim();
    }
    public void setUser(String s)
    {  user=s.trim();
    }
  public StringBuffer getQueryResult()
    {  Connection con;
       Statement sql; 
       ResultSet rs;
      try { queryResult.append("<table border=1>"); 
            String uri= "jdbc:mysql://localhost/"+databaseName;
            String id=user;
            String password=secret;
            con=DriverManager.getConnection(uri,id,password);
            DatabaseMetaData metadata=con.getMetaData();
            ResultSet rs1=metadata.getColumns(null,null,tableName,null);
            int 字段个数=0;
            queryResult.append("<tr>");
            while(rs1.next())
             { 字段个数++;
               String clumnName=rs1.getString(4);
               queryResult.append("<td>"+clumnName+"</td>");
             }
            queryResult.append("</tr>");
            sql=con.createStatement();
            rs=sql.executeQuery("SELECT * FROM "+tableName);
            while(rs.next())
            {  queryResult.append("<tr>");
               for(int k=1;k<=字段个数;k++) 
                {  queryResult.append("<td>"+rs.getString(k)+"</td>");
                }
               queryResult.append("</tr>");
            }
            queryResult.append("</table>");
            con.close();
           }
       catch(SQLException e) 
           {  queryResult.append(e);
           }
       return queryResult;
   }    
}
