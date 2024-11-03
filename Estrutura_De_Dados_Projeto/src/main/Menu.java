// Grupo:
// Gabriel Araújo Farias de Santana - 01611979
// José Denilson Moreira dos Santos Júnior - 01612813
// Lucas Henrique Lins da Silva - 01613905
// Vinícios Eduardo Lourenço de Oliveira - 01626056

package main;

import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        int opcao;
        String caminhoArquivo = "C:\\Users\\lucas\\Desktop\\Estrutura de Dados Projeto\\main\\Produto.txt";

        do {
            System.out.println("### MENU ###");
            System.out.println("1. Criar Arraylist");
            System.out.println("2. Criar Pilha");
            System.out.println("3. Criar Fila");
            System.out.println("0. Sair do programa");
            System.out.print("Escolha uma opção: ");
            
            opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer

            switch (opcao) {
                case 1:
                    System.out.println("Criando Arraylist...");
                    Arraylist lista = new Arraylist();
                    lista.CriarLista(caminhoArquivo);
                    break;
                case 2:
                    System.out.println("Criando Pilha...");
                    Pilha pilha = new Pilha();
                    pilha.criarPilha(caminhoArquivo);
                    break;
                case 3:
                    System.out.println("Criando Fila...");
                    Fila fila = new Fila();
                    fila.criarFila(caminhoArquivo);
                    break;
                case 0:
                    System.out.println("Encerrando o programa...");
                    break;
                default:
                    System.out.println("Opção inválida! Escolha novamente.");
                    break;
            }
        } while (opcao != 0);
        scanner.close();
	}
}
