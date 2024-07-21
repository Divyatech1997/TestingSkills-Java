package com.interview.code.in;

public class StringReverseEachWord {

	public static void main(String[] args) {
		String s="Learning Java and Oops";
		
		//Approach-1
		for(int i=s.length()-1;i>=0;i--) {
			System.out.print(s.charAt(i));
		}System.out.println();
		
		//Approach-2
		StringBuffer sb=new StringBuffer(s);
		System.out.println(sb.reverse());
	}

}
