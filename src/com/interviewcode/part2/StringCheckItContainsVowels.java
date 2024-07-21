package com.interviewcode.part2;

public class StringCheckItContainsVowels {

	public static void main(String[] args) {
		String str="welcome";
		int count=0;
		for(int i=0;i<str.length();i++) {
			char val=str.charAt(i);
			if( val=='a'||  val=='e' || val=='i'||val=='o'|| val=='u') {
				count++;
			}
		}System.out.println(count);
	}

}
