package com.anti.foodchart;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class FoodCastDButil {

	String url = "jdbc:mysql://localhost:3306/Alien?serverTimezone=UTC&useSSL=false";
	String user = "hbstudent";
	String password = "hbstudent";

	String SQL = "SELECT * FROM Food.foodcart";
	
	Connection con;

	private void getConnection() {
		try {
			con = DriverManager.getConnection(url, user, password);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		System.out.println("Connection done");
	}

	private void closeConnection() {
		try {
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		System.out.println("Connection done");
	}

	public List<Food> getFoodList() {

		List<Food> foods = new ArrayList<>();
		try {

			// get connection
			getConnection();
			// create statment
			Statement state = con.createStatement();
			
			ResultSet result = state.executeQuery(SQL);
			
			while (result.next()) {
				
				System.out.println(result.getString(1)+ " " + result.getString(2)+ " " +result.getString(3));
				Food food = new Food();
				food.setId(result.getInt(1));
				food.setItem(result.getString(2));
				food.setPrice(result.getDouble(3));
				
				foods.add(food);
			}
			
			//execute statemant 
		} catch (SQLException e) {
			
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// close connection;
		return foods;
	}

}
