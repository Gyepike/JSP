package com.anti.dependecy.losecoupiling.di;



import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
	
	/*
	Student student = new Student();
	student.setMathCheat(new Mathcheat());
	student.cheat();
	*/
	
	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("cheatlose.xml");
		System.out.println("cheat xml loaded");
		Student student = context.getBean("stud", Student.class);
		 
		student.cheat();
		System.out.println(student);
	
		
	}

}
