package logics;

public class ReverseFirstAndLastDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 1234; //output = 4231;
		int digitcount = digitCount(number);
		int[] numbersArray = new int[digitcount];
		
		updateArray(numbersArray, number);
		
		int temp = numbersArray[digitcount - 1];
		numbersArray[digitcount - 1] = numbersArray[0];
		numbersArray[0] = temp;
		
		double total = 0;
		for(int i = 0; i < numbersArray.length; i++) {
			total = total + (numbersArray[i] * (Math.pow(10, (digitcount - (i + 1)))));
		}
		
		System.out.println((int)total);
	}

	private static void updateArray(int[] numbersArray, int number) {
		// TODO Auto-generated method stub
		int input = number;
		int count = numbersArray.length - 1;
		while(input > 0) {
			int reminder = input % 10;
			input = input / 10;
			numbersArray[count]= reminder;
			count--;
		}
	}

	private static int digitCount(int number) {
		// TODO Auto-generated method stub
		int count = 0;
		int input = number;
		while(input > 0) {
			input = input / 10;			
			count++;
		}
		return count;
	}

}
