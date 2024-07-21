package com.interview.code.in;
import java.util.*;

public class Reversenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num=sc.nextInt();*/
		Long num = 78986898977l;
		Long rev=0l;
		while(num!=0) {
			rev = rev*10 + num%10;
			num = num/10;
		}
		System.out.println(rev);
		
	/*	//using String buffer
		StringBuffer buf= new StringBuffer(String.valueOf(num));
		System.out.println(buf.reverse());
		
		//using string builder
		StringBuilder bul= new StringBuilder();
		bul.append(num);
		System.out.println(bul.reverse());*/
		
		
		
		
		
		
		
	}

		
}
