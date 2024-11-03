package src;

import java.util.List;
import java.util.ArrayList;

public class Solution2 {
	public List<Integer> findDisappearedNumbers(int[] nums) {
        return new MyList(nums);
    }
    
    private static class MyList extends ArrayList<Integer> {
        int[] nums;

        public MyList(int[] nums) {
            this.nums = nums;
        }

        public int size() {
            method();
            return super.size();
        }

        public void method() {
            int n = nums.length;
            boolean[] temp = new boolean[n + 1];

            for (int num : nums) {
                temp[num] = true;
            }

            for (int i = 1; i < n + 1; i++) {
                if (!temp[i]) {
                    super.add(i);
                }
            }
            this.nums = null;
        }
    }
}
