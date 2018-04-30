package tom.jiafei;
import java.sql.*;
public class Stay
{  
    StringBuffer queryResult; //��ѯ���  StringBuffer��Ҫ��Ϊ�˶��ַ�������ӡ����롢�޸ĺ�ɾ���������String �ǲ�����ɺ������洢�ַ��
    public Stay()
    {  queryResult=new StringBuffer();
       try {   Class.forName("com.mysql.jdbc.Driver");//1�����ز�ע������
           }
       catch(ClassNotFoundException e)
           {  queryResult=new StringBuffer();
              queryResult.append(""+e);
           } 
    }
   
    public StringBuffer getQueryResult()
    {  Connection con;
       Statement sql; 
       ResultSet rs;

      try { queryResult.append("<table border=1>"); 
      String url= "jdbc:mysql://localhost/web?useUnicode=true&characterEncoding=UTF-8";
	      con=DriverManager.getConnection(url,"root","961115");//2����������

            DatabaseMetaData metadata=con.getMetaData();
            //http://blog.sina.com.cn/s/blog_8c6a55f101012a8o.html
            //���tableName����n���ֶΣ�rs1�͸պ���n�У�ÿ���к����ֶ������Ϣ
            ResultSet rs1=metadata.getColumns(null,null,"stay",null);
            int p=0;
            
            queryResult.append("<tr>");
            while(rs1.next())
             { p++;  
               String clumnName=rs1.getString(4);
               queryResult.append("<td>"+clumnName+"</td>");
             }
            queryResult.append("</tr>"); 
            sql=con.createStatement();      
            sql.executeUpdate("set names utf8"); 
            rs=sql.executeQuery("SELECT * FROM "+"stay");
            while(rs.next())
            {  queryResult.append("<tr>");
               for(int k=1;k<=p;k++) 
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