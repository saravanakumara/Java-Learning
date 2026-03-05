package logics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String[] inputs = {"eat","tea","tan","ate","nat","bat"};
		//String[] inputs = {"eat"};
		//String[] inputs = {"eat", "eat1"};
		//String[] inputs = {"eat", "eat1", null};
		//String[] inputs = {"eat", "eat1", null, null};
		//String[] inputs = {"eat", "eat1", "", ""};
		String[] inputs = {"tea1", "ate1", ""};
		//Map<String, List<String>> outputs = new LinkedHashMap<>(); //input order maintained
		Map<String, List<String>> outputs = new HashMap<>();
		//Approach 1: Manual algorithm
		boolean[] visited = new boolean[inputs.length];
		
		for(int i = 0; i < inputs.length; i++) {
			if(visited[i] == false) {
				for(int j = 0; j < inputs.length; j++) {
					if(visited[j] == false) {
						if(i != j && isAnagram(inputs[i], inputs[j])) {
							visited[j] = true;
							constructOutPutMapIfAnagram(outputs, inputs[i], inputs[j]);
						} else {
							constructOutPutMapIfNotAnagram(outputs, inputs[i]);
						}
					}
				}
			}
			if(!visited[i]) {
				visited[i] = true;
			}
		}
		
		for(Map.Entry<String, List<String>> entry : outputs.entrySet()) {
			System.out.print(entry.getKey() + ": ");
			for(String s : entry.getValue()) {
				System.out.print(s + " ");
			}
			System.out.println();
		}
		
		//Approach 2 : Using sorting
		outputs.clear();
		String[] inputs1 = {"eat","tea","tan","ate","nat","bat"};
		for(String word : inputs1) {
			char[] cA = word.toCharArray();
			Arrays.sort(cA);
			String ss = new String(cA);
			outputs.computeIfAbsent(ss, v -> new ArrayList<>()).add(word);
		}
		System.out.println(outputs.values());
		
		//Approach 3 : without using sorting
		outputs.clear();
		String[] inputs2 = {"eat","tea","tan","ate","nat","bat"};
		for(String word : inputs2) {
			int[] iA = new int[256];
			for(int i = 0; i < word.length(); i++) {
				iA[word.charAt(i) - 'a']++;
			}
			StringBuilder sb = new StringBuilder();
			for(int i : iA) {
				sb.append("#").append(i);	
			}
			String key = sb.toString();
			outputs.computeIfAbsent(key, v -> new ArrayList<>()).add(word);
		}
		System.out.println(outputs.values());
	}
	
	private static void constructOutPutMapIfNotAnagram(Map<String, List<String>> outputMapRef, String key) {
		if(!outputMapRef.containsKey(key)) {			
			List<String> newList = new ArrayList<>();
			newList.add(key);
			outputMapRef.put(key, newList);
		}		
	}

	public static void constructOutPutMapIfAnagram(Map<String, List<String>> outputMapRef, String key, String value) {
		if(outputMapRef.containsKey(key)) {
			List<String> oldList = outputMapRef.get(key);
			if(!oldList.contains(key)) {
				oldList.add(key);
			}
			oldList.add(value);
			outputMapRef.put(key, oldList);
		} else {
			List<String> newList = new ArrayList<>();
			newList.add(key);
			newList.add(value);
			outputMapRef.put(key, newList);
		}
		
	}
	public static boolean isAnagram(String in1, String in2) {
//		if(in1 == null && in2 == null) {
//			return true;
//		}
		if(in1 == null || in2 == null) {
			return false;
		}		
		if(in1.length() != in2.length()) {
			return false;
		}
		if(in1.length() == 0 || in2.length() == 0) {
			return false;
		}
		
		//it will not work for alpha numerics as we are considering only alphabets 26 length. "tea1", "ate1"
//		int[] count = new int[26];
//		for(int i = 0; i < in1.length(); i++) {
//			char n1 = in1.charAt(i);
//			char n2 = in2.charAt(i);
//			count[n1 - 'a'] = count[n1 - 'a'] + 1; //indexoutofbound exception
//			count[n2 - 'a'] = count[n2 - 'a'] - 1;			
//		}
		
		//it will work for alpha numerics as we are considering all characters except other lang chars. "tea1", "ate1"
		int[] count1 = new int[256];
		for(int i = 0; i < in1.length(); i++) {
			char n1 = in1.charAt(i);
			char n2 = in2.charAt(i);
			count1[n1]++; //When you use a character as an index inside the square brackets of an array, the computer performs an implicit cast
			count1[n2]--;			
		}
		
		for(int i : count1) {
			if(i != 0) {
				return false;
			}
		}
		return true;
	}
}


//Questions to interviewer
//1. Input will have null, empty string, numeric, special characters or not?

//Approach 1
//Time complexity - O(n^2) + O(256) => O(n^2)
//Space complexity - visited array O(n) + hashmap O(n) + List in hashmap O(n) => O(n)

//Approach 2
//Time complexity - O(n) for all words and sorting each word of length k is k log k => O(n * k log k)
//Space complexity - Hashmap O(n) and char array O(k) => O(n * k)

//Approach 3 - Canonical representation - Convert different representations of the same object into a single unique key
//Time complexity - O(n) for all words and O(k) for int array building, O(256) for reading int array. finally => O(n * k)
//Space complexity - Hashmap O(n) and int array O(256) => O(n) 