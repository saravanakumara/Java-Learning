package logics;

import java.util.Arrays;

public class SecondSmallestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers = {2, 4, 0, 3}; //If non negative numbers
		// Approach 1
		// Arrays.sort(numbers);
		for(int i = 0; i < numbers.length; i++) {
			if(i == 1) {
				System.out.println(numbers[i]);
			}
		}
		
		//Approach 2
		int firstSmall = numbers[0];
		int secondSmall = numbers[0];
		for(int i = 1; i < numbers.length; i++) {
			if(firstSmall > numbers[i]) {
				secondSmall =  firstSmall;
				firstSmall = numbers[i];
			} else {
				if(secondSmall > numbers[i]) {
					secondSmall = numbers[i];
				}
			}
		}
		System.out.println("FirstSmall: " + firstSmall);
		System.out.println("SecondSmall: " + secondSmall);		
		
	}

}
