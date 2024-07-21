package com.collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Hash_set {

	public static void main(String[] args) {
		/*Hashset : Insertion order not maintained
		 *          Duplicates not allowed
		 *          Heterogenous data allowed(only if generics are not used)
		 *          Insert between index not possible
		 *          Multiple null values can't be stored
		 *          Also Access or get value is not possible directly.First convert into arraylist
		 */
		
		
		
		Set<String> hs = new HashSet<String>();
		hs.add("Java");
		hs.add("Selenium");
		hs.add("Testng Framework");
		hs.add("Cucumber Framework");
		hs.add("Github");
		hs.add(null);
		hs.add(null);
		hs.add("Java");
		System.out.println("Hash : "+hs);
		
		//for loop iteration can't be done as it doesn't have "get" method
		
		//Enhanced for loop can be done to iterate
		for(String s:hs) {
			System.out.println("Enhanced for loop : "+s);
		}
		
	/* Cnverted into list to insert and access
	 	List<String> al = new ArrayList<String>(hs);
		System.out.println("List : "+al);
		System.out.println("Converted into list : "+al.get(3));*/
		
		Iterator<String> it = hs.iterator();
		while(it.hasNext()) {
			System.out.println("Using Iterator method :"+it.next());
		}
	}

}
