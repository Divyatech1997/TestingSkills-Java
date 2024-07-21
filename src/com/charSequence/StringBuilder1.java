package com.charSequence;

public class StringBuilder1 {
	
	
	
	StringBuilder build = new StringBuilder("Java");
	
	public void builder() {
		System.out.println(build.indexOf("a", 2));
		System.out.println(build.lastIndexOf("a", 2));
		System.out.println(build.append(" program"));
		System.out.println(build);
		System.out.println(build.insert(12, "ing"));
		System.out.println(build.substring(5, 12));
		System.out.println(build.reverse());
		//System.out.println(build.isEmpty());
	
	
	
	
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder1 obj= new StringBuilder1();
		obj.builder();
		

	}

}
