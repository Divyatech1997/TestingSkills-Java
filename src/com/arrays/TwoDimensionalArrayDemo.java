package com.arrays;

public class TwoDimensionalArrayDemo {

	public static void main(String[] args) {
		//Two-dimensional array- storing row and column
		
	/*	int ar[][] = new int[2][3];
		ar[0][0]=12;
		ar[0][1]=13;
		ar[0][2]=14;
		ar[1][0]=120;
		ar[1][1]=140;
		ar[1][2]=150;*/
		
		int ar[][]= {{100,200},{560,908},{567,343},{321,345}};
		
	/*	//Two forloops are used to print rows and columnn
		for(int r=0;r<2;r++){
			for(int c=0;c<3;c++) {
				System.out.print(ar[r][c]+"  ");
			}
			System.out.println();
		}*/
		
		
		System.out.println("Print Only Rows : "+ar.length);
		System.out.println("Print Only 0th Coloumn : "+ar[0].length);
		System.out.println("Print Only 1th Coloumn : "+ar[1].length);
		
		for(int r=0;r<ar.length;r++) {
			for(int c=0;c<ar[r].length;c++) {
				System.out.print(ar[r][c]+"  ");
			}
			System.out.println();
		}
		
		
		
		
		
	}

}
