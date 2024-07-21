package com.interview.code.in;

public class ArrayFindingDuplicates {

	public static void main(String[] args) {
		int ar[]= {78,98,78,90,54,56,78,100,78};
		int duplicate=78;
		boolean staus=false;
		int j=0;
		for(int i=0;i<ar.length;i++) {
			if(ar[i]==duplicate) {
				j++;
				staus=true;
			}
		}
		System.out.println("Number of duplicates : "+j);
		if(staus==false) {
			System.out.println("No duplicates found");
		}
		
		
		
	}

}
