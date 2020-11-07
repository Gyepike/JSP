package com.anti;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class SqrtServlet2
 */
@WebServlet("/SqrtServlet3")
public class SqrtServlet3 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	    
		PrintWriter out = response.getWriter();
		out.println("Hello SqrtServer 3 / Negyzet Server URL Rewrite  GET TUDJA!! egyedul");
	    out.println("URL Rewriter Work Only For GET!!!!");
	    HttpSession session = request.getSession();
	    
		int sqrt = (int) session.getAttribute("sum");
	
		
		sqrt  = sqrt * sqrt; 
		response.getWriter().append( sqrt +" Served at: ").append(request.getContextPath());
		
	}
   
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	    
		PrintWriter out = response.getWriter();
		out.println("Ide suha nem kerul GET kuldi");
	    out.println("POST!!!");
	
		
	}
	
	
}
