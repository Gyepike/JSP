package com.anti.JDBC;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class JDBCtest {

	public static void main(String[] args) {
		
		 ApplicationContext context = new ClassPathXmlApplicationContext("jdbc.xml");
		 System.out.println("context done");
		 
		 JDBCConnection jdbc = context.getBean("jdbc", JDBCConnection.class);
		 
		 jdbc.connection();

	}

}
