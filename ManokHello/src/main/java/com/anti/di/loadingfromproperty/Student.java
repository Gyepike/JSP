package com.anti.di.loadingfromproperty;

public class Student {
		
	private String  name;
    private String intrestedCourse;
    private String hobby;

    public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getIntrestedCourse() {
		return intrestedCourse;
	}
	public void setIntrestedCourse(String intrestedCourse) {
		this.intrestedCourse = intrestedCourse;
	}
	public String getHobby() {
		return hobby;
	}
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
