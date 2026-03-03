package logics;

public class RotateZerosToTheRight {

	//Move all zeros to end while preserving order: [1,0,2,3,0,4]→ [1,2,3,4,0,0]
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Approach - 1 using loop
		int[] numsArray = {1,0,1}; //{0,1,0,3,12}; //{0, 0, 1}; //{1,0,0,0,0,4};
		int countOfNonZeros = 0, countOfZeros = 0;
		for(int i : numsArray) {
			if(i == 0) {
				countOfZeros++;
			} else {
				countOfNonZeros++;
			}
		}
		System.out.println("non zeros count: " + countOfNonZeros);
		System.out.println("zeros count: " + countOfZeros);
		countOfZeros = countOfNonZeros;
		countOfNonZeros = 0;
		int[] outNumsArr = new int[numsArray.length];
		for(int i = 0; i < outNumsArr.length; i++) {
			if(numsArray[i] == 0) {
				outNumsArr[countOfZeros] = numsArray[i];
				countOfZeros++;
			} else {
				outNumsArr[countOfNonZeros] = numsArray[i];
				countOfNonZeros++;
			}
		}
		for(int i : outNumsArr) {
			System.out.println(i);
		}
		
		//Time complexity - O(n) + O(n) = O(2n) = O(n) for both loops to look all the values
		//Space complexity - O(n) for new result array and auxiliary constants O(1), final O(n) space complexity
		
		// Approach - 2 using two pointer to swap in the same array [1,0,2,3,0,4], bit complex to understand debug
		int left = 0, right = 1;
		while(right < numsArray.length) {
			if(numsArray[left] != 0 && numsArray[right] == 0) {
				right++;
				left++;
			} else if(numsArray[left] == 0 && numsArray[right] != 0) {
				numsArray[left] = numsArray[right];
				numsArray[right] = 0;
				right++;
				left++;
			} else if(numsArray[left] == 0 && numsArray[right] == 0) {
				right++;				
			}			
		}
		for(int i : numsArray) {
			System.out.println(i);
		}
		
		//Time complexity - O(n) for while loop to look all the values
		//Space complexity - O(1) in place array update and auxiliary constants O(1)
		
		//Approach - 3, simple to debug and read [1,0,2,3,0,4]
		int[] numsArray1 = {1,0,1}; //{0,1,0,3,12}; //{0, 0, 1}; //{1,0,0,0,0,4};
		int insertPos = 0;
		for(int i = 0; i < numsArray1.length; i++) {
			if(numsArray1[i] != 0) {
				numsArray1[insertPos] = numsArray1[i];
				insertPos++;
			}
		}
		
		while(insertPos < numsArray1.length) {
			numsArray1[insertPos] = 0;
			insertPos++;
		}
		for(int i : numsArray1) {
			System.out.println(i);
		}
	}

}
