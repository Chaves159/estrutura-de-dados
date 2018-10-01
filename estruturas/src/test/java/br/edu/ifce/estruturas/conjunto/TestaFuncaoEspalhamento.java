package br.edu.ifce.estruturas.conjunto;

public class TestaFuncaoEspalhamento {
	public static void main(String[]args) {
		
		ConjuntoEspalhamento ce1 = new ConjuntoEspalhamento();
		
		for(int i = 0;i<1000;i++) {
			ce1.adiciona("" + i);
		}
		
		System.out.println(ce1.toString());
	}
	
}
	
