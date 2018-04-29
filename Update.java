package com.bfmz.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bfmz.dao.StudentDao;
import com.bfmz.entity.Course;


public class Update extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setCharacterEncoding("utf-8");
		request.setCharacterEncoding("utf-8");
		Course c=new Course();
		c.setConame(request.getParameter("coname")); 
		c.setCoid(request.getParameter("coid"));
		c.setAcyear(request.getParameter("acyear"));
		c.setSemester(request.getParameter("semester"));
		c.setMax(request.getParameter("max"));
		c.setCredit(request.getParameter("credit"));
		c.setTid(request.getParameter("tid"));
		
		StudentDao dao=new StudentDao();
		dao.updateStudentInfo(c);
		
		
		List<Course> list= dao.getCourse();
		request.setAttribute("message", list);
		request.getRequestDispatcher("show.jsp").forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
