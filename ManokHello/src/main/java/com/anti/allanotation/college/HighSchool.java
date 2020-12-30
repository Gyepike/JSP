package com.anti.allanotation.college;


public class HighSchool {
	

	private VicePresident vicepresident;
	private USCSecretary  secretary;
    private StudentCouncil studentCouncil; // can use interface
	
   

	public void setStudentCouncil(StudentCouncil studentCouncil) {
		this.studentCouncil = studentCouncil;
	}



	public void setSecretary(USCSecretary secretary) {
		this.secretary = secretary;
	}



	public HighSchool(VicePresident vicepresident) {
		this.vicepresident = vicepresident;
	}
   
	

	public void highSchooling() {
		System.out.println("High School Student Council Members");
		System.out.println(studentCouncil.studentCouncilMember());
		System.out.println(vicepresident.studentCouncilMember());
		System.out.println(secretary.studentCouncilMember());
	}

}
