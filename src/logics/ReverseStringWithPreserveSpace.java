package logics;

import java.util.Arrays;

public class ReverseStringWithPreserveSpace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] iS =  "I am Sar a".toCharArray(); //Output: "a ra SamI"
		int left = 0, right = iS.length -1;
		
		while(left < right) {
			if(iS[left] != ' ') {
				char temp = iS[left];
				iS[left] = iS[right];
				iS[right] = temp;
				left++;
				right--;
				
			} else if(iS[left] == ' ') {
				left++;
			} else if(iS[right] == ' '){
				right--;
			}
		}
		System.out.println(Arrays.toString(iS));
		
		left = 0;
		right = iS.length -1;
		String ins = "I am Sar a";
		StringBuilder sb = new StringBuilder(ins);
		while(left < right) {
			if(sb.charAt(left) != ' ' && sb.charAt(right) != ' ') {
				char temp = sb.charAt(left);
				sb.setCharAt(left, sb.charAt(right));
				sb.setCharAt(right, temp);
				left++;
				right--;
				
			} else if(sb.charAt(left) == ' ' && sb.charAt(right) == ' ') {
				left++;
				right--;
			} else if(sb.charAt(left) == ' ') {
				left++;
			} else if(sb.charAt(right) == ' '){
				right--;
			}
		}
		System.out.println(sb.toString());
		
		//time - O(n) for while loop
		//Space - O(n) for char array or string builder conversion
	}

}
