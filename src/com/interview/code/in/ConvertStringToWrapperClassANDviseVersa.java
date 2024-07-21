package com.interview.code.in;

public class ConvertStringToWrapperClassANDviseVersa {

	public static void main(String[] args) {
		//String
		String sb="true";
		String si="907";
		String cs="c";
		String fs="907.67";
		
		//Converting String to Wrapper class:  WrapperClass.parsePrimitivedata()
		
		Boolean wb=Boolean.parseBoolean(sb);
		System.out.println(wb);
		Float wf=Float.parseFloat(fs);
		System.out.println(wf);
		
		/*Character wc=Character.valueOf(cs); //Converting charstring to charWrapp is not possible
		System.out.println(wc);*/
		
		System.out.println(Integer.parseInt(si) + Float.parseFloat(fs)); //Wrapper class can perform addition operation.
		
		System.out.println(si + fs); //String can't perform addition operation.
		
		//Wrapper class
		Boolean b=true;
		Character c='u';
		Integer i=45;
		Short s=765;
		Float f=686.7986f;
		
		//Converting Wrapper class to String
		String bo=String.valueOf(b);
		System.out.println(bo);
		
		String co=String.valueOf(c);
		System.out.println(co);
		
		String io=String.valueOf(i);
		System.out.println(io);
		
	}

}
