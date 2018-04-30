package test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import org.junit.Test;

import com.bfmz.entity.Person;
import com.bfmz.utils.BaseDao;

public class studentselectclass {
	Connection con=null;
	PreparedStatement ps=null;
	ResultSet rs=null;
@Test
public void studentselect(){
	try {
		con=BaseDao.getCon();
		ps= con.prepareStatement("select * from person ");
		rs= ps.executeQuery();
		//遍历，把拿到的数据库信息存到List<Student> 中
		while(rs.next()) {
			Person ro=new Person();
				ro.setCoursename(rs.getString(1));
				ro.setCoid(rs.getString(2));
				ro.setTuitionfee(rs.getString(3));
				System.out.println(ro);
				
			}
		
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally {
			BaseDao.close(con, ps, rs);
		}
	
}
}
