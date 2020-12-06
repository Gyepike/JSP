package com.anti.springtest.annot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class AppTest {

	public static void main(String[] args) {
		System.out.println("Hello Mobile");
		
		ApplicationContext factory =  new AnnotationConfigApplicationContext(AppConfig.class);
		
		SamSung sam =  factory.getBean(SamSung.class);
    
		
		sam.config();
		
	}

}
