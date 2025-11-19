package logics;

import java.util.LinkedHashMap;
import java.util.Map;

public class CompressString {

	public static void main(String[] args) {
		String s = "aabbcccddddeeeee";
		compressString(s);
		compressStringUsingHashMap(s);
		compressString2(s);
	}

	private static void compressStringUsingHashMap(String s) {
		if(s == null || s.length() == 0) {
			System.out.println("string is empty or null");
			return;
		}
		
		StringBuffer sb = new StringBuffer();
		Map<Character, Integer> fMap = new LinkedHashMap<>();
		
		for(int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			fMap.put(c, fMap.getOrDefault(c, 0) + 1);
		}
		
		for(Map.Entry<Character, Integer> e : fMap.entrySet()) {
			sb.append(e.getKey()).append(e.getValue());
		}
		
		System.out.println(sb.toString());
	}

	private static void compressString(String s) {
		if(s == null || s.length() == 0) {
			System.out.println("string is empty or null");
			return;
		}
		StringBuffer sb = new StringBuffer();
		char prev = s.charAt(0);
		int count = 0;
		for(int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if(prev == c) {
				count++;
			} else {
				sb.append(prev).append(count);
				count = 1;
				prev = c;
			}

			if(i == s.length() - 1) { 
				sb.append(c).append(count); 
			}

		}
		System.out.println(sb.toString());
	}

	private static void compressString2(String s) {
		if(s == null || s.length() == 0) {
			System.out.println("string is empty or null");
			return;
		}
		StringBuffer sb = new StringBuffer();
		int count = 1;
		for(int i = 0; i < s.length(); i++) {
			if(i + 1 < s.length() && s.charAt(i) == s.charAt(i + 1)) {
				count++;
			} else {
				sb.append(s.charAt(i)).append(count);
				count = 1;
			}

		}
		System.out.println(sb.toString());
	}
}
