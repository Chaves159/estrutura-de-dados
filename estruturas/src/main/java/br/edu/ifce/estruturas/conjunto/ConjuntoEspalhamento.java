package br.edu.ifce.estruturas.conjunto;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ConjuntoEspalhamento {
	private int totalDeElementos = 0;
	
	private ArrayList<LinkedList<String>> tabelaEspalhamento = new ArrayList<LinkedList<String>>();
	
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
	public ConjuntoEspalhamento(){
		for(int i = 0;i<26;i++){
			LinkedList<String> lista = new LinkedList<String>();
			tabelaEspalhamento.add(lista);
			
		}
		
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

}
