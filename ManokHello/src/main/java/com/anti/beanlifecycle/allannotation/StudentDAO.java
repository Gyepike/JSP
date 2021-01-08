package com.anti.beanlifecycle.allannotation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class StudentDAO {

	// jdbc:mysql://localhost:3306/Alien?serverTimezone=UTC&useSSL=false

	String url;
	String user;
	String password;
	String driver;

	Connection con = null;
	Statement statment = null;
	PreparedStatement state = null;

	public void connectionCreate() {

		try {
			con = DriverManager.getConnection(url, user, password);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		System.out.println("Connection created and done");
	}

	public void createStatment(String SQL) {

		try {
			statment = con.createStatement();
			statment.execute(SQL);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void createStatmentPrepare(String SQL) {
		try {
			state = con.prepareStatement(SQL);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void closeConnection() {
		
		try {
			statment.close();
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		System.out.println("Connection close");
	}

	public void closeConnectionParam() {
		try {
			state.close();
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		System.out.println("Connection close");
	}

	protected void selectAll() {
		String SQL = "SELECT * FROM Alien.HostelStudentInfo";
		try {
			connectionCreate();
			createStatment(SQL);
			ResultSet result = statment.getResultSet();
			while (result.next()) {
				System.out.println(result.getInt(1) + " " + result.getString(2) + " " + result.getDouble(3) + " "
						+ result.getString(4));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			closeConnection();
		}
	}

	protected void deleteStudentRecord(int student_id) {
		String SQL = "DELETE FROM Alien.HostelStudentInfo where Student_ID = " + student_id;
		try {
			connectionCreate();
			createStatment(SQL);
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
			closeConnection();
		}
   	}

	protected void deleteStudentRecordParam(int student_id) {
		String SQL = "DELETE FROM Alien.HostelStudentInfo where Student_ID = ?";
		try {
			connectionCreate();
			createStatmentPrepare(SQL);
			state.setInt(1, student_id);
			state.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
			closeConnectionParam();
		}
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setDriver(String driver) {
		this.driver = driver;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public StudentDAO(String url) {
		this.url = url;
	}

}
