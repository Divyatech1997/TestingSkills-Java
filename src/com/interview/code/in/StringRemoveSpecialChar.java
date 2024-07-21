package com.interview.code.in;

public class StringRemoveSpecialChar {

	public static void main(String[] args) {
		String s= "#$%$$@&^&& Java Program@)0708";
		s=s.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(s);
	}

}
