package com.lambdaExpressions;

import java.util.function.Predicate;

public class FunctionalInterfacesForLambda {
	/* Pre-defined functional Interfaces for invoke Lambda expressions:
	 *         1]PREDICATE
	 *         2]FUNCTION
	 *         3]CONSUMER
	 *         4]SUPPLIER
	 *         
	 * These FI's are in "java.util.function" package(in-built).
	 * 
	 * 
	 */

	public static void main(String[] args) {
		/*Predicate: 
		 *   Comparable interface- Checks Only condition.
		 *   Single Argument is allowed.            
		 *               
		 *   Contains only one Abstract Method
		 *   Method name inside this interface is 'test'
		 *   Return type of this method is 'Boolean'
		 *   
		 *Prototype:
		 *   interface Predicate<>{
		 *   public abstract boolean test(object i);
		 *   }
		 * 
		 */
		
		//Integer comparison
		Predicate<Integer> p=i->(i>10);
		System.out.println(p.test(10));
		
		//String comparision
		Predicate<String> ps=s->(s.length()>5);
		System.out.println(ps.test("Divya"));
		
		//Array comparison - Directly we can't compare instead, use foreach & if 
		String ar[]= {"java","selenium","Testng","Github","Maven"};
		for(String n:ar) {
			if(ps.test(n)) {
				System.out.println(n);
			}
		}
		
		
		
	}

}
