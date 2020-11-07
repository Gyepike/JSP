package com.anti;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class SqrtServlet2
 */
@WebServlet("/SqrtServlet2")
public class SqrtServlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	    
		PrintWriter out = response.getWriter();
		out.println("Hello SqrtServer 2 / Negyzet Server URL Rewrite  GET TUDJA!! egyedul");
	    out.println("URL Rewriter Work Only For GET!!!!");
		int sqrt = Integer.parseInt(request.getParameter("summa"));
		sqrt  = sqrt * sqrt; 
		
		//Test Session 
		HttpSession session = request.getSession();
		String outsession = (String) session.getAttribute("s");
		
		out.println(" ");
		out.println("Session variable:" + outsession);
		
		
		//Test Cookie 
		
		Cookie cokies [] =  request.getCookies();
		
	    for ( Cookie c : cokies) {
			 
	    	 out.print(c.getValue());
	    	 out.print(c.getName());
		}
		
		response.getWriter().append( sqrt +" Served at: ").append(request.getContextPath());
		
	}
   
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		out.println("Ide suha nem kerul GET kuldi Sendredirect !!!");
	    out.println("POST!!!");
	
		
	}
	
	
}
