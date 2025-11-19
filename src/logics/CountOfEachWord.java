package logics;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class CountOfEachWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Test automation java automation";
		countOfEachWord(s);
	}

	private static void countOfEachWord(String s) {
		if(s == null || s.length() == 0) {
			System.out.println("String is empty or null");
			return;
		}
		
		HashMap<String, Integer> fMap = new HashMap<>();
		String[] wordsArr = s.split(" ");
		
		for(String word : wordsArr) {
			fMap.put(word, fMap.getOrDefault(word, 0) + 1);
		}
		
		System.out.println(fMap.toString());
		Iterator<Map.Entry<String, Integer>> it = fMap.entrySet().iterator();
		while(it.hasNext()) {
			Map.Entry<String, Integer> e = it.next();
			System.out.println(e.getKey() + ": " + e.getValue());
		}
	}

}
