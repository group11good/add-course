package com.bfmz.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bfmz.dao.StudentDao;
import com.bfmz.entity.Course;

public class Delete extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setCharacterEncoding("utf-8");
		request.setCharacterEncoding("utf-8");
		System.out.println(request.getParameter("coid"));
		int coid= Integer.parseInt(request.getParameter("coid")) ;
		StudentDao dao=new StudentDao();
		dao.deleteOne(coid);
		List<Course> list=dao.getCourse();
		request.setAttribute("message", list);
		request.getRequestDispatcher("show.jsp").forward(request, response);
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
