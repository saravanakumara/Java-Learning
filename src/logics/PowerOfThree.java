package logics;

public class PowerOfThree {

	public static void main(String[] args) {
		int n = 0;
		checkPowerOfThree(n);

	}

	private static void checkPowerOfThree(int n) {
		if(n == 0) {
			System.out.println(false);
			return;
		}
		
		int i = n;
		while(i > 1) {
			int rem = i % 3;
			if(rem != 0) {
				System.out.println(false);
				return;
			}
			i = i / 3;
		}
		System.out.println(i == 1);
	}
}
