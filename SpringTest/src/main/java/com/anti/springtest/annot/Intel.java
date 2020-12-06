package com.anti.springtest.annot;

import org.springframework.stereotype.Component;

@Component
public class Intel implements MobilProcessor {

	@Override
	public void process() {
	  System.out.println("Inte is the best CPU!");
	}

}
