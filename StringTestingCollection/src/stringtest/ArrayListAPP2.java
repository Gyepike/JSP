package stringtest;

import java.util.ArrayList;

class intWrapper {
	public int intValue;
	
	public intWrapper(int intValue) {
		this.intValue = intValue;
	}

	public int getIntValue() {
		return intValue;
	}

	public void setIntValue(int intValue) {
		this.intValue = intValue;
	}

	@Override
	public String toString() {
		return "intWrapper [intValue=" + intValue + "]";
	}		
}

public class ArrayListAPP2 {
	
	

	public static void main(String[] args) {
//	   ArrayList<Integer> studentNumbers = new ArrayList<>();
//	   studentNumbers.add(45);
//	   
//	   System.out.println(studentNumbers.get(0));

		intWrapper warapper = new intWrapper(58);
	    ArrayList<intWrapper> studentNumbers = new ArrayList<>();
		
		studentNumbers.add(warapper);
		
		System.out.println(studentNumbers.get(0));
		ArrayList<Double> studentdoubleNumbers = new ArrayList<>();
		studentdoubleNumbers.add(20.4);
		System.out.println(studentdoubleNumbers.get(0));
		
	}

}
