package com.anti.di.airtel;

public class MissedCallAlertService implements Service {

	private String missedNumber;
	
	public MissedCallAlertService(String missedNumber) {
		this.missedNumber = missedNumber;
	}
	public void service() {
		System.out.println("Misssed " + missedNumber);
		System.out.println("Missed Call Alert Service Activated");
	}

}
