package com.chris.web;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.chris.web.model.Maven;

/**
 * Servlet implementation class InsertMavenController
 */
public class InsertMavenController extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//retrieve 3 parameters
		int aid = Integer.parseInt(request.getParameter("aid"));
		String aname = request.getParameter("aname");
		String tech = request.getParameter("tech");
		
		try {
			
			
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/maven", "root", "Chris1375695!");
			Statement st = con.createStatement();
			String query1 = "INSERT INTO person " + "VALUES ("+ aid + ", '" + aname + "', '" + tech + "')";
			st.executeUpdate(query1);
			
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
		RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
		rd.forward(request, response);
		
		
		
		
		
	}

}
