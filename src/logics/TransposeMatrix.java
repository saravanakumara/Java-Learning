package logics;

public class TransposeMatrix {
	public static void main(String[] args) {
		int a[][] = new int[3][2];
		int count = 0;
		for(int r = 0; r < a.length; r++) {
			for(int c = 0; c < a[0].length; c++) {
				a[r][c] = count++;
			}
		}
		
		System.out.println("Input array: ");
		for(int r = 0; r < a.length; r++) {
			for(int c = 0; c < a[0].length; c++) {
				System.out.print(a[r][c] + " ");
			}
			System.out.println();
		}
		
		System.out.println("Input array after transpose matrix: ");
		
		int result[][] = new int[a[0].length][a.length];
		
		for(int r = 0; r < a.length; r++) {
			for(int c = 0; c < a[0].length; c++) {
				result[c][r] = a[r][c];
			}
		}
		
		for(int r = 0; r < result.length; r++) {
			for(int c = 0; c < result[0].length; c++) {
				System.out.print(result[r][c] + " ");
			}
			System.out.println();
		}
	}
}
