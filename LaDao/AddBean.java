package com.Bean;
import java.sql.*;
public class AddBean
{   String id="",      //学号
           bookNo="",
           bookName="";        
    int  number,day;
    String addMessage="";
    public AddBean()
    {  try {  Class.forName("com.mysql.jdbc.Driver");//1、加载并注册驱动器
           }
       catch(ClassNotFoundException e){}
    }
    public void setId(String s)
    {  id=s.trim();
     }
   public void setBookNo(String s)
    {  bookNo=s.trim();
     }
   public void setBookName(String s)
    {  bookName=s.trim();
    }
   public void setNumber(int n)
    {  number=n;
    }
   public void setDay(int n)
    {  day=n;
    }
   public String getAddMessage()
{  String insertCondition="INSERT jieshu VALUES( '"+id+"', '"+bookNo+"',"
+bookName+","+number+","+day+")";
       String str="";
       Connection con;
       Statement sql;
       try { String url= "jdbc:mysql://127.0.0.1/liberty";
             con=DriverManager.getConnection(url,"root","3233246qqzy");
             sql=con.createStatement();
             if(id.length()>0)
             { int m=sql.executeUpdate(insertCondition);
                if(m!=0)
                {    str="对表中添加"+m+"条记录成功";
                }
                else
                 { str="添加记录失败";
                 }
             }
            else
             {  str="必须要有学号";
             }
            con.close();
           }
       catch(SQLException e)
           {  str="输入的序号不允许重复"+e;
           }
       return str;
    }
}
