package src;

public class Solution {
	public static int[] sortedSquares(int[] nums) {
		
		// Eleve cada número do vetor ao quadrado.
		for (int i=0; i<nums.length; i++) {
			nums[i]=nums[i]*nums[i];
		}
		
		// Ordene o vetor(bubble sort).
		int placeholder;
		for (int i=0; i<nums.length;i++) {
			for (int j=0;j<nums.length-1;j++) {
				if (nums[i]<nums[j]) {
					placeholder=nums[i];
					nums[i]=nums[j];
					nums[j]=placeholder;
				}
			}
		}
		
		return nums;
		
	}
}
