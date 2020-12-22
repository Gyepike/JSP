package com.anti.autowired;

public class Heart {
	private int  number;
	
	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public void pump() {
		
		System.out.println("Pumping your heart " + getNumber());
		System.out.println("Alive");
	}

}
