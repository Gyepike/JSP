package com.anti;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.anti.Dao.LoginDao;

@WebServlet({ "/nev" })
public class Control extends HttpServlet {
	private static final long serialVersionUID = 1L;
	LoginDao dao;
	
	public Control() {
		super();

	}
	
    
	public void init(ServletConfig config) throws ServletException {
		dao = new LoginDao();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		PrintWriter out = response.getWriter();
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		int sum = 12;

		/*
		 * out.println("<html> <body>"); out.println("welcome user  "+
		 * request.getParameter("username") + " " + "password: " +
		 * request.getParameter("password")) ; out.println("</br>");
		 * out.println(request.getContextPath()); out.println("</body> </html>");
		 */
         // username.equals("a") && password.equals("a")
		
		if (dao.checkAccess(username, password)) {
			int k = 10;
			String k2 = "helloka";
			request.setAttribute("k", k);
			request.setAttribute("k2", k2);
			
			HttpSession session = request.getSession();
			
			session.setAttribute("username", username);
			
			RequestDispatcher rd = request.getRequestDispatcher("welcome.jsp");
			rd.forward(request, response);
		} else {
			response.sendRedirect("login.jsp");
		}

	}

}
