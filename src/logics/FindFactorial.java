package logics;

public class FindFactorial {

	public static void main(String[] args) {
		int n = 6;
		findFactorial(n);
		System.out.println(findFactorialRecursively(n));

	}

	private static void findFactorial(int n) {
		int f = 1;
		for(int i = n; i >= 1; i--) {
			f = f * i;
		}
		System.out.println(f);
	}

	private static int findFactorialRecursively(int n) {		
		if(n == 1)
			return 1;
		return n * findFactorialRecursively(n - 1);
	}

}
