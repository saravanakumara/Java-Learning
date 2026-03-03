package core;

import java.util.HashSet;

public class HashSetDemo {

	public static void main(String[] args) {
		// Backed by HashMap
		// Default size is 16
		// Resize to double when it reaches the 75% capacity based on this load factor Threshold = OldCapacity * .75 => 12, while inserting 13 th data resize will happen.
		// It will not maintain insertion order
		// No duplicates allowed & only one null is allowed
		// value will not be updated if already present, returns false.
		// It stores values into hash key and dummy value is added
		// Read -> O(1) if linkedlist -> O(n), tree -> O(log n) for worst case
		// Add -> O(1) if linkedlist -> O(n), tree -> O(log n)
		// Delete ->  O(1) if linkedlist -> O(n), tree -> O(log n)
		
		HashSet<String> hs = new HashSet<>();
		hs.add(null);
		hs.add("0");
		hs.add("1");
		hs.add("2");
		hs.add("30");
		hs.add("40");
		hs.add("50");
		hs.add("60");
		System.out.println("Size: " + hs.size());
		for(String s : hs) {
			System.out.println(s);
		}
		hs.add(null);
		hs.add(null);
		hs.remove("2");
		System.out.println("Size: " + hs.size());
		for(String s : hs) {
			System.out.println(s);
		}
	}

}
