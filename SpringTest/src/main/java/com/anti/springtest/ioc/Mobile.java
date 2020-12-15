package com.anti.springtest.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.anti.springtest.practise.AppControl;

public class Mobile {

	 public static void main(String[] args) {
		//SIM sim = new VodaPhone(); old way before spring
		// sim.calling();
		//	sim.data();

		 
		 //ApplicationContext context = new ClassPathXmlApplicationContext("mobil.xml");
		// xml config 
		 
		 ApplicationContext context = new AnnotationConfigApplicationContext(AppClassControl.class);
		 // annotation config
		 System.out.println("Config loaded");
		  
		
		 SIM sim = context.getBean(SIM.class);
		 
		 sim.calling();
		 sim.data();
		 
		
	 }
			
}
