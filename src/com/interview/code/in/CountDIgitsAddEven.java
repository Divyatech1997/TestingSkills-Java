package com.interview.code.in;

public class CountDIgitsAddEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Long num = 57855548l;
		Long remainder;
		
		int odd = 0;
		int even = 0;
		
		while(num!=0) {
			remainder= num%10;
			
			if(remainder%2==0) {
				even++;
			}else {
				odd++;
			}
			num = num/10;
		}
		
		System.out.println("count of even digits :"+even );
		System.out.println("count of odd digits :"+odd);

	}

}
