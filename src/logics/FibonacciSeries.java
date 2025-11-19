package logics;

import java.util.HashMap;

public class FibonacciSeries {

	public static void main(String[] args) {
		int n = 8;
		printFibonacciSeries(n);
		System.out.println();
		printFibonacciNumbersRecursively(n);
		System.out.println();
		printFibonacciNumbersRecursivelyWithMemoization(n);
		System.out.println();

	}

	private static void printFibonacciNumbersRecursivelyWithMemoization(int n) {
		HashMap<Integer, Integer> map = new HashMap<>();
		for(int i = 0; i < n; i++) {
			System.out.print(fibonacciWithMemo(i, map));
		}
		
	}

	private static int fibonacciWithMemo(int n, HashMap<Integer, Integer> map) {
		if(n == 0) {
			return 0;
		}
		if(n == 1) {
			return 1;
		}
		
		if(map.containsKey(n)) {
			return map.get(n);
		}
		
		int result = fibonacciWithMemo(n - 1, map) + fibonacciWithMemo(n - 2, map);
		map.put(n, result);
		return result;
	}

	private static void printFibonacciNumbersRecursively(int n) {
		for(int i = 0; i < n; i++) {
			System.out.print(fibonacci(i));
		}		
	}

	private static int fibonacci(int n) {
		if(n == 0)
			return 0;
		if(n == 1)
			return 1;
		
		return fibonacci(n - 1) + fibonacci(n - 2);
	}

	private static void printFibonacciSeries(int n) {
		int prev = 0;
		int curr = 1;
		
		if(n <= 0)
			return;
		System.out.print(prev);
		
		if(n == 1)
			return;
		System.out.print(curr);
		
		for(int i = 2; i < n; i++) {
			int newValue = prev + curr;
			prev = curr;
			curr = newValue;
			System.out.print(curr);
		}
	}

}
