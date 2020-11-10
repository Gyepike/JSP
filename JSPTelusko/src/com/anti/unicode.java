package com.anti;

import java.math.BigDecimal;

public class unicode {

	public static void main(String[] args) {
		//unicode table .com u utan kod 
		char ch = '\u00DC';
		System.out.println(ch);
      
		// BigDecimal igazi ponotssagert 
		 
		double x = 1.05;
		double y = 2.55;
		
		System.out.println(x+y);
		BigDecimal  d1 = new  BigDecimal("1.05");
		BigDecimal  d2 = new  BigDecimal("2.55");
		
		System.out.println(d1.add(d2));
		
		// (a+b) square = (( a *a  ) + 2 ab+ (b*b))
		int a = 25;
		float b = 42.159f;
		double value = 0;
		
		value=  (( a *a  ) + (2 * a * b) + (b*b));
		
		System.out.println("Value of float equsition "+value);
		
		int intvalue = (int) value;
		
		System.out.println("Value of float equsition " + intvalue);
		
		
	
		    
	}

}
