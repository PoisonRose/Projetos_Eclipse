package main;

public class Arvore<T extends Comparable<T>> {
	NoArvore<T> raiz;
	
	public Arvore() {
		raiz = null;
	}
	
	public void inserir(T dado) {
		raiz = inserirRec(raiz, dado);
	}
	
	private NoArvore<T> inserirRec(NoArvore<T> raiz, T dado){
		if(raiz == null) {
			raiz = new NoArvore<>(dado);
			return raiz;
		}
		if (dado.compareTo(raiz.dado)<0) {
			raiz.esquerda=inserirRec(raiz.esquerda,dado);
		} else if(dado.compareTo(raiz.dado)>0){
			raiz.direita=inserirRec(raiz.direita,dado);
		}
		return raiz;
	}
	//Cria uma interface "método" com a metodo "visitarNO" 
	public interface Visitante<T> {
        void visitarNo(T no);
    }
	
	public void emOrdem(Visitante<T> visitante) {
		emOrdem(raiz, visitante);
	}
	
	//Método para pegar os elementos de uma árvore;
	private void emOrdem(NoArvore<T> raiz, Visitante<T> visitante) {
		if (raiz != null) {
			emOrdem(raiz.esquerda, visitante);
            visitante.visitarNo(raiz.dado);
            emOrdem(raiz.direita, visitante);
		}
	}
}
