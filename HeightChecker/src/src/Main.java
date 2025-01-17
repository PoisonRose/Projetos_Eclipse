package src;

public class Main {

	public static void main(String[] args) {
		int[] height = new int[] {1,1,4,2,1,3};
		System.out.println(Solution2.heightChecker(height));
		
		int[] height2 = new int[] {5,1,2,3,4};
		System.out.println(Solution.heightChecker(height2));
		
		int[] height3 = new int[] {1,2,3,4,5};
		System.out.println(Solution2.heightChecker(height3));
	}
	
	//Solution heightChecker is faster, but uses more memory than Solution2 heighChecker.
	//Solution2 is also way simpler, using 11 lines of code.
}
