package com.anti.autowired.withxml;

import org.springframework.beans.factory.annotation.Autowired;

public class Heart {

	private int number;

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public void pump() {

		System.out.println("Pumping your heart " + number ) ;
		System.out.println("Alive");
	}

}
