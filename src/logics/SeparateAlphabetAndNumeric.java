package logics;

public class SeparateAlphabetAndNumeric {

	public static void main(String[] args) {
		
		String s = "Subbu4321Megna";
		separateAlphabetAndNumeric(s);
	}

	private static void separateAlphabetAndNumeric(String s) {
		if(s == null && s.length() == 0) {
			System.out.println("string is empty or null");
			return;
		}
		StringBuffer sA = new StringBuffer();
		StringBuffer sD = new StringBuffer();
		
		for(int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			
			if(Character.isDigit(c)) {
				sD.append(c);
			}
			
			if(Character.isLetter(c)) {
				sA.append(c);
			}
		}
		System.out.println(sA.toString() + ", " + sD.toString());
		
	}

}
