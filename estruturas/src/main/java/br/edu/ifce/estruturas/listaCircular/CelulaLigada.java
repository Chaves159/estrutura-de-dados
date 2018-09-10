package br.edu.ifce.estruturas.listaCircular;

import br.edu.ifce.estruturas.lista.Celula;

public class CelulaLigada {

	private Celula proxima;
	
	private Object elemento;
	
	private Celula anterior;
	
	private Celula ultima;
	
	public CelulaLigada(Celula proxima, Object elemento) {
		this.proxima = proxima;
		this.elemento = elemento;
	}
	
	public CelulaLigada(Object elemento) {
		this.elemento = elemento;
	}
	
	public void setProxima(Celula proxima) {
		this.proxima = proxima;
	}
	
	public Celula getProxima() {
		return proxima;
	}
	public void setAnterior(Celula anterior) {
		this.anterior = anterior;
	}
	
	public Celula getAnterior() {
		return anterior;
	}
	
	public Object getElemento() {
		return elemento;
	}

	public Celula getUltima() {
		return ultima;
	}

	public void setUltima(Celula ultima) {
		this.ultima = ultima;
	}
}
