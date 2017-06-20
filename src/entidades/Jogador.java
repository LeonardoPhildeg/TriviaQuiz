/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import controladores.Mesa;

/**
 *
 * @author Leonardo
 */
public class Jogador {
    
    protected String nome;
    protected int idJogador;
    protected String [] temasGanhos;
    protected String [] temasAGanhar;
    //protected int pontosGanhos;
    //protected int pontosAGanhar;
    protected boolean jogadorLocal;
    protected Mesa mesa;
    
    
    public Jogador(String nome, boolean jogadorLocal){
        mesa = new Mesa();
    	this.nome = nome;
        this.jogadorLocal = jogadorLocal;
    }
    
	public boolean isJogadorLocal() {
		return jogadorLocal;
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

    
//    public int getPontosAGanhar(){
//    	return this.pontosAGanhar;
//    }
//    
//    public void setPontosAGanhar(int pontosAGanhar){
//    	this.pontosAGanhar = pontosAGanhar;
//    }
//    
//    public int getPontosAGanhos(){
//    	return this.pontosGanhos;
//    }
//    
//    public void setPontosGanhos(int pontosGanhos){
//    	this.pontosGanhos = pontosGanhos;
//    }
    
    public Mesa getMesa() {
    	return mesa;
    }
    
    public void setMesa(Mesa mesa) {
    	this.mesa = mesa;
    }
    
    
    
}
