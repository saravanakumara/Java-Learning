package logics;

public class MaxAvgSubArray {

	public static void main(String[] args) {
		int[] nums = {1, 12, -5, -6, 50, 3};
		int k = 4;
		
		int left = 0, right = 0, count = 1;
		double maxSum = 0, currentSum = 0;
		
		for(int i = 0; i < k; i++) {
			currentSum = currentSum + nums[i];
		}
		
		maxSum = currentSum;
		
		for(int i = k; i < nums.length; i++) {
			currentSum = currentSum + nums[i];
			currentSum = currentSum - nums[i - k];
			maxSum = Math.max(maxSum, currentSum);
		}
		
		System.out.println("Max sum average: " + maxSum / k);
		
		//Logic bug when sum of all k element is -ive
		maxSum = 0;
		currentSum = 0;
		while(right < nums.length) {
			currentSum += nums[right];
			if(count == k) {
				maxSum = Math.max(maxSum, currentSum);
			}
			if(count > k) {
				currentSum =  currentSum - nums[left];
				left++;
				maxSum = Math.max(maxSum, currentSum);
			}
			right++;
			count++;
		}
		System.out.println("Max sum average2: " + maxSum / k);
		
		//Fix for 2
		right = 0;
		left = 0;
		maxSum = Double.NEGATIVE_INFINITY;
		currentSum = 0;
		while(right < nums.length) {
			currentSum += nums[right];
			if(right - left + 1 == k) {
				maxSum = Math.max(maxSum, currentSum);
				currentSum =  currentSum - nums[left];
				left++;
			}
			right++;
		}
		System.out.println("Max sum average3: " + maxSum / k);
	}

}
