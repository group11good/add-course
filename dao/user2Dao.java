package com.bfmz.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.bfmz.entity.User1;
import com.bfmz.entity.User2;
import com.bfmz.utils.BaseDao;
public class user2Dao {
	Connection con=null;
	PreparedStatement ps=null;
	ResultSet rs=null;
	
	/**
	 * 登录验证
	 * @return
	 */

	/**
	 * 获取所有学生信息
	 * @return
	 */
	public List<User2> getUser1(){
		List<User2> list=new ArrayList<User2>();
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
					list.add(us);
				}
			
			}catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}finally {
				BaseDao.close(con, ps, rs);
			}
		return list;
	}
	
	/**
	 * 保存学生信息
	 * @param stu
	 */
	public void save(User2 us) {
		try {
			con=BaseDao.getCon();
			ps= con.prepareStatement("insert user2(user2id,user2pass,user2name) values(?,?,?) ");
			ps.setString(1, us.getUser2id());
			ps.setString(2, us.getUser2pass());
			ps.setString(3, us.getUser2name());
			
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
	
	/**
	 * 根据id 删除学生信息
	 */
	public void deleteOne(int user2id) {
		try {
			con=BaseDao.getCon();
			ps= con.prepareStatement("delete from user2 where user2id=? ");
			ps.setInt(1, user2id);
			
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
	
	//根据学生姓名获取学生信息，可以模糊查询，比如可以查询姓相同的信息
	public List<User1> findStudentByName(String user1name) {
		List<User1> list=new ArrayList<User1>();
		try {
			con=BaseDao.getCon();
			ps= con.prepareStatement("select * from room where roname like ?");
			ps.setString(1,"%"+user1name+"%");
			
			rs=ps.executeQuery();
			
			while(rs.next()) {
				User1 us=new User1();
				us.setUser1id(rs.getString(1));
				us.setUser1pass(rs.getString(2));
				us.setUser1name(rs.getString(3));
			
				
				System.out.println(us);
				list.add(us);
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			BaseDao.close(con, ps, rs);
		}
		return list;
	}
	
	//根据学生ID获取学生信息
	public User1 getStudentInfoById(int user1id) {
		User1 us=new User1();
		try {
			con=BaseDao.getCon();
			ps= con.prepareStatement("select * from user1 where user1id=?");
			ps.setInt(1,user1id);
			
			rs=ps.executeQuery();
			
			while(rs.next()) {
				us.setUser1id(rs.getString(1));
				us.setUser1pass(rs.getString(2));
				us.setUser1name(rs.getString(3));
				
				
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			BaseDao.close(con, ps, rs);
		}
		return us;
	}
	
	//根据id修改学生信息
	public void updateStudentInfo(User1 us) {
		try {
			con=BaseDao.getCon();
			ps= con.prepareStatement("update user1 set user1pass=?,user1name=?where user1id=?");
			
			ps.setString(1, us.getUser1pass());
			ps.setString(2, us.getUser1name());
			ps.setString(3, us.getUser1id());
			
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
