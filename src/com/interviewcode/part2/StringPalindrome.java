package com.interviewcode.part2;

public class StringPalindrome {

	public static void main(String[] args) {
		String s="nitin";
		
		String Original=s;
		StringBuffer sb=new StringBuffer(s);
		sb.reverse();
		System.out.println(sb);
		if(Original.contains(sb)) {
			System.out.println("Given String is a palindrome");
		}else {
			System.out.println("String is not Palindrome");
		}
	}

}
