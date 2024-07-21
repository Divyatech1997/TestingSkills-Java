package com.interview.code.in;

public class StringOccurancesOfChar {

	public static void main(String[] args) {
		String s= "Java programming";
		int Total_length=s.length();
		int Length_AfterRemovingA=s.replace("m", "").length();
		
		int CharCount=Total_length-Length_AfterRemovingA;
		System.out.println(CharCount);
		
		
	}

}
