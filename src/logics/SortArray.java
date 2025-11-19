package logics;

public class SortArray {

	public static void main(String[] args) {
		int[] i = {4, 5, 2, 1, 9, 124, 00};
		sortArray(i);
	}

	private static void sortArray(int[] n) {
		if(n == null || n.length == 0) {
			System.out.println("Array is null or empty");
			return;
		}
		
		for(int i = 0; i < n.length; i++) {
			for (int j = i + 1; j < n.length; j++) {
				if(n[i] > n[j]) {
					int temp = n[i];
					n[i] = n[j];
					n[j] = temp;
				}
			}
		}
		
		for(int i : n) {
			System.out.print(i + " ");
		}
	}

}
