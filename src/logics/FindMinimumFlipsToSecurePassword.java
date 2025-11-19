package logics;

public class FindMinimumFlipsToSecurePassword {

	public static void main(String[] args) {
		// IBM
		String str = "1110011000";
		findMinimumFlipsToSecurePassword1(str);
		findMinimumFlipsToSecurePassword2(str);

	}

	private static void findMinimumFlipsToSecurePassword2(String str) {
		if(str == null || str.length() == 0) {
			System.out.println("String is empty or null");
			return;
		}
		int minFlips = Integer.MAX_VALUE;
		for(int i = 2; i <= str.length() - 2; i += 2) {
			String firstPart = str.substring(0, i);
			String secondPart = str.substring(i);
			int flipsForFirst = findMinimumCount(firstPart);
			int flipsForSecond = findMinimumCount(secondPart);
			int totalFlips = flipsForFirst + flipsForSecond;
			
			minFlips = Math.min(totalFlips, minFlips);
		}
		System.out.println(minFlips);
	}

	private static int findMinimumCount(String s) {
		int count0 = 0;
		int count1 = 0;
		
		for(int i = 0; i < s.length(); i++) {
			if(s.charAt(i) == '0') {
				count0++;
			} else {
				count1++;
			}
		}
		return Math.min(count0, count1);
	}

	private static void findMinimumFlipsToSecurePassword1(String str) {
		if(str == null || str.length() == 0) {
			System.out.println("String is empty or null");
			return;
		}
		int count = 0;
		for(int i = 0; i < str.length(); i +=2) {
			if(str.charAt(i) != str.charAt(i + 1)) {
				count++;
			}
		}
		
		System.out.println(count);
	}

}
