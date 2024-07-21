package com.interviewcode.part2;

import java.util.Arrays;

public class StringReverseWords {

	public static void main(String[] args) {
		String s="we are learning java";
		String ar[]=s.split("\\s");
		
		String rev="";
		for(int i=ar.length-1;i>=0;i--) {
			rev=rev+ar[i]+" ";
		}
		System.out.println(rev);
		
	}

}
