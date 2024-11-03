package src;

public class Solution {
	public static boolean validMountainArray(int[] arr) {
		int length = arr.length;
		int peak=0, peakPosition=0;
		
		if (length < 3) {
			return false;
		}
		else {
			for (int i=peak;i<length-1;i++) {
				if (arr[i+1]>arr[i]) {
					peak=arr[i+1];
					peakPosition=i+1;
				}
				else if (arr[i+1]==arr[i]) {
					return false;
				}
				else if (arr[i+1]<arr[i]) {
					break;
				}
			}
			if ((peakPosition==0)||(peakPosition==length-1)) {
				return false;
			}
			for (int i=peakPosition+1;i<length-1;i++) {
				if (arr[i+1]>=arr[i]) {
					return false;
				}
			}
			return true;
		}
	}
}
