package com.collection;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class Tree_Map {

	public static void main(String[] args) {
		/* Tree map=> Contains only key,value pair
		 *           Key not be duplicated,value can be duplicated
		 * Diff : *Insertion order is natural sorting order(Ascending order)
		 *        *Even one Null key, value is not allowed Instead showing Null pointer Exception */
		Map<String,String> tm = new TreeMap<String,String>();
		tm.put("Company Name", "Global logic");
		tm.put("Company Id", "GL78655");
		tm.put("Num of Employees", "11234");
		tm.put("Num of Branches", "28");
		tm.put("Num of Branch", "28");
		tm.put("CEO", "Rajnath");
		tm.put("CEO", "Rajnath singh");
		//tm.put(null, "Invalid");
		System.out.println(tm);
		Map<String,String> tm1 = new TreeMap<String,String>();
		tm1.putAll(tm);
		System.out.println(tm1);
		System.out.println(tm1.size());
		System.out.println(tm1.containsKey("CEO"));
		System.out.println(tm1.containsValue("28"));
		System.out.println(tm1.get("Company Name"));
		System.out.println(tm1.isEmpty());
		System.out.println(tm1.remove("CEO"));
		System.out.println(tm1);
		System.out.println(tm1.remove("Company Id", "GL78655"));
		System.out.println(tm1);
		System.out.println(tm1.replace("Num of Employees", "28675"));
		System.out.println(tm1);
		System.out.println("Entry set : "+tm1.entrySet());
		System.out.println(tm1.keySet());
		System.out.println(tm1.values());
		System.out.println("Entry set : "+tm1.entrySet());
		
		//Iteratiion using enhanced forloop
		for(Entry k : tm1.entrySet()) {
			System.out.println(k.getKey()+"  "+k.getValue());
		}
		System.out.println("-----------------------------------");
		
		//Iteration using Iterator
		Iterator<Entry<String,String>> entry=tm1.entrySet().iterator();
		while(entry.hasNext()) {
			System.out.println(entry.next());
		}
		System.out.println("-------------------------------------");
		tm1.clear();
		System.out.println(tm1);
		
		
	}

}
