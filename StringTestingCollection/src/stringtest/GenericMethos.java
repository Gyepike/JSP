package stringtest;

import java.util.ArrayList;
import java.util.List;


class DataM {

	public <E> void printList(List<E> list) {
		// TODO Auto-generated method stub
		System.out.println("----------------------------");
		System.out.println("printing List ");
		for (E element : list) {
			
			System.out.println(element);
		}
		System.out.println("----------------------------");
		System.out.println("Printing List ");
	}
	
	public <E >void printArrayList(ArrayList<E> arrayList) {
		System.out.println("Printing ArrayList ");
		System.out.println("----------------------------");
		for (E element : arrayList) {
			
			System.out.println(element);
		}
		System.out.println("----------------------------");
		System.out.println("Printing ArrayList ");
	}
	
	public <E >void printArray(E[] array) {
		System.out.println("Printing Array ");
		System.out.println("----------------------------");
		for (E element : array) {
			
			System.out.println(element);
		}
		System.out.println("----------------------------");
		System.out.println("Printing Array");
	}

}

public class GenericMethos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         List<Object> list = new ArrayList<Object>();
         list.add("Alma");
         list.add("Szolo");
         list.add("Korte");
         list.add(1);
         list.add("?");
         
         Object [] anArray = new Object  [10];
         anArray[0] = 45; 
         anArray[1] = 25;
         anArray[2] = 11; 
         anArray[3] = 8.0; 
         anArray[4] = "SSS"; 
         anArray[5] = '*'; 
         
         String[] text = {"one","two","tree"}; 
         
         DataM datam = new DataM ();
         
     
         datam.printList(list);
         datam.printArray(anArray);
         
 
         
	}

}
