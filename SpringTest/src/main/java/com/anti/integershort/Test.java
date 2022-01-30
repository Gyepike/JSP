package com.anti.integershort;

public class Test {

	public static void main(String[] args) {
		Human peter = new Human(1234, "Peter");
		Human hamish = new Human(1234, "Peter");

		System.out.println(peter.hashCode());
		System.out.println(hamish.hashCode());

		String str1 = "FB";
		String str2 = "Ea";

		System.out.println(str1.hashCode() + " egyforma néha hashcode equas a biztos !!" + str2.hashCode());

		System.out.println(str1);

		
		
		
		String s3 = new String ("java");
		String s4 = new String ("java");
		
		
		s4 = s4.toUpperCase();
		s3  = "c++";
	
		System.out.println(s3+" "+s4);
		
	}

}
