package com.Bean;
import java.sql.*;
public class AddBean1
{    String id="",      //学号
        studentName="";        //姓名
 int  studentNo,jieshuId;
    String addMessage="";
    public AddBean1()
    {  try {  Class.forName("com.mysql.jdbc.Driver");//1、加载并注册驱动器
           }
       catch(ClassNotFoundException e){}
    }
    public void setId(String s)
    {  id=s.trim();
     }
   public void setStudentName(String s)
    {  studentName=s.trim();
     }
   public void setStudentNo(int n)
    {  studentNo=n;
    }
   public void setJieshuId(int n)
    {  jieshuId=n;
    }
  
   public String getAddMessage()
{  String insertCondition="INSERT student VALUES( '"+id+"', '"+studentName+"','"
+studentNo+"','"+jieshuId+"')";
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
             {  str="必须要有id";
             }
            con.close();
           }
       catch(SQLException e)
           {  str="输入的序号不允许重复"+e;
           }
       return str;
    }
}
