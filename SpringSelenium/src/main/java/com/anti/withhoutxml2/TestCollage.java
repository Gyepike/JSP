package com.anti.withhoutxml2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
//import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestCollage {

	public static void main(String[] args) {
		
		//ApplicationContext context =  new ClassPathXmlApplicationContext("collage.xml"); 
		
		ApplicationContext context = new AnnotationConfigApplicationContext(CollageConfig.class);
		
		
		System.out.println(" XML Loaded ");
		
		Collage colleg = context.getBean("collage",Collage.class); 
		colleg.collage();

	
	}

}
