package core;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapDemo {

	public static void main(String[] args) {
		// Used key, value pairs
		// Default size is 16
		// resized when it reaches to 75% of its size
		// Threshold = oldCapacity * 0.75
		// NewCapacity = oldcapacity * 2
		// Only one null key is allowed index 0 is reserved for null key
		// Duplicate values can be stored
		// Read -> O(1) if linkedlist -> O(n), tree -> O(log n)
		// Add -> O(1) if linkedlist -> O(n), tree -> O(log n)
		// Delete -> O(1) if linkedlist -> O(n), tree -> O(log n)
		// Maintained insertion order
		
		LinkedHashMap<String, String> lhm = new LinkedHashMap<>();
		lhm.put(null, null);
		lhm.put(null, "null update for same key");
		lhm.put("Test1", "t");
		lhm.put("A", "A");
		lhm.put("b", "b");
		lhm.put("z", "z");
		lhm.put("AA", "AA");
		lhm.put("BB", "AA");
		System.out.println(lhm.size());
		for(Map.Entry<String, String> entr : lhm.entrySet()) {
			System.out.println("key: " + entr.getKey() + ", value: " + entr.getValue());
		}
		
		//Output:
		//		key: null, value: null update for same key
		//		key: Test1, value: t
		//		key: A, value: A
		//		key: b, value: b
		//		key: z, value: z
		//		key: AA, value: AA
		//		key: BB, value: AA
		
		lhm.remove("AA");
		System.out.println(lhm.size());
		for(Map.Entry<String, String> entr : lhm.entrySet()) {
			System.out.println("key: " + entr.getKey() + ", value: " + entr.getValue());
		}
//		output:
//			key: null, value: null update for same key
//			key: Test1, value: t
//			key: A, value: A
//			key: b, value: b
//			key: z, value: z
//			key: BB, value: AA
	}

}
