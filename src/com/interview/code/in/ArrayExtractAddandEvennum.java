package com.interview.code.in;

public class ArrayExtractAddandEvennum {

	public static void main(String[] args) {
		int ar[]= {23,44,89,56,78,90,21,28};
		
		System.out.println("Even numbers of array :");
		for(int i=0;i<ar.length;i++) {
			if(ar[i]%2==0) {
				System.out.println(+ar[i]);
			}
		}
		
		
		System.out.println("Odd numbers of array :");
		for(int i=0;i<ar.length;i++) {
			if(ar[i]%2!=0) {
				System.out.println(+ar[i]);
			}
		}
		
		
		
		
	}

}
