package br.edu.ifce.estruturas.pilha;

public class TestaAdiciona {
	public static void main(String[]args) {
		Pilha<String> p1 = new Pilha<String>();
		
		p1.inserir("Joao");
		
		String elemento = p1.remover();
		
		System.out.println(elemento);
		
		
		System.out.println(p1);
	}
}
