package logics;

public class FindPrimeNumber {

	public static void main(String[] args) {
		String s = "33";
		isPrimeNumber(s);

	}

	private static void isPrimeNumber(String s) {
		if(s == null || s.length() == 0) {
			System.out.println("input is empty or null");
			return;
		}
		
		//only 2 factors
		//0 & 1 or not a prime
		//All even numbers are not a prime except 2 which smallest even prime number
		//We will not get new prime number when the square root of the given number is reached during iteration, we will get repeated [order changed] factors
		//Iterate upto square root of n or i * i = n
		
		int n = Integer.parseInt(s);
		if(n < 2) {
			System.out.println(n + " is not a prime");
			return;
		}
		
		if(n == 2) {
			System.out.println(n + " is a prime");
			return;
		}
		
		if(n % 2 == 0) {
			System.out.println(n + " is not a prime");
			return;
		}
		
		for(int i = 3; i * i <= n; i = i + 2) {
			if(n % i == 0) {
				System.out.println(n + " is not a prime");
				return;
			}
		}
		System.out.println(n + " is a prime");
	}

}
