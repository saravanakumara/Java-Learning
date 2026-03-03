package core;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {

	public static void main(String[] args) {
		// Used key, value pairs
		// Default size is 16
		// resized when it reaches to 75% of its size, threshold = oldcapacity * 0.75
		// newCapacity = oldCapacity * 2
		// Only one null key is allowed
		// Duplicate values can be stored
		// Read -> O(1) if linkedlist -> O(n), tree -> O(log n)
		// Add -> O(1) if linkedlist -> O(n), tree -> O(log n)
		// Delete -> O(1) if linkedlist -> O(n), tree -> O(log n)
		// No insertion order
		// Internally uses array of buckets (Node<K,V>[] table), is used to store at each index.
		// Node<k, V>[] table
		// Each index position is called a bucket.
		//A bucket can contain:
		//null
		//one Node
		//LinkedList of Nodes
		//Tree of Nodes
		//		table[5] => Node1 → Node2 → Node3
		//		Bucket size = 3
		//		If bucket size reaches 8 AND capacity ≥ 64 
		//		Then:
		//		LinkedList → Red Black Tree
		// Node {int hash, key, value, next node pointer of linkedlist}
		// It is an implementation of map interface
		// Hash collision will occur when hashcode of the keys are same, it will uses the same index and it will compare the values, if not matched new node will be added to the list.
		// Internally it will use LinkedList for upto bucket size is 8, then it will store in Tree structure.
		// linkedlist size is >= 8 && capacity >= 64 ==> Treefication; this tree will be converted to linkedlist when tree size is less than 6.
		// hashcode = key.hashcode
		// hash spreading to mix higher order bits to lower order bits to avoid collision
		// hash = hash ^ (hashcode >>> 16)
		// index = hash & (capacity - 1) //lower order bits, capacity is always 2 powers
		//table[index] == null, insert new node at index
		// If the same index is computed for different keys and already has items at the index collision occurred, so it will added to linkedlist
		// Compare hash
		// If hash same → compare equals()
		//		
		// If equals() true → replace value
		//		
		// Else → go to next node
		//		
		// If no match → append new node
		
		//During resize, the old index values are not again rehashed.
		//It will check the hash of the old key, [new index should be calculated by hash & (newcapacity - 1) but the trick is
		//checks the old capacity place bit
		//if the bit is 0, keep old index itself
		//if the bit is 1, new index is oldindex + oldcapacity]
		//override both equals() & hashcode() -> HashMap may allow duplicate logical keys and retrieval may fail
		//No thread-safe
		
		
		HashMap<String, String> hm = new HashMap<>();
		hm.put(null, "null");
		hm.put("1", "null");
		hm.put(null, "null99");
		hm.put("2", "null");
		hm.put("3", "3");
		hm.put("4", "4");
		hm.put("5", "5");
		
		hm.put("5", "55");
		hm.put("6", "55");
		hm.put("Test", "55");
		hm.put("Abc", "ABC");
		hm.put("Aazs", "AAZS");
		hm.put("0Azs", "0AZS");
		System.out.println(hm.size());
		for(Map.Entry<String, String> entr : hm.entrySet()) {
			System.out.println("key: " + entr.getKey() + ", value: " + entr.getValue());
		}
		
//		output:
//		key: null, value: null99
//		key: 1, value: null
//		key: 2, value: null
//		key: 3, value: 3
//		key: Abc, value: ABC
//		key: 4, value: 4
//		key: 5, value: 55
//		key: Test, value: 55
//		key: 6, value: 55
//		key: Aazs, value: AAZS
//		key: 0Azs, value: 0AZS
		
		System.out.println(hm.get(null)); //null99
		hm.remove(null);
		for(Map.Entry<String, String> entr : hm.entrySet()) {
			System.out.println("key: " + entr.getKey() + ", value: " + entr.getValue());
		}
//		output:
//		key: 1, value: null
//		key: 2, value: null
//		key: 3, value: 3
//		key: Abc, value: ABC
//		key: 4, value: 4
//		key: 5, value: 55
//		key: Test, value: 55
//		key: 6, value: 55
//		key: Aazs, value: AAZS
//		key: 0Azs, value: 0AZS
		
	}

}
