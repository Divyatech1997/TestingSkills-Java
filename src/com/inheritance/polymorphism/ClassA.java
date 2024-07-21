package com.inheritance.polymorphism;

public class ClassA {

	int a=34;
	int b=45;
	int c;
	float d;
	float o;
	
	 int addition() {
		c=a+b;
		System.out.println("Addition of a and b is "+c);
		return c;
	}
	
	//overloading
	public float addition(int a,int b,int c) {
		 d=a+b+c;
		System.out.println(d);
		return d;
		
	}
	
	public void division() {
		o= (c+d)/2;
		System.out.println("division of c is "+o);
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassA obj= new ClassA();
		obj.addition();
		obj.division();
		obj.addition(23, 45, 345);

	}

}
