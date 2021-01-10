package com.anti.beanlifecycle.allannotation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class StudentDAO {

	// jdbc:mysql://localhost:3306/Alien?serverTimezone=UTC&useSSL=false

	String url;
	String user;
	String password;
	String driver;

	Connection con = null;
	Statement statment = null;
	PreparedStatement state = null;

	
	@PostConstruct
	private void ini() {
	   System.out.println("init executed ");
	   connectionCreate();
	   System.out.println("init done");
	}
	
	
	
	public void connectionCreate() {
		System.out.println("Post Constructor Done!");
		System.out.println("javax.annotation.PostConstruct needed import J2EE maven");
		System.out.println("context:annotation-config needed !! we used annotation in code !!");
		try {
			con = DriverManager.getConnection(url, user, password);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		System.out.println("Connection created and Done");
	}

	public void createStatment(String SQL) {

		try {
			statment = con.createStatement();
			statment.execute(SQL);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	

	public void createStatmentPrepare(String SQL, int student_id) {
		try {
			state = con.prepareStatement(SQL);
			state.setInt(1, student_id);
			state.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@PreDestroy
	public void closeConnection() {
		System.out.println("DDD");
		try {
			statment.close();
			state.close();
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
			System.out.println("Connection close");
		}
	
	}

	@PreDestroy
	public void closeConnectionParam() {
		System.out.println("DDD");
		try {
			statment.close();
			state.close();
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
        finally {
        	System.out.println("Param Connection close");
        }
		
	}

	protected void selectAll() {
		String SQL = "SELECT * FROM Alien.HostelStudentInfo";
		try {
			createStatment(SQL);
			ResultSet result = statment.getResultSet();
			while (result.next()) {
				System.out.println(result.getInt(1) + " " + result.getString(2) + " " + result.getDouble(3) + " "
						+ result.getString(4));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	protected void deleteStudentRecord(int student_id) {
		String SQL = "DELETE FROM Alien.HostelStudentInfo where Student_ID = " + student_id;
		createStatment(SQL);
	}

	protected void deleteStudentRecordParam(int student_id) {
		String SQL = "DELETE FROM Alien.HostelStudentInfo where Student_ID = ?";
		createStatmentPrepare(SQL, student_id);
	}

	public void setPassword(String password) {
		System.out.println("Password set injected ");
		this.password = password;
	}

	public void setDriver(String driver) {
		System.out.println("Driver set injected ");
		this.driver = driver;
	}

	public void setUser(String user) {
		System.out.println("user set injected ");
		this.user = user;
	}

	
	public StudentDAO(String url) {
		System.out.println("UL  StudentDAO constructor  injected");
		this.url = url;
	}

}
