package com.anti.allanotation.college2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class HighSchool {
	
	@Autowired
	private Secretary  secretary;
	private President president;
	private VicePresident vicepresident;
	
	@Autowired
	@Qualifier("president")
	StudentCouncil council;
	
	@Autowired
	public HighSchool(VicePresident vicepresident) {
		this.vicepresident = vicepresident;
	}


	@Autowired
	public void setPresident(President president) {
		this.president = president;
	}



	public void highSchooling() {
		System.out.println("High School Student Council Members");
		System.out.println(president.studentCouncilMember());
		System.out.println(vicepresident.studentCouncilMember());
		System.out.println(secretary.studentCouncilMember());
		System.out.println(council.studentCouncilMember());
	}

}
