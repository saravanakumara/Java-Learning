package core;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class LinkedHashSetDemo {

	public static void main(String[] args) {
		// Backed by HashMap
		// Default size is 16
		// Resize - doubled when it reaches the 75% capacity based on this load factor threshold = OldCapacity * .75 => 12, while inserting 13 th data resize will happen.
		// It will maintain insertion order
		// No duplicates allowed & only one null is allowed
		// It stores values into hash key and dummy value is added
		// Add -> O(1)
		// Delete -> O(1)
		// Read -> O(n)
		
		LinkedHashSet<String> lhs = new LinkedHashSet<>();
		lhs.add(null);
		lhs.add("0");
		lhs.add("1");
		lhs.add("2");
		lhs.add("30");
		lhs.add("40");
		lhs.add("50");
		lhs.add("60");
		System.out.println("Size: " + lhs.size());
		for(String s : lhs) {
			System.out.println(s);
		}
		lhs.add(null);
		lhs.add(null);
		lhs.remove("2");
		System.out.println("Size: " + lhs.size());
		for(String s : lhs) {
			System.out.println(s);
		}
		
	}

}

//Output: 
//Size: 8
//null
//0
//1
//2
//30
//40
//50
//60
//Size: 7
//null
//0
//1
//30
//40
//50
//60
