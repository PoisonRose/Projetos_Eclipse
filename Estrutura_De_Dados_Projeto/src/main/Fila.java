// Grupo:
// Gabriel Araújo Farias de Santana - 01611979
// José Denilson Moreira dos Santos Júnior - 01612813
// Lucas Henrique Lins da Silva - 01613905
// Vinícios Eduardo Lourenço de Oliveira - 01626056

package main;

import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.io.File;

public class Fila {

	public void criarFila(String caminhoArquivo) {
		// Crie uma fila para armazenar os dados.
		Queue<Regpro> filaDeProdutos = new LinkedList<>();
		
		// Especifique o caminho para o arquivo de texto.		
		
		try {
			// Crie um objeto File para representar o arquivo.
			File arquivo = new File(caminhoArquivo);
			
			// Crie um objeto Scanner para leitura do arquivo.
			Scanner leitor = new Scanner(arquivo);
			
			// Para cada linha do arquivo, adicione os dados do Produto na fila criada.
			while (leitor.hasNextLine()) {
				String linha = leitor.nextLine();
                int codigo = Integer.parseInt(linha.substring(0, 2));
                String nome = linha.substring(3, 35);
                String valors = linha.substring(36, 41);
                double valor = Double.parseDouble(valors) / 100;
                int qtd = Integer.parseInt(linha.substring(42, 45));
                int categoria = Integer.parseInt(linha.substring(46, 47));
                
                filaDeProdutos.add(new Regpro(codigo,nome,valor,qtd,categoria));
			}
			// Feche o scanner leitor.
			leitor.close();
			
			// Mostre na tela os dados de cada produto.
			for (Regpro produto : filaDeProdutos){
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
