package logics;

public class RemoveSpaceFromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Welcome to java";
		RemoveSpaceFromString(s);
	}

	private static void RemoveSpaceFromString(String s) {
		if(s == null || s.length() == 0) {
			System.out.println("string is empty or null");
		}
		StringBuffer sb = new StringBuffer();
		for(int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if(c != ' ') {
				sb.append(c);
			}
		}
		System.out.println(sb.toString());
	}

}
