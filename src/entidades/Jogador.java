/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

/**
 *
 * @author Leonardo
 */
public class Jogador {
    
    protected String nome;
    protected int idJogador;
    protected boolean vez;
    protected int acertosRodada;
    protected String [] temasGanhos;
    protected String [] temasAGanhar;
    protected int pontosGanhos;
    protected int pontosAGnhar;
    
    
    public Jogador(){
        
    }
    
    
    public boolean isVencedor(){
        return false;
    }
    
    public Jogador iniciar(){
        return null;
    }
    
    public void setVez(boolean vez){
        
    }
    
    public boolean isJogadorDaVez(){
        return false;
    }
}
