package com.anti.dependecy.di.loadingfromproperty;




import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Exam {
   
	public static void main(String[] args) {
		/*Student student =  new Student();
		student.setStudentName( "Munyi"); 
		student.display();
		*/
		
		ClassPathXmlApplicationContext context  = new ClassPathXmlApplicationContext("studentp.xml");
		System.out.println("studentp.xml loaded");
		
		Student student = context.getBean("student",Student.class);
		Student student2 = context.getBean("student2",Student.class);
		Student student3= context.getBean("student3",Student.class);
		
		System.out.println(student);
		System.out.println(student2);
		System.out.println(student3);
	}
}
