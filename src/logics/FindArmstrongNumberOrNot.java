package logics;

public class FindArmstrongNumberOrNot {

	public static void main(String[] args) {
		int n = 123;
		isArmstrongNumberOrNot(n);
	}

	private static void isArmstrongNumberOrNot(int n) {
		int noDigits = getNumberOfDigits(n);
		int i = n;
		double newNumber = 0;
		while(i > 0) {
			int rem = i % 10;
			newNumber = newNumber + Math.pow(rem, noDigits);
			i = i / 10;			
		}
		
		System.out.println(n == newNumber);
	}

	private static int getNumberOfDigits(int n) {
		int i = n;
		int newNumber = 0;
		int count = 0;
		while(i > 0) {
			int rem = i % 10;
			newNumber = rem + (newNumber * 10);
			i = i / 10;
			count++;
		}
		return count;
	}

}
