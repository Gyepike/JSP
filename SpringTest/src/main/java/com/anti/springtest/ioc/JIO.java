package com.anti.springtest.ioc;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class JIO implements SIM {

	@Override
	public void calling() {
		System.out.println("JIO calling sim");
	}

	@Override
	public void data() {
		System.out.println("JIO Use internet sim");

	}

}
