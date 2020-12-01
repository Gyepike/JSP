package com.anti.springtest.dao;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class AppRun {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		
		
		Bike bike = (Bike) context.getBean("bike");
		System.out.println("No XML + ONLY Component + AutoWired GET/SET");
		bike.drive();
		System.out.println();
	}

}
