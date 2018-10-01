package br.edu.ifce.estruturas.conjunto;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ConjuntoEspalhamento {
	private int totalDeElementos = 0;
	
	public ArrayList<LinkedList<Object>> tabelaEspalhamento = new ArrayList<LinkedList<Object>>();
	
	public void adiciona(Object objeto){
		if(!this.contem(objeto)){
			int indice = this.calculaIndiceDaTabela(objeto);
			LinkedList<Object> lista = this.tabelaEspalhamento.get(indice);
			lista.add(objeto);
			this.totalDeElementos++;
		}
	}
	
	public int calculaIndiceDaTabela(Object objeto) {
		
		int codigoEspalhamento = objeto.hashCode();
			codigoEspalhamento =	Math.abs(codigoEspalhamento);
		return codigoEspalhamento %this.tabelaEspalhamento.size();
	}
	public void remove(Object objeto){
		if (this.contem(objeto)) {
			int indice = this.calculaIndiceDaTabela(objeto);
			List<Object> lista = this.tabelaEspalhamento.get(indice);
			lista.remove(objeto);
			this.totalDeElementos--;
			this.verificaCarga();
			}
	}
	public boolean contem (Object objeto){
		int indice = calculaIndiceDaTabela(objeto);
		List<Object> lista = this.tabelaEspalhamento.get(indice);
		return lista.contains(objeto);
	}
	
	public List<Object> pegaTodasPalavras(){
		List<Object> objeto = new ArrayList<Object>();
		for (int i = 0; i < this.tabelaEspalhamento.size(); i++) {
			objeto.addAll(this.tabelaEspalhamento.get(i));
		}
			return objeto;
	}

	public int tamanho() {
		return this.totalDeElementos;
	}
	private void verificaCarga() {
		int capacidade = this.tabelaEspalhamento.size();
		double carga = this.tamanho()/capacidade;
		
		if(carga > 0.75) {
			this.redimensionarTabela(capacidade * 2);
		}else if(carga < 0.25) {
			this.redimensionarTabela(Math.max(capacidade/2, 10));
		}
	}
	private void redimensionarTabela(int novaCapacidade) {
		List<Object> backup = this.pegaTodasPalavras();
		this.tabelaEspalhamento.clear();
		
		for(int i = 0;i< novaCapacidade;i++){
			LinkedList<Object> lista = new LinkedList<Object>();
			this.tabelaEspalhamento.add(lista);
		}
		for(Object objeto :backup) {
			this.adiciona(objeto);
		}
	
	}
	public ConjuntoEspalhamento(){
		for(int i = 0;i<26;i++){
			LinkedList<Object> lista = new LinkedList<Object>();
			tabelaEspalhamento.add(lista);
		}
		
		
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("[%d]--> %s",this.totalDeElementos,this.tabelaEspalhamento);
	}

}
