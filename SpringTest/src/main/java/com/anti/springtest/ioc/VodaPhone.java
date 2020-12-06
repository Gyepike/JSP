package com.anti.springtest.ioc;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class VodaPhone implements SIM {

	@Override
	public void calling() {
		System.out.println("Vodaphone calling sim");
	}

	@Override
	public void data() {
		System.out.println("Vodaphone Use internet sim");

	}

}
