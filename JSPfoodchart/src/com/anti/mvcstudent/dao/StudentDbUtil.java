package com.anti.mvcstudent.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


import javax.sql.DataSource;

import com.anti.mvcstudent.dto.Student;

public class StudentDbUtil {

	private DataSource dataSource;
	private Connection con = null;
	private Statement state = null;
	private ResultSet result = null;

	
	
	private List<Student> getList() {
		// create SQL stament
		String sql = "SELECT * FROM Food.student order by firstName";
		List<Student> students = new ArrayList<>();
		try {
			// create connection
			con = dataSource.getConnection();
			// create stament
			state = con.createStatement();

			// execute
			result = state.executeQuery(sql);
			// process
			while (result.next()) {
				int id = result.getInt(1);
				String firstName = result.getString(2);
				String lastName = result.getString(3);
				String email = result.getString(4);
				Student tempStudent = new Student(id, firstName, lastName, email);
				students.add(tempStudent);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(con, state, result);
		}
		return students;
	}

	private void close(Connection con, Statement state, ResultSet result) {
		try {

			if (result != null) {
				result.close();
			}

			if (state != null) {
				state.close();
			}

			if (con != null) {
				con.close();
			}
		} catch (SQLException e) {

			e.printStackTrace();
		}

	}

	public StudentDbUtil(DataSource theDataSource) {
		this.dataSource = theDataSource;
	}

	public List<Student> getStudents() {
		return getList();
	}

}
