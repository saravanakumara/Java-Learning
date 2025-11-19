package logics;

public class ReverseString {

	public static void main(String[] args) {
		String input = "i love india";

		//String reverse - character wise
		StringBuilder sb = new StringBuilder(input);
		System.out.println(sb.reverse());

		//Looping
		//char[] chars = input.toCharArray();
		//int i = chars.length;
		for(int i = input.length() - 1; i >= 0; i--) {
			System.out.print(input.charAt(i));
		}
		System.out.println();

	}
}
