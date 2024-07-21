package com.exception.handling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CheckedException {

	public static void main(String[] args) throws InterruptedException, FileNotFoundException {
		// TODO Auto-generated method stub

		System.out.println("Program is started...");
		System.out.println("Gathering the inputs...");
		Thread.sleep(4000);
		System.out.println("Program is in progress...");
		try {
		FileInputStream fis = new FileInputStream("c://text.txt");
		}catch(FileNotFoundException e) {
			System.out.println("Exception is handled");
			System.out.println(e.getMessage());
		}
		System.out.println("Program is finshed successfuly... ");
	}

}
