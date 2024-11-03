package src;

public class Main {

	public static void main(String[] args) {
		int[] vetor = new int[9];
		int val=4;
		
		vetor[0]=0;vetor[1]=4;vetor[2]=4;vetor[3]=0;vetor[4]=4;vetor[5]=4;
		vetor[6]=4;vetor[7]=0;vetor[8]=2;
		
		System.out.println(Solution.removeElement(vetor, val));

	}

}
