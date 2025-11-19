package logics;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class FindCommonElementsInArrays {

	public static void main(String[] args) {
		int[] a = {1, 2, 3, 4, 5}; 
		int[] b = {4, 6, 5, 1};
		findCommonElementsInArrays(a, b);
		findCommonElementsInArraysUsingSet(a, b);
	}

	private static void findCommonElementsInArraysUsingSet(int[] a, int[] b) {
		if(a == null || b == null) {
			System.out.println("arrays are null");
			return;
		}
		
		if(a.length == 0 || b.length == 0) {
			System.out.println("arrays are empty");
			return;
		}
		
		Set<Integer> uniqueNumbers = new HashSet<>();
		Set<Integer> commonNumbers = new HashSet<>();
		
		for(int i : a) {
			uniqueNumbers.add(i);
		}
		
		for(int i : b) {
			if(!uniqueNumbers.add(i)) {
				commonNumbers.add(i);
			}
		}
		
		for(int i : commonNumbers) {
			System.out.print(i + " ");
		}
	}

	private static void findCommonElementsInArrays(int[] a, int[] b) {
		if(a == null || b == null) {
			System.out.println("array is null");
			return;
		}

		if(a.length == 0 || b.length == 0) {
			System.out.println("Arrays are empty");
			return;
		}

		int[] small = {};
		int[] big = {};
		if(a.length < b.length) {
			small = a;
			big = b;
		} else if(a.length > b.length){
			small = b;
			big = a;
		} else {
			small = a;
			big = b;
		}
		int[] result = new int[small.length];
		//Arrays.fill(result, -1); we can filter -1 while printing the result array
		int k = 0;
		for(int i = 0; i < small.length; i++) {
			for(int j = 0; j < big.length; j++) {
				if(small[i] == big[j]) {
					result[k] = small[i];
					k++;
					break;
				}
			}
		}

		if(k != 0) {
			for(int i = 0; i < k; i++) {
				System.out.print(result[i]);
			}
		} else {
			System.out.print("no common elements");
		}
	}
}

