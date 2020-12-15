package com.anti.springtest.di;

import org.springframework.stereotype.Component;


public class ConstStudent {

	private int id;
	private String studentName;

	public ConstStudent(int id, String studentName) {
		this.id = id;
		this.studentName = studentName;
	}

	public ConstStudent(int id) {
		this.id = id;
	}
	
	public void displayStudentName() {
		System.out.println("Student Name:  " + studentName + " and the ID is : " + id);
	}

}
