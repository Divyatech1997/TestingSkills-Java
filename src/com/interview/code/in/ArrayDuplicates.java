package com.interview.code.in;

public class ArrayDuplicates {

	public static void main(String[] args) {
		int a[]= {32,89,67,45,89,78};
		boolean status=false;
		
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]==a[j]) {
					status=true;
					System.out.println("Duplicate element found :"+a[i]);
				}
			}
		}
		if(status==false) {
			System.out.println("Duplicate element not found.");
		}
	}

}
