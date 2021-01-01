package com.anti.allanotation.college2;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


@Component
public class VicePresident implements StudentCouncil {

	@Value("${VicePresident.name}")
	private String name;
	
	public String studentCouncilMember() {
		return "I am Vice-President, you will be punished by me " + getName();
	}

	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}

}
