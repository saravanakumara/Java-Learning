package logics;

public class SumOfDigitsOfNumber {

	public static void main(String[] args) {
		int n = 121019;
		findSumOfDigitsOfNumber(n);

	}

	private static void findSumOfDigitsOfNumber(int n) {
		int i = Math.abs(n);
		int newNumber = 0;
		
		while(i > 0) {
			int rem = i % 10;
			newNumber = newNumber + rem;
			i = i / 10;
		}
		System.out.println(newNumber);
	}

}
