package core;

import java.util.Collections;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapDemo {

	public static void main(String[] args) {
		// Thread-safe, bucket level synchronized, fine grained locking - only for specific bucket when collision occurs
		// It is better than Collections.synchronizedmap();
		// Used key, value pairs
		// Default size is 16
		// resized when it reaches to 75% of its size
		// newCapacity is doubled when it reaches the capacity to oldCapacity * 0.75
		// null key/value & duplicate keys are not allowed and value is updated
		// Duplicate value are allowed
		// Read -> O(1) if linkedlist -> O(n), tree -> O(log n)
		// Add -> O(1) if linkedlist -> O(n), tree -> O(log n)
		// Delete -> O(1) if linkedlist -> O(n), tree -> O(log n)
		// No insertion order
		// No null key or values, no duplicates keys allowed and value updated. Dont know whether null key or null value, multiple thread can alter it and dont know which one
		// But in HashMap - single thread application we can manage the thread alteration
		
		ConcurrentHashMap<String, String> chm = new ConcurrentHashMap<>();
		//chm.put(null, "null value"); // NullPointerException is error
		// chm.put("null key", null);//
		chm.put("s1", "s1");
		chm.put("s1", "s11"); //Value updated
		chm.put("s2", "s2");
		chm.put("s3", "s3");
		chm.put("s4", "s3");
		System.out.println(chm.size());
		for(Map.Entry<String, String> entr : chm.entrySet()) {
			System.out.println("key: " + entr.getKey() + ", value: " + entr.getValue());
		}
//		output:
//			key: s3, value: s3
//			key: s4, value: s3
//			key: s1, value: s11
//			key: s2, value: s2
		chm.remove("s1");
		System.out.println(chm.size());
		for(Map.Entry<String, String> entr : chm.entrySet()) {
			System.out.println("key: " + entr.getKey() + ", value: " + entr.getValue());
		}
//		output:
//			key: s3, value: s3
//			key: s4, value: s3
//			key: s2, value: s2
		
	}

}
