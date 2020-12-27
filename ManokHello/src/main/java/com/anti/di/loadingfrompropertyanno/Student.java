package com.anti.di.loadingfrompropertyanno;


import org.springframework.beans.factory.annotation.Required;
import org.springframework.beans.factory.annotation.Value;

public class Student {
		
	@Value("${student.name}")
	private String  name;
    private String intrestedCourse;
    private String hobby;
   	
	// @Required removed for new 5.1 we use construrcor 
	@Value("${student.intrestedCourse}")
	public void setIntrestedCourse(String intrestedCourse) {
		this.intrestedCourse = intrestedCourse;
	}
	
	@Value("${student.hobby}")
	public void setHobby(String hobby) {
		this.hobby = hobby;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", intrestedCourse=" + intrestedCourse + ", hobby=" + hobby + "] Autowire work only for object !";
	}
	
	public void displayStudentInfo() {
		System.out.println(toString());
	}
}
