package br.edu.odenaMenorInteiro;

import java.util.ArrayList;
import java.util.List;

public class MenorInteiro {
	public static void main(String[] args) {
		List<Integer> lista = new ArrayList<Integer>();

		for (int i = 0; i < 1000; i++) {
			lista.add(i);

		}
		
		int menor = buscaMenor(lista,0,lista.size());
		System.out.println(menor);
		for(int i = 0;i<lista.size();i++) {
			int indiceMenor = buscaMenor(lista,i,lista.size());
			int menorAtual = lista.get(i);
			int menorReal = lista.get(indiceMenor);
		}
		System.out.println(lista);
	}
	

	private static int buscaMenor(List<Integer> lista, int inicio, int fim) {
		Integer menor = inicio;
		System.out.println(menor);
		for (int i = inicio; i < fim; i++) {
			if (lista.get(i) < lista.get(menor)) {
				menor = i;
			}
		}
		return menor;	
	}
}