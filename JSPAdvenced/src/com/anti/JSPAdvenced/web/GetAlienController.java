package com.anti.JSPAdvenced.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.anti.JSPAdvenced.dao.AlienDao;

/**
 * Servlet implementation class GetAlienController
 */
@WebServlet("/getAlien")
public class GetAlienController extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
     
	    PrintWriter out = resp.getWriter();
	    
	    out.println(req.getParameter("aid"));
	    
	    int aid = 0;
		
	    try {
	    	aid =  Integer.parseInt(req.getParameter("aid"));
		} catch (Exception e) {
			System.out.println(e);
		}
	   
	    
	    System.out.println(aid);
	    
	    AlienDao dao = new AlienDao();
	    
	    Alien a1 = dao.getAlien(aid);
	   
	    req.setAttribute("alien", a1);
	    
	    RequestDispatcher rd = req.getRequestDispatcher("showAlien.jsp");
	    rd.forward(req, resp);
		
		resp.getWriter().append("Served at: ").append(req.getContextPath());
	}

}
