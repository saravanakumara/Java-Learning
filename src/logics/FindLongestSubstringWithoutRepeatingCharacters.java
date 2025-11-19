package logics;

import java.util.HashSet;

public class FindLongestSubstringWithoutRepeatingCharacters {

	public static void main(String[] args) {
		String s = "fffff";
		findLongestSubstringWithoutRepeatingCharacters(s);

	}

	private static void findLongestSubstringWithoutRepeatingCharacters(String s) {
		if(s == null || s.length() == 0) {
			System.out.println("string is empty or null");
			System.out.println("0");
			return;
		}
		HashSet<Character> set = new HashSet<>();
		int maxLength = 0;
		int start = 0;
		int end = 0;
		
		while(end < s.length()) {
			char endChar = s.charAt(end);
			char startChar = s.charAt(start);
			if(!set.contains(endChar)) {
				set.add(endChar);
				maxLength = Math.max(maxLength, end - start + 1);
				end++;
			} else {
				set.remove(startChar);
				start++;
			}
		}
		
		System.out.println(maxLength);
		
	}

}
