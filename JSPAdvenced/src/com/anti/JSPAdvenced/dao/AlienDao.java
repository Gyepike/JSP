package com.anti.JSPAdvenced.dao;

import java.sql.*;

import javax.xml.transform.Result;

import com.anti.JSPAdvenced.web.Alien;

public class AlienDao {
	
    public Alien getAlien(int aid)
    {
    	Alien a = new Alien();
    	
    	a.setAid(101);
    	a.setAname("navin");
    	a.setTech("JAVA");
    	

		//String jdbcUrl = "jdbc:mysql://localhost:3306/hb-01-one-to-one-uni?serverTimezone=UTC&useSSL=false";
		
    	
		String url = "jdbc:mysql://localhost:3306/Alien?serverTimezone=UTC&useSSL=false";
		String user = "hbstudent";
		String password = "hbstudent"; 
		String sql = "SELECT * FROM Alien.aliens where idaliens = ?";
    	
    	try {
    		
    		Class.forName("com.mysql.jdbc.Driver"); 
    		Connection con = DriverManager.getConnection(url, user, password);
    		System.out.println("Test Connection Working");
    		
    		PreparedStatement stat = con.prepareStatement(sql);
    		stat.setInt(1, aid);
    		
    		ResultSet set = stat.executeQuery();
    		
    		while(set.next())
    		{
    			System.out.println(set.getString(2));
    			a.setAid(set.getInt(1));
    	    	a.setAname(set.getString(2));
    	    	a.setTech(set.getString(3));
    		}
    		
		} catch (Exception e) {
			System.out.println(e);
		}
    	
    	
    	return a;
    	
    }
    
    
}
