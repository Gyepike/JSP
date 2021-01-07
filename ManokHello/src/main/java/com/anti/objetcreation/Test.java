package com.anti.objetcreation;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Test {

	private static void instanceMethod() throws InstantiationException, IllegalAccessException, ClassNotFoundException {
		// creating object using newInstance method class
		// print the object
		// load class for instance
		Student student2 = null;
		student2 = (Student) Class.forName("com.anti.beanlifecycle.allannotation.Student").newInstance();
		student2.colg_id = 203;
		System.out.println(student2.toString());
		System.out.println("****************************");
		Student student3 = Student.class.newInstance();
		student2.colg_id = 204;
		System.out.println(student2.toString());
		System.out.println("instace() can only use public contructor withou parameter !! "
				+ "After executed it is run constructor.instance! ");
		System.out.println("****************************");
	}

	private static void normalClass() {
		System.out.println("****************************");
		Student student = new Student();
		student.colg_id = 202;
		System.out.println(student.colg_id);
		System.out.println("****************************");

	}

	public Student clone() throws CloneNotSupportedException {
		// object clobe copy same bject but different refence can update data seperated
		Student student4 = new Student();
		student4.colg_id = 78;
		Student student5 = (Student) student4.clone();
		System.out.println(student5.toString());
		System.out.println("not callaed constructor deserilaze and cloen not call constructor !!");
		
		return student5;
	}
	
	public void deserialize() throws IOException, ClassNotFoundException {
		
			FileOutputStream fos = new FileOutputStream("file.txt");
		ObjectOutputStream oos  = new ObjectOutputStream(fos);
		Student student5 = new Student();
		oos.writeObject(student5);
		
		// nincs constructor hivas mert file erkezik !!
		FileInputStream fis = new FileInputStream("file.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Student s7 = (Student) ois.readObject();
		
		System.out.println(s7);
		System.out.println("not callaed constructor deserilaze and cloen not call constructor !!");
		
	}
	
	

	private static void construcInstace() throws NoSuchMethodException, SecurityException, InstantiationException,
			IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		System.out.println("****************************");
		Constructor<Student> constr = Student.class.getConstructor(int.class);
		System.out.println(constr);
		Student student3 = constr.newInstance(15);
		// student3.colg_id = 206;
		System.out.println(student3.toString());
		System.out.println("Can use any constructor used int parameter");
		System.out.println("****************************");
	}

	public static void main(String[] args)
			throws InstantiationException, IllegalAccessException, ClassNotFoundException, NoSuchMethodException,
			SecurityException, IllegalArgumentException, InvocationTargetException, CloneNotSupportedException, IOException {
		// instanceMethod();
		// construcInstace();
		Test test = new Test();
		test.clone();
		
		// Serialization 
		
	
		// deserialize 
		
	   	test.deserialize();
		
		
	}
}
