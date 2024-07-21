package com.keywords;

class A{
	String flower="lilly";
	String colour="white";
}

public class ThisKey extends A {
	/* 'this' keyword : points to Class/Child variable, If name of class & local variables/Parent-child class variables are similar.
	 * 
	 */
	ThisKey(){
	String flower;
	String colour;
	}
	void methodInheritance() {
		System.out.println(flower +"  "+colour);
	}
	
	ThisKey(String flower,String colour){
		this.flower=flower;
		this.colour=colour;
	}
	
	 void method(String flower,String colour) {
		this.flower=flower;
		this.colour=colour;
		System.out.println(flower+"  "+colour);
	}
	
	public static void main(String[] args) {
		A aobj = new A();
		System.out.println(aobj.flower +" "+aobj.colour);
		ThisKey ob=new ThisKey();
		ob.methodInheritance();
		ThisKey obj=new ThisKey("Sunflower","Yellow");
		System.out.println(obj.flower);
		System.out.println(obj.colour);
		
		obj.method("Rose", "red");
	}

}
