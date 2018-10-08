/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifce.estruturas.mapa;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author RDC
 */
public class Mapa {
    private List<Associacao> associacoes = new ArrayList<Associacao>();
   
    public void adiciona(String placa,Carro carro){
        if(!contemChave(placa)){
            Associacao a1 = new Associacao(placa,carro);
            this.associacoes.add(a1);
          
        }
    }
    public void remove(String placa){
        if(this.contemChave(placa)){
            for(Associacao a : this.associacoes){
                if(placa.equals(a.getPlaca())){
                    this.associacoes.remove(a);
                    break;
                }
                
            }
                    
        }
        
    }
    public Carro pega(String placa){
        for(Associacao a : this.associacoes){
            if(placa.equals(a.getPlaca())){
                return a.getCarro();
            }
        }
        return null;
    }
    public boolean contemChave(String placa){
        if(this.contemChave(placa)){
            for(Associacao a : this.associacoes){
                if(placa.equals(a.getPlaca())){
                   return true;
                }
                
            }
                    
        }
        return false;
        
    }
    
}
