package com.anti.autowired;

public class Head {
     
	private String animalHead;
	
	public String getAnimalHead() {
		return animalHead;
	}

	public void setAnimalHead(String animalHead) {
		this.animalHead = animalHead;
	}

	public void pump() {
		
		System.out.println("My head is : " + getAnimalHead());
	}
}
