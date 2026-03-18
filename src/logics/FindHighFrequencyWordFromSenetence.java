package logics;
import java.util.*;
public class FindHighFrequencyWordFromSenetence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String sentence = "Python Java1 Java Java C# JavaScript Java Python Python"; //find the maximum occurred word from the input string
		//Split the sentence using empty spaces
		//Loop the each word and calculate the frequency in the HashMap
		//Loop the frequency and find the maximum count and return it
		
		String[] wordArray = sentence.split(" ");
		Map<String, Integer> fMap = new LinkedHashMap<>();
		for(String word : wordArray) {
			if(fMap.containsKey(word)) {
				//int count = fMap.get(word);
				fMap.put(word, fMap.getOrDefault(word, 0) + 1);
			} else {
				fMap.put(word, 1);
			}
			
		}
		String maxWord = "";
		int max = 0;
		for(Map.Entry<String, Integer> entry : fMap.entrySet()) {
			if(entry.getValue() > max) {
				max = entry.getValue();
				maxWord = entry.getKey();
			}
		}
		System.err.println("Word: " + maxWord + ", count: " + max);
	}

}
