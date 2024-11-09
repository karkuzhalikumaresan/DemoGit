package org.test;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Employee2 {
	
	
	public static void main(String[] args) {
		
		Map<Integer, String> m = new HashMap<Integer, String>();
		
		System.out.println(m);
		
		//to add the values
		m.put(1, "Java");
		m.put(2, "Python");
		m.put(3, "Dart");
		m.put(4, "Javascript");
		
		
		System.out.println(m);
		
		Set<Entry<Integer,String>> entrySet = m.entrySet();
		
		for (Entry<Integer, String> entry : entrySet) {
//			System.out.println(entry);
//			Integer key = entry.getKey();
//			System.out.println(key);
			
			String value = entry.getValue();
			System.out.println(value);
		}
	}
}
