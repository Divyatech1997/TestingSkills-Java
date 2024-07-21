package com.interview.code.in;

import java.util.HashMap;
import java.util.Map;

public class StringCountWords {

	public static void main(String[] args) {
		String s="we are learning java";
		int count=1;
		for(int i=0;i<s.length();i++) {
			if((s.charAt(i)==' ') && (s.charAt(i+1)!=' ')) {
				count++;
			}
		}System.out.println("Number of words in a string : "+count);
	
	
	
	
	
	}

}
