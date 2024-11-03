// Grupo:
// Gabriel Araújo Farias de Santana - 01611979
// José Denilson Moreira dos Santos Júnior - 01612813
// Lucas Henrique Lins da Silva - 01613905
// Vinícios Eduardo Lourenço de Oliveira - 01626056

package main;


import java.util.ArrayList;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Arraylist {


	public void CriarLista(String caminhoArquivo) {
		// Criar um ArrayList para armazenar objetos Regpro
        ArrayList<Regpro> listaDeProdutos = new ArrayList<>();

        // Especifique o caminho para o arquivo de texto
        //String caminhoArquivo = "C:\\Users\\lucas\\Desktop\\Estrutura de Dados Projeto\\main\\Produto.txt";

        try {
            // Crie um objeto File para representar o arquivo
            File arquivo = new File(caminhoArquivo);
            // Crie um objeto Scanner para ler o conteúdo do arquivo
            Scanner leitor = new Scanner(arquivo);

            // Use um loop para ler e imprimir cada linha do arquivo
            while (leitor.hasNextLine()) {
                String linha = leitor.nextLine();
                int codigo = Integer.parseInt(linha.substring(0, 2));
                String nome = linha.substring(3, 35);
                String valors = linha.substring(36, 41);
                double valor = Double.parseDouble(valors) / 100;
                int qtd = Integer.parseInt(linha.substring(42, 45));
                int categoria = Integer.parseInt(linha.substring(46, 47));

                // Adicionar objetos Regpro à Arraylist criada anteriormente.
                listaDeProdutos.add(new Regpro(codigo, nome, valor, qtd, categoria));
            }

            // Feche o Scanner após a leitura do arquivo
            leitor.close();

            // Imprimir os detalhes dos produtos na lista (pode ser movido para outro método)
            for (Regpro produto : listaDeProdutos) {
                System.out.println("Código: " + produto.getCodigo());
                System.out.println("Descrição: " + produto.getDescricao());
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