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
 * Servlet implementation class SqrtServlet
 */
@WebServlet("/SqrtServlet")
public class SqrtServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		out.println("Hello SqrtServer / Negyzet Server forwarddispatcher  GET/ POST TUDJA!!");
		out.println("Dispather URLForward  GET Method Dispatcher");
		out.println("A parameter "+ request.getAttribute("summa"));
		int sqrt = (int) request.getAttribute("summa");
		
		//Sesssional 
		HttpSession session = request.getSession();
		int outsession = (int) session.getAttribute("s");
		out.println("A session altal  kuldott" + outsession);
		out.println("Az eredmey "+  (outsession * outsession));
		
		out.println("A vegeredmeny negyzete : " + (sqrt * sqrt ) );
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		out.println("Hello SqrtServer / Negyzet Server forwarddispatcher  GET/ POST TUDJA!!");
		out.println("Dispather URLForward  Post Method Dispatcher");
		
		out.println("A parameter "+ request.getAttribute("summa"));
		int sqrt = (int) request.getAttribute("summa");
		
		//Sessional 

		HttpSession session = request.getSession();
		int outsession = (int) session.getAttribute("s");
		out.println("A session altal kuldott" + outsession);
		out.println("Az eredmey "+  (outsession * outsession));
		

		out.println("A vegeredmeny negyzete : " + (sqrt * sqrt ) );
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}
	
}
