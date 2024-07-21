package com.interview.code.in;

public class ArrayFindingMisssingnum {

	public static void main(String[] args) {
		int a[]= {21,23,24,25,26,27,28};
		int sum=0;
		int v=0;
		
		for(int i=0;i<a.length;i++) {
			sum=sum+a[i];
		}System.out.println("Actual number: "+sum);
		
		for(int j=21;j<=28;j++) {
			v=v+j;
		}System.out.println("original number: "+v);
		
		System.out.println("Missing number : "+(v-sum));
	}

}
