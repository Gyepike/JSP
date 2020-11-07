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

@WebServlet("/helloworld2")
public class HelloWorldReURLWrite extends HttpServlet {
	private static final long serialVersionUID = 1L;

	// ctrl+alt+b need to remove key from eclise { not work
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		int i = Integer.parseInt(request.getParameter("num1"));
		int j = Integer.parseInt(request.getParameter("num2"));

		PrintWriter out = response.getWriter();
        
		out.println("Calculation : " + (i + j));
		out.println("GET Method URL Rewrite!! out web site !response! vissza client browsere + onan get kulso weblapra");
		int sum = i + j;
	
		
		   
    	//Create Session + Cookie 
		HttpSession session = request.getSession();
		session.setAttribute("s", "SendRedirect Session keresztul GET adat!!");
		
		// Cookie adat
		Cookie cookie = new Cookie("k", "Alma");
		response.addCookie(cookie); // work only for respone
		
		
		// forward with respond!! Only with GET method
        response.sendRedirect("SqrtServlet2?summa="+sum);   // URL rewitering transfer to the client back 
		
     
		
		response.getWriter().append("Send Redirect Served at: ").append(request.getContextPath());

	}
  
	
	

}
