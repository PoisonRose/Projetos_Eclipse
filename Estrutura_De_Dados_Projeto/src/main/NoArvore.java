package main;

public class NoArvore<T> {
	T dado;
	NoArvore<T> esquerda,direita;
	
	public NoArvore(T item) {
		dado = item;
		esquerda=direita=null;
	}
}
