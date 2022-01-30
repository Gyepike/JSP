package com.anti.dependecy.di.autowiring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;


public class Human {
	
	
	private Heart heart;

	
	public Human() {
	}

	
	
	public Human(Heart heart) {
		System.out.println("use only for autowire =constructor ");
		this.heart = heart;
	}

    
	@Autowired
	@Qualifier("humanHeart")
	public void setHeart(Heart heart) {
		this.heart = heart;
	}
	
	public void startpumping() {
		
	 if(heart != null)	{
		 heart.pump(); 
	 } 
	 else {
		 System.out.println("Heart not pumping");
	 }
		
	}

	@Override
	public String toString() {
		return "Human [heart=" + heart + "]";
	}

}
