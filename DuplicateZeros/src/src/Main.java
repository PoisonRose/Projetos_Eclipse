package src;

public class Main {

	public static void main(String[] args) {
		int[] arr = new int[5];
		arr[0]=0;
		arr[1]=1;
		arr[2]=2;
		arr[3]=3;
		arr[4]=4;
		Solution.duplicateZeros(arr);
		for (int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		

	}

}
