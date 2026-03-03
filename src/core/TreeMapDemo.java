package core;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapDemo {

	public static void main(String[] args) {
		// Sorting order is maintained, default is ascending order based on keys
		// It is used to store in key value pairs
		// No default size, internally uses RedBlack tree, So no "initial capacity", no "load factor", no resizing
		// Read -> O(log n)
		// Add -> O(log n)
		// Delete -> O(log n)
		// No insertion order [based on comparator or comparable]
		// No null key, no duplicates keys allowed and value updated, null value allowed

		TreeMap<String, String> tm = new TreeMap<>();
		//tm.put(null, null);
		//tm.put(null, "Null key check");
		tm.put("null value check", null);
		tm.put("key1", "key1");
		tm.put("k2", "k2");
		tm.put("k3", "key1");
		tm.put("k4", "k2");
		System.out.println(tm.size());
		for(Map.Entry<String, String> entr : tm.entrySet()) {
			System.out.println("key: " + entr.getKey() + ", value: " + entr.getValue());
		}
		tm.put("k2", "K2");
		System.out.println(tm.size());
		for(Map.Entry<String, String> entr : tm.entrySet()) {
			System.out.println("key: " + entr.getKey() + ", value: " + entr.getValue());
		}
		
		//output:
//		key: k2, value: k2
//		key: k3, value: key1
//		key: k4, value: k2
//		key: key1, value: key1
//		key: null value check, value: null
//		5
//		key: k2, value: K2
//		key: k3, value: key1
//		key: k4, value: k2
//		key: key1, value: key1
//		key: null value check, value: null
	}

}
