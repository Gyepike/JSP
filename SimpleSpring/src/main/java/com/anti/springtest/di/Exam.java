package com.anti.springtest.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Exam {
   
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("student.xml");
		
		//ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationControll.class);
		//Student student = context.getBean("student",Student.class); more strickt 
		
		SpringSetStudent studentA = context.getBean("studentA",SpringSetStudent.class);
		SpringSetStudent studentB = context.getBean("studentB",SpringSetStudent.class);
		ConstStudent studentC = context.getBean("studentC",ConstStudent.class);
		ConstStudent studentD = context.getBean("studentD",ConstStudent.class);
		
		studentA.displayStudentName();
		studentB.displayStudentName();
		studentC.displayStudentName();
		studentD.displayStudentName();
		
		
	}
	
}
