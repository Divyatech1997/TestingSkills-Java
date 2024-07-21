package com.interview.code.in;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayReadAndWriteInConsole {

	public static void main(String[] args) {
		
		
		/*Homogenous input
		 int ar[]=new int [5];
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<ar.length;i++) {
			System.out.println("Enter array element for "+i+" position :");
		    ar[i]=sc.nextInt();
		}
		System.out.println("Array input :"+Arrays.toString(ar));*/
		
		//Heterogenous input
		Object ar[]=new Object[5];
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<ar.length;i++) {
			System.out.println("Enter array element for "+i+ " position");
			ar[i]=sc.next();
		}
		System.out.println("Array input :"+Arrays.toString(ar) );

	}

}
