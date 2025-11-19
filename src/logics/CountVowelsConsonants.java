package logics;

public class CountVowelsConsonants {

	public static void main(String[] args) {
		String s1 = "Hello World".toLowerCase();
		printVowelsConsonantscount(s1);

	}

	private static void printVowelsConsonantscount(String s1) {

		if(s1 == null  || s1.length() == 0) {
			System.out.println("String is null or empty");
			return;
		}
		int vowels = 0;
		int consonants = 0;
		for(int i = 0; i < s1.length(); i++) {
			char c = s1.charAt(i);
			if(c >= 'a' && c <= 'z') {
				if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
					vowels++;
				} else {
					consonants++;
				}
			}
		}
		System.out.println("Vowels: " + vowels);
		System.out.println("Consonants: " + consonants);

	}

}
