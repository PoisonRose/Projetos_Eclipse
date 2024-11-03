package src;

public class Solution2 {
	public boolean validMountainArray(int[] arr) {
		int length = arr.length;
		if (length < 3) {
            return false;
        }

        int i = 1;
        
        // Walk up
        while (i < length && arr[i] > arr[i - 1]) {
            i++;
        }
        
        // Check if peak is at first or last position
        if (i == 1 || i == length) {
            return false;
        }
        
        // Walk down
        while (i < length && arr[i] < arr[i - 1]) {
            i++;
        }

        return i == length;
	}
}
