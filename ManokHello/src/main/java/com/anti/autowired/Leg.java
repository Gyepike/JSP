package com.anti.autowired;

import org.springframework.beans.factory.annotation.Value;

public class Leg {
	
	
	@Value("2")
	private int numberOfLegs;
	@Value("Human")
	private String animal;

	public int getNumberOfLegs() {
		return numberOfLegs;
	}

	public String getAnimal() {
		return animal;
	}

	
	public void leg() {
		System.out.println("Leg type " + getAnimal() + " has number of legs " + getNumberOfLegs());
		System.out.println("A have Legs ! ");
	}

}
