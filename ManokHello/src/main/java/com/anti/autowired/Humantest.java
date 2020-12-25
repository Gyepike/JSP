package com.anti.autowired;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Humantest {

	public static void main(String[] args) {
      ApplicationContext context = new ClassPathXmlApplicationContext("mananno.xml");
      System.out.println("context runnning");
      
      Human humans = context.getBean("human", Human.class);
      
      humans.startPumping();
      humans.head();
      humans.leg();
	}

}
