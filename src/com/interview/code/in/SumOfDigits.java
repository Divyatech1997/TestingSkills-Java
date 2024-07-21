package com.interview.code.in;
import java.util.*;

public class SumOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number :");
		Long num=(long) sc.nextInt();
		Long sum=0l;
		while(num!=0) {
			sum=sum+num%10;
			num=num/10;
		}System.out.println(sum);
	}

}
