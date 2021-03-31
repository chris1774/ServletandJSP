package com.chris.web.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import com.chris.web.model.Maven;
public class MavenDao {
	
	public Maven getMaven(int aid) {
		
		
		Maven m = new Maven();
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/maven", "root", "Chris1375695!");
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("select * from person where aid=" + aid);
			if(rs.next()) {
				m.setAid(rs.getInt("aid"));
				m.setAname(rs.getString("aname"));
				m.setTech(rs.getString("tech"));
			}
			
			
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
		
		
		return m;
	}
}
