package com.interviewcode.part2;

public class StringExtractlastFourChar {

	public static void main(String[] args) {
		String s="Divyas";
		System.out.println(s.length());
		System.out.println(s.length()-4);
		System.out.println(s.length()-1);
		
		System.out.println("Last four characters of string :"+s.substring(s.length()-4, s.length()));
		System.out.println("First four characters of string :"+s.substring(0, 4));
	}

}
