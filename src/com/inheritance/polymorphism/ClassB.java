package com.inheritance.polymorphism;

public class ClassB extends ClassA {
	
	
	protected int addition() {
		System.out.println("I am searching for scanner to perform addition \n but unable to find");
		
		return c;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassA obj=new ClassB();
		obj.addition();
	}

}
