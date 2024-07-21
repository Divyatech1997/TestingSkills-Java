package com.practice.constructor;

import com.practice.javain.Constructors;

public class ConstructorsP {
	String name1;
	String w;
	static String height;
	
	//1.default constructors are created by compiler
	
	//2.No-argument constructor
	
	/*ConstructorsP(){
		System.out.println("No argument is meant for writing logic only \n and also called non-parameterized constructor ");
		
	}*/
	
	ConstructorsP(){
		System.out.println("Parent class");
	}
	
	ConstructorsP(String name,String weight){
		
		this.name1=name;
		this.w=weight;
		System.out.println("detail of person = "+name +","+ weight);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstructorsP obj=new ConstructorsP();
		ConstructorsP obj1=new ConstructorsP("Divya","62kg");
		ConstructorsP obj2=new ConstructorsP("Raj","65kg");
		
		//ConstructorChild obj3=new ConstructorChild("Radiv", "15kg");
		

	}

}
