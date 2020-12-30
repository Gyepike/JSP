package com.anti.allanotation.college2;


import org.springframework.beans.factory.annotation.Value;

public class President implements StudentCouncil{
	
	@Value("Mari Kurihara")
	private String name;
	
	public String getName() {
		return name;
	}

	
	public String studentCouncilMember() {
		
		return "I am President, you will be sentenced by me " + getName();
	}
}
