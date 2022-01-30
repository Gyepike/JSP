package stringtest;

import java.util.ArrayList;
import java.util.List;

class Notor  {
	
	private String name ;
	
	  public Notor(String name) {
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
		return "Notor [name=" + name + "]";
	}

}

interface Lambda3 {
	abstract public int demo3(int be);
}

public class LambdaAdv {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		final int x = 10;
		new Thread(() -> {

			System.out.println("Print x can only be final " + x);
		}

		).start();
		
		Lambda3 l = (int a) -> {
			int b = 6;
			b++;
			System.out.println("With interface " + b);

			return 10;
		};

		int y = 5;
		y++;

		System.out.println(l.demo3(y));

		

		// x++;
		

		
		List<Integer> list = new ArrayList<Integer>() ;
		list.add(4);
		list.add(5);
		list.add(40);
		list.add(11);
		list.add(14);
		list.add(7);
		
//		for (Integer elem : list) {
//			
//			System.out.println(elem);
//		}
		list.forEach((i) ->  { 
			if (  i >= 10) 
		     System.out.println(i);
		           }
				);
		
		List<Notor> list2 = new ArrayList<Notor>() ;
		list2.add(new Notor("Honda"));
		list2.add(new Notor("Skoda"));
		list2.add(new Notor("Merci"));
		list2.add(new Notor("Lada"));
		list2.add(new Notor("BMW"));
		
		list2.forEach(i ->  {
		     System.out.println(i.toString());
		          }
				)
		        ;
		
	}
}