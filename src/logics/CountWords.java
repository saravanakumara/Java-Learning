package logics;

public class CountWords {

	public static void main(String[] args) {
		String s = "welcome to java world";
		countWords(s);

	}

	private static void countWords(String s) {
		if(s == null || s.length() == 0) {
			System.out.println("string is empty or null");
			return;
		}
		
		String[] wordsArray = s.split(" ");
		System.out.println(wordsArray.length);
	}

}
