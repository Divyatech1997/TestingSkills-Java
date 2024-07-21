package com.interview.code.in;

public class ArrayLinearSearch {

	public static void main(String[] args) {
		int a[]= {34,89,76,45,12,9};
		int n=9;
		boolean status=false;
		
		
		for(int i=0;i<a.length;i++) {
			if(a[i]==n) {
				status=true;
				System.out.println(a[i]+" is found");
				break;
			}
		}
		if(status==false) {
			System.out.println(n+" is not found");
		}
		
		
		
		
		
		
		
		
	}
	
	

}
