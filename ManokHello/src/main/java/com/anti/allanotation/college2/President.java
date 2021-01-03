package com.anti.allanotation.college2;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Primary
public class President implements StudentCouncil{
	
	@Value("${President.name}")
	private String name;
	
	public void setName(String name) {
		this.name = name;
	}

   
	public String getName() {
		return name;
	}

	
	public String studentCouncilMember() {
		
		return "I am President, you will be sentenced by me " + getName();
	}
}
