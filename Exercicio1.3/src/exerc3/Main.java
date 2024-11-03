package exerc3;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.print("Insira a primeira nota: ");
        Scanner a = new Scanner(System.in);
        double nota1 = a.nextDouble();
        System.out.print("Insira a segunda nota: "); // Note the corrected prompt
        Scanner b = new Scanner(System.in);
        double nota2 = b.nextDouble();

        Media aprovacao = new Media();
        double media = aprovacao.media(nota1, nota2); // Calculate the media once and store it

        if ((nota1 > 10 || nota1 < 0)||(nota2 > 10 || nota2 < 0)) {
            System.out.println("notas inválidas");
        } else {
            if (media == 10) {
                System.out.println("Aprovado com Distinção");
            } else {
                if (media >= 7) {
                    System.out.println("Aprovado");
                } else {
                    System.out.println("Reprovado");
                }
            }
        }

        a.close();
        b.close();
    }
}

