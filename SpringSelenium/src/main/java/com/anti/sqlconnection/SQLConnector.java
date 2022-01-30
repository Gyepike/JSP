package com.anti.sqlconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Required;
import org.springframework.beans.factory.annotation.Value;

public class SQLConnector {

	/*
	String url = "jdbc:mysql://localhost:3306/Alien?serverTimezone=UTC&useSSL=false";
	String user = "hbstudent";
	String password = "hbstudent"; 
	
   */
	
	@Value("${SQLConnector.url}")
	String url ;
	@Value("${SQLConnector.user}")
	String user ;
	@Value("${SQLConnector.password}")
	String password ; 
	

	@Override
	public String toString() {
		return "SQLConnector [url=" + url + ", user=" + user + ", password=" + password + "]";
	}

	
	public void displayConnection() {
		System.out.println("SQL Connection Data : " + toString());
	}
     
	
	public void testConnection() {
		displayConnection();
		
		try {
			Connection con = DriverManager.getConnection(url, user, password);
			System.out.println("Connection Done");
			
		} catch (SQLException e) {
			
		    System.out.println("SQL Conection failed");
			e.printStackTrace();
		}
		
	}
	
}
