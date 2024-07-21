package com.keywords;

public class StaticKeywithoutMainMethod {
	
	/*Static key: If we supposed to use common methods & variables for all classes,then 'Static' keyword is used in those methods and variables'
	 *Features:
	 *        No need to create Object for access static variabels & methods.
	 *        Static method can't access non-static methods & variable directly.
	 *        Non-static method can access everything.
	 *
	 *Same class:
	 *      sysout(i);
	 *      method();
	 *      
	 *Different class:
	 *      sysout(classname.variable);
	 *      classname.methodname();
	 *         
	 */

	static StringBuffer val=new StringBuffer("Welcome");
	
	static int i=100;
	int j=10;
	
	public static void method() {
		System.out.println("I am static method");
		//System.out.println(j);
	}
	
	public void method2() {
		System.out.println("I am non-static method");
		System.out.println(i);
		method();
	}
	
/*	public static void main(String[] args) {
		//static
		System.out.println(i);
		method();
		
		//System.out.println(j);   [shows error as non-static variable can't be accessed directly in main method]
		
		
		
		StaticKeywithoutMainMethod obj = new StaticKeywithoutMainMethod();
		//non-static
		System.out.println(obj.j);
		obj.method2();
		
		
	
	}*/
	
	
	

}
