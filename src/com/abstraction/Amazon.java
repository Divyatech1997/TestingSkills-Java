package com.abstraction;

public class Amazon extends Abstraction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Abstraction obj=new Amazon();
		obj.paymentFunction();
		int a=obj.number;
		a=10;
		System.out.println(a);
	}

	@Override
	public void SearchFunctionality() {
		// TODO Auto-generated method stub
		System.out.println("Amazon code");
		
	}

	@Override
	public void loginFunctio() {
		// TODO Auto-generated method stub
		System.out.println("Amazon code");
		
		
	}

	@Override
	void paymentFunction() {
		// TODO Auto-generated method stub
		System.out.println("Amazon code");
		
		
	}

}
