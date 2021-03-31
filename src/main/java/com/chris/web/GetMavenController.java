package com.chris.web;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.chris.web.dao.MavenDao;
import com.chris.web.model.Maven;

public class GetMavenController extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		int aid = Integer.parseInt(request.getParameter("aid"));
		
		MavenDao dao = new MavenDao();
		Maven m1 = dao.getMaven(aid);
		
		//to connect a servlet to a jsp file we can use a dispatcher
		
		request.setAttribute("maven", m1);
		RequestDispatcher rd = request.getRequestDispatcher("showMaven.jsp");
		rd.forward(request, response);
	}
}
