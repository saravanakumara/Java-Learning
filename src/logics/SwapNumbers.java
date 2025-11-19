package logics;

public class SwapNumbers {

	public static void main(String[] args) {
		int a = 10;
		int b = 5;
		System.out.println("Before swap: " + a + ", " + b);		
		findUsingArthemetic(a, b);
		findUsingLogicalXor(a, b);		

	}
	
	private static void findUsingArthemetic(int a, int b) {
		a = a + b;
		b = a - b;
		a = a - b;
		
		System.out.println("After swap: " + a + ", " + b);
		
	}

	private static void findUsingLogicalXor(int a, int b) {
		a = a ^ b;
		b = a ^ b;
		a = a ^ b;
		
		System.out.println("After swap: " + a + ", " + b);
	}

}
