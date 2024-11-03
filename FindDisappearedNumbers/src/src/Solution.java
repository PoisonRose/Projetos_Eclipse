package src;

import java.util.List;
import java.util.ArrayList;

public class Solution {
	public List<Integer> findDisappearedNumbers(int[] nums){
		List<Integer> missingNumbers = new ArrayList<>();
		int[] appeared = new int[nums.length+1];
		
		for (int i : nums) {
			appeared[i]++;
		}
		
		for (int i=1;i<nums.length+1;i++) {
			if (appeared[i]==0) {
				missingNumbers.add(i);
			}
		}
		
		return missingNumbers;
	}
}
