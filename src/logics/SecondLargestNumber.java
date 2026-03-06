package logics;

import java.util.Arrays;

public class SecondLargestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Approach 1
		int[] numbers = {2, 4, 0, 3};
		int firstSmall = numbers[0];
		int secondSmall = numbers[0];
		for(int i = 1; i < numbers.length; i++) {
			if(firstSmall < numbers[i]) {
				secondSmall =  firstSmall;
				firstSmall = numbers[i];
			} else {
				if(secondSmall < numbers[i]) {
					secondSmall = numbers[i];
				}
			}
		}
		System.out.println("FirstLarge: " + firstSmall);
		System.out.println("SecondLarge: " + secondSmall);
		
		// Approach 2
		Arrays.sort(numbers);
		for(int i = 0; i < numbers.length; i++) {
			if(i == (numbers.length - 2)) {
				System.out.println(numbers[i]);
			}
		}

	}

}
