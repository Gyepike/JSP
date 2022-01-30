package com.anti.dependecy.di.autowiring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Body {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("human.xml");
		
		Human human = context.getBean("human", Human.class);
		
		human.startpumping();
		System.out.println(human);
		

	}

}
