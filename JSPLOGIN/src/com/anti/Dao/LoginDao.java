package com.anti.Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.xml.transform.Result;

public class LoginDao {
	
	
	public boolean checkAccess(String uname, String password) {
		
		
		String url = "jdbc:mysql://localhost:3306/Alien?serverTimezone=UTC&useSSL=false";
		String user = "hbstudent";
		String sqlpassword = "hbstudent"; 
		String sql = "SELECT * FROM Alien.login where uname=? and pass=? ";
		
		
		
		try {
			Class.forName("com.mysql.jdbc.Driver"); 
			Connection con = DriverManager.getConnection(url, user, sqlpassword);
			System.out.println("Coonected ");
			PreparedStatement st = con.prepareStatement(sql);
			st.setString(1, uname);
			st.setString(2, password);
			
			ResultSet rset = st.executeQuery();
			
			while(rset.next())
			{
				
				  System.out.println(rset.getString(1));
			      return true;
			}
			
			st.execute();
		} catch (Exception e) {
			System.out.println("SSSss2");
			e.getMessage();
		}
	
		
		
		return false;
	}

}
