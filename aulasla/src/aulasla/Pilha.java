package aulasla;

public class Pilha {
	private Object[] conteudo;
	private int indice;
	
	public Pilha(int tamanho) {
		if(tamanho<=0) {
			throw new IllegalArgumentException("tamanho da pilha inválido: "+tamanho);
		}
		conteudo = new Object[tamanho];
		indice = 0;
	}
	public int tamanho() {
		return indice;
	}
	public String elementos() {
		String s="";
		for(int i=0;i<indice;i++) {
			s=s+conteudo[i];
			if(i<(indice-1)) {
				s=s+", ";
			}
		}
		return s;
	}
}
