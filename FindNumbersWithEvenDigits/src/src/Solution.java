package src;

public class Solution {
	public static int findNumbers(int[] nums) {
		int count = 0;
		for (int number : nums) {
			int numDigits = 0;
			while (number != 0) {
				number /= 10;
				numDigits++;
			}
			if (numDigits%2 == 0) {
				count++;
			}
		}
		return count;
	}
}
