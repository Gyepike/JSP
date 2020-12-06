package com.anti.springtest.dao;

import org.springframework.stereotype.Component;

// full config without xml

@Component
public class Tyre4 {
    
	private String brand;

	

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	

	@Override
	public String toString() {
		return "Tyre is working "+ brand;
	}
}
