package exerc3;

import java.util.Scanner;

public class Triangulo {

	public static void main(String[] args) {
		double ladoA, ladoB, ladoC, n=0;
		Scanner dado1 = new Scanner(System.in), dado2 = new Scanner(System.in), dado3 = new Scanner(System.in);
		
		System.out.print("Digite o primeiro lado do triangulo: ");
		ladoA = dado1.nextDouble();
		System.out.print("Digite o segundo lado do triangulo: ");
		ladoB = dado1.nextDouble();
		System.out.print("Digite o terceiro lado do triangulo: ");
		ladoC = dado1.nextDouble();
		if ((ladoA+ladoB>ladoC)&&(ladoA+ladoC>ladoB)&&(ladoB+ladoC>ladoA)) {
			if (ladoA == ladoB) {
				n++;
			}
			if (ladoA == ladoC) {
				n++;
			}
			if (ladoB == ladoC) {
				n++;
			}
			if (n==3) {
				System.out.println("O triangulo e Equilatero");
			}
			else {
				if (n==1) {
					System.out.println("O triangulo e Isosceles");
				}
				else {
					System.out.println("O triangulo e Escaleno");
				}
			}
		}
		else {
			System.out.println("Isso nao e um triangulo!");
		}
		dado1.close();dado2.close();dado3.close();
	}

}
