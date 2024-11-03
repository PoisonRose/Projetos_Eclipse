package Prova1;

import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner valor = new Scanner(System.in);
		double valores[] = new double[15];
		for (int i=0;i<valores.length;i++) {
			valores[i] = valor.nextDouble();
			if (valores[i]%2==0) {
				valores[i] = valores[i]/2;
			}
			else {
				valores[i] = valores[i]*2;
			}
		}
		valor.close();
		for (int i=0;i<valores.length;i++) {
			System.out.println(valores[i]);
		}
	}
}
