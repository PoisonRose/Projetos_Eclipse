package src;

public class Solution3 {
	public int thirdMax(int[] nums) {
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        int third = Integer.MIN_VALUE;
        int count = 0;
        boolean hasMin = false;
        for (int i : nums) {
            if (i >= first) {
                if (i > first) {
                    third = second;
                    second = first;
                    first = i;
                    count++;
                } else if (i == Integer.MIN_VALUE && !hasMin) {
                    count++;
                    hasMin = true;
                }
            } else if (i >= second) {
                if (i > second) {
                    third = second;
                    second = i;
                    count++;
                } else if (i == Integer.MIN_VALUE && !hasMin) {
                    count++;
                    hasMin = true;
                }
            } else if (i >= third) {
                if (i > third) {
                    third = i;
                    count++;
                } else if (i == Integer.MIN_VALUE && !hasMin) {
                    count++;
                    hasMin = true;
                }
            }
        }
        if (count >= 3) {
            return third;
        } else {
            return first;
        }
    }
}
