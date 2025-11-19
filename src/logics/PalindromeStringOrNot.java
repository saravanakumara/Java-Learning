package logics;

public class PalindromeStringOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "tat";
		checkPalindromeOrNot(input);
	}

	private static void checkPalindromeOrNot(String input) {
		if(input.length() == 0) {
			System.out.println("String is empty");
			return;
		}
		boolean isTrue = true;
		//1. While loop
		int start = 0;
		int end = input.length() - 1;
		
		while(start < end) {
			if(input.charAt(start) != input.charAt(end)) {
				isTrue = false;
				return;
			}
			start++;
			end--;
		}
		if(isTrue) {
			System.out.println(input + " is a palindrome");
		} else {
			System.out.println(input + " is not a palindrome");
		}
		
		//2. for loop
		for(int i = 0; i < input.length(); i++) {
			char c1 = input.charAt(i);
			char c2 = input.charAt(input.length() - i - 1);
			if(c1 != c2) {
				System.out.println(input + " is not a palindrome");
				isTrue = false;
				break;
			}
		}
		if(isTrue)
			System.out.println(input + " is a palindrome");
	}

}
