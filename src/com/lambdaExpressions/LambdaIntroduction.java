package com.lambdaExpressions;

interface FI{
	public abstract void method(String h,String a);
}
public class LambdaIntroduction {
	/*Objective: 1)To bring the "functional programming features" as java contains object oriented programming features.
	 *           (oops contains 'classes' & 'objects', fpf contains functions & variables).
	 *           2)To improve "code optimization"/consize code.
	 *           
	 *What is lambda expression?
	 *       Is a 'Anonymous function'=>Method doesn't have NAME,RETURN TYPE & ACCESS MODIFIER.
	 *       
	 *How to invoke lambda expression?
	 *       Through 'Functional Interface'=> FI Store SINGLE ABSTRACT METHOD(SAM).
	 * 
	 * Default Functional Interface & Methods in Java:
	 * Runnable - run()
	 * Callable - call()
	 * Comparable - compareTo()
	 * ActionListener actionPerformed()
	 * 
	 */
	
	public static void main(String[] args) {
		
		FI fi=(h,d)->System.out.println("name is : "+h+" "+d);
		fi.method("hello","Divya");
		
		
		
		
	}

}


