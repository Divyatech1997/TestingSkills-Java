package com.readWriteData;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteData {

	public static void main(String[] args) throws IOException {
		FileWriter fw=new FileWriter("C:\\Users\\Public\\Documents\\FileWriting.txt");
		BufferedWriter bw=new BufferedWriter(fw);
		
		bw.write("Learning Java with Selenium");
		bw.write("Learning oops concepts");
		bw.write("Learning Manual testing");
		bw.close();
		
		System.out.println("Finished!!!");
	}

}
