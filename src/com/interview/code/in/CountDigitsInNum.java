package com.interview.code.in;

public class CountDigitsInNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Long num = 68665544l;
		Long remainder;
		int count = 0;
		
		while(num!=0) {
			num = num/10; 
			count++; 
		}
		
		System.out.println(count);
	}

}
