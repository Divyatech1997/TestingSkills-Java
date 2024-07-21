package com.interview.code.in;

public class FabinnociSeries {

	public static void main(String[] args) {
		int N1=0;
		int N2=1;
		int sum =0;
		System.out.print(N1+" "+N2);
		for(int i=0;i<30;i++) {
			sum = N1+N2; //0+1=1, 1+1=2 1+2=3 2+3=5 3+5=8
			System.out.print(" "+sum); //1 2 3 5 8
			N1 = N2; //1 1 2 3 5
			N2 = sum;//1 2 3 5 8
			// 0 1 1 2 3 5 8 13 21
		}
	}

}
