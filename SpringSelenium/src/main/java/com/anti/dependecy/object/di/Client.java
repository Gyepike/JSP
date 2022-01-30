package com.anti.dependecy.object.di;



import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
	
	/*
	Student student = new Student();
	student.setMathCheat(new Mathcheat());
	student.cheat();
	*/
	
	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("cheat.xml");
		System.out.println("cheat xml loaded");
		Student student = context.getBean("stud", Student.class);
		
		System.out.println(student);
		student.cheat();
		
		
		
		AnotherStudent anotherStudent = context.getBean("anotherStudent", AnotherStudent.class);
		
		System.out.println(anotherStudent);
		
		anotherStudent.startCheating();
		context.close();
		
		
	}

}
