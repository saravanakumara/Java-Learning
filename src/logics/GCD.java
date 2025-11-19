package logics;

public class GCD {

	public static void main(String[] args) {
		int a = 12;
		int b = 18;
		findGCD(a, b);
		findGCD2(a, b);

	}

	private static void findGCD2(int a, int b) {
		a = Math.abs(a);
		b = Math.abs(b);
		
		while(b != 0) {
			int temp = b;
			b = a % b;
			a = temp;
		}
		System.out.println(a);
	}

	private static void findGCD(int a, int b) {
		a = Math.abs(a);
		b = Math.abs(b);
		int gcd = 1;
		
		for(int i = 1; i < Math.min(a, b); i++) {
			if(a % i == 0 && b % i == 0) {
				gcd = i;
			}
		}
		System.out.println(gcd);
	}

}
