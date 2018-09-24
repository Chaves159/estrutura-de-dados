package br.edu.ifce.estruturas.conjunto;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ConjuntoEspalhamento {
	private int totalDeElementos = 0;
	
	public ArrayList<LinkedList<String>> tabelaEspalhamento = new ArrayList<LinkedList<String>>();
	
	public int funcaoEspalhamento(String palavra) {
		return palavra.toLowerCase().charAt(0)%26;
	}
	public void adiciona(String palavra){
		if(!this.contem(palavra)){
			int indice = this.funcaoEspalhamento(palavra);
			LinkedList<String> lista = this.tabelaEspalhamento.get(indice);
			lista.add(palavra);
			this.totalDeElementos++;
		}
	}
	private int calcularCodigoEspalhamento(String palavra) {
			int somaCodigo= 1;
			
			for(int i = 0; i<palavra.length();i++){
				somaCodigo =31*somaCodigo + palavra.toLowerCase().charAt(i);
			}
			return somaCodigo;
	}
	public int calculaIndiceDaTabela(String palavra) {
		int codigoEspalhamento = Math.abs(calcularCodigoEspalhamento(palavra));
		return codigoEspalhamento %this.tabelaEspalhamento.size();
	}
	public void remove(String palavra){
		if (this.contem(palavra)) {
			int indice = palavra.toLowerCase().charAt(0)%26;
			List<String> lista = this.tabelaEspalhamento.get(indice);
			lista.remove(palavra);
			this.totalDeElementos--;
		}
	}
	public boolean contem (String palavra){
		int indice =  palavra.toLowerCase().charAt(0)%26;
		List<String> lista = this.tabelaEspalhamento.get(indice);
		return lista.contains(palavra);
	}
	
	public List<String> pegaTodasPalavras(){
		List<String> palavras = new ArrayList<String>();
		for (int i = 0; i < this.tabelaEspalhamento.size(); i++) {
			palavras.addAll(this.tabelaEspalhamento.get(i));
		}
			return palavras;
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
		List<String> backup = this.pegaTodasPalavras();
		this.tabelaEspalhamento.clear();
		
		for(int i = 0;i< novaCapacidade;i++){
			LinkedList<String> lista = new LinkedList<String>();
			this.tabelaEspalhamento.add(lista);
		}
		for(String palavra :backup) {
			this.adiciona(palavra);
		}
	
	}
	public ConjuntoEspalhamento(){
		for(int i = 0;i<26;i++){
			LinkedList<String> lista = new LinkedList<String>();
			tabelaEspalhamento.add(lista);
		}
		
		
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("[%d]--> %s",this.totalDeElementos,this.tabelaEspalhamento);
	}

}
