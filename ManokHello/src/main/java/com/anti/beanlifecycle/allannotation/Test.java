package com.anti.beanlifecycle.allannotation;


import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Test {

	public static void main(String[] args) {
      
		//StudentDAO studentDAO = new StudentDAO();
	   	
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("lifecycle.xml");
		
		StudentDAO studentDAO =  context.getBean("studentDAO", StudentDAO.class);
		//studentDAO.deleteStudentRecord(2);
		//studentDAO.deleteStudentRecordParam(2);
		studentDAO.selectAll();
		
		
	}
}
