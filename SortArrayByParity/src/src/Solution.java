// Given an integer array nums, move all the even integers at the beginning of the array followed by all the odd integers.
// Return any array that satisfies this condition.

package src;

public class Solution {
	public static int[] sortArrayByParity(int[] nums) {
		int oddDetector = 0;
		int evenDetector = nums.length-1;
		int temp;
		
		while (oddDetector<evenDetector) {
			//If both Detectors 'detect' numbers, exchange them and move on.
			if (nums[oddDetector]%2!=0&&nums[evenDetector]%2==0) {
				temp=nums[oddDetector];
				nums[oddDetector]=nums[evenDetector];
				nums[evenDetector]=temp;
				oddDetector++;
				evenDetector--;
			}
			//If any detector doesn't detect the appropriate number, move on.
			if (nums[oddDetector]%2==0) {
				oddDetector++;
			}
			if (nums[evenDetector]%2!=0) {
				evenDetector--;
			}
		}
		
		return nums;
	}
}
