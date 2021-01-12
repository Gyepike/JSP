package com.anti.foodchart;

import java.util.List;

public class TestFoodDAO {

	public static void main(String[] args) throws ClassNotFoundException {
		FoodCastDButil food = new FoodCastDButil();
		
		List<Food> list = food.getFoodList();

		
		for (Food food2 : list) {
			
			System.out.println(food2.toString());
		}
	}

}
