package logics;

public class FindPalindromeNumberOrNot {

	public static void main(String[] args) {
		int n = -121;
		findPalindromeNumberOrNot(n);

	}

	private static void findPalindromeNumberOrNot(int n) {
		int i = Math.abs(n);
		int newNumber = 0;
		
		if(i == 0) {
			System.out.println(i == 0);
			return;
		}
		
		while(i > 0) {
			int rem =  i % 10;
			newNumber = rem + (newNumber * 10);
			i = i / 10;
		}
		System.out.println(newNumber == n);
	}

}
