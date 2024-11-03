package src;

public class Main {

	public static void main(String[] args) {
		int[] vetor = new int[5];
		
		vetor[0]=5;
		vetor[1]=4;
		vetor[2]=3;
		vetor[3]=2;
		vetor[4]=1;
		
		
		for (int numero : Solution2.sortedSquares(vetor)) {
			System.out.println(numero);
		}
		

	}

}
