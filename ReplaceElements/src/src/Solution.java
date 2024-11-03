package src;

public class Solution {
	public static int[] replaceElements(int[] arr) {
		int length = arr.length;
		
		
		if (length==1) {
			arr[0]=-1;
			return arr;
		}
		
		int elementIndex=0;
		int greatest=0;
		
		while (elementIndex<length-1) {
			for (int i=elementIndex+1;i<length;i++) {
				if (arr[i]>greatest) {
					greatest=arr[i];
				}
			}
			arr[elementIndex]=greatest;
			greatest=0;
			elementIndex++;
		}
		arr[elementIndex]=-1;
		
		return arr;
	}
}
