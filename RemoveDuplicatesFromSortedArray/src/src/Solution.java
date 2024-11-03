package src;

public class Solution {
	public static int removeDuplicates(int[] nums) {
		int length=nums.length;
		int k=0;
		for (int i=0;i<length;i++) {
			if (nums[i]!=nums[k]) {
				nums[k+1]=nums[i];
				k++;
			}
		}
		return k+1;
	}
}
