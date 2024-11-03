package main;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Arvore<Pedido> arvoreDePedidos = new Arvore<>();
		String caminhoArquivo = "C:\\Users\\lucas\\Downloads\\Pedido.txt";
		try {
			File arquivo = new File(caminhoArquivo);
			Scanner leitor = new Scanner(arquivo);
			
			while(leitor.hasNextLine()) {
				String linha = leitor.nextLine();
				int codigo = Integer.parseInt(linha.substring(0, 5));
				String data = linha.substring(14,24);
				String pais = linha.substring(71,82);
				
				arvoreDePedidos.inserir(new Pedido(codigo, data, pais));
			}
			Arvore.Visitante<Pedido> printVisitor = new Arvore.Visitante<Pedido>() {
                @Override
                public void visitarNo(Pedido pedido) {
                    System.out.println("Código: " + pedido.getCodigo());
                    System.out.println("Data: " + pedido.getData());
                    System.out.println("País: " + pedido.getPais());
                    System.out.println("---------------");
                }
            };

            // Leia a árvore
            arvoreDePedidos.emOrdem(printVisitor);
			leitor.close();
		} catch(FileNotFoundException e) {
			System.out.println("Arquivo não encontrado: " + caminhoArquivo);
		}
	}

}
