package com.anti.integershort;

public class Human {

	
	private int adharNumber; // id number 
	private String name;
	
	public Human(int adharNumber, String name) {
		this.adharNumber = adharNumber;
		this.name = name;
	}
	
     

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return adharNumber;
	}

}
