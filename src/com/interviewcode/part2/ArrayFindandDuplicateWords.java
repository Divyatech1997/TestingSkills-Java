package com.interviewcode.part2;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class ArrayFindandDuplicateWords {

	public static void main(String[] args) {
		String s="I am am Divya Divya";
		
		//As we know in set Insertion order not maintained & duplicates not allowed
		
		Set<String> set=new LinkedHashSet<String>();
		String ar[]=s.split("\\s");
		
		for(String x:ar) {
			set.add(x);
		}
		
		Iterator it=set.iterator();
		while(it.hasNext()) {
			System.out.print(it.next()+" ");
		}
		
		
		
	}

}
