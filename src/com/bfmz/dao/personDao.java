package com.bfmz.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.bfmz.entity.Person;
import com.bfmz.utils.BaseDao;
public class personDao {
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
	public List<Person> getPerson(){
		List<Person> list=new ArrayList<Person>();
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
					list.add(ro);
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
	public void save(Person ro) {
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
	
	/**
	 * 根据id 删除学生信息
	 */
	/*public void deleteOne(int ronumber) {
		try {
			con=BaseDao.getCon();
			ps= con.prepareStatement("delete from room where ronumber=? ");
			ps.setInt(1, ronumber);
			
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
	}*/
	
	//根据学生姓名获取学生信息，可以模糊查询，比如可以查询姓相同的信息
	/*public List<Person> findStudentByName(String roname) {
		List<Person> list=new ArrayList<Person>();
		try {
			con=BaseDao.getCon();
			ps= con.prepareStatement("select * from room where roname like ?");
			ps.setString(1,"%"+roname+"%");
			
			rs=ps.executeQuery();
			
			while(rs.next()) {
				Person s=new Person();
				s.setRonumber(rs.getString(1));
				s.setRostate(rs.getString(2));
				s.setRoprice(rs.getString(3));
				s.setRotype(rs.getString(4));
				
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
	}
	*/
	//根据学生ID获取学生信息
	/*public Person getStudentInfoById(int ronumber) {
		Person s=new Person();
		try {
			con=BaseDao.getCon();
			ps= con.prepareStatement("select * from room where ronumber=?");
			ps.setInt(1,ronumber);
			
			rs=ps.executeQuery();
			
			while(rs.next()) {
				s.setRonumber(rs.getString(1));
				s.setRostate(rs.getString(2));
				s.setRoprice(rs.getString(3));
				s.setRotype(rs.getString(4));
				
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
	}*/
	
	//根据id修改学生信息
	/*public void updateStudentInfo(Person ro) {
		try {
			con=BaseDao.getCon();
			ps= con.prepareStatement("update room set rostate=?,roprice=?,rotype=?where ronumber=?");
			ps.setString(1, ro.getRostate());
			ps.setString(2, ro.getRoprice());
			ps.setString(3, ro.getRotype());
			ps.setString(4, ro.getRonumber());
			
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
		
	}*/
	
}
