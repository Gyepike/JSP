package com.anti;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
		
		//List<Student> students = new  ArrayList<Student> ();
		
		List<Student> students =  Arrays.asList(new Student(1, "Munyi manó"), new Student(2, "Munyo manó"),new Student(3, "Tibi manó"),new Student(4, "Mama manó"));
		
		/* classic way
		 * 
		List<Student> students = new  ArrayList<Student> ();
		Student stud = new Student(1, "Munyi manó");
		Student stud1 = new Student(2, "Munyo manó");
		Student stud2 = new Student(3, "Tibi manó");
		Student stud3 = new Student(4, "Mama manó");
		
		students.add(stud);
		students.add(stud1);
		students.add(stud2);
		students.add(stud3);
		*/
		
		RequestDispatcher rd = request.getRequestDispatcher("test.jsp");
		
		request.setAttribute("students", students);
		request.setAttribute("name", name );
		
		rd.forward(request, response);
		
		
	}

}
