package com.interviewcode.part2;

import java.util.Arrays;

public class StringAnagram {

	public static void main(String[] args) {
		/*Anagram: If both length & characters of two strings are equal,then the string is called anagram.
		 */
		
		String s1="Javaa";
		String s2="vajaa";
		
		char[] a1=s1.toLowerCase().toCharArray();
		char[] a2=s2.toLowerCase().toCharArray();
		
		Arrays.sort(a1);
		Arrays.sort(a2);
		if(Arrays.equals(a1, a2)) {
			System.out.println("Two Strings are anagram");
		}else {
			System.out.println("Two Strings are not anagram");
		}
	}

}
