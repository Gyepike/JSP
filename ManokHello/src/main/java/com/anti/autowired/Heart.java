package com.anti.autowired;

public class Heart {
	private int  numberOfPitvar;
	private String  animal;
	
	public String getAnimal() {
		return animal;
	}
	public void setAnimal(String animal) {
		this.animal = animal;
	}
	public int getNumberOfPitvar() {
		return numberOfPitvar;
	}
	public void setNumberOfPitvar(int numberOfPitvar) {
		this.numberOfPitvar = numberOfPitvar;
	}
	
	
	public void pump() {
		
		System.out.println("Pumping your heart "+getAnimal() + " has number of pitvar " + getNumberOfPitvar());
		System.out.println("Alive");
	}

}
