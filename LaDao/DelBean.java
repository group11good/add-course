package com.Bean;
import java.sql.*;
public class DelBean
{   String id="",      //学号
           bookName="";        //姓名
    int  bookNo,number,day;
    String delMessage="";
    public DelBean()
    {  try {  Class.forName("com.mysql.jdbc.Driver");//1、加载并注册驱动器
           }
       catch(ClassNotFoundException e){}
    }
    public void setNumber(String s)
    {  id=s.trim();       
    }
   public String getDelMessage()
    {  String delCondition="DELETE FROM jieshu WHERE id = "+"'"+id+"'";
       String str="";
       Connection con;
       Statement sql;
       try { String url= "jdbc:mysql://127.0.0.1/liberty";
             con=DriverManager.getConnection(url,"root","3233246qqzy");
             sql=con.createStatement();
             if(id.length()>0)
             { int m=sql.executeUpdate(delCondition);
                if(m!=0)
                {    str="对表中删除"+m+"条记录成功";
                }
                else
                 { str="删除记录失败";
                 }
             }
            else
             {  str="必须指定要删除记录的学号";
             }
            con.close();
           }
       catch(SQLException e)
           {  str="学号不存在";
           }
       return str;
    }
}
