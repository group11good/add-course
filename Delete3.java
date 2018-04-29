package com.bfmz.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bfmz.dao.user1Dao;
import com.bfmz.entity.User1;

public class Delete3 extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setCharacterEncoding("utf-8");
		request.setCharacterEncoding("utf-8");
		System.out.println(request.getParameter("user1id"));
		int user1id= Integer.parseInt(request.getParameter("user1id")) ;
		user1Dao dao=new user1Dao();
		dao.deleteOne(user1id);
		List<User1> list=dao.getUser1();
		request.setAttribute("message", list);
		request.getRequestDispatcher("show3.jsp").forward(request, response);
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
