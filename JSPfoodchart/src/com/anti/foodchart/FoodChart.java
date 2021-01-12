package com.anti.foodchart;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FoodChart
 */
@WebServlet("/FoodChart")
public class FoodChart extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
        FoodCastDButil food = new FoodCastDButil();
		try {
			List<Food> list = food.getFoodList();
			request.setAttribute("list", list);
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		// get data from modell servlet is the controller
		
		String[] foodItems = {"Apple Pie", "Cola", "Hamburger", "Pizza"};  
		// redirect to viwe jsp page !! 
		
	    String name = "Munyi&Munyo";
	    		
		RequestDispatcher req =   request.getRequestDispatcher("foodlist.jsp");
	    
	    
		request.setAttribute("foodItemsList", foodItems);
		request.setAttribute("Name", name);	
		
	    
        req.forward(request, response);
	}

}
