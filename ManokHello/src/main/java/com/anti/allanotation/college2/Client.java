package com.anti.allanotation.college2;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Client {
  public static void main(String[] args) {
	 //ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
	  AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(CollageConfig.class);
	  System.out.println("Context created Control class done ");
	 
	  //System.out.println("Application Context Created "+context.getId());
	  
	 College college = context.getBean("collegeBean", College.class);
	 college.collage();
	 System.out.println("Collage created ");
     
	
	 
	 HighSchool highschool = context.getBean("highSchool",  HighSchool.class);
	 System.out.println("High School created ");
	 highschool.highSchooling();

	 
    
     School school = context.getBean("school", School.class); // component use smallcap name as id
     System.out.println("School created ");
     school.school();
     
      
     context.close();
     
  }
}
