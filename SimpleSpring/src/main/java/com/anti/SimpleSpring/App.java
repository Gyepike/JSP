package com.anti.SimpleSpring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {

		// beanfactory for small use applicationcontext for web /eee
		//ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		// Vehicle sringobject = (Vehicle) context.getBean("vehicle"); xml based

		/*
		 * Vehicle sringobject = (Vehicle) context.getBean("bike");
		 * 
		 * Vehicle obj = new Bike(); Vehicle obj1 = new Car();
		 * 
		 * 
		 * obj.drive(); obj1.drive(); sringobject.drive();
		 */
	    
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		Tyre tyre = (Tyre) context.getBean("tyre");
		System.out.println(tyre.toString());
		System.out.println("Add property in the xml");

		Tyre2 tyre2 = (Tyre2) context.getBean("tyre2");
		System.out.println(tyre2.toString());
		System.out.println("Constructor injection XML");

		Tyre3 tyre3 = (Tyre3) context.getBean("tyre3");
		System.out.println(tyre3.toString());

		
		Car car = (Car) context.getBean("car");
		Tyre3 type3 = (Tyre3) context.getBean("tyre3");

		car.drive();
		System.out.println(type3.toString());
		System.out.println("MIXED XML TYPE3 + CAR Component + AutoWired");
		System.out.println();
		
		Bike bike = (Bike) context.getBean("bike");
		System.out.println("No XML + ONLY Component + AutoWired GET/SET");
		bike.drive();
		System.out.println();
	}
}
