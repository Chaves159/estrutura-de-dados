package br.edu.ifce.estruturas.pilha;

import java.util.LinkedList;
import java.util.List;

public class Pilha<X> {
	int totalDeElemento = 0;
	List<X> elementos = new LinkedList<X>();
	
	public void inserir(X p) {
		this.elementos.add(p);
		this.totalDeElemento++;
	}

	public X remover() {
		return this.elementos.remove(this.elementos.size()-1);
	}
	public boolean vazia() {
		return this.elementos.size()==0;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
}
