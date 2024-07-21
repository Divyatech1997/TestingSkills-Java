package com.interview.code.in;

import java.util.Arrays;

public class ArraysEquality {

	public static void main(String[] args) {
		int a1[]= {2,4,6,8,10,12};
		int a2[]= {2,4,6,8,10,12};
		
		/*//Approach-1
		Boolean status=Arrays.equals(a1, a2);
		if(status==true) {
			System.out.println("Arrays are equal");
		}else {
			System.out.println("Arrays are not equal");
		}*/
		
		//Approach-2
		Boolean sta=true;
		if(a1.length==a2.length) {
			for(int i=0;i<a1.length;i++) {
				if(a1[i]!=a2[i]) {
				sta=false;
				}
			}
			if(sta==true) {
				System.out.println("Arrays are equal");
			}else if(sta==false){
				System.out.println("Arrays are not equal");
			}
			
			
		}else {
			System.out.println("Length of arrays not equal");
		}
		
		
	}

}
