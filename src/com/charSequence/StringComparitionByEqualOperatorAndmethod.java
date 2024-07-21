package com.charSequence;

public class StringComparitionByEqualOperatorAndmethod {

	public static void main(String[] args) {
		/*String can be created by 2 methods
		 * (If duplicate values needs to be created,)
		 *          1]by String Literal - Points to the value,instead of allocating new memory
		 *          2]by new keyword - Allocates new memory,instead of pointing values
		 */
		
		/* "==" -> operator compares TWO OBJECTS
		 * "equals()" -> method compared TWO VALUES in the two objects
		 */
		
		String s1="hello"; //String literal
		String s2="hello";
		
		String s3=new String("hello");  //new keyword
		String s4=new String("hello");
		String s5=s3;
		String s6=s2;
		
		//case1
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		System.out.println("----------------------");
		
		//case2
		System.out.println(s3==s4);
		System.out.println(s3.equals(s4));
		System.out.println("----------------------");
		
		//case3
		System.out.println(s1==s3);
		System.out.println(s1.equals(s3));
		System.out.println("----------------------");
		
		//case4
		System.out.println(s3==s5);
		System.out.println(s3.equals(s5));
		System.out.println("----------------------");
			
		
		
	}

}
