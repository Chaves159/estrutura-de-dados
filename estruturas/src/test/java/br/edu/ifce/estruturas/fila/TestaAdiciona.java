package br.edu.ifce.estruturas.fila;

public class TestaAdiciona {
	public static void main(String[]args) {
		Fila<String> p1 = new Fila<String>();
		String a;
		p1.adiciona("Joao");
		p1.adiciona("Gustavo");
		p1.adiciona("Cleziana");
		p1.adiciona("Junior");
		p1.adiciona("Renata");
		
		p1.remove();
		p1.remove();
		a = p1.remove();
		
		System.out.println(a);
		
		
		
		
		
		
		
	}
}
