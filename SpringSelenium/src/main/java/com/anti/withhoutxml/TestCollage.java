package com.anti.withhoutxml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
//import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestCollage {

	public static void main(String[] args) {
		
		//ApplicationContext context =  new ClassPathXmlApplicationContext("collage.xml"); 
		
		ApplicationContext context = new AnnotationConfigApplicationContext(CollageConfig.class);
		
		
		System.out.println(" XML Loaded ");
		
		Collage colleg = context.getBean("Munyi",Collage.class); //metohid name id for bean !!! 
		
		colleg.collage();

	
	}

}
