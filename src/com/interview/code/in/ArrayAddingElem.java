package com.interview.code.in;

public class ArrayAddingElem {

	public static void main(String[] args) {
		int ar[]= {12,78,89,54,67,13,43};
		int sum=0;
		for(int i=0;i<ar.length;i++) {
			sum=sum+ar[i];
		}
		System.out.println("Sum of array is : "+sum);
	}

}
