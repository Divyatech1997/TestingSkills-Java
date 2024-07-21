package com.interviewcode.part2;

public class PyramidPatternPrinting {

	public static void main(String[] args) {
		
	//pattern-1 
   /* for(int i=1;i<=5;i++) {
    	for(int j=1;j<=i;j++) {
    	System.out.print("*");
    	}
    	System.out.println();
    }*/
		
		
		//pattern-2
		int k=1;
		for(int i=1;i<=5;i++) {
	    	for(int j=1;j<=k;j++) {
	    	System.out.print("*");
	    	}
	    	k=k+2;
	    	System.out.println();
	    }
		
		
	}

}
