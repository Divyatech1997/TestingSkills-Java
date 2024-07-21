package com.variables.datatypes.operators.in;

public class VariablesDemo {

	public static void main(String[] args) {
		/*Variable is a container stores datatypes
		 * In JAVA, 'datatype' must be represented to specify type of variable
		 * Multiple declaration+assignment of similar variable not possible
		 * We can change the variable value(last assigned value will be taken) and able to use it
		 * If we don't want to change the variable value and keep it constant,then use "final" and "constant" keywords
		 * use concatenate(+) operator to seperate from string value and print it
		 */
		
		
		
		//declaration 
		int a;
		//assignment
		a=10;
		//declaration + assignment
		int variable = 23;
		
		
		//JavaVariable = 89; [In JAVA, 'datatype' must be represented to specify type of variable]
		
		//int a = 12; [Multiple declaration of similar variable not possible]
		
		//declaration + assignment {APPROACH-1}
		int b = 15;
		int c = 17;
		int d = 19;
		
		//declaration + assignment {APPROACH-2}
		int a1,b1,c1;  //[Possible only variables having similar datatypes ]
		a1 = 15;
		b1 = 17;
		c1 = 19;
		
		//declaration + assignment {APPROACH-3}
		int a2 = 12, b2 = 17, c2 = 19; //[Possible only variables having similar datatypes ]
		
		
		//We can change the variable value
		int n = 190;
		System.out.println(n);
		n = 167;
		System.out.println(n);
		
		//final and constant keywords
		final int x = 775;
		//x=776;
		//const int y =907;
		
		
		//print variable
		System.out.println(b);
		System.out.println("Value of b : "+b); //must use + to seperate variable from string
		System.out.println("Value of b+c+d :"+(b+c+d)); //must use curly brace to perform operation in sysout
		
		
		
	}

}
