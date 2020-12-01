package com.anti.SimpleSpring;

public class Tyre2 {
    
	private String brand;

	

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public Tyre2(String brand) {
		super();
		this.brand = brand;
	}

	@Override
	public String toString() {
		return "Tyre [brand=" + brand + "]";
	}
}
