package com.charSequence;

public class StringBuffer1 {

	StringBuffer name = new StringBuffer("selenium");
	
	
	public void buffer() {
		System.out.println(name.append(" learning"));
		System.out.println(name);
		//System.out.println(name.reverse());
		System.out.println(name.capacity());
	//	System.out.println(name.delete(1, 5));
		System.out.println(name.insert(8, " is easy"));
	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer1 obj = new StringBuffer1();
		obj.buffer();
		
	}

}
