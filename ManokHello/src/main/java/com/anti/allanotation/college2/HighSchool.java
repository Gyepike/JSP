package com.anti.allanotation.college2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class HighSchool {
	
	@Autowired
	private Secretary  secretary;
	@Autowired
	private VicePresident vicepresident;
	@Autowired
	private Apple apple;
	
	


  
	public void highSchooling() {
		System.out.println("High School Student Council Members");
		System.out.println(apple.studentCouncilMember());
		System.out.println(vicepresident.studentCouncilMember());
		System.out.println(secretary.studentCouncilMember());
	}

}
