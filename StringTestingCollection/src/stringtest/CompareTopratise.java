package stringtest;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;


class Names implements Comparable<Names> {
	
	private String name;

	public Names(String name) {
		this.name = name;
	}

	@Override
	public int compareTo(Names o) {
		
		int a = name.length(); 
		int b = o.name.length();

	    if (a == b ) return 0;
	 
		return  (a < b) ? 1 : -1;
		
//		if(name.length() == o.name.length())  {
//		  return 0;
//		}
//		else if (name.length() < o.name.length()) {
//			return -1; 
//		}
//		else {
//			return 1;
//		}
	}

	@Override
	public String toString() {
		return "Names [name=" + name + "]";
	}
} 

public class CompareTopratise {

	public static void main(String[] args) {
		CompareTopratise comp = new CompareTopratise();
		List<Names> elements = new LinkedList<>();
		
		elements.add(new Names("Chaand"));
		elements.add(new Names("Ed"));
		elements.add(new Names("John"));	
		elements.add(new Names("Mia"));
		elements.add(new Names("Apes"));
		elements.add(new Names("Gabor"));
		
		comp.printlist(elements);
		Collections.sort(elements);
		comp.printlist(elements);
		
	}
	
	
	
	private void printlist(List<Names> list) {
		System.out.println("*****************************************"); 
		ListIterator<Names>  iterator  =   list.listIterator(); // oly list types stack vector linked list array 
         
         //System.out.println(iterator);
         
         while(iterator.hasNext()) {
        	 
        	 System.out.println(iterator.next());
         }
         
         System.out.println("*****************************************");
	}



	@Override
	public String toString() {
		return "CompareTopratise []";
	}


}
