package com.anti.di.airtel;

public class HelloTuneService implements Service {

    private int number;
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public void service() {
		System.out.println("Hello Tune Service Activated " + number) ;
	}

}
