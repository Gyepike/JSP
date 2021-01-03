package com.anti.beanlifecycle.allannotation;

import java.io.Serializable;

public class Student  implements Cloneable, Serializable{
	
	public int colg_id = 101;
	
	public Student(int colg_id) {
		this.colg_id = colg_id;
	}

	@Override
	public String toString() {
		return "Student [colg_id=" + colg_id + "]";
	}
	
	public void hello() {
	 System.out.println("hello");
	}

	public Student() {
		   System.out.println("Student Constructor");
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
}
