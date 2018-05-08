package com.bfmz.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bfmz.dao.stayDao;
import com.bfmz.entity.Stay;

public class Delete4 extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setCharacterEncoding("utf-8");
		request.setCharacterEncoding("utf-8");
		System.out.println(request.getParameter("stnumber"));
		int stnumber= Integer.parseInt(request.getParameter("stnumber")) ;
		stayDao dao=new stayDao();
		dao.deleteOne(stnumber);
		List<Stay> list=dao.getStay();
		request.setAttribute("message", list);
		request.getRequestDispatcher("show4.jsp").forward(request, response);
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
