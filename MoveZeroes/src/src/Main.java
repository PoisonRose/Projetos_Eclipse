package src;

public class Main {

	public static void main(String[] args) {
		int[] teste = new int[]{0,1,2,3,4,5,0,0,7,15,0,12,0};
		Solution.moveZeroes(teste);
		for (int elemento : teste) {
			System.out.println(elemento);
		}
	}

}
