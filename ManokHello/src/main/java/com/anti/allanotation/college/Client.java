package com.anti.allanotation.college;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
  public static void main(String[] args) {
	 //ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
	 ApplicationContext context = new AnnotationConfigApplicationContext(CollageConfig.class);
	  System.out.println("Control class done");
	 
	  //System.out.println("Application Context Created "+context.getId());
	  
	 College college = context.getBean("collegeBean", College.class);
	 college.test();
	 HighSchool school = context.getBean("prisonschool",  HighSchool.class);
	 school.school();
      System.out.println("Collage created ");
  }
}
