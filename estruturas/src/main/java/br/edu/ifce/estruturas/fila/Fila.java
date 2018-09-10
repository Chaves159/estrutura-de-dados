package br.edu.ifce.estruturas.fila;
import java.util.LinkedList;
import java.util.List;
public class Fila<X> {
	int totalDeElementos = 0;
	List<X> elementos = new LinkedList<X>();
	
	public void adiciona(X f) {
		if(totalDeElementos == 0) {
			this.elementos.add(f);
			totalDeElementos++;
		}else {
			totalDeElementos++;
			this.elementos.add(f);
		}
	}
	public X remove() {
		totalDeElementos--;
		return this.elementos.remove(0);
	}
	
	public boolean Vazio(){
		return this.elementos.size()==0;
		
	}
}
