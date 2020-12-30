package com.anti.allanotation.college2;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Secretary implements StudentCouncil {

	
	@Value("Hana Midorikawa")
	private String name;
	
	public String studentCouncilMember() {
		return "I am USC Secretary, you will be punished by me " + getName();
	}

	public String getName() {
		return name;
	}

}
