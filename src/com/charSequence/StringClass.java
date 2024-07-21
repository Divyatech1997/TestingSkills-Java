package com.charSequence;

import java.util.Arrays;

public class StringClass {
	Long a=8988776667l;
	String name="Divya";
	String name1=new String("Radiv krishna");
	String name2="Raj";
	
	public void stringMethods() {
		System.out.println(name.charAt(2));
		System.out.println(name.contains("a"));
		System.out.println(name.equalsIgnoreCase("divya"));
		System.out.println(name.indexOf("y"));
		System.out.println(name.isEmpty());
		System.out.println(name.length());
		System.out.println(name1.concat(" Krishna"));
		System.out.println(name2.concat("kumar"));
		System.out.println(name.replace(name, "cute girl"));
		System.out.println(name.replaceAll(name1, name));
		System.out.println("Substring : "+name1.substring(6));
		System.out.println(name2.substring(0, 2));
		System.out.println("substring - "+name1.substring(6,12));
		System.out.println(name.toLowerCase());
		System.out.println(a.toString());
		
		//split is used to multiple the parts of the string based on it's DELIMETER and words.
		//split by space-" "
		String[] s=name1.split(" ");
		for(String names:s) {
			System.out.println("Split string using space : "+names);
		}
		//split by char-"i"
		String ar[]=name1.split("i");
		System.out.println("split the string using char : "+Arrays.toString(ar));
		//split by delimeter-"@"
		String email="divya@gmail.com";
		String mail[]=email.split("@");
		System.out.println("Split the string by delimeter : "+mail[0]);
		
		
		
		//for joining special caharacters multiple times in a single shot
		System.out.println(String.join("-","Divya", "is","confident"));
		String date=String.join("/", "07","08","1997");
		System.out.println(date);
		
		
		//Use multiple in-built methods
		String values="hello!!!";
		//replace l->a,!->#
		System.out.println("Multiple In-built methods : "+values.replace("l", "a").replace("!", "#"));
		
		
		
		
		
		//SubString
		System.out.println("If we use single index,will print values next to index : "
				+values.substring(5));
		System.out.println("Extract substring : "+values.substring(5, 8));
		
		
		
		
		
	
	
	
	
	
	
	
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringClass obj=new StringClass();
		obj.stringMethods();

	}

}
