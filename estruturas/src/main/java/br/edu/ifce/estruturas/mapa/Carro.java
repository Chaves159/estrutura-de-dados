/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifce.estruturas.mapa;

/**
 *
 * @author RDC
 */
public class Carro {
    private String nome;
    private String marca;
    private String cor;
    private int ano;

    
    public String getNome() {
        return this.nome;
    }

    
    public void setNome(String nome) {
        this.nome = nome;
    }

    
    public String getMarca() {
        return this.marca;
    }

    
    public void setMarca(String marca) {
        this.marca = marca;
    }

    
    public String getCor() {
        return this.cor;
    }

   
    public void setCor(String cor) {
        this.cor = cor;
    }

    
    public int getAno() {
        return ano;
    }

   
    public void setAno(int ano) {
        this.ano = ano;
    }
    
}
