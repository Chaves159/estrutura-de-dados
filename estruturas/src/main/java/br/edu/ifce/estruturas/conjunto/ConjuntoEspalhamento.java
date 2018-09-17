package br.edu.ifce.estruturas.conjunto;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ConjuntoEspalhamento {
	
	private ArrayList<LinkedList<String>> tabelaEspalhamento = new ArrayList<LinkedList<String>>();
	
	public int funcaoEspalhamento(String palavra) {
		return palavra.toLowerCase().charAt(0)%26;
	}
	public void adiciona(String palavra){
		if(!this.contem(palavra)){
			int indice = this.funcaoEspalhamento(palavra);
			LinkedList<String> lista = this.tabelaEspalhamento.get(indice);
			lista.add(palavra);
		}
		}
	public void remove(String palavra){
		
	}
	public boolean contem (String palavra){
		//implementacao
		return false;
	}
	public List<String> pegaTodasPalavras(){
		
		return null;
		
		
	}
	public int tamanho() {
		return 0;
	}
	public ConjuntoEspalhamento(){
		for(int i = 0;i<26;i++){
			LinkedList<String> lista = new LinkedList<String>();
			tabelaEspalhamento.add(lista);
			
		}
		
	}

}
