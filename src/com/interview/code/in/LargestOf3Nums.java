package com.interview.code.in;

import java.util.Scanner;

public class LargestOf3Nums {

	public static void main(String[] args) {
		//int a=90,b=78,c=45;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter int a :");
		int a =sc.nextInt();
		System.out.println("Enter int b :");
		int b =sc.nextInt();
		System.out.println("Enter int c :");
		int c =sc.nextInt();
		
		
	/*	int largest = a>b?a:b;
		int biggest = largest>c?largest:c;
		System.out.println("Largest of all 3 is "+biggest);*/
		
		if(a>b && a>c) {
			System.out.println("a is largest");
		} else if(b>a && b>c ){
			System.out.println("b is largest");
		}else {
			System.out.println("c is largest");
		}
		
	}

}
