package com.anti.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mobil {

	public static void main(String[] args) {

		// Sim sim = new Vodaphone();
		// sim.calling();
		// sim.data();

		/*
		 * Phone phone = new Phone(new Vodaphone()); phone.calling(); phone.data();
		 */

		/*
		 * Phone phone = new Phone(); phone.setSim(new Vodaphone());
		 * 
		 * phone.calling(); phone.data();
		 */

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("mobil.xml");

		Sim vod = context.getBean("phone", Sim.class);

		vod.calling();
		vod.data();

		context.close();

	}

}