package logics;

public class DecimalNumberCount {

	public static void main(String[] args) {
		double number = 124.56789;
		String numberStr = String.valueOf(number);
		
		//1.
		String[] numberSplitStringArray = numberStr.split("\\.");
		System.out.println(numberSplitStringArray[1].length());
		
		//2.
		int dotIndex = numberStr.indexOf('.');
		System.out.println("index of dot char: "+dotIndex);
		System.out.println(numberStr.length() - dotIndex - 1);
		
	}

}
