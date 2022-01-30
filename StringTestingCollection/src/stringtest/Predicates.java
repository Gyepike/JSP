package stringtest;

import java.util.function.IntPredicate;

public class Predicates {
	
	static IntPredicate lessThan15 = i -> i < 15;
	static IntPredicate biggerThan12 = i -> i >= 12;

	private static void predicatExam() {
		IntPredicate lessThan18 = new IntPredicate() {

			@Override
			public boolean test(int value) {
				if (value < 18) {
					return true;
				} else {
					return false;
				}

			}
		};

		IntPredicate biggerThan10 = ((int value) -> {
			if (value < 10) {
				return true;
			} else {
				return false;
			}
		}

		);

		IntPredicate lessThan15 = i -> i < 15;
		IntPredicate biggerThan12 = i -> i >= 12;

		System.out.println(lessThan18.test(18));
		System.out.println(biggerThan10.test(4));
		System.out.println(lessThan15.test(18));

		System.out.println(biggerThan12.and(lessThan15).test(12));
	}

	
	public void predicate(int x, IntPredicate lessThan15, IntPredicate biggerThan12) {
        
           if (biggerThan12.and(lessThan15).test(12)) {
        	      System.out.println("True between 12 - 15");
           }
           else {
        	   System.out.println("False not between 12 - 15");
           }

	}
	public static void main(String[] args) {
		
         
		new Predicates().predicate(10, lessThan15,biggerThan12);
	}

}
