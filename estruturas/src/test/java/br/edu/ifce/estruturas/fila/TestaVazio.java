package br.edu.ifce.estruturas.fila;



import br.edu.ifce.estruturas.pilha.Pilha;

public class TestaVazio {
			public static void main(String[]args) {
				Pilha<String> p1 = new Pilha<String>();
				
				p1.inserir("Joao");
				
				
				

				System.out.println(p1.vazia());
				
				
			}
		}



