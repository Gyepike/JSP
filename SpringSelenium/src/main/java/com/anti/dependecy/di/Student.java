package com.anti.dependecy.di;

public class Student {
	

	private String studentName;
	private int studenID;
	private int studenYear;
	
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

	

	public void setStudenID(int studenID) {
		this.studenID = studenID;
	}

	@Override
	public String toString() {
		return "Student [studentName=" + studentName + ", studenID=" + studenID + ", studenYear=" + studenYear + "]";
	}

	
}
