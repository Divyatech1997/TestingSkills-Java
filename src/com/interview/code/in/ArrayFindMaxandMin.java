package com.interview.code.in;

public class ArrayFindMaxandMin {

	public static void main(String[] args) {
		int a[]= {78,12,56,34,76,90};
		
		/*Approach-1
		 * Arrays.sort(ar);
		System.out.println("Smallest number : "+ar[0]);
		System.out.println("Largest number : "+ar[ar.length-1]);*/
		
		//Approach-2
		/*int max=a[0];
		for(int i=1;i<=a.length-1;i++) {
			if(a[i]>max) {
				max=a[i];
			}
		}System.out.println("Maximum number of array : "+max);*/
		
		int min=a[0];
		for(int i=1;i<=a.length-1;i++) {
			if(a[i]<min) {
				min=a[i];
			}
		}System.out.println("Minimum number of array : "+min);
		
		
		
		
	}

}
