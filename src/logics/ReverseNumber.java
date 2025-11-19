package logics;

public class ReverseNumber {

	public static void main(String[] args) {
		int n = 15330;
		reverseNumber(n);

	}

	private static void reverseNumber(int n) {
		int i = n;
		int newNum = 0;
		while(i > 0) {
			int rem = i % 10;
			newNum = rem + (newNum * 10);
			i = i / 10;
		}
		System.out.println(newNum);
	}

}
