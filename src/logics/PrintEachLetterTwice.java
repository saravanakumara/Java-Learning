package logics;

public class PrintEachLetterTwice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "heHe22&";
		PrintEachLetterTwice(s);
	}

	private static void PrintEachLetterTwice(String s) {
		if(s == null || s.length() == 0) {
			System.out.println("string is empty or null");
			return;
		}
		
		StringBuffer sb = new StringBuffer();
		for(int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if(c != ' ') {
				sb.append(c).append(c);
			}
		}
		System.out.println(sb.toString());
	}

}
