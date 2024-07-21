package com.interviewcode.part2;

import java.util.Iterator;

public class ArrayManipulation {

	public static void main(String[] args) {
		String[] input= {"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
		
		
		//Store output in string
	  /*  String output=null;
	    for(int i=0;i<input.length;i++) {
	    	output=input[i].replace("day", "");
	    	 System.out.println(output);
	    }*/
		
		
		//Store output in array
		String output[]=new String[input.length];
		for(int i=0;i<input.length;i++) {
			output[i]=input[i].replace("day", "");
		}
	   
		for(String x:output) {
			System.out.println(x);
		}
	}

}
