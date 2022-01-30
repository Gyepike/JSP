package com.anti.dependecy.di.loadingfromproperty.annotation;

import java.beans.ConstructorProperties;

import org.springframework.beans.factory.annotation.Value;

public class Student {

	private String studentName;
	private int studenID;
	private int studenYear;
	private String intrestedCourse;
	private String hobby;

	
	  
	public Student() {
		super();
	}


	
	public Student(String studentName, int studenYear) {
		this.studentName = studentName;
		this.studenYear = studenYear;
	}

	public Student(String studentName) {
		this.studentName = studentName;

	}

	public void display() {
		System.out.println(toString());
	}

	@Value("19")	
	public void setStudenID(int studenID) {
		this.studenID = studenID;
	}

	@Override
	public String toString() {
		return "Student [studentName=" + studentName + ", studenID=" + studenID + ", studenYear=" + studenYear
				+ ", intrestedCourse=" + intrestedCourse + ", hobby=" + hobby + "]";
	}


	@Value("A,B,C")	
	public void setIntrestedCourse(String intrestedCourse) {
		this.intrestedCourse = intrestedCourse;
	}

	@Value("JAVA")	
	public void setHobby(String hobby) {
		this.hobby = hobby;
	}

}
