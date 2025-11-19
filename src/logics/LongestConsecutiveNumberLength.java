package logics;

import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveNumberLength {

	public static void main(String[] args) {
		int[] in = new int[] {2, 5, 10, 3, 4, 1};
		findLongestConsecutiveNumberLength1(in);
		findLongestConsecutiveNumberLength2(in);

	}

	private static void findLongestConsecutiveNumberLength2(int[] in) {
		if(in == null || in.length == 0) {
			System.out.println("input is empty");
			return;
		}
		int len = 0;
		Set<Integer> numberSet = new HashSet<>();
		
		for(int i = 0; i < in.length; i++) {
			numberSet.add(in[i]);
		}
		
		for(int i : in) {
			if(!numberSet.contains(i - 1)) {
				int num = i;
				int count = 1;
				while(numberSet.contains(num + 1)) {
					num++;
					count++;
				}
				len = Math.max(count, len);
			}
		}
		System.out.println(len);
		
	}

	private static void findLongestConsecutiveNumberLength1(int[] in) {
		if(in == null || in.length == 0) {
			System.out.println("input is empty");
			return;
		}
		int len = 0;
		Set<Integer> numberSet = new HashSet<>();
		
		for(int i = 0; i < in.length; i++) {
			numberSet.add(in[i]);
		}
		
		for(int i = 0; i < in.length; i++) {			
			if(numberSet.contains(in[i])) {
				int count = 1;
				while(numberSet.contains(in[i] - count)) {
					count++;					
				}
				len = Math.max(len, count);
			}
		}
		System.out.println(len);
	}

}
