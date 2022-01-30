package stringtest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

class DataClass {
	
	
	private String name;
	
	public DataClass(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "DataClass [name=" + name + "]";
	}

}


public class LambaExperssion {

	public static void main(String[] args) {
         
		List<DataClass> list = new ArrayList<>();
		
		list.add(new DataClass("Munyó"));
		list.add(new DataClass("Peti"));
		list.add(new DataClass("Munyi"));
		list.add(new DataClass("Anikó"));
		list.add(new DataClass("Mama"));
		list.add(new DataClass("Cica"));
		list.add(new DataClass("Hege"));
		list.add(new DataClass("John"));
		list.add(new DataClass("Dady"));
		
	/*	Collections.sort(list, new Comparator<DataClass>() {

		

			@Override
			public int compare(DataClass o1, DataClass o2) {
				return o1.getName().compareTo(o2.getName());
			}
			
		});
		
		*/
		
		Collections.sort(list, (DataClass o1, DataClass o2) -> {
			
			//System.out.println("Teszt");
			return  o1.getName().compareTo(o2.getName());
		}
		
		)
		;
		
		
		
	    disPlay(list);
		
		
	}

	private static void disPlay(List<DataClass> list) {
		for (DataClass element : list) {
			System.out.println(element);
		}
	}

}
