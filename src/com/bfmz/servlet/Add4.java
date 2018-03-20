package com.bfmz.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bfmz.dao.stayDao;
import com.bfmz.entity.Stay;

public class Add4 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setCharacterEncoding("utf-8");
		request.setCharacterEncoding("utf-8");
		Stay st=new Stay();
		st.setClnumber(request.getParameter("clnumber")); 
		st.setRonumber(request.getParameter("ronumber"));
		st.setStintime(request.getParameter("stintime"));
		st.setStouttime(request.getParameter("stouttime"));
		st.setStnumber(request.getParameter("stnumber"));
		st.setUser1id(request.getParameter("user1id"));
		stayDao dao=new stayDao();
		dao.save(st);
		List<Stay> list=dao.getStay();
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
