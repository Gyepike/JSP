package com.anti.web.jdbc;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.annotation.Resource;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;

/**
 * Servlet implementation class TestServlet
 */

@WebServlet("/TestServlet")
public class TestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	Connection con = null;

	PrintWriter out;
	Statement   state;
	ResultSet result;
	
	
	

	@Resource(name = "jdbc/Food")
	private DataSource datasource;

	public void test(PrintWriter out) throws IOException {

		String SQL  = "SELECT * FROM Food.student";
		try {
			con = datasource.getConnection();
			System.out.println("Get Connection");
			//out.print("get connnection");
		    
			state = con.createStatement();
			state.execute(SQL);
			
			result  = state.getResultSet();
			
			out.println("<HTML><HEAD><TITLE>Hello World!</TITLE></HEAD>");
			out.println("<BODY>"); 
			
			out.print("<table align='center' border='4' bordercolor='blue' /> ");
			
			while (result.next()) {
				
				out.print("<tr>");
				out.print("<td>");
				out.println(result.getInt(1));
				out.print("</td>");
				
				out.print("<td>");
				out.println(result.getString(2));
				out.print("</td>");
				
				out.print("<td>");
				out.println(result.getString(3));
				out.print("</td>");
				
				out.print("<td>");
				out.println(result.getString(4));
				out.print("</td>");
				
				out.print("</tr>");
				
			}
			
			out.println("</table>");
			out.println("</BODY></HTML>");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub

		// con = datasource.getConnection();
		response.setContentType("text/html");
		out = response.getWriter();
		test(out);

		System.out.println("Get Connection");
		//out.print("Hello");

	}

}
