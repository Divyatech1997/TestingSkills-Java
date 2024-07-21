package com.practice.javain;

public class Demo {
	
	int a=12;
	int b=15;
	long acc_num=897657655443l;
	short roll_num=-2;
	
	float deci1=1234.90890f;
	double deci2=4884758.9887878990;
	
	
	char f='D';
	char i='I';
	char r='v';
	char s='y';
	char t='A';
	
	String vibe="Stay positive";  //wrapper class
	
	
	//return type
	public String vibes() {
		System.out.println(vibe);
		return "Always be Consistent";
	}
	
	//"\n" & "\t"
	public void myName() {
		System.out.println(f+"\t"+i+"\t"+r+"\t"+s+"\t"+t);
		System.out.println(f+"\n"+i+"\n"+r+"\n"+s+"\n"+t);
	}
	
	
	public void demo_method() {
		int c=a+b;
		Double dec=deci1-deci2;   //wrapper class
		System.out.println("Output of addition is "+c);
		System.out.println("Subraction of decimal is "+dec);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo obj=new Demo();
		obj.demo_method();
		obj.myName();
		String goal=obj.vibes();
		System.out.println(goal);
	}

}
