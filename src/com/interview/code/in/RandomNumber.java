package com.interview.code.in;

import java.util.Random;

public class RandomNumber {

	public static void main(String[] args) {
		Random obj=new Random();   //It is a pre-defined class
		System.out.println(obj.nextInt(5654));
		
		
		System.out.println(Math.random());   //Print only decimal random number ranges from 0.0 to 0.9.
		
	}

}
