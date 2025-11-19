package logics;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class FindDuplicateCharacters {

	public static void main(String[] args) {
		String s = "Learn java programming";
		findDuplicateCharacters(s);
	}

	private static void findDuplicateCharacters(String s) {		
		if(s == null || s.length() == 0) {
			System.out.println("string is empty or null");
			return;
		}
		
		Map<Character, Integer> fMap = new HashMap<>();		
		for(int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if(c != ' ') {
				fMap.put(c, fMap.getOrDefault(c, 0) + 1);
			}
		}
		
		System.out.print("Duplicate characters in: " + s + " ");
		for(Map.Entry<Character, Integer> e : fMap.entrySet()) {
			if(e.getValue() > 1) {
				System.out.print(e.getKey() + ": " + e.getValue() + " ");
			}
		}
		System.out.println();
	}

}
