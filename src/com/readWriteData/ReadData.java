package com.readWriteData;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ReadData {

	public static void main(String[] args) throws IOException {
		//Approach-1
		/*FileReader fw=new FileReader("C:\\\\Users\\\\Public\\\\Documents\\\\FileWriting.txt");
		BufferedReader bw=new BufferedReader(fw);
		String str;
		while((str=bw.readLine())!=null) {
			System.out.println(str);
		}*/
		
		
		//Approach-2
		File f=new File("C:\\\\Users\\\\Public\\\\Documents\\\\FileWriting.txt");
		Scanner sc=new Scanner(f);
		/*while(sc.hasNextLine()) {
			System.out.print(sc.next());
		}*/
		
		sc.useDelimiter("//z");
		System.out.println(sc.next());
	}

}
