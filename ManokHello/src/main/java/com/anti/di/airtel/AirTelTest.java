package com.anti.di.airtel;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AirTelTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context = new ClassPathXmlApplicationContext("airtel.xml");
		System.out.println("import done ");
		
		AirTel tel = context.getBean("air", AirTel.class);
		
		tel.service();

	}

}
