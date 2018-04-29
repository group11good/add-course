package com.bfmz.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bfmz.dao.user1Dao;
import com.bfmz.entity.User1;

public class Add3 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setCharacterEncoding("utf-8");
		request.setCharacterEncoding("utf-8");
		User1 us=new User1();
		us.setUser1id(request.getParameter("user1id")); 
		us.setUser1pass(request.getParameter("user1pass"));
		us.setUser1name(request.getParameter("user1name"));
		
	
		user1Dao dao=new user1Dao();
		dao.save(us);
		List<User1> list=dao.getUser1();
		request.setAttribute("message", list);
		request.getRequestDispatcher("show4.jsp").forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
