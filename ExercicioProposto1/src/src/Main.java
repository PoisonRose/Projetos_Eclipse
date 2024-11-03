package src;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//Inicialização de variáveis
		Scanner entrada = new Scanner(System.in);
		int quantPares = 0, quantImpares = 0, iPares=0, iImpares=0;
		int[] vet = new int[6];
		
		//Receba os números inteiros, guarde-os no vetor, e conte a quantidade de Pares ou impares.
		for (int i=0;i<6;i++) {
			System.out.println("Escreva o "+(i+1)+"º numero do vetor");
			vet[i] = entrada.nextInt();
			if (vet[i]%2==0) {
				quantPares+=1;
			}
			else {
				quantImpares+=1;
			}
		}
		entrada.close();
		
		//Armazene os números no vetor apropriado.
		int[] pares = new int[quantPares];
		int[] impares = new int[quantImpares];
		for (int i=0;i<6;i++) {
			if (vet[i]%2==0) {
				pares[iPares]=vet[i];
				iPares++;
			}
			else {
				impares[iImpares]=vet[i];
				iImpares++;
			}
		}
		
		//Mostre os pares e ímpares, bem como suas quantidades.
		System.out.println("---------------");
		System.out.println("Pares:");
		for (int i=0;i<quantPares;i++) {
			System.out.println(pares[i]);
		}
		System.out.println("Quantidade: "+quantPares);
		System.out.println("---------------");
		System.out.println("Impares:");
		for (int i=0;i<quantImpares;i++) {
			System.out.println(impares[i]);
		}
		System.out.println("Quantidade: "+quantImpares);
		System.out.println("---------------");
	}
}
