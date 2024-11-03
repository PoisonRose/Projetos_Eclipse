// Grupo:
// Gabriel Araújo Farias de Santana - 01611979
// José Denilson Moreira dos Santos Júnior - 01612813
// Lucas Henrique Lins da Silva - 01613905
// Vinícios Eduardo Lourenço de Oliveira - 01626056

package main;

import java.io.FileNotFoundException;
import java.util.Stack;
import java.util.Scanner;
import java.io.File;

public class Pilha {

	public void criarPilha(String caminhoArquivo) {
		
		// Crie uma pilha para armazenar os dados.
		Stack<Regpro> pilhaDeProdutos = new Stack<>();
		
		// Especifique o caminho para o arquivo de texto.
		try {
			// Crie um objeto File para representar o arquivo
			File arquivo = new File(caminhoArquivo);
			// Crie um objeto Scanner para ler o conteúdo do arquivo
			Scanner leitor = new Scanner(arquivo);
			
			// Use um loop para ler cada linha do arquivo.
			while (leitor.hasNextLine()) {
                String linha = leitor.nextLine();
                int codigo = Integer.parseInt(linha.substring(0, 2));
                String nome = linha.substring(3, 35);
                String valors = linha.substring(36, 41);
                double valor = Double.parseDouble(valors) / 100;
                int qtd = Integer.parseInt(linha.substring(42, 45));
                int categoria = Integer.parseInt(linha.substring(46, 47));

                // Adicionar objetos Regpro à pilha criada anteriormente.
                pilhaDeProdutos.push(new Regpro(codigo, nome, valor, qtd, categoria));
            }
			
			//Feche o Scanner após a leitura do arquivo
			leitor.close();
			
			// Mostre na tela os dados de cada produto.
			for (Regpro produto : pilhaDeProdutos){
				System.out.println("Código: " + produto.getCodigo());
                System.out.println("Nome: " + produto.getDescricao());
                System.out.println("Preço: " + produto.getPreco());
                System.out.println("Quantidade: " + produto.getQtd());
                System.out.println("Categoria: "+produto.getCategoria());
                System.out.println();
	        }
		} catch (FileNotFoundException e) {
            System.out.println("Arquivo não encontrado: " + caminhoArquivo);
        }
	}

}
