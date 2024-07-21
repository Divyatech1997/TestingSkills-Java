package com.collection;

import java.util.LinkedHashMap;
import java.util.Map;

public class Linked_Hashmap {

	public static void main(String[] args) {
		/*LinkedHash Map : Contains key-value pair
		 * Diff : Insertion order is maintained
		 * Key duplicates not allowed,value duplicates allowed
		 * only one null key pair is allowed
		 */
		
		Map<String,String> lm = new LinkedHashMap<String,String>();
		lm.put("EmployeeName", "Divya");
		lm.put("EmployeeId", "788668");
		lm.put("YearOfExp", "Four");
		lm.put("YearOfExp", "4.5");
		lm.put("CurrentOrg", "Hcl");
		lm.put(null, "hi");
		lm.put(null, "InvalidData");
		System.out.println(lm);
		System.out.println(lm.containsKey("YearOfExp"));
		System.out.println(lm.get("CurrentOrg"));
		System.out.println(lm.remove(null));
		System.out.println(lm);
		System.out.println(lm.replace("EmployeeName", "Priya"));
		System.out.println(lm.replace("EmployeeName", "Priya", "Divya"));
		System.out.println(lm);
		
		
		
	}

}
