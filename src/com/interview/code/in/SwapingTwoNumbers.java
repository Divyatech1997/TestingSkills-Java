package com.interview.code.in;

public class SwapingTwoNumbers {

	public static void main(String[] args) {
		
		int a=50;
		int b= 90;
		
		System.out.println("Before swaping a and b is "+a+ " "+b);
		
	/*	//Logic 1
		int t;
		t=a; //t=50
		a=b; //a=90
		b=t; //b=50
		System.out.println("After swaping a and b is "+a +" "+b);
		System.out.println("************************************");
		
		//logic 2 without temparory variable
		 a=a+b; //140 50+90
		 b=a-b; //50 140-90
		 a=a-b; //90 140-50
		 System.out.println("After swaping a and b is "+a +" "+b);
			System.out.println("************************************");
		
		//Logic 3 single statement
		b=a+b-(a=b);   //140-90 
		System.out.println("After swaping a and b is "+a +" "+b);*/
		
		//Logic 4 using * and division
		
		a=a*b;  //450
		b=a/b; //450/90
		a=a/b; 
		System.out.println("After swaping a and b is "+a +" "+b);	
		
			

	}

}
