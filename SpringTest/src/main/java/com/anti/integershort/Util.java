package com.anti.integershort;

import java.util.ArrayList;
import java.util.List;

public class Util {
	
	public static <T> void printArrayList(List<T> list) {
		// Display generic elements
		for (T element : list) {
			System.out.printf("%s ", element);
		}
		System.out.println();
	}
	
	public static <T extends Song> void printArrayListLinefeed(List<T> list) {
		// Display Generic List elements
		System.out.println("Only Song class");
		for (T element : list) {
			System.out.printf("%s ", element);
			System.out.println();
		}
		System.out.println();
	}
	
	
	public static  <T>  void printArray(T[] inputArray) {
		// Display array elements
		for (T element : inputArray) {
			System.out.printf("%s ", element);
		}
		System.out.println();
	}
	
	
	protected static void intList(ArrayList<Integer> intList) {

		for (Integer outInt : intList) {
			System.out.println(outInt);
		}
	}

	protected static void strList(ArrayList<String> strList) {

		for (String outInt : strList) {
			System.out.println(outInt);
		}
		
	}
	
	


}
