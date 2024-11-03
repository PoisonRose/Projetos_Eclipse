package src;

public class Main {

	public static void main(String[] args) {
		int[] vetor = new int[6];
		for (int i=0; i<vetor.length; i++) {
			if (Math.random()>0.5) {
				vetor[i]=1;
			}
			else {
				vetor[i]=0;
			}
		}
		
		for (int numero : vetor) {
			System.out.println(numero);
		}
		
		System.out.println("==fim do vetor==");
		System.out.println(Solution.findMaxConsecutiveOnes(vetor));
	}

}
