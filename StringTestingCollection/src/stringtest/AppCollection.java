package stringtest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Stack;
import java.util.stream.Collectors;

public class AppCollection {
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printIterator();
		
		
		
	}

	private static void printIterator() {
		
		
		// create array list object
	      List<String> countries = new LinkedList<String>();

	      // populate the list
	      countries.add("Apple");
	      countries.add("Bush");
	      countries.add("Cello");
	      countries.add("Date");
	      countries.add("Font");

	      System.out.println("The initial list is :"+countries);
	      new AppCollection().printlist(countries);
	      // reverse the list
	      Collections.reverse(countries);

	      System.out.println("The Reverse List is :"+countries);
		
		  
		  
		 // new AppCollection().printlist(countries);
		  //Collections.reverse(countries);
		 // Collections.sort(countries);
		  //Collections.reverseOrder();
		 // Collections.reverse(countries);
		  //Collections.reverse(countries);
		  System.out.println("-----------------Sorted------------------ ");
		  new AppCollection().printlist(countries);
		  Collections.sort(countries);
		  new AppCollection().printlist(countries);

	}
	
	private void printlist(List<String> list) {
		System.out.println("*****************************************"); 
		ListIterator<String>  iterator  =   list.listIterator(); // oly list types stack vector linked list array 
         
         //System.out.println(iterator);
         
         while(iterator.hasNext()) {
        	 
        	 System.out.println(iterator.next());
         }
         
         System.out.println("*****************************************");
	}

	private static void linkedListcreate() {
		  List<String> countries = new LinkedList<>();
		  countries.add("Hungary");
		  countries.add("Poland");
		  countries.add("USA");
		  countries.add("Thailandy");
		  countries.add("Egypt");
		  countries.add("Russia");
		  
		 // new AppCollection().listLinKList(countries);
				  
		  countries.add(2, "Gemrmany");
		  
		  countries.set(3, "United States of America ");
		  
		  countries.remove("Egypt");
		  
		  
		  new AppCollection().listLinKList(countries);
		  
		  
		  
		  List<String> hcountries = new ArrayList<>();
		  hcountries.add("Magyar");
		  hcountries.add("Lenygel");
		  hcountries.add("Amerika");
		  hcountries.add("Thaiföld");
		  hcountries.add("Egyiptom");
		  hcountries.add("Orosz");
		  
		  new AppCollection().listLinKList(hcountries);
		
	}


	private  void listLinKList(List<String> countries) {
		  System.out.println("-------------------------------------");
		for (String countrie : countries) {
		       System.out.println(countrie);	
		 	}
		  System.out.println(countries);
		  System.out.println("-------------------------------------");
	}

	
	private static void stack() {
		Stack<Integer> demo = new Stack<Integer>();
		  
		
		  demo.push(12);
		  demo.push(8);
		  demo.push(7);
		  demo.push(9);
		  demo.push(8);
		  demo.push(2);
		  
		  
		  System.out.println("Peek :"+ demo.peek());
		  System.out.println("Size :"+demo.size());
		  System.out.println("Postion "+demo.search(7));
	}

}
