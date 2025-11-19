package logics;

public class PowerOfTwo {

	public static void main(String[] args) {
		int n = 684;
		findPowerOfTwoOrNot(n);
		findPowerOfTwoOrNotUsingDivision(n);

	}

	private static void findPowerOfTwoOrNotUsingDivision(int n) {
		if(n <= 0) {
			System.out.println(false);
			return;
		}
		
		int i = n;
		while(i > 1) {
			int rem = i % 2;
			if(rem != 0) {
				System.out.println(false);
				return;
			}
			i = i / 2;
		}
		System.out.println(i == 1);
	}

	private static void findPowerOfTwoOrNot(int n) {
		if(n == 0) {
			System.out.println(n != 0);
			return;
		}
		
		int i = n;
		int count = 0;
		while(i > 0) {
			if((i & 1) == 1) {
				count++;
			}
			i = i >> 1;
		}
		
		System.out.println(count == 1);
	}

}
