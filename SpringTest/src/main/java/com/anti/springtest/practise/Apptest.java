package com.anti.springtest.practise;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Apptest {

	public static void main(String[] args) {
	   
		
		ApplicationContext cotex = new AnnotationConfigApplicationContext(AppControl.class);
		
		Playstation play = cotex.getBean(Playstation.class);
		
		play.play();

	}

}
