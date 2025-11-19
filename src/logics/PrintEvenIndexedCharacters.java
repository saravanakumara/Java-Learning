package logics;

public class PrintEvenIndexedCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Automation";
		PrintEvenIndexedCharacters(s);
	}

	private static void PrintEvenIndexedCharacters(String s) {
		if(s == null || s.length() == 0) {
			System.out.println("String is empty or null");
			return;
		}
		
		for(int i = 0; i < s.length(); i++) {
			if((i & 1) == 0) {
				System.out.print(s.charAt(i));
			}
		}
		System.out.println();
	}

}
