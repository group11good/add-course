package test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import org.junit.Test;

import com.bfmz.entity.User1;
import com.bfmz.entity.User2;
import com.bfmz.utils.BaseDao;

public class testteacherlogin {
	Connection con=null;
	PreparedStatement ps=null;
	ResultSet rs=null;
	@Test
	public void testLogin(){
		try {
			con=BaseDao.getCon();
			ps= con.prepareStatement("select * from user2 ");
			rs= ps.executeQuery();
			//遍历，把拿到的数据库信息存到List<Student> 中
			while(rs.next()) {
				User2 us=new User2();
					us.setUser2id(rs.getString(1));
					us.setUser2pass(rs.getString(2));
					us.setUser2name(rs.getString(3));
					System.out.println(us);
					
				}
			
			}catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}finally {
				BaseDao.close(con, ps, rs);
			}
		
		
	}
}
