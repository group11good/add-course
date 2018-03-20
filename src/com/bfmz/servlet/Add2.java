package com.bfmz.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bfmz.dao.personDao;
import com.bfmz.entity.Person;

public class Add2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setCharacterEncoding("utf-8");
		request.setCharacterEncoding("utf-8");
		Person ro=new Person();
		ro.setCoursename(request.getParameter("coursename")); 
		ro.setCoid(request.getParameter("coid"));
		ro.setTuitionfee(request.getParameter("tuitionfee"));
		
		
		personDao dao=new personDao();
		dao.save(ro);
		List<Person> list=dao.getPerson();
		request.setAttribute("message", list);
		request.getRequestDispatcher("show2.jsp").forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
