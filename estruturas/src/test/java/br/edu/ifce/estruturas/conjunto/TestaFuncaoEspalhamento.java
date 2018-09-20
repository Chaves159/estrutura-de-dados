package br.edu.ifce.estruturas.conjunto;

public class TestaFuncaoEspalhamento {
	public static void main(String[]args) {
		
		ConjuntoEspalhamento ce1 = new ConjuntoEspalhamento();
		
		System.out.println(ce1.funcaoEspalhamento("Eminem"));
		
		System.out.println(ce1.funcaoEspalhamento("JosiFreudo"));
		
		ce1.adiciona("Eminem");
		
		ce1.adiciona("Eminem");
		
		ce1.adiciona("JosiFreudo");
		
		ce1.adiciona("JosiFreudos");
		
		System.out.println(ce1.toString());
		
		System.out.println(ce1.pegaTodasPalavras());
		
		System.out.println(ce1.contem("Eminem"));
		
		ce1.remove("Eminem");
		
		System.out.println(ce1.contem("Eminem"));
		
		System.out.println(ce1.tamanho());
	}
	

}
