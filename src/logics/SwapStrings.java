package logics;

public class SwapStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "Hello";
		String s2 = "World";
		swapStringsWithThirdVariable(s1, s2);
		swapStringsWithOutThirdVariable(s1, s2);
	}

	private static void swapStringsWithOutThirdVariable(String s1, String s2) {
		if(s1 == null || s2 == null) {
			System.out.println("Strings are null");
			return;
		}
		
		if(s1.length() == 0 || s2.length() == 0) {
			System.out.println("Strings are empty");
			return;
		}
		System.out.println("Before swap => s1 = " + s1 + ", s2 = " + s2);
		
		s1 = s1 + s2;
		s2 = s1.substring(0, s1.length() - s2.length());
		s1 = s1.substring(s2.length());
		System.out.println("After swap => s1 = " + s1 + ", s2 = " + s2);
	}

	private static void swapStringsWithThirdVariable(String s1, String s2) {
		if(s1 == null || s2 == null) {
			System.out.println("Strings are null");
			return;
		}
		
		if(s1.length() == 0 || s2.length() == 0) {
			System.out.println("Strings are empty");
			return;
		}
		System.out.println("Before swap => s1 = " + s1 + ", s2 = " + s2);
		String temp = s1;
		s1 = s2;
		s2 = temp;
		System.out.println("After swap => s1 = " + s1 + ", s2 = " + s2);
		
	}

}
