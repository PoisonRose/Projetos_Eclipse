package src;

public class Main {

	public static void main(String[] args) {
		int[] exemplo1 = new int[] {2,1};
		int[] exemplo2 = new int[] {3,2,1};
		int[] exemplo3 = new int[] {5,2,2};
		int[] exemplo4 = new int[] {4,2,3};
		int[] exemplo5 = new int[] {5,5,3};
		int[] exemplo6 = new int[] {7,7,7};
		int[] exemplo7 = new int[] {3,3,8};
		int[] exemplo8 = new int[] {4,5,3};
		int[] exemplo9 = new int[] {6,8,8};
		int[] exemplo10 = new int[] {1,2,3};
		
		System.out.println(Solution.validMountainArray(exemplo1));
		System.out.println(Solution.validMountainArray(exemplo2));
		System.out.println(Solution.validMountainArray(exemplo3));
		System.out.println(Solution.validMountainArray(exemplo4));
		System.out.println(Solution.validMountainArray(exemplo5));
		System.out.println(Solution.validMountainArray(exemplo6));
		System.out.println(Solution.validMountainArray(exemplo7));
		System.out.println(Solution.validMountainArray(exemplo8));
		System.out.println(Solution.validMountainArray(exemplo9));
		System.out.println(Solution.validMountainArray(exemplo10));
	}
}
