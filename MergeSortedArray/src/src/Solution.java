package src;

public class Solution {
	public static void merge(int[] nums1, int m, int[] nums2, int n) {
		int p = nums1.length;
		
		if (m==0) {
			for (int i=0;i<n;i++) {
				nums1[i]=nums2[i];
			}
		}
		for (int i=0;i<n;i++) {
			for (int j=0;j<p;j++) {
				if (nums2[i]<nums1[j]) {
					for (int x=p-2;x>=j;x--) {
						nums1[x+1]=nums1[x];
					}
					nums1[j]=nums2[i];
					m++;
					break;
				}
				else if(j==m-1) {
					nums1[j+1]=nums2[i];
					m++;
					break;
				}
			}
		}
	}
}
