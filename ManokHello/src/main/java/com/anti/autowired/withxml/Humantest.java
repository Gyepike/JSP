package com.anti.autowired.withxml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Humantest {

	public static void main(String[] args) {
      ApplicationContext context = new ClassPathXmlApplicationContext("manxmlconfig.xml");
      System.out.println("context runnning");
      
      Human humank = context.getBean("human", Human.class);
      
      humank.startPumping();
      humank.head();
      
	}

}
