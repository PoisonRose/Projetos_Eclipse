package exerc1;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.print("Insira o primeiro cateto do triangulo: ");
		Scanner a = new Scanner(System.in);
		double cateto1 = a.nextDouble();
		System.out.print("Insira o primeiro cateto do triangulo: ");
		Scanner b = new Scanner(System.in);
		double cateto2 = b.nextDouble();
		Hipotenusa calc = new Hipotenusa();
		System.out.println(calc.calcHip(cateto1, cateto2));
		
		a.close();
		b.close();
	}

}
