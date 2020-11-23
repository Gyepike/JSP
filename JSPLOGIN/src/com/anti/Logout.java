package com.anti;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.anti.Dao.LoginDao;

@WebServlet("/Logout")
public class Logout extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
 
    public Logout() {
        super();
        
    }

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 
		PrintWriter out = response.getWriter();
		out.println("Lougout done!!!");
	
		
		HttpSession session = request.getSession();
		
		session.removeAttribute("username");
		session.removeAttribute("password");
	    session.invalidate();
		
	    
	    
		response.sendRedirect("login.jsp");
		

	}

}
