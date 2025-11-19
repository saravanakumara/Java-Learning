package logics;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class PrintUniqueCharacters {

	public static void main(String[] args) {
		String s = "Java Automation";
		printUniqueChars(s);

	}

	private static void printUniqueChars(String s) {
		Set<Character> uniqueSet = new HashSet<>();
		
		for(int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if(c != ' ' && !uniqueSet.add(c)) {
				System.out.println("it is not a unique character: " + c);
			}
		}
		
		for(Character c : uniqueSet) {
			System.out.print(c);
		}
		System.out.println();
	}

}
