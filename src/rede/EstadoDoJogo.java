/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rede;
import br.ufsc.inf.leobr.cliente.Jogada;

import entidades.Jogador;

/**
 *
 * @author Leonardo
 */
public class EstadoDoJogo implements Jogada {
    
    protected int numeroRodada;
    protected Jogador jogador1;
    protected Jogador jogador2;
           
    public EstadoDoJogo(){
        super();

    }
    
    
    
    public void criarJogador(String nome, boolean jogadorLocal){
        if (jogador1 == null) {
            jogador1 = new Jogador(nome, jogadorLocal);
        } else if (jogador2 == null) {
            jogador2 = new Jogador(nome, jogadorLocal);
        }
    }
    
    public void atualizaEstadoJogo(Jogador jogadorDaVez){
        
    }
    
    public boolean setJogadorDaVez(boolean jogadorDaVez){
        return false;
    }
    
    public Jogador getJogador1(){
        return jogador1;
    }
    
    public Jogador getJogador2(){
        return jogador2;
    }
    
    
    
    
    

    
    
    
    
}
