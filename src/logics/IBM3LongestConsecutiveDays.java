package logics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class IBM3LongestConsecutiveDays {

	public static void main(String[] args) {
				
		//A company runs 3 microservices every day. At the end of each day, the status of all microservices is recorded as a string where:
		//Y means the micro service is working.
		//N means the micro service is not working.
		//Each element in the list represents one day's status of all microservices.
		//Find the longest streak of consecutive days where all microservices passed?.
		//input: ["YYY", "YNY", "YYY", "YYY", "YYY"]
		//output: 3
		
		//Approach 1
		int count = 0, maxCount = 0;
		List<String> inList = new ArrayList<>();
		inList.add("YYY");
		inList.add("YYN");
		inList.add("YYY");
		inList.add("YYY");
		inList.add("YYY");
					
		for(String word : inList) {
			if(isAllServicesActive(word)) {
			//if(isAllServicesActive2(word)) {
				count = count + 1;
				maxCount = Math.max(count, maxCount);
			} else {
				count = 0;
			}
		}
		
		System.out.println(maxCount);
		
		//Approach 3 - This is failed
		List<String> inList1 = Arrays.asList("YYY", "YYY", "YYN", "YYY", "YYY", "YYY");
		String[] arr = inList1.toArray(new String[0]);
		int left = 0, right = 1;
		
		if(arr.length > 1) {
			while(right < arr.length) {
				if(!arr[left].equalsIgnoreCase(arr[right])) {
					left++;
				}
				right++;
			}
		}
		System.out.println((right - left));
		
		//Approach 3a - This is failed - String comparison is not aligned with requirement, so this logic is for another problem longest consecutive sub array
		List<String> inList2 = Arrays.asList("YYY", "YYY", "YYN", "YYY", "YYY", "YYY");
		String[] arr1 = inList2.toArray(new String[0]);
		int left1 = 0, right1 = 1;
		
		while(right1 < arr.length) {
			if(!arr1[left1].equalsIgnoreCase(arr1[right1])) {
				left1 =  right;
			}
			right1++;
		}		
		System.out.println((right1 - left1));
	}

	private static boolean isAllServicesActive(String word) {
		for(int i = 0; i < word.length(); i++) {
			if(word.charAt(i) != 'Y') {
				return false;
			}
		}
		
		return true;
	}
	
	//approach 2
	private static boolean isAllServicesActive2(String word) {
		if(word.contains("N")) {
			return false;
		}		
		return true;
	}

//Approach 1
//Time complexity - O(n * k)
//Space complexity - O(1)
	
//Approach 2
//Time complexity - O(n)
//Space complexity - O(1)
}
