package com.collection;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Tree_set {

	public static void main(String[] args) {
		/*TreeSet : Duplicates not allowed
		 * Dif: Insertion is in sorted(ascending order)
		 * 		Only Homogenous data are allowed
		 * 		Null is not allowed
		 */
		
		Set<String> ts = new TreeSet<String>();
		ts.add("Java");
		//ts.add(89);
		ts.add("Selenium");
		ts.add("Maven");
		ts.add("Testng");
		ts.add("Cucumber");
		ts.add("Java");
		//ts.add("8900");
		//ts.add(null);
		//ts.add('c');
		
		Set<String> ts1 = new TreeSet<String>();
		System.out.println(ts1.addAll(ts));
		Iterator it = ts1.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		
		}
		
		
	}

}
