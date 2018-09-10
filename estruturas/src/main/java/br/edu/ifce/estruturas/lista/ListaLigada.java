package br.edu.ifce.estruturas.lista;

public class ListaLigada {

	private Celula primeira;
	private Celula ultima;
	
	private int totalDeElementos;
	
	public void adiciona(Object elemento) {
		// implementacao
	}
	
	public void adiciona(int posicao, Object elemento) {
		// implementacao
	}
	
	public void adicionaNoComeco(Object elemento) {
		Celula nova = new Celula(this.primeira, elemento);
		this.primeira = nova;
		
		if(this.totalDeElementos == 0) {
			this.ultima = this.primeira;
		}
		this.totalDeElementos++;
	}
	
	public Object pega(int posicao) {
		// implementacao
		return null;
	}
	
	public void remove(int posicao) {
		// implementacao
	}
	
	public void removeDoComeco() {
		
		this.primeira = this.primeira.getProxima();
		
		this.totalDeElementos--;
		
		if(this.totalDeElementos == 0) {
			this.ultima = null;
		}
		
		
	}
	
	public void removeDoFim() {
		if(this.totalDeElementos == 1) {
			this.removeDoComeco();
		}
		this.ultima = this.ultima.getAnterior();
		this.ultima.setProxima(null);
		this.totalDeElementos--;
	}
	
	public int tamanho() {
		// implementacao
		return 0;
	}
	public boolean contem(Object o) {
		// implementacao
		return false;
	}
	
	
	public String toString() {
		
		if(this.totalDeElementos == 0) {
			return "[]";
		}
		
		StringBuilder builder = new StringBuilder("[");
		Celula atual = primeira;
		
		// Percorrendo até o penúltimo elemento
		for(int i = 0; i < this.totalDeElementos-1; i++) {
			builder.append(atual.getElemento());
			builder.append(", ");
			atual = atual.getProxima();
		}
		
		//último elemento
		builder.append(atual.getElemento());
		builder.append("]");
		
		return builder.toString();
	}
}
