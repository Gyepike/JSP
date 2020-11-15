package com.anti;

public class Student {
   private int rollno;
   @Override
public String toString() {
	return "Student [rollno=" + rollno + ", name=" + name + "]";
}

private String name;
   
public Student(int rollno, String name) {
	super();
	this.rollno = rollno;
	this.name = name;
} 
}
