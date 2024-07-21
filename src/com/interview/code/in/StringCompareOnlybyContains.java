package com.interview.code.in;

public class StringCompareOnlybyContains {

	public static void main(String[] args) {
		String name="Radiv krishna";
		//we should not use 'equalsIgnorCase'.Instead use only 'contains'
		
		
		System.out.println(name.contains("radiv")); //false
		
		//use multiple inbuilt methods
		System.out.println(name.toLowerCase().contains("radiv"));
		
		System.out.println(name.replace('R', 'r').contains("radiv"));
		
		
		
	}

}
