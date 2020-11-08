package com.anti;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * Servlet implementation class ServletContext
 */
@WebServlet(
		
		name = "servletParamAnnotation", 
		urlPatterns =  {"/ServletContext", "/Kuki"},
		
		initParams =
	        {
	            @WebInitParam(name = "saveDir", value = "D:/FileUpload"),
	            @WebInitParam(name = "allowedTypes", value = "jpg,jpeg,gif,png")
	        }
		)



public class TestServletContext extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: dddd ").append(request.getContextPath());
		response.setContentType("text/html;charset=UTF-8");
	    String name = request.getParameter("user");
	    String pass = request.getParameter("pass");
	        
	    
	    PrintWriter out = response.getWriter();
	    ServletContext ctx = getServletContext();
	    out.println("Servlet Context:");
	    out.println("<br/>");
	    out.println(ctx.getInitParameter("name"));
	    out.println(ctx.getInitParameter("consol"));
	    out.println("</br>");
	    
	    String saveDir = getInitParameter("saveDir");
        String fileTypes = getInitParameter("allowedTypes");
        
        out.println("saveDir = " + saveDir);
        out.println("</br>");
        out.println("fileTypes = " + fileTypes);
	        if(pass.equals("1234"))
	        {
	            Cookie ck = new Cookie("username", name);
	            response.addCookie(ck);
	            response.sendRedirect("First");
	        }
	        
	        
	}

	
	

}
