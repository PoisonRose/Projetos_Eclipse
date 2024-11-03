package src;

public class Solution {
	public static int thirdMax(int[] nums) {
		boolean secondIn = false;
		boolean thirdIn = false;
		int max=nums[0];
		int secondMax=Integer.MIN_VALUE;
		int thirdMax=Integer.MIN_VALUE;
		
		for (int i=0;i<nums.length;i++) {
			if (nums[i]==Integer.MIN_VALUE) {
				thirdIn=true;
			}
			if (nums[i]>max) {
				thirdMax=secondMax;
				secondMax=max;
				max=nums[i];
				if (secondIn==true) {
					thirdIn=true;
				}
				secondIn=true;
			}
			else if (nums[i]>secondMax&&nums[i]<max) {
				thirdMax=secondMax;
				secondMax=nums[i];
				if (secondIn==true) {
					thirdIn=true;
				}
				secondIn=true;
			}
			else if (nums[i]>thirdMax&&nums[i]<secondMax) {
				thirdMax=nums[i];
				thirdIn=true;
			}
		}
		
		if (nums.length<3) {
			return max;
		}
		
		if (max>secondMax&&secondMax>thirdMax) {
			if (secondIn==true&&thirdIn==true) {
				return thirdMax;
			}
			else {
				return max;
			}
		}
		else {
			return max;
		}
	}
}
