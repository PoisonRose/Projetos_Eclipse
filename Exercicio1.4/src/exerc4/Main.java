package exerc4;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		double vetor[];
		int i;
		Scanner entrada = new Scanner(System.in);
		
		vetor = new double[3];
		System.out.println("Por favor insira os 3 numeros(Enter para inserir o proximo)");
		for (i=0;i<3;i++)
			vetor[i] = entrada.nextDouble();
		Maior resultado = new Maior();
		System.out.println("O maior numero e: "+resultado.maior(vetor));
		
		entrada.close();
	}
}
