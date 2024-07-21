package com.practice.javain;

public class Looping {
	
	
	public void for_Loop() {
		for(int i=0;i<25;i++) {
			System.out.println("Loop should repeat until it satisfies the condition ");
				}
		System.out.println("----------------------------------------------------");
	}
	
	public String while_Loop() {
		int i=0;
		while(i<10) {
			System.out.println("Loop should repeat until it satisfies the condition ");
			i++;
			
		}System.out.println("----------------------------------------------------");
		return "I am a while loop";
		}
	
	
	public String do_While_Loop() {
		int i=0;
		do {
			System.out.println("Loop should repeat until it satisfies the condition ");
			i++;
		}while(i<15);
		System.out.println("----------------------------------------------------");
		return "I am do-while";
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Looping obj=new Looping();
		obj.for_Loop();
		obj.while_Loop();
		obj.do_While_Loop();

	}

}
