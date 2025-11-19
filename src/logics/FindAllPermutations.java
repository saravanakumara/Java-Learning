package logics;

public class FindAllPermutations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "11375";
		permutation(str, "");

	}

	private static void permutation(String str, String prefix) {
		if(str.length() == 0) {
			System.out.println(prefix);
		} else {
			for (int i = 0; i < str.length(); i++) {
				char c = str.charAt(i);
				String newPrefix = prefix + c;
				String newRemaining = str.substring(0, i) + str.substring(i + 1);
				permutation(newRemaining, newPrefix);
			}
		}
	}

}
