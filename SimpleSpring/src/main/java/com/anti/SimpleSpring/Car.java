package com.anti.SimpleSpring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Car  implements Vehicle {   // Vehile not needed 

	 @Autowired
	 private Tyre3 tyre3;
	 public Tyre3 getTyre3() {
		return tyre3;
	}
	public void setTyre3(Tyre3 tyre3) {
		this.tyre3 = tyre3;
	}
	public void drive() {
		System.out.println("Drive a car " + tyre3);
		System.out.println("Car is " + tyre3.toString());
	}
}
