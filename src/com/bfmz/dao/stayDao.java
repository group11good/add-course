package com.bfmz.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.bfmz.entity.Stay;
import com.bfmz.utils.BaseDao;
public class stayDao {
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
	public List<Stay> getStay(){
		List<Stay> list=new ArrayList<Stay>();
		try {
			con=BaseDao.getCon();
			ps= con.prepareStatement("select * from stay ");
			rs= ps.executeQuery();
			//遍历，把拿到的数据库信息存到List<Student> 中
			while(rs.next()) {
				Stay st=new Stay();
					st.setClnumber(rs.getString(1));
					st.setRonumber(rs.getString(2));
					st.setStintime(rs.getString(3));
					st.setStouttime(rs.getString(4));
					st.setStnumber(rs.getString(5));
					st.setUser1id(rs.getString(6));
					System.out.println(st);
					list.add(st);
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
	public void save(Stay st) {
		try {
			con=BaseDao.getCon();
			ps= con.prepareStatement("insert stay(clnumber,ronumber,stintime,stouttime,stnumber,user1id) values(?,?,?,?,?,?) ");
			ps.setString(1, st.getClnumber());
			ps.setString(2, st.getRonumber());
			ps.setString(3, st.getStintime());
			ps.setString(4, st.getStouttime());
			ps.setString(5, st.getStnumber());
			ps.setString(6, st.getUser1id());
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
	public void deleteOne(int stnumber) {
		try {
			con=BaseDao.getCon();
			ps= con.prepareStatement("delete from stay where stnumber=? ");
			ps.setInt(1, stnumber);
			
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

	
	//根据学生ID获取学生信息
	public Stay getStudentInfoById(int stnumber) {
		Stay st=new Stay();
		try {
			con=BaseDao.getCon();
			ps= con.prepareStatement("select * from stay where stnumber=?");
			ps.setInt(1,stnumber);
			
			rs=ps.executeQuery();
			
			while(rs.next()) {
				st.setClnumber(rs.getString(1));
				st.setRonumber(rs.getString(2));
				st.setStintime(rs.getString(3));
				st.setStouttime(rs.getString(4));
				st.setStnumber(rs.getString(5));
				st.setUser1id(rs.getString(6));
				
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
		return st;
	}
	
	//根据id修改学生信息
	public void updateStudentInfo(Stay st) {
		try {
			con=BaseDao.getCon();
			ps= con.prepareStatement("update stay set clnumber=?,ronumber=?,stintime=?,stouttime=?,user1id=?where stnumber=?");
			ps.setString(1, st.getClnumber());
			ps.setString(2, st.getRonumber());
			ps.setString(3, st.getStintime());
			ps.setString(4, st.getStouttime());
			ps.setString(5, st.getUser1id());
			ps.setString(6, st.getStnumber());
			
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
