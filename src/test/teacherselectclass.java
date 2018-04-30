package test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import org.junit.Test;

import com.bfmz.entity.Course;
import com.bfmz.utils.BaseDao;

public class teacherselectclass {
	Connection con=null;
	PreparedStatement ps=null;
	ResultSet rs=null;
@Test
public void teacherselect(){
	try {
		con=BaseDao.getCon();
		ps= con.prepareStatement("select * from course ");
		rs= ps.executeQuery();
		//遍历，把拿到的数据库信息存到List<Student> 中
		while(rs.next()) {
			Course c=new Course();
				c.setConame(rs.getString(1));
				c.setCoid(rs.getString(2));
				c.setAcyear(rs.getString(3));
				c.setSemester(rs.getString(4));
				c.setMax(rs.getString(5));
				c.setCredit(rs.getString(6));
				c.setTid(rs.getString(7));
				System.out.println(c);
				
			}
		
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally {
			BaseDao.close(con, ps, rs);
		}
	
}
}
