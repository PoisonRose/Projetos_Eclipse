package projeto_produtos;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Leituraarq {
		
	        // Especifique o caminho para o arquivo de texto
	        private int codigo=0;
	        private String nome;
	        private String valors;
	        private double valor=0;
	        private int qtd = 0;
	        private int categoria =0;
	        private GravarProd gravador = new GravarProd();
	        
	        public void lerEGravar(String caminhoArquivo){
	        	try {
		            // Crie um objeto File para representar o arquivo
		            File arquivo = new File(caminhoArquivo);
		            // Crie um objeto Scanner para ler o conteúdo do arquivo
		            Scanner leitor = new Scanner(arquivo);
		            Scanner leia = new Scanner(System.in);
		            // Use um loop para ler cada linha do arquivo, editar e enviar gravador
		            // para que ele possa colocar tudo no ArrayList.
		            while (leitor.hasNextLine()) {
		                String linha = leitor.nextLine();
		                codigo = Integer.parseInt(linha.substring(0,2));
		                nome=linha.substring(3,34);
		                valors=linha.substring(36,41);
		                valor=Double.parseDouble(valors);
		                valor = valor /100;
		                qtd=Integer.parseInt(linha.substring(43,45));
		                categoria=Integer.parseInt(linha.substring(46,47));
		                gravador.addProd(codigo, nome, valor, qtd);
		            }
		            leitor.close();
		            // Ao final, mostre a lista de produtos.
		            gravador.mostrarProd();
		        } catch (FileNotFoundException e) {
		            System.out.println("Arquivo não encontrado: " + caminhoArquivo);
		        }
	        }
}
