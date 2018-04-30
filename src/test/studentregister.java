package test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.junit.Test;

import com.bfmz.entity.User1;
import com.bfmz.utils.BaseDao;

public class studentregister {
	Connection con=null;
	PreparedStatement ps=null;
	ResultSet rs=null;
@Test
public void register(){
	User1 us=new User1();
	try {
		con=BaseDao.getCon();
		ps= con.prepareStatement("insert user1(user1id,user1pass,user1name) values(?,?,?) ");
		ps.setString(1, us.getUser1id());
		ps.setString(2, us.getUser1pass());
		ps.setString(3, us.getUser1name());
		
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
