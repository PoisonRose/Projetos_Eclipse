package src;

public class Main {

	public static void main(String[] args) {
		int[] vet1 = new int[1];
		int[] vet2 = new int[0];
		
		vet1[0]=1;
		
		Solution.merge(vet1, 1, vet2, 0);
		
		for (int numero : vet1) {
			System.out.println(numero);
		}
	}

}
