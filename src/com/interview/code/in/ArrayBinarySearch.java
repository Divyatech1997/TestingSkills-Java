package com.interview.code.in;

import java.util.Arrays;

public class ArrayBinarySearch {

	public static void main(String[] args) {
		int a[]= {4,5,6,7,9,8,10,11,12};   //must be sorting order
		int num=8;
		int L=0;
		int H=a.length-1;
		boolean status=false;
		
		
		Arrays.sort(a);
	while(L<=H) {	
		int m=(L+H)/2;
		
			if(a[m]==num) {
				System.out.println("Element found :"+a[m]);
				status=true;
				break;
			}
			if(a[m]<num) {
				L=m+1;
			}if(a[m]>num) {
				H=m-1;
			}
		}
	
	if(status==false) {
		System.out.println("Element not found");
	}
	}

}
