package logics;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class CheckAnagram {
	public static void main(String[] args) {
		String input1 = "silent".toLowerCase();
		String input2 = "iltsne".toLowerCase();
		//Anagram: the same word is formed by re-arranging the letters of another word

		if(input1 == null || input2 == null) 
			System.out.println("It is not an Anagram");

		if(input1.length() != input2.length())
			System.out.println("It is not an Anagram");

		System.out.println(isAnagramByHashMap(input1, input2));
		System.out.println(isAnagramByAscii(input1, input2));
		System.out.println(checkAnagramOrNot(input1, input2));
		
	}
	public static boolean isAnagramByHashMap(String input1, String input2) {
		//Build frequency map
		//Check the other word characters in the map and reduce the occurrence when we get the count
		//Loop the frequency map for left over

		//Build frequency map
		HashMap<Character, Integer> fMap = new HashMap<>();

		for(int i = 0; i < input1.length(); i++) {
			char c = input1.charAt(i);
			fMap.put(c, fMap.getOrDefault(c, 0) + 1);
		}

		//Now reduce the frequency map
		for(int i = 0; i < input2.length(); i++) {
			char c = input2.charAt(i);
			Integer count = fMap.get(c); //for null check used wrapper class
			if(count == null) {
				//System.out.println("Not an Anagram");
				//break;
				return false;
			}
			if(count == 1)
				fMap.remove(c);
			else
				fMap.put(c, count - 1);
		}

		//if(fMap.isEmpty()) {
		//	System.out.println("It is an Anagram");
		//} else {
		//	System.out.println("Not an Anagram");
		//}
		return fMap.isEmpty();
	}
	
	/*
	Time:
	Total length of characters 'n' & unique characters 'k'
	For building frequency map is,
		- Normal case, O(n)
		- Worst case, collisions occurred. put will take (log n) time. So O(n log n).

	For checking frequency map,
		- Normal case, O(n)
		- Worst case, collisions occurred. put/get will take (log n) time. So O(n log n).

	Total: O(n log n)

	Space:
	Adding distinct characters in map - O(k)

	*/
	
	public static boolean isAnagramByAscii(String input1, String input2) {
		//Only Alpha characters -> small characters ASCII starting from 97 & capital characters starting from 65.
		int[] countArray = new int[26];
		
		for(int i = 0; i < input1.length(); i++) {
			char c1 = input1.charAt(i);
			char c2 = input2.charAt(i);
			
			countArray[c1 - 'a'] = countArray[c1 - 'a'] + 1;
			countArray[c2 - 'a'] = countArray[c2 - 'a'] - 1;
		}
		
		for(int count : countArray) {
			if(count != 0) {
				//System.out.println("It is not an Anagram");
				//break;
				return false;
			}
		}
		//System.out.println("It is an Anagram");
		return true;
	}
	/*
	Time:
	Total length of characters 'n' & unique characters '26'
	For building array is,
		- O(n) time to update the count for n character string
		- Read each char from string1 O(1)
		- Read each char from string2 O(1)
		- Value update/add in integer array is O(1)
		- O(n)
	For checking the integer array for non zero elements
	 	- We will loop thorough maximum 26 times and early returning when it meets non zero value. So worst condition is O(26)
	 	- O(1)	
	Total: O(n)

	Space:
	Adding distinct characters in map - O(26) -> O(1)

	*/
	
	private static boolean checkAnagramOrNot(String s1, String s2) {
		// TODO Auto-generated method stub
		if(s1 == null || s2 == null) {
			return false;
		}
		if(s1.length() == 0 || s2.length() == 0) {
			return false;
		}
		if(s1.length() != s2.length()) {
			return false;
		}
		//1. HashMap
		HashMap<Character, Integer> fMap = new HashMap<>();
		
		for(int i = 0; i < s1.length(); i++) {
			char c = s1.charAt(i);
			fMap.put(c, fMap.getOrDefault(c, 0) + 1);
		}
		
		for(int i = 0; i < s2.length(); i++) {
			char c = s2.charAt(i);
			fMap.put(c, fMap.getOrDefault(c, 0) - 1);
		}
		
		Iterator<Map.Entry<Character, Integer>> it = fMap.entrySet().iterator();
		while(it.hasNext() ) {
			Map.Entry<Character, Integer> e = it.next();
			if(e.getValue() != 0) {
				return false;
			}
		}
		return true;
	}
}


