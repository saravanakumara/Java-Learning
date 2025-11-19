package logics;

public class MinAndMaxInArray {

	public static void main(String[] args) {
		int[] in = {1, 2, 3, 5};
		findMinAndMaxInArray(in);

	}

	private static void findMinAndMaxInArray(int[] in) {
		if(in == null || in.length == 0) {
			System.out.println("array is empty or null");
			return;
		}
		
		int min = in[0];
		int max = in[0];
		
		for(int i : in) {
			if(min > i) {
				min = i;
			}
			if(max < i) {
				max = i;
			}
		}
		System.out.println("Min: " + min + ", Max: " + max);
	}

}
