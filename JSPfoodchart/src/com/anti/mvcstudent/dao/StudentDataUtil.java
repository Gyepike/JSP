package com.anti.mvcstudent.dao;

import java.util.ArrayList;
import java.util.List;

import com.anti.mvcstudent.dto.*;

public class StudentDataUtil {

	
	public static List<Student> studentList() {
		
		// create empty list
		
		List<Student> students = new ArrayList<Student>();
		// add Sample 
		
		students.add(new Student(1,"Peti", "Munyi", "antipet@gmail.com"));
		students.add(new Student(2,"Anikó", "Munyo", "barkoaniko@gmail.com"));
		students.add(new Student(3,"Tibi", "Mano", "menyorszag@gmail.com"));
		
		return students;
	}
}
