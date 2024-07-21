package com.arrays;

import java.util.Arrays;

public class ArraysDemo {

	public static void main(String[] args) {
		/*Array: Is a collection of multiple values(Homogenous values),i.e.
		 * multiple values are stored in single variable.
		 * Type:
		 *     1)Single-Dimensional Array(Normal storing of Data)
		 *     2)Two-Dimensional Array(Storing Rows & Columns)
		 */
		
		
		//Syntax 1 (If we know the size of array, we can go for this syntax)
		int a[]=new int[6]; //Declaring array
		a[0]=89; //Assigning values to array
		a[1]=89;
		a[2]=78;
		a[3]=56;
		a[5]=90;
		
		//Simply print array and not use in program
		System.out.println("Array input :"+Arrays.toString(a));  
		
	/*	for(int i=0;i<a.length;i++) {  //printing array by forloop and use in program
			System.out.println(a[i]);}   */
		
		
		//Syntax 2 (If we don't know the array size,we can go for this syntax)
		String skills[]= {"Java","Selenium","TestNg","Github","API","Postman"}; //Declaration + Assignment
		for(String name:skills) {    //printing array by foreach/Enhanced forloop
			System.out.println(name);
		}
		
		
	}

}
