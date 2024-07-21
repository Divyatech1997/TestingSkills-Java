package com.exception.handling;

import java.util.Scanner;

public class UncheckedException {

	public static void main(String[] args) {
		System.out.println("Program started");
		String name = null;
		try {
			System.out.println(name.length());
		}catch(NullPointerException e) {
			System.out.println("Null pointer Exception is handled");
			System.out.println(e.getMessage()); //exception detail is printed sysout can be applicable
		}catch(ArithmeticException e) {
			System.out.println("Arithmetic Exception is handled");
			System.out.println(e.getMessage()); //exception detail is printed sysout can be applicable
		}catch(IndexOutOfBoundsException e) {
			System.out.println("Arithmetic Exception is handled");
			System.out.println(e.getMessage()); //exception detail is printed sysout can be applicable
		}
		
		
		
		//finally block
		
		int n1=5;
		int n2=0;
		try {
		int n3=n1/n2;
		System.out.println(n3);
		}catch (Exception e) {
			e.printStackTrace();  //exception detail is printed sysout can't applicable
			System.out.println("Invalid input");
		}
		finally {
			System.out.println("Finally is used for closing files and exit from docs ");
		}
		
		
		
		
		System.out.println("Program is finshed...");
	}

}
