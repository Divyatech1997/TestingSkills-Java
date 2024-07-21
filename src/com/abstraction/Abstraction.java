package com.abstraction;

public abstract class Abstraction {
	
	
	public int number;
	public abstract void SearchFunctionality();

	public abstract void loginFunctio();
	abstract void paymentFunction();
	
	public void registerFunctionality() {
		System.out.println("Register details to login into application");
	}


	
}
