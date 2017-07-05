package entidades;

import controladores.Mesa;

public class Jogador {
    
    protected String nome;
    protected int idJogador;
    protected String [] temasGanhos;
    protected String [] temasAGanhar;
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

    
    public Mesa getMesa() {
    	return mesa;
    }
    
    public void setMesa(Mesa mesa) {
    	this.mesa = mesa;
    }
    
    
}
