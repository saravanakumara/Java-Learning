package core;

import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		// LinkedList backed by doubly linked list
		// Insertion order is maintained
		// Each node will have the reference of previous and next node pointers
		// It can be list or deque. Its the implementation for List & Deque
		// No default size. Its value stored in non contiguous memory.
		// Duplicate values, null values are allowed
		// Add at first -> O(1)
		// Add at last -> O(1)
		// Remove at first -> O(1), no shifting required so it can be used for modification purpose.
		// Remove at last -> O(1)
		// Read at index -> O(n)
		// Add at index -> O(n)
		// Delete at index -> O(n)
		// random access is slow
		// Memory overhead is high compare to ArrayList because of prev, next pointers
		
		LinkedList<String> ll = new LinkedList<>();
		ll.add(null);
		ll.add("ll1");
		ll.add("ll2");
		ll.add("ll3");
		ll.add("ll4");
		ll.add("ll5");
		ll.add("ll6");
		ll.add("ll6");
		ll.add("ll6");
		ll.add(null);
		ll.add(null);
		ll.add(null);
		System.out.println(ll.size());
		for(String s : ll) {
			System.out.println(s);
		}
		ll.remove(0);
		System.out.println(ll.size());
		for(String s : ll) {
			System.out.println(s);
		}
		System.out.println(ll.get(0));
	}

}
