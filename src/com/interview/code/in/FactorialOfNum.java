package com.interview.code.in;

public class FactorialOfNum {

	public static void main(String[] args) {
		/*Factorial : Is a function that multiplies a number by every number below it.
		 * Ex: 
		 * 5!=5*4*3*2*1=120
		 *  or
		 * 5!=1*2*3*4*5=120
		 */
		
		int n=4;
		int factorial=1;
	/*	for(int i=1;i<=n;i++) {
			factorial=factorial*i;
		}*/
		
		for(int i=n;i>=1;i--) {
			factorial=factorial*i;
		}
		
		System.out.println("Factorial of "+n+ "is : "+factorial);
		
		
		
	}

}
