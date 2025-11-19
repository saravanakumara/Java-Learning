package logics;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class IBM1 {

	public static void main(String[] args) {
		String sent = "this is a java program"; //this is a java program and not a good program;
		String received = "java program"; //"java program not good";
		
		for(String s : findTheMissingWordsInSameOrder(sent, received)) {
			System.out.print(s + " ");
		}
		
//		System.out.println();
//		for(String s : findTheMissingWordsInSameOrderWithHashMap(sent, received)) {
//			System.out.print(s + " ");
//		}
		
//		System.out.println();
//		for(String s : findTheMissingWordsInSameOrderWithArrayList(sent, received)) {
//			System.out.print(s + " ");
//		}
	}

	private static List<String> findTheMissingWordsInSameOrder(String sent, String received) {
		List<String> result = new ArrayList<>();
		if(sent == null || received == null) {
			return result;
		}
		if(sent.length() == 0 || received.length() == 0) {
			return result;
		}
		
		String[] se = sent.split(" ");
		String[] rx = received.split(" ");
		int j = 0;
		for(int i = 0; i < se.length; i++) {			
			if(j < rx.length && !se[i].equalsIgnoreCase(rx[j])) {
				result.add(se[i]);
			} else {
				j++;
			}			
		}
		return result;
	}
	private static List<String> findTheMissingWordsInSameOrderWithArrayList(String sent, String received) {
		List<String> result = new ArrayList<>();
		if(sent == null || received == null) {
			return result;
		}
		if(sent.length() == 0 || received.length() == 0) {
			return result;
		}
		
		String[] se = sent.split(" ");
		String[] rx = received.split(" ");
		ArrayList<String> aa = new ArrayList<>();		
		
		for(String str : se) {
			aa.add(str);
		}
		
		for(String str : rx) {
			if(aa.contains(str)) {
				aa.remove(str);
			}
		}
		
		for(String st : aa) {
			result.add(st);
		}
		
		return result;
	}

	private static List<String> findTheMissingWordsInSameOrderWithHashMap(String sent, String received) {
		List<String> result = new ArrayList<>();
		if(sent == null || received == null) {
			return result;
		}
		if(sent.length() == 0 || received.length() == 0) {
			return result;
		}
		
		String[] se = sent.split(" ");
		String[] rx = received.split(" ");
		
		Map<String, Integer> map = new LinkedHashMap<>();
		
		for(String str : se) {
			map.put(str, map.getOrDefault(str, 0) + 1);
		}
		
		for(String str : rx) {
			if(map.containsKey(str)) {
				int count = map.get(str);
				if(count > 1) {
					map.put(str, count - 1);
				} else {
					map.remove(str);
				}
			}
		}
		
		for(Map.Entry<String, Integer> e : map.entrySet()) {
			if(e.getValue() == 1) {
				result.add(e.getKey());
			}
		}
		
		return result;
	}
}
