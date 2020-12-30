package com.anti.allanotation.college;

import org.springframework.beans.factory.annotation.Value;

public class USCSecretary implements StudentCouncil {

	
	@Value("Hana Midorikawa")
	private String name;
	
	public String studentCouncilMember() {
		return "I am USC Secretary, you will be punished by me " + getName();
	}

	public String getName() {
		return name;
	}

}
