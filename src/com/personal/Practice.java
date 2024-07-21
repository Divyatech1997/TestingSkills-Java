package com.personal;

import java.util.Arrays;

public class Practice {
	
	
	public void swap2num() {
		int a=12;
		int b=17;
		int tem;
		
		/*tem=a;
		a=b;
		b=tem;
		System.out.println("swaping of a & b is :"+a+" "+b);
		
		a=a+b; //29
		b=a-b; //29-17=12
		a=a-b;  //29-12=17
		System.out.println("swaping of a & b is :"+a+" "+b);
		
		a=a*b; 
		b=a/b; 
		a=a/b;
		System.out.println("swaping of a & b is :"+a+" "+b);*/
		
		b=a+b-(a=b);  //29-17=12
		System.out.println("swaping of a & b is :"+a+" "+b);
	}
	
	public void reverseNum() {
		int n=1234;
		int rev=0;
		
		while(n!=0) {
			rev = rev*10 +n%10;    
			n=n/10;
		}
		System.out.println("Reverse nu : "+rev);
		
		/*StringBuffer sb= new StringBuffer();
		sb.append(n);
		StringBuffer r=sb.reverse();
		System.out.println("Reverse number : "+r);*/
	}
	
	String v;
	public void stringReverse(String v) {
		this.v=v;
		
		/*System.out.print("Reverse of String : ");
		for(int i=v.length()-1;i>=0;i--) {
			System.out.print(v.charAt(i));
		}*/
		
		StringBuilder sb=new StringBuilder();
		sb.append(v);
		StringBuilder re=sb.reverse();
		System.out.println("Reverse of String : "+re);
	}
	
	
	public void palindromeNum() {
		int num=87878;
		int Original=num;
		int rev=0;
		while(num!=0) {
			rev = rev*10 + num%10;
			num = num/10;
		}
		if(Original==rev) {
			System.out.println("It is a palindrome number...");
		}else {
			System.out.println("Not a palindrome number...");
		}
	}
	
	public int digitCounting() {
		int n= 456423452;
		int count=0;
		int digit;
		while(n!=0) {
			digit=n%10;
			n=n/10;
			count++;
		}
		return count;
	}
	
	public void numOfOddAndEvenDigits() {
		int n=574533326;
		int Enum;
		int odd=0;
		int even=0;
		while(n!=0) {
			Enum=n%10;
			if(Enum%2==0) {
				even++;
			}else {
				odd++;
			}
			n=n/10;
				}
		System.out.println("Odd digits: "+odd);
		System.out.println("Even digits: "+even);	
	}

	public int largestOf3Num() {
		int a=9808,b=3345,c=4356;
		int lar=a>b?a:b;
		int Largest=lar>c?lar:c;
		return Largest;
	}
	
	public void fabinnociSeries() {
		int n1=0;
		int n2=1;
		int sum;
		System.out.print(n1+" "+n2+" ");
		for(int i=0;i<=15;i++) {
			sum=n1+n2;
			n1=n2;
			n2=sum;  //If we have to assign n2 & n2 have to be changed then first assign n2 value before changing its value.
			System.out.print(n2+" ");
			
		}System.out.println();
	}
	
	
	public void stringCharOccurance() {
		String s="Java Learning";
		int s1=s.length();
		int s2=s.replaceAll("a", "").length();
		System.out.println("Character occurances of 'a' :"+(s1-s2));
	}
	
	public void stringFindDuplicateChar() {
		String n="Hello";
		String lc=n.toLowerCase();
		boolean status=false;
		for(int i=0;i<lc.length()-1;i++) {
			for(int j=i+1;j<lc.length();j++) {
				if(n.charAt(i)==n.charAt(j)) {
					System.out.println("Duplicate found :"+n.charAt(i));
					status=true;
				}
			}
		}if(status==false) {
			System.out.println("Duplicate not found...");
		}	
	}
	
	public void reverseString() {
		String n1="JAVA";
		System.out.print("Reverse string : ");
		for(int i=n1.length()-1;i>=0;i--) {
			System.out.print(n1.charAt(i));
		}System.out.println();
	}
	
	public void arrayFindMaxMin() {
		int ar[]=new int[5];
		ar[0]=76;
		ar[1]=16;
		ar[2]=234;
		ar[3]=45;
		ar[4]=21;
		int max=ar[0],min=ar[0];
		
		/*Approach-1
		 * Arrays.sort(ar);
		System.out.println("Smallest number : "+ar[0]);
		System.out.println("Largest number : "+ar[ar.length-1]);*/
		
		//Approach-2
		 for(int i=1;i<ar.length;i++) {
			if(ar[i]>ar[0]) {
				max=ar[i];
			}
		}System.out.println("Maximum number : "+max);
		
		for(int j=1;j<ar.length;j++) {
			if(ar[j]<min) {
				min=ar[j];
			}
		}System.out.println("Minimum number : "+min);	
	}
	
	
	public void arrayMissingNum() {
		int a[]= {45,46,47,49,50,51,52};
		int actual=0;
		int correct=0;
		
		for(int i=0;i<a.length;i++) {
			actual=actual+a[i];
		}
		for(int j=45;j<=52;j++) {
			correct=correct+j;
		}
		System.out.println("Missing number of array : "+(correct-actual));
	}
	
	public void arrayDuplicates() {
		int a[]= {36,56,78,90,34,21,3,90};
		
		//Approach-1
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
		boolean status=false;
		for(int i=0;i<a.length-1;i++) {
			if(a[i]==a[i+1]) {
				status=true;
				System.out.println("Duplicate found : "+a[i]);
			}
		}if(status==false) {
			System.out.println("Duplicate not found");
		}
		
		
		//Approach-2
		/*boolean status=false;
		for(int i=0;i<a.length-1;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]==a[j]) {
					status=true;
					System.out.println("Duplicate found : "+a[i]);
				}
			}
		}
		if(status==false) {
			System.out.println("Duplicate not found");
		}*/
	}
	
	public void reverseNumber() {
		int a=8346;
		int rev=0;
	
		while(a>0) {
			rev=(rev*10) + (a%10);
			a=a/10;
		}System.out.println("Reverse of number is : "+rev);
		}
	
	public void fabinacciSeries1() {
		int n1=0,n2=1;
		System.out.print(n1+" "+n2+" ");
		int sum;
		for(int i=0;i<=15;i++) {
			sum=n1+n2;
			n1=n2;
			n2=sum;
			System.out.print(n2+" ");
		}System.out.println();
		}
	
	public void factorial() {
		int a=3;
		int factorial=1;
		for(int i=a;i>1;i--) {
			factorial=factorial*i;
		}System.out.println("Factorial of "+a+" is : "+factorial);
	}
	
	
	public static void main(String[] args) {
		
		Practice obj = new Practice();
		obj.swap2num();
		obj.reverseNum();
		obj.stringReverse("Dream");
		obj.palindromeNum();
		System.out.println("Number of digits in a num : "+obj.digitCounting());
		obj.numOfOddAndEvenDigits();
		System.out.println("Largest of 3 numbers is : "+obj.largestOf3Num());
		obj.fabinnociSeries();
		obj.stringCharOccurance();
		obj.stringFindDuplicateChar();
		obj.reverseString();
		obj.arrayFindMaxMin();
		obj.arrayMissingNum();
		obj.arrayDuplicates();
		obj.reverseNumber();
		obj.fabinacciSeries1();
		obj.factorial();
		}

}
