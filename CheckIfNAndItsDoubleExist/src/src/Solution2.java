package src;

public class Solution2 {
	public static boolean checkIfExist(int[] arr) {
		int length = arr.length;
		for (int i=0;i<length;i++) {
			if(find(arr[i]*2, i, arr)) {
				return true;
			}
		}
		return false;
	}
	
	private static boolean find(int val, int ignoreIndex, int[] arr) {
		int length = arr.length;
		for (int i=0;i<length;i++) {
			if (i==ignoreIndex) {
				continue;
			}
			if(arr[i]==val) {
				return true;
			}
		}
		return false;
	}
}
