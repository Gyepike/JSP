package com.anti;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/helloworld")
public class HelloWorld extends HttpServlet {
	private static final long serialVersionUID = 1L;

	// ctrl+alt+b need to remove key from eclise { not work
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		int i = Integer.parseInt(request.getParameter("num1"));
		int j = Integer.parseInt(request.getParameter("num2"));

		PrintWriter out = response.getWriter();
        
		out.println("Calculation : " + (i + j));
		out.println("GET Method");
		int sum = i + j;
		
		//Forwrad dispatcher diszpecser
		RequestDispatcher rd = request.getRequestDispatcher("SqrtServlet");
		
		// forward with request
		request.setAttribute("summa", sum);
		
		rd.forward(request, response);
		
		
		response.getWriter().append("Served at: ").append(request.getContextPath());

	}


}
