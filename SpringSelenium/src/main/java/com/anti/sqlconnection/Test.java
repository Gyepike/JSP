package com.anti.sqlconnection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext context =  new ClassPathXmlApplicationContext("sqlconnection.xml"); 
		
		SQLConnector con =  context.getBean("sqlconnect", SQLConnector.class);
		
	    con.testConnection();

	}

}
