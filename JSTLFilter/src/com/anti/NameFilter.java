package com.anti;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

/**
 * Servlet Filter implementation class NameFilter
 */

@WebFilter("/nev")
public class NameFilter implements Filter {

	

	public void destroy() {
		// TODO Auto-generated method stub
	}

   
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		
		PrintWriter out = response.getWriter();
		out.println("In the  NAME FILTER");
	
		
		String firstname = request.getParameter("firstName");
		String lastname = request.getParameter("lastName");
		
	    if (firstname.length() > 3 && lastname.length() > 3) {
	    	chain.doFilter(request, response);
	    }
	    else 
	    {
	    	out.println("first & Last name to short!!");
	    }
		// pass the request along the filter chain
		
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
