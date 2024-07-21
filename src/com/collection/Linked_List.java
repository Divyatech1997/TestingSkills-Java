package com.collection;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Linked_List {

	public static void main(String[] args) {
		/*LinkedList : Same as arraylist
		 * Diff: Best suited for insertion and deletion and worst for search operation
		 * Implements serializable and clonable interfaces
		 */
		
		
		List<Integer> ll = new LinkedList<Integer>();
		ll.add(78);
		ll.add(67);
		ll.add(34);
		ll.add(9889080);
		
		
		List<Integer> ll1 = new LinkedList<Integer>();
		System.out.println(ll1.addAll(ll));
		ll1.add(897);
		System.out.println(ll1);
		
		ListIterator<Integer> it = ll1.listIterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		
		
		
	}

}
