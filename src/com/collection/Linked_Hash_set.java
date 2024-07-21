package com.collection;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class Linked_Hash_set {

	public static void main(String[] args) {
		/*Linked Hashset : Duplicates not allowed
		 * 				   Heterogenous data allowed(only if generics not used
		 * Main diff: Insertion order is maintained
		 */
		
		
		
		Set ls = new LinkedHashSet();
		ls.add("Java");
		ls.add("Selenium");
		ls.add("Cucumber");
		ls.add("Github");
		ls.add("Java");
		ls.add(null);
		ls.add("cypress");
		ls.add(89);
		ls.add('d');
		System.out.println(ls);
		
		Iterator it = ls.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
