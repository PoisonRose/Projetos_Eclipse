package src;

public class Solution {
	public static boolean checkIfExist(int[] arr) {
		int length = arr.length;
		for (int i=0;i<length;i++) {
			for (int j=i+1;j<length;j++) {
				if (arr[i]==2*arr[j]) {
					return true;
				}
			}
		}
		return false;
	}
}
