package com.anti.springtest.ioc;

import org.springframework.stereotype.Component;

@Component
public class Telenor implements SIM {

	public Telenor() {
		super();
		System.out.println("Telenor constructor");
	}

	@Override
	public String toString() {
		return "Telenor Print";
	}

	@Override
	public void calling() {
		System.out.println("Telenor calling sim");
	}

	@Override
	public void data() {
		System.out.println("Telenor Use internet sim");

	}

}
