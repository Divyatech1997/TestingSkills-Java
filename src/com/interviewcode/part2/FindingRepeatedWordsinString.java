package com.interviewcode.part2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class FindingRepeatedWordsinString {

	public static void main(String[] args) {
		String s="I am learning java java and oops concepts learning";
		String ar[]=s.split(" ");
		
		System.out.println(ar.length);
		System.out.println(Arrays.toString(ar));
		Map<String,Integer> map=new HashMap<String,Integer>();
		Integer count=1;
		
		for(int i=0;i<ar.length;i++) {
			
			if(map.containsKey(ar[i])) {
				map.put(ar[i], map.get(ar[i])+count);   //get=value of keyi.e count
			}else if(!map.containsKey(ar[i])) {
				map.put(ar[i], count);
			}
		}
		
		for(String x:map.keySet()) {
			System.out.println(x+" "+map.get(x));
		}
		
		
	}

}
