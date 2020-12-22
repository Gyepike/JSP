package com.anti.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestStudent {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("cheat.xml");
		System.out.println("cheat.xml loaded ");
		Student student = context.getBean("student", Student.class);
		
	    student.cheat();
	}

}
