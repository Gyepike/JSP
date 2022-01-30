package com.anti.integershort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class IntegerShort {

	private static void arrayload() {

		Integer[] intArray = { 1, 2, 3, 4, 5 };
		Double[] doubleArray = { 1.1, 2.2, 3.3, 4.4 };
		Character[] charArray = { 'H', 'E', 'L', 'L', 'O' };

		System.out.println("Array integerArray contains:");
		Util.printArray(intArray); // pass an Integer array

		System.out.println("\nArray doubleArray contains:");
		Util.printArray(doubleArray); // pass a Double array

		System.out.println("\nArray characterArray contains:");
		Util.printArray(charArray); // pass a Character array

	}

	private static void shortintlist() {
		ArrayList<Integer> intList2 = new ArrayList<>(Arrays.asList(15, 3, 7, 9, 10));
		System.out.println("List Integer :");
		System.out.println("-----Before Short-----");
		Util.printArrayList(intList2);
		System.out.println("-----------------------");
		Collections.sort(intList2);
		System.out.println("-----After Short-----");
		Util.printArrayList(intList2);
		System.out.println("-----------------------");
	}

	
	private static void stringArrayList() {
		ArrayList<String> music = new ArrayList<>(Arrays.asList("bubu", "alama", "cedrus", "kakoscsiga", "anime", "Munyo", "Munyi", "acmi","baba"));
		System.out.println("Array List String :");
		System.out.println("-----Before Short-----");
		Util.printArrayList(music);
		System.out.println("-----------------------");
		System.out.println("-----After Short-----");
		Collections.sort(music);
		Util.printArrayList(music);
		System.out.println("-----------------------");
	}
	
	public static void main(String[] args) {
		//stringArrayList();
		//arrayload();
		//shortintlist();
		String a = "baba";
	    String b = "aaba";
	    String c = "baba";
	    
	    
	    
	    System.out.println(a.equals(b));
	    System.out.println(a.compareTo(b));
	    		
	}

	

}
