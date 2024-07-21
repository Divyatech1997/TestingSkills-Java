package com.interview.code.in;

import java.util.Scanner;

public class PalindromeNum {

	public static void main(String[] args) {
		// Palindrome number is a number that remains the same even if the 
	//	digits are reversed
		
		System.out.println("hi");
		int rev=0;
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter the number: ");
		int n=sc.nextInt();
		int Org_nu=n;
		
		while(n!=0) {
			rev = rev*10 + n%10;
			n = n/10;
			}
		if(Org_nu==rev) {
			System.out.println(Org_nu+" is a palindrome");
		}else {
			System.out.println(Org_nu+" is not a palindrome");
		}
		
		
	}

}
