package logics;

public class SortAnArrayOf0s1s2s {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {2, 0, 1, 2, 0};
		//Output [0, 0, 1, 2, 2] -> classic Dutch National Flag problem
		
		int left = 0, mid = 0, right = nums.length - 1;
		
		while(mid <= right) {
			if(nums[mid] == 0) {
				swap(nums, left, mid);
				left++;
				mid++;
			} else if(nums[mid] == 1) {
				mid++;
			} else if(nums[mid] == 2) {
				swap(nums, mid, right);
				right--;
			}
		}

		for(int num : nums) {
			System.out.println(num);
		}
	}

	private static void swap(int[] nums, int mid, int right) {
		int temp = nums[right];
		nums[right] = nums[mid];
		nums[mid] = temp;		
	}

}
