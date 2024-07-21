package com.practice.javain;

public class Constructors {
	String name1;
	Integer w;
	
	//1.default constructors are created by compiler
	
	//2.No-argument constructor
	Constructors(){
		System.out.println("No argument is meant for writing logic only \n and also called non-parameterized constructor ");
	}
	
	Constructors(String name,int weight){
		this.name1=name;
		this.w=weight;
		System.out.println("detail of person = "+name +","+ weight);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Constructors obj=new Constructors();
		Constructors obj1=new Constructors("Divya",62);
		Constructors obj2=new Constructors("Raj",65);
		
		
	}

}
