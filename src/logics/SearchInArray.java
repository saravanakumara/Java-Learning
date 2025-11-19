package logics;

public class SearchInArray {

	public static void main(String[] args) {
		int[] in = {1, 2, 3, 5, 9};
		int target = 0;
		findInArray(in, target);
		findInArrayUsingBinarySearch(in, target);
	}

	private static void findInArray(int[] in, int target) {
		if(in == null || in.length == 0) {
			System.out.println("array is empty or null");
			return;
		}
		boolean isFound = false;
		for(int i : in) {
			if(i == target) {
				isFound = true;
				break;
			}
		}
		System.out.println(isFound);
	}

	private static void findInArrayUsingBinarySearch(int[] in, int target) {
		if(in == null || in.length == 0) {
			System.out.println("array is empty or null");
			return;
		}
		
		int start = 0;
		int end = in.length - 1;
		boolean isFound = false;
		
		while(start <= end) {
			int mid = start + (end - start) / 2;
			if(in[mid] == target) {
				isFound = true;				
				break;
			}
			
			if(in[mid] > target) {
				end = mid - 1;
			}
			
			if(in[mid] < target) {
				start = mid + 1;
			}
		}
		
		System.out.println(isFound);
	}

}
