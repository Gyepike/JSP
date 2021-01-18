package com.anti.service;

import java.io.IOException;
import java.io.PrintWriter;
import java.rmi.ServerException;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.DispatcherType;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.sql.DataSource;
import javax.websocket.Session;

import org.eclipse.jdt.internal.compiler.ast.ThrowStatement;

import com.anti.mvcstudent.dao.StudentDbUtil;
import com.anti.mvcstudent.dto.Student;

/**
 * Servlet implementation class StudentController
 */
@WebServlet("/StudentController")
public class StudentController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private StudentDbUtil studentDBUtil;

	@Resource(name = "jdbc/Food")
	private DataSource datasource;

	public void init(ServletConfig config) throws ServletException {
		studentDBUtil = new StudentDbUtil(datasource);
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		try {
			listStudents(request, response);
		  } catch (Exception e) {
           throw new ServerException(getServletInfo());
		}

	}

	private void listStudents(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {

		List<Student> students = studentDBUtil.getStudents();
		PrintWriter out = response.getWriter();

		for (Student student : students) {
			System.out.println(student.toString());
		}

		HttpSession session = request.getSession();
		session.setAttribute("students", students);

		RequestDispatcher dispatcher = request.getRequestDispatcher("StudentViewCSSJSTL.jsp");

		dispatcher.forward(request, response);
	}

}
