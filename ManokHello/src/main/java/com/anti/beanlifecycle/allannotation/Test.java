package com.anti.beanlifecycle.allannotation;



import org.springframework.context.support.AbstractXmlApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.anti.allanotation.college2.Hello;


public class Test {

	public static void main(String[] args) {
         	
		AbstractXmlApplicationContext context = new ClassPathXmlApplicationContext("lifecycle.xml");
		
		StudentDAO studentDAO =  context.getBean("studentDAO", StudentDAO.class);
		studentDAO.deleteStudentRecord(2);
		studentDAO.deleteStudentRecordParam(2);
		studentDAO.selectAll();
		
	     
		Hello hello = context.getBean("hello",  Hello.class);
	
		
		context.close();  // Only desktop APP use close !!! WEB Servlet Automaticly close !!!
		
		// clsoe permanent close !!  no new object can created in contener !! 
		
		//context.registerShutdownHook(); // same as close but complety close the container !! 
		//StudentDAO studentDAO2 =  context.getBean("studentDAO", StudentDAO.class);
		
	}
}
