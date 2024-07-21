package com.interview.code.in;

public class ArraySearchElement {

	public static void main(String[] args) {
		int ar[]= {86,98,65,43,45};
		int Search_Ele=65;
		boolean status=false;
		
		
		for(int i=0;i<ar.length;i++) { //repeat loop until array size
		if(ar[i]==Search_Ele) {    //compare element to be searched with array element
			System.out.println("Element found");
			status=true;
			break; //if element found jump from whole forloop	
		}
		}
		if(status==false) { //'==' must use this to compare
			System.out.println("Element not found");
		}
		
		
	}

}
