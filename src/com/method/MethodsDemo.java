package com.method;

public class MethodsDemo {
	/*Def: Block of code performs specific tasks i.e actions ready to execute
	 * Through Object we can execute methods
	 * Type:
	 *    1)void type (does'nt return value)
	 *    2)return type (return value)
	 *     
	 */
	
	int a=10,b=20;
	String name;
	String colour;
	
	//approach - 1   NO PARAMETERS, NOT RETURN VALUE
	void method() {
		System.out.println(a+b);
	}
	
	//approach - 2   NO PARAMETERS ,RETURN VALUE
	int method2() {
		return a+b;
	}
	
	//approach - 3    TAKE PARAMETERS,NOT RETURN VALUE
	void method3(String n,String c) {
		name = n;
		colour = c;
		System.out.println(n+"  "+c);
	}
	
	//approach - 4    TAKE PARAMETERS, RETURN VALUE
	String method4(String n,String c) {
		name = n;
		colour = c;
		return n+"  "+c;
	}
	
	

	public static void main(String[] args) {
		MethodsDemo obj=new MethodsDemo();
		obj.method();
		System.out.println(obj.method2());
		obj.method3("Sunflower", "yellow");
		System.out.println(obj.method4("Rose", "Red"));
		
		
	}

}
