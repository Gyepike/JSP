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

@WebServlet("/helloworld3")
public class HelloWorldSendRedirectwithCookieandSession extends HttpServlet {
	private static final long serialVersionUID = 1L;

	// ctrl+alt+b need to remove key from eclise { not work
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		int i = Integer.parseInt(request.getParameter("num1"));
		int j = Integer.parseInt(request.getParameter("num2"));

		PrintWriter out = response.getWriter();
        
		out.println("Calculation : " + (i + j));
		out.println("GET Method Only Sendredirect!!!! Out web site !response! vissza clintre + onan get");
		int sum = i + j;
	
		
		// forward with respond!! Only with GET method
		//Cookies + Session another 2 way 
		HttpSession session = request.getSession();
		session.setAttribute("sum", sum);
		
		Cookie cookie = new Cookie("k", "Alma");
		
		response.addCookie(cookie); // work only for respone
		
        response.sendRedirect("SqrtServlet3");   // URL rewitering transfer no form need + no cokkies session tracking
		
        
    	
        
        
		session.setAttribute("s", "Session  URL Writer keresztul GET adat!!");	
		
		response.getWriter().append("Send Redirect Served at: ").append(request.getContextPath());

	}
  
	
	

}
