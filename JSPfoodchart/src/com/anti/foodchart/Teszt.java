package com.anti.foodchart;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.websocket.Session;

/**
 * Servlet implementation class Teszt
 */
@WebServlet("/Teszt")
public class Teszt extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// get data
		
		
		String [] students = {"Munyi", "Munyó", "Tibi bacsi", "Mama"  } ;
		// get request dispathecer 
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("students.jsp");
		
		HttpSession session =  request.getSession();
		session.setAttribute("students", students);
		// forward to JSP
		dispatcher.forward(request, response);
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		
	}

}
