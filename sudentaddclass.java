package test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.junit.Test;

import com.bfmz.entity.Person;
import com.bfmz.utils.BaseDao;

public class sudentaddclass {
	Connection con=null;
	PreparedStatement ps=null;
	ResultSet rs=null;
	@Test
	public void studentadd(){
		Person ro=new Person();
		try {
			con=BaseDao.getCon();
			ps= con.prepareStatement("insert person(coursename,coid,tuitionfee) values(?,?,?) ");
			ps.setString(1, ro.getCoursename());
			ps.setString(2, ro.getCoid());
			ps.setString(3, ro.getTuitionfee());
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
