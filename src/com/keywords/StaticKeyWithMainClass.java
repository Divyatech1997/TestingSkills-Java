package com.keywords;

public class StaticKeyWithMainClass {

	public static void main(String[] args) {
	/*If we want to access similar static method & static variable in,
	 * Same class:
	 *      sysout(i);
	 *      method();
	 *      
	 *Different class:
	 *      sysout(classname.variable);
	 *      classname.methodname();
	 */
		
		System.out.println(StaticKeywithoutMainMethod.i);
		StaticKeywithoutMainMethod.method();
		
		//Reverse the String buffer
		System.out.println("Static StringBuffer reverse : "+StaticKeywithoutMainMethod.val.reverse());
		
		
		//Likewise sysout stands for,
		System.out.println();
		/*  System=> Predefined class
		 *  out => vaiable for printstream class{static printstream out;}
		 *  println =>method for printstream class.
		 */
		
		
		
	}

}
