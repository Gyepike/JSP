package com.anti.springtest.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Bike  {
   
	@Autowired
	Tyre4  tyre4;
	
	public Tyre4 getTyre4() {
		return tyre4;
	}

	public void setTyre4(Tyre4 tyre4) {
		this.tyre4 = tyre4;
	}

	public void drive() {
		System.out.println("Riding Bike "+tyre4);
	}
}
