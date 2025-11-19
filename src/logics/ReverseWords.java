package logics;

public class ReverseWords {

	public static void main(String[] args) {
		String input = "i love india test";
		if(!input.isEmpty()) {
			reverseWordsBySplit(input);
			reverseWordsByLoop(input);
		}		
	}
	
	public static void reverseWordsBySplit(String input) {
		//split
		String[] wordsArrayFromSentence = input.split(" ");
		for (int i = wordsArrayFromSentence.length - 1; i >= 0; i--) {
			System.out.print(wordsArrayFromSentence[i] + " ");
		}
		System.out.println();
	}
	/*
	Time:
		- String split takes O(n) to process all the characters
		- Looping is running upto string array length O(n)
		- O(2n) -> O(n)
	
	Space:
		- String split array O(n)
	*/
	
	public static void reverseWordsByLoop(String input) {
		int substringEnd = input.length();
		
		for(int i = input.length() - 1; i >= 0; i--) {
			if(input.charAt(i) == ' ') {
				System.out.print(input.substring(i + 1, substringEnd) + " ");
				substringEnd = i;
			}
		}
		//Here we need to get the string from the starting separately as for loop ends by reaching the 0 index and not with whitespace character.
		System.out.println(input.substring(0, substringEnd));
		/*
		Time:
			- Looping is running upto string array length O(n)
			- O(n)
		
		Space:
			- Not using extra spaces to store substring values.
			- Auxiliary space O(1) to store length for end, i in the loops.
		*/
	}
}
