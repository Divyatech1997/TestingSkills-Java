package com.personal;

public class Interview {

	public static void main(String[] args) {
		
		/*int a[]= {1,3,53,74,5};
		int even=0;
		int odd=0;
		
		for(int i=0;i<a.length;i++) {
			
			if(a[i]%2==0) {
				even++;
				//System.out.println("Even numbers: "+a[i]);
			}else if(a[i]%2!=0) {
				//System.out.println("odd numbers: "+a[i]);
				odd++;
			}
		}System.out.println("Odd numbers :"+odd);
		System.out.println("Even numbers :"+even);*/
		
		String str="rever";
		String Original=str;
		String rev="";
		
		for(int j=str.length()-1;j>=0;j--) {
			rev=rev+str.charAt(j);
		}System.out.println(rev);
		if(rev.equals(Original)) {
			System.out.println("palindrome");
		}else {
			System.out.println("Not Palindrome");
		}
}
}