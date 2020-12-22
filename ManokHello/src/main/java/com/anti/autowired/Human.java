 package com.anti.autowired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Human {
	
	 //  @Autowired use bytype autowired 
	@Autowired
	private Heart heart;
	
	@Autowired  // can be here or on the setter / constructor 
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
