package com.anti.allanotation.college;

import org.springframework.beans.factory.annotation.Value;

public class VicePresident implements StudentCouncil {

	@Value("Meiko Shiraki")
	private String name;
	
	public String studentCouncilMember() {
		return "I am Vice-President, you will be punished by me " + getName();
	}

	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}

}
