package com.interview.code.in;

import java.util.Arrays;
import java.util.Collections;

import javax.lang.model.type.DeclaredType;

public class ArraySorting {

	public static void main(String[] args) {
		int ar[]= {900,340,456,642,785};
		System.out.println("Before sorting : "+Arrays.toString(ar));
		
		//Ascending order
		Arrays.sort(ar);
		System.out.println("After sorting : "+Arrays.toString(ar));
		
		
		//Descending order
	/*	Arrays.sort(ar);
		System.out.print("After sorting descending order :");
		for(int i=ar.length-1;i>=0;i--) {
			System.out.print(ar[i]+"  ");
			
		}*/
		
		Integer b[]={900,340,456,642,785};  //For using collections, Array should be in wrapper class
		Arrays.parallelSort(b,Collections.reverseOrder());  
		System.out.println("After descending using collections :"+Arrays.toString(b));
		
	}

}
