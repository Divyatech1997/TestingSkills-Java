package com.collection;

import java.util.HashMap;
import java.util.Map;

public class Hash_Map {
	/* HashMap : Contains key-value pair
	 * key not be dulplicated ,value will be duplicated
	 * Only one null key-value pair is allowed.If multiple key is determined,value is overwrites, 
	 * and last value is printed
	 * Diff : Insertion order not maintained
	 */

	public static void main(String[] args) {
		Map<String,String> hm = new HashMap<String,String>();
		hm.put("Name", "Divya");
		hm.put("CompanyName", "Global Logic");
		hm.put("Year of Experiecnce", "four");
		
		System.out.println("hi "+hm.get("Name"));
		System.out.println(hm);
	}

}
