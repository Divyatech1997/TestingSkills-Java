package com.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Array_List {

	public static void main(String[] args) {
		/*ArrayList- Insertion order=>maintained
					 Duplicates => allowed
					 Heterogenous data =>allowed(if generics are not used)
					 
		Diff: Best suited for search operations & worst for Insertion and deletion 
		      Implements random access serializable and clonable interfaces
		      Multiple null values can be stored*/
		
		
		List<Character> AL = new ArrayList<Character>();
		AL.add('j');
		AL.add('a');
		AL.add('v');
		AL.add('a');
		System.out.println(AL);
		System.out.println(AL.contains('a'));
		System.out.println(AL.indexOf('a'));
		System.out.println(AL.lastIndexOf('a'));
		System.out.println(AL.isEmpty());
		//for remove one value or element
		System.out.println(AL.remove(3));
		System.out.println(AL.add('a'));
		// for remove multiple value in one shot
		List<Character> ALR = new ArrayList<Character>();
		ALR.add('a');
		ALR.add('j');
		AL.removeAll(ALR);
		System.out.println("Remove multiple values "+AL);
		//clear all values
		AL.clear();
		System.out.println(AL);
		
		AL.add('P');
		AL.add('Y');
		AL.add('T');
		AL.add(2, 'T');
		AL.add(null);
		AL.add(null);
		AL.add('H');
		AL.add('O');
		AL.add('N');
		//Iteration by forloop
		for(int i=0;i<AL.size();i++) {
			System.out.println(AL.get(i));
		}
		//Iteration by enhanced forloop
		for(Character c : AL) {
			System.out.println(c);
		}
		
		Iterator it=AL.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		
		
		
		
		
		
		
		
	/*	List<Character> arrL = new ArrayList<Character>();
		System.out.println(arrL.addAll(AL));
		System.out.println(arrL);
		System.out.println(arrL.size());
		System.out.println(arrL.get(0));
		arrL.set(3, 'i');
		System.out.println(arrL);
		
		
		
		int a[] = {233,786,876,787};
		System.out.println(a[2]);
		
		String[] ar= new String[3];
		ar[0] = "I";
		ar[1] = "can";
		ar[2] = "program";
		
		List<String> arl = new ArrayList<String>();
		arl.add("Java");
		arl.add("Selenium");
		arl.add("Testng");
		arl.add("Github");
		
		/*ListIterator<String> it = arl.listIterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}*/
		
	/*	Iterator it1 = arl.iterator();
		while(it1.hasNext()) {
			System.out.println(it1.next());
		}
		
		
		
		
	*/	
		
	}

}
