package stringtest;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Vector;

class Test {

	private static void listTesting() {
		List<String> values2 = new Vector();

		List<Integer> values = new ArrayList<Integer>();

		values.add(1020);
		values.add(206);
		values.add(206);
		values.add(206);
		values.add(14);
		values.add(99);

		values2.add("");
		values2.add("");
		values2.add("alma");
		values2.add("alma");

		System.out.println(values2);
		System.out.println(values);

		Iterator<Integer> itr = values.iterator();

		System.out.println(itr.next());

		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

	private static void stringTest() {
		// TODO Auto-generated method stub
		int a = 12;

		// NON synchronized
		StringBuilder sb = new StringBuilder();

		long startTme = System.currentTimeMillis();

		for (int i = 0; i < 1000000; i++) {
			sb.append("hello");
		}

		long endTme = System.currentTimeMillis();

		long duration = endTme - startTme;

		System.out.println("Time " + duration);
		// synchronized

		StringBuffer sbuff = new StringBuffer();

		startTme = System.currentTimeMillis();

		for (int i = 0; i < 1000000; i++) {
			sbuff.append("hello");
		}

		endTme = System.currentTimeMillis();

		duration = endTme - startTme;

		System.out.println("Time " + duration);

		String str1 = "FB";
		String str2 = "Ea";

		System.out.println(str1.hashCode() + " egyforma néha hashcode equas a biztos !!" + str2.hashCode());
		System.out.println(str1);

		String s3 = new String("java");
		String s4 = new String("java");

		s4.toLowerCase();
		s3 = "c++";
		System.out.println(s3 + " " + s4);
	}
}

class Customer {

	private static void testQueeue() {
		// listTesting();
		Queue<Customer> queue = new LinkedList(); // natural order normal que works like lnkdlist
		Deque<Customer> q2 = new ArrayDeque();
		PriorityQueue<Integer> q3 = new PriorityQueue<Integer>();

		Customer a = new Customer("barna");
		Customer b = new Customer("barna");
		Customer c = null;

		queue.add(new Customer("barna"));

		queue.add(null);
		queue.add(null);

		queue.add(b);
		queue.add(c);

		System.out.println(queue);

		q2.add(a);
		q2.add(b);
		q2.add(b);

		q3.clear();

		q3.add(8);
		q3.add(11);
		q3.add(1);
		q3.add(4);
		q3.add(2);

		System.out.println(q2);

		System.out.println(q3.comparator());
	}

	public Customer(String name) {
		this.name = name;
	}

	public String name;

	@Override
	public String toString() {
		return "Customer [name=" + name + "]";
	}
}

public class Hello {

	public static void main(String[] args) {
		// Collection <Integer> values = new ArrayList ();
         objectArray();
	}

	private static void objectArray() {
		Object[] a = new Object[5]; 
         
         a[0] = new Student("Alma");
         a[1] = new Employee("FA");
         a[2] = 2.3;
         
          System.out.println((Student) a[0]);
          System.out.println((Employee) a[1]);
          System.out.println(a[2]);
	}

}
