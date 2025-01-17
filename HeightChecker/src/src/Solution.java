//A school is trying to take an annual photo of all the students.
//The students are asked to stand in a single file line in non-decreasing order by height.
//Let this ordering be represented by the integer array expected where expected[i] is the
//expected height of the ith student in line.

//You are given an integer array heights representing the current order that the students
//are standing in. Each heights[i] is the height of the ith student in line (0-indexed).

//Return the number of indices where heights[i] != expected[i].

package src;

public class Solution {
	public static int heightChecker(int[] heights) {
		int k=0;
		int[] expected = new int[heights.length];
		//copy all elements from heights to expected
		for(int i=0;i<heights.length;i++) {
			expected[i]=heights[i];
		}
		
		//sort expected
		mergeSort(expected, expected.length);
		
		//compare them and return k(number of indices where heights[i] != expected[i]).
		for(int i=0;i<heights.length;i++) {
			if (heights[i]!=expected[i]) {
				k++;
			}
		}
		return k;
	}
	
	private static void mergeSort(int[] a, int n) {
		if (n < 2) {
	        return;
	    }
	    int mid = n / 2;
	    int[] l = new int[mid];
	    int[] r = new int[n - mid];

	    for (int i = 0; i < mid; i++) {
	        l[i] = a[i];
	    }
	    for (int i = mid; i < n; i++) {
	        r[i - mid] = a[i];
	    }
	    mergeSort(l, mid);
	    mergeSort(r, n - mid);

	    merge(a, l, r, mid, n - mid);
	}
	
	private static void merge(int[] a, int[] l, int[] r, int left, int right) {
		int i = 0, j = 0, k = 0;
	    while (i < left && j < right) {
	        if (l[i] <= r[j]) {
	            a[k++] = l[i++];
	        }
	        else {
	            a[k++] = r[j++];
	        }
	    }
	    while (i < left) {
	        a[k++] = l[i++];
	    }
	    while (j < right) {
	        a[k++] = r[j++];
	    }
	}
}
