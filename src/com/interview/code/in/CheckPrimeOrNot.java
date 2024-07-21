package com.interview.code.in;

public class CheckPrimeOrNot {

	public static void main(String[] args) {
		/* Prime: Number which contains only 2 factors 1 and itself
		 * Ex:
		 * 1,2,3,5,7,11...is a prime number
		 * 4,6,8,9,10,12,14..is not a prime number.
		 */
		
		int n=19;
		int count=0;
		
		if(n>1) {
		for(int i=1;i<=n;i++) {
		if(n%i==0) {
			count++;
		}
		}
			if(count<=2) {
				System.out.println("Yes,Prime number");
			}else {
				System.out.println("Not a prime number");
			}
		
		}
		else {
			System.out.println("Invalid number");
		}
		
	}

}
