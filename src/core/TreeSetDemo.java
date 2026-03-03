package core;

import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		// Backed by TreeMap
		// Used to store in Red Black (like BST) tree format
		// No duplicates, null values are not used as it will compare internally so null comparison is not allowed.
		// Sorting order maintained, default ascending order
		// Read -> O(logn)
		// Add -> O(logn)
		// Delete -> O(logn)
		
		TreeSet<String> ts = new TreeSet<>();
		// ts.add(null); // NullPointerException
		ts.add("1");
		ts.add("2");
		ts.add("3");
		ts.add("4");
		ts.add("5");
		ts.add("6");
		System.out.println(ts.size());
		for(String s : ts) {
			System.out.println(s);
		}		
		//ts.add(null); // NullPointerException
		//ts.add(null); // NullPointerException
		ts.add("6");
		System.out.println(ts.size());
		for(String s : ts) {
			System.out.println(s);
		}
		
//		output:
//			6
//			1
//			2
//			3
//			4
//			5
//			6
//		
//			6
//			1
//			2
//			3
//			4
//			5
//			6
	}

}
