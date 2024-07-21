package com.interviewcode.part2;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class StringFirstNonRepeatedChar {

	public static void main(String[] args) {
		String s="swiss";
		Integer count=1;
		Map<Character,Integer> map=new LinkedHashMap<Character,Integer>();
		for(int i=0;i<s.length();i++) {
			if(!map.containsKey(s.charAt(i))) {
				map.put(s.charAt(i), count);
			}else if(map.containsKey(s.charAt(i))) {
				map.put(s.charAt(i), map.get(s.charAt(i)+1));
			}
			}
		
		for(Entry m:map.entrySet()) {
			if(m.getValue()==count) {
				System.out.println("First repeated char of string is : "+m.getKey());
				break;
			}
		}
		
		
		}
	}


