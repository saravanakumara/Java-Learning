package logics;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates {

	public static void main(String[] args) {
		int[] i = {5, 2, 9, 1, 6, 2, 5};
		removeDuplicates(i);

	}

	private static void removeDuplicates(int[] i) {
		if(i == null || i.length == 0) {
			System.out.println("Array is empty or null");
			return;
		}
		
		Set<Integer> uniqueNumbers = new HashSet<>();
		
		for(int n : i) {
			uniqueNumbers.add(n);
		}
		
		for(int in : uniqueNumbers) {
			System.out.print(in + " ");
		}
	}

}
