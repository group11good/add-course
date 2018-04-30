package test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.junit.Test;

import com.bfmz.entity.Course;
import com.bfmz.utils.BaseDao;

public class teacherdeleteclass {
	Connection con=null;
	PreparedStatement ps=null;
	ResultSet rs=null;
	@Test
	public void teacherdelete(){
		Course c=new Course();
		int coid=555;
		try {
			con=BaseDao.getCon();
			ps= con.prepareStatement("delete from course where coid=? ");
			ps.setInt(1, coid);
			
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
