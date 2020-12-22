package com.anti.autowired.withxml;

import org.springframework.beans.factory.annotation.Autowired;

public class Human {
	
	
	private Heart heart;
	private Head head;

	
	public void setHead(Head head) {
		this.head = head;
	}



	public Human() {
		
	}
    
	

	public Human(Heart heart) {
		this.heart = heart;
	}
	
	
	

	public void setHeart(Heart heart) {
		this.heart = heart;
	}
	
	public void head() {
		
     head.pump();
	}
	
    public void startPumping() {
    	if(heart != null) {
    		
    		heart.pump();
    	}
    	else {
    		
    		System.out.println("Heart stopped you are dead heart object not present");
    	}
    }
}
