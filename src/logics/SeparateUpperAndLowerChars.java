package logics;

public class SeparateUpperAndLowerChars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "aBACbcEDed";
		separateUpperAndLowerChars(s);
	}

	private static void separateUpperAndLowerChars(String s) {
		if(s== null || s.length() == 0) {
			System.out.println("string is null or empty");
			return;
		}
		
		StringBuffer sL = new StringBuffer();
		char[] sLa = new char[26];
		StringBuffer sU = new StringBuffer();
		char[] sUa = new char[26];
		
		for(int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if(Character.isLowerCase(c)) {
				sL.append(c);
				sLa[c - 'a'] = c;
			}
			if(Character.isUpperCase(c)) {
				sU.append(c);
				sUa[c - 'A'] = c;
			}
		}
		
		System.out.print(sL.toString() + "," + sU.toString());
		System.out.println();
		System.out.print(String.valueOf(sLa).trim() + "," + String.valueOf(sUa).trim());
	}

}
