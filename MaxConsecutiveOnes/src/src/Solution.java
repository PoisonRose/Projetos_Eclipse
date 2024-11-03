package src;

public class Solution {
	public static int findMaxConsecutiveOnes(int[] nums) {
		int max = 0;
		int currentCount = 0;
		for (int number : nums) {
			if (number == 0) {
				currentCount = 0;
			}
			else {
				currentCount++;
				if (currentCount>max) {
					max=currentCount;
				}
			}
		}
		return max;
	}
}
