package com.anti.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestStudent {

	public static void main(String[] args) {

		// Student student = new Student();
		// GrammarCheat cheat = new GrammarCheat();
		// student.setCheat(new GrammarCheat());
		// student.cheat();

		ApplicationContext context = new ClassPathXmlApplicationContext("cheat.xml");

		GrammarCheat cheat = context.getBean("grammar", GrammarCheat.class);
		Student student = context.getBean("student", Student.class);

		AnotherStudent  anotherStudent = context.getBean("another", AnotherStudent.class);

		
		cheat.grammarCheat();
		student.cheat();
		anotherStudent.cheat();

	}

}
