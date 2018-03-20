package com.bfmz.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.bfmz.entity.Course;
import com.bfmz.utils.BaseDao;

public class StudentDao {
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
	public List<Course> getCourse(){
		List<Course> list=new ArrayList<Course>();
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
					list.add(c);
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
	public void save(Course c) {
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
	
	/**
	 * 根据id 删除学生信息
	 */
	public void deleteOne(int coid) {
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
	
	//根据学生姓名获取学生信息，可以模糊查询，比如可以查询姓相同的信息
	/*public List<Course> findStudentByName(String clname) {
		List<Course> list=new ArrayList<Course>();
		try {
			con=BaseDao.getCon();
			ps= con.prepareStatement("select * from client where clname like ?");
			ps.setString(1,"%"+clname+"%");
			
			rs=ps.executeQuery();
			
			while(rs.next()) {
				Course s=new Course();
				s.setClname(rs.getString(1));
				s.setClphone(rs.getString(2));
				s.setClid(rs.getString(3));
				s.setClnumber(rs.getString(4));
				
				System.out.println(s);
				list.add(s);
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
	}*/
	
	//根据学生ID获取学生信息
	public Course getStudentInfoById(int coid) {
		Course s=new Course();
		try {
			con=BaseDao.getCon();
			ps= con.prepareStatement("select * from course where coid=?");
			ps.setInt(1,coid);
			
			rs=ps.executeQuery();
			
			while(rs.next()) {
				s.setConame(rs.getString(1));
				s.setCoid(rs.getString(2));
				s.setAcyear(rs.getString(3));
				s.setSemester(rs.getString(4));
				s.setMax(rs.getString(5));
				s.setCredit(rs.getString(6));
				s.setTid(rs.getString(7));
				
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
		return s;
	}
	
	//根据id修改学生信息
	public void updateStudentInfo(Course c) {
		try {
			con=BaseDao.getCon();
			ps= con.prepareStatement("update client set coname=?,coid=?,acyear=?,semester=?,max=?,credit=?,tid=? where coid=?");
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
