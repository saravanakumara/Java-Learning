package logics;

public class FindNumberOfDigits {

	public static void main(String[] args) {
		int n = 1530;
		findNumberOfDigits(n);

	}

	private static void findNumberOfDigits(int n) {
		int i = n;
		int count = 0;
		int newNumber = 0;
		
		if(i < 0) {
			i = i * -1;
		}
		
		if(i == 0) {
			i = 1;
		}
		
		while(i > 0) {
			int rem = i % 10;
			newNumber = rem + (newNumber * 10);			
			i = i / 10;
			count++;
		}
		System.out.println(count);
		//System.out.println(newNumber);
	}

}
