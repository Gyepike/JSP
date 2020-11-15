package com.anti;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DemoServlet
 */
@WebServlet("/DemoServlet")
public class DemoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// JSTL -> JSP Standard Tag LIB
		response.getWriter().append("Served at: ").append(request.getContextPath());
		String name = "Peti";
		
		Student stud = new Student(1, "Munyi manó");
		
		RequestDispatcher rd = request.getRequestDispatcher("Test.jsp");
		
		request.setAttribute("student", stud);
		request.setAttribute("name", name );
		
		rd.forward(request, response);
		
		
	}

}
