package com.interview.code.in;

import java.util.Arrays;

public class ArrayBubbleSort {

	public static void main(String[] args) {
		int a[]= {90,56,78,23,99,12,34};
		System.out.println("Before sorting :"+Arrays.toString(a));
		for(int i=0;i<a.length-1;i++) {
			for(int j=0;j<a.length-1;j++) {
				if(a[j]>a[j+1]){
			int tem=a[j];
			a[j]=a[j+1];
			a[j+1]=tem;
				}
			}
		}System.out.println("After sorting :"+Arrays.toString(a));
	}

}
