package test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.junit.Test;

import com.bfmz.entity.Course;
import com.bfmz.utils.BaseDao;

public class teacheraddclass {
	Connection con=null;
	PreparedStatement ps=null;
	ResultSet rs=null;
@Test
public void teacheradd(){
	Course c=new Course();
	try {
		con=BaseDao.getCon();
		ps= con.prepareStatement("insert course(coname,coid,acyear,semester,max,credit,tid) values(?,?,?,?,?,?,?) ");
		ps.setString(1, c.getConame());
		ps.setString(2, c.getCoid());
		ps.setString(3, c.getAcyear());
		ps.setString(4, c.getSemester());
		ps.setString(5, c.getMax());
		ps.setString(6, c.getCredit());
		ps.setString(7, c.getTid());
		ps.execute();
		
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}finally {
		BaseDao.close(con, ps, rs);
	}
}
}
