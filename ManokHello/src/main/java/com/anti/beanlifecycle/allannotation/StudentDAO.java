package com.anti.beanlifecycle.allannotation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



public class StudentDAO {
	
	//jdbc:mysql://localhost:3306/Alien?serverTimezone=UTC&useSSL=false
	
	String url;
	String user;
	String password;
	String driver;
	
	
	
	protected void selectAll() {
		String SQL = "SELECT * FROM Alien.HostelStudentInfo";
		// load driver
		Connection con = null;
		Statement statment = null;
		try {
			// Class.forName(driver);
			con = DriverManager.getConnection(url, user, password);
			System.out.println("Connection done");

			statment = con.createStatement();
			statment.execute(SQL);

			ResultSet result = statment.getResultSet();

			while (result.next()) {
				System.out.println(result.getInt(1) + " " + result.getString(2) + " " + result.getDouble(3) + " "
						+ result.getString(4));
			}
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		finally {
			try {
				statment.close();
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

	protected void deleteStudentRecord(int student_id) {
		String SQL = "DELETE FROM Alien.HostelStudentInfo where Student_ID = " + student_id;

		Connection con = null;
		Statement state = null;

		try {
			con = DriverManager.getConnection(url, user, password);

			System.out.println("Connection done");
			state = con.createStatement();

			state.executeUpdate(SQL);

			con.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}

		finally {
			try {
				state.close();
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	protected void deleteStudentRecordParam(int student_id) {
		String SQL = "DELETE FROM Alien.HostelStudentInfo where Student_ID = ?";

		Connection con = null;
		PreparedStatement state = null;

		try {
			con = DriverManager.getConnection(url, user, password);

			System.out.println("Connection done");
			state = con.prepareStatement(SQL);

			state.setInt(1, student_id);
			state.execute();
			state.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		finally {
			try {
				state.close();
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
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
