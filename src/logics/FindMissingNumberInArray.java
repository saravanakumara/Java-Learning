package logics;

public class FindMissingNumberInArray {

	public static void main(String[] args) {
		int[] in = {1, 2, 3, 5};
		findMissingNumberInArray1(in);
		findMissingNumberInArray2(in);

	}

	private static void findMissingNumberInArray2(int[] in) {
		if(in == null || in.length == 0) {
			System.out.println("array is empty or null");
			return;
		}
		
		int n = in.length + 1;
		int total = n * (n + 1) / 2;
		int arraySum = 0;
		
		for(int i : in) {
			arraySum = arraySum + i;
		}
		
		int missingNumber = total - arraySum;
		System.out.println(missingNumber);
	}

	private static void findMissingNumberInArray1(int[] in) {
		if(in == null || in.length == 0) {
			System.out.println("array is empty or null");
			return;
		}
		
		int min = in[0];
		int max = in[0];
		
		for(int i = 0; i < in.length; i++) {
			if(in[i] < min) {
				min = in[i];
			}
			if(in[i] > max) {
				max = in[i];
			}
		}
		System.out.println("min: " + min + ", max: " + max);
		
		int total = 0;
		for(int i = min; i <= max; i++) {
			total = total + i;
		}
		
		int arraySum = 0;
		for(int i : in) {
			arraySum =  arraySum + i;
		}
		
		System.out.println("Missing number is: " + (total - arraySum));
	}

}
