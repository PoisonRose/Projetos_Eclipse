package src;

public class Main {

	public static void main(String[] args) {
		
		int[] vet= new int[] {17,18,5,4,6,1};
		
		Solution2.replaceElements(vet);
		
		for (int element : vet) {
			System.out.println(element);
		}
	}

}
