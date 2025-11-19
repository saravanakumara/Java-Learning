package logics;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

	public static void main(String[] args) {
		int[] in = new int[] {2, 5, 9, 10};
		int target = 7;
		findTwoSumIndices(in, target);

	}

	private static void findTwoSumIndices(int[] in, int target) {
		if(in == null || in.length == 0) {
			System.out.println("input array is empty or null");
			return;
		}
		
		Map<Integer, Integer> numMap = new HashMap<>(); 
//		for(int i = 0; i < in.length; i++) {
//			numMap.put(in[i], i);		
//		}
//in this map build approach, generates duplicate indices when input is 4, it will check if already available. So this will give duplicate indices.
//So building map on the go, in this we will compare the already available item while processing current item. for example, we know 7-2=> 5 which is available in the input
//But while processing 5 will not be available in the map and 2 is now only added when we found a match, then print the mapped index first and i, so that we will get smaller index first		
		for(int i = 0; i < in.length; i++) {
			int remainingValue = target - in[i];
			if(numMap.containsKey(remainingValue))  {
				//int[] indices = new int[] {i, numMap.get(remainingValue)};
				System.out.println(i + "," + numMap.get(remainingValue));
				System.out.println(numMap.get(remainingValue) + "," + i);				
				return;
			}
			numMap.put(in[i], i);
		}
		System.out.println("no match found");
	}

}
