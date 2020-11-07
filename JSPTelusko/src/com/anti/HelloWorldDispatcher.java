package com.anti;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/helloworld")
public class HelloWorldDispatcher extends HttpServlet {
	private static final long serialVersionUID = 1L;

	// ctrl+alt+b need to remove key from eclise { not work
	//dispatcher work post / get 
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		int i = Integer.parseInt(request.getParameter("num1"));
		int j = Integer.parseInt(request.getParameter("num2"));

		PrintWriter out = response.getWriter();
        
		out.println("Calculation : " + (i + j));
		out.println("Post Method Dispatcher Adata kerest ");
		int sum = i + j;
		
		//Forwrad dispatcher diszpecser ha weblapon belulre kell request kuldom adatott GET !!
		// We can issue a redirect which will send a HTTP 302 response instructing the browser to perform a new GET request to the specified URL.
		
		RequestDispatcher rd = request.getRequestDispatcher("SqrtServlet");
		
		
		
		// forward with request
		request.setAttribute("summa", sum);
	
		//Create Session 
		HttpSession session = request.getSession();
		session.setAttribute("s", "Session keresztul POST adat!!");
		
	
		
	
		rd.forward(request, response);
		
		
		response.getWriter().append("Dispatcher Served at: ").append(request.getContextPath());

	}

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		int i = Integer.parseInt(request.getParameter("num1"));
		int j = Integer.parseInt(request.getParameter("num2"));

		PrintWriter out = response.getWriter();
        
		out.println("Calculation : " + (i + j));
		out.println("GET Method Dispatcher Adta kerest");
		int sum = i + j;
		
		//Forwrad dispatcher diszpecser ha weblapon belulre kell request kuldom adatott GET !!
		// We can issue a redirect which will send a HTTP 302 response instructing the browser to perform a new GET request to the specified URL.
		RequestDispatcher rd = request.getRequestDispatcher("SqrtServlet");
		
		
		
		// forward with request
		request.setAttribute("summa", sum);
		
		//Create Session + Cookie 
		HttpSession session = request.getSession();
		session.setAttribute("s", "Session keresztul GET adat!!");
		
		rd.forward(request, response);
		
		
		
		response.getWriter().append("Dispatcher Served at: ").append(request.getContextPath());

	}
	
	

}
