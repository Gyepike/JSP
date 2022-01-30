package com.anti.dependecy.object.di;




import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Exam {
   
	public static void main(String[] args) {
		/*Student student =  new Student();
		student.setStudentName( "Munyi"); 
		student.display();
		*/
		
		ClassPathXmlApplicationContext context  = new ClassPathXmlApplicationContext("student.xml");
		
		Student student = context.getBean("student",Student.class);
		Student student2 = context.getBean("student2",Student.class);
		Student student3= context.getBean("student3",Student.class);
		
		System.out.println(student);
		System.out.println(student2);
		System.out.println(student3);
	}
}
