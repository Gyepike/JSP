package com.anti.autowired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Human {

	// @Autowired use bytype autowired

	private Heart heart;
	private Leg leg;
     
	@Autowired
	public Human(Leg leg) {
		System.out.println("Constructor injection!");
		this.leg = leg;
	}

	@Autowired // can be here or on the setter / constructor
	@Qualifier("headObjectValue") // not need setter / constructor
	private Head head;

	@Autowired
	@Qualifier("horseObject")
	public void setHeart(Heart heart) {
		System.out.println("SET injection !!");
		this.heart = heart;
	}

	public void head() {
		head.pump();
	}

	public void leg() {
		leg.leg();
	}

	public void startPumping() {
		if (heart != null) {

			heart.pump();
		} else {

			System.out.println("Heart stopped you are dead heart object not present");
		}
	}
}
