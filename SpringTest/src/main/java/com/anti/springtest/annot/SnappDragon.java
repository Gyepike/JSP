package com.anti.springtest.annot;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("snappdragon")
//@Primary with this annotiation forece use this not intel class
public class SnappDragon implements MobilProcessor {
   
	private String type;
	
	@Override
	public void process() {
		System.out.println("Word Best dargon processor");

	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

}
