package com.keywords;
class B{
	String flower="sunflower";
	String colour="yellow";
	
	void superMethod() {
		System.out.println("hello!!!");
	}
	
}
public class SuperKey extends B {
	// Super : This keyword points to Parent class variable and method. 
	
	String flower="lilly";
	String colour="white";
	
	void superMethod() {
		super.superMethod();
		System.out.println(super.flower+"  "+super.colour);
	}
	

	public static void main(String[] args) {
		SuperKey obj=new SuperKey();
		System.out.println(obj.flower+"  "+obj.colour );
		obj.superMethod();
		
	}

}
