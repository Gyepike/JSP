package com.anti.springtest.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SpringSetStudent {
	

	private int id ;
	
	public int getId() {
		return id;
	}


	public void setId(int id) {
		System.out.println("A SET ID meghivasra kerult !");
		this.id = id;
	}


	private String studentName ;
	
	
	@Override
	public String toString() {
		return "Student [studentName=" + studentName + "]";
	}

	
	public void  displayStudentName() {
		System.out.println("Student Name:  " + studentName + " and the ID is : " + id);
	}

	public String getStudentName() {
		return studentName;
	}


	public void setStudentName(String studentName) {
		System.out.println("A SET NAME meghivasra kerult !");
		this.studentName = studentName;
	}

}
