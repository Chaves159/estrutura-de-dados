package br.edu.ifce.estruturas.ordenacao;
import java.util.ArrayList;
import java.util.List;
public class TestaTransporte {
	public static void main(String[]args) {
		List<Transporte> lista = new ArrayList<Transporte>();
		Transporte t1 = new Transporte();
		Transporte t2 = new Transporte();
		Transporte t3 = new Transporte();
		Transporte t4 = new Transporte();
		Transporte t5 = new Transporte();
		t1.setNome("Lancha");
		t1.setValor(9000000);
		t2.setNome("Aviao");
		t2.setValor(90000000);
		t3.setNome("bike");
		t3.setValor(900);
		t4.setNome("Patins");
		t4.setValor(150);
		t5.setNome("Bross");
		t5.setValor(12000);
		
		lista.add(t1);
		lista.add(t2);
		lista.add(t3);
		lista.add(t4);
		lista.add(t5);
		
		Transporte menor = lista.get(0);
		
		for(int i = 0;i < lista.size();i++){
			if(lista.get(i).getValor() < menor.getValor()) {
				menor = lista.get(i);
			}
			
		}
		System.out.println("Transporte: " + menor.getNome() + ", Valor: " + menor.getValor());
	}
}
