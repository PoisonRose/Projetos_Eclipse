package projeto_produtos;

import java.util.ArrayList;
import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class GravarProd {
        // Crie um ArrayList para armazenar objetos Regpro
        ArrayList<Regpro> listaDeProdutos = new ArrayList<>();
        // Adicione objetos Regpro à lista
        public void addProd(int codigo,String nome,double valor,int qtd) {
        	listaDeProdutos.add(new Regpro(codigo, nome, valor, qtd));
        }

        // Acesse os objetos na lista
        public void mostrarProd() {
        	for (Regpro produto : listaDeProdutos) {
                System.out.println("Código: " + produto.getCodigo());
                System.out.println("Descrição: " + produto.getDescricao());
                System.out.println("Preço: " + produto.getPreco());
                System.out.println("Quantidade: " + produto.getQtd());
                System.out.println();
            }
        }
}