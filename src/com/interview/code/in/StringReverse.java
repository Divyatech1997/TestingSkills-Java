package com.interview.code.in;

public class StringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name="SELENIUM";
		String rev = "";
		
	/*	//using string logic
		int l=name.length();
		for(int i=l-1;i>=0;i--) {
			rev = rev + name.charAt(i);
		}
		System.out.println(rev);
		
		
		//using char array
		char[] a=name.toCharArray();
		int len=a.length;
		for(int i=len-1;i>=0;i-- ) {
			rev = rev + a[i];
		}
		System.out.println(rev);*/
		
		
		//using String buffer and builder
		StringBuffer sb= new StringBuffer(name);
		StringBuffer r=sb.reverse();
		System.out.println(r);
		
		

	}

}
