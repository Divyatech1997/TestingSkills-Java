package com.wrapperclass;

public class WrapperClassDemo {
	/* Wrapper class: Holding variables & methods of specific 'primitive' datatype.
	 * Types: Integer,Float,Double,Short,Long,Boolean & Character.
	 * 
	 * Features:
	 * 		String is not a "wrapper class". String,Array,String buffer,list,set & map are 'pre-defined' classes.
	 * 		Generics <> must be Wrapper class, not be primitive data type.
	 * 		If we use concat "+" for wrapper class,will adds up whereas ,if we use concat "+" for string class,will not addsup.
	 */

	public static void main(String[] args) {
		
		//Wrapper classes
		Integer i=100;
		Character c='a';
		Long l=90238977366554l;
		Short s=9088;
		Float f=89.90F;
		Double d=897.6634258;
		Boolean b=true;
		
		
		//String classes
		String is="90";
		String cs="r";
		String bs="false";
		String fs="198.89";
		String ds="564.67";
		
		
		
		//Converting Wrapper class->String
		System.out.println(String.valueOf(i));
		
		String ws=String.valueOf(c);
		System.out.println(ws);
		
		String ls=String.valueOf(l);
		System.out.println(ls);
		
		System.out.println(String.valueOf(b));
		
		//Converting String to wrapper class
		Integer cw=Integer.parseInt(is);
		System.out.println(cw);
		
		//can't convert String to Character wrapper class
		
		Boolean bw=Boolean.parseBoolean(bs);
		System.out.println(bw);
		
		Float fw=Float.parseFloat(fs);
		System.out.println(fw);
		
		
		//If we use concat "+" for wrapper class,will adds up
		System.out.println(l+f);
		
		//If we use concat "+" for string class,will not addsup
		System.out.println(fs+ds);
		
	}

}
