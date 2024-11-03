package src;

public class Solution2 {
	public static int[] replaceElements(int[] arr) {
        int max = arr[arr.length-1];
        arr[arr.length - 1] = -1;
        int temp = 0;
        for(int i = arr.length-2; i >= 0; i--)
        {
            if(max < arr[i])
            {
                temp = arr[i];
                arr[i] = max;
                max = temp;
                
            }else{
                 arr[i] = max;
            }
        }
        return arr;
    }
}
