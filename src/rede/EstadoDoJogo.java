package rede;

import br.ufsc.inf.leobr.cliente.Jogada;
import controladores.Mesa;


public class EstadoDoJogo implements Jogada {
    
	
	
	protected Mesa mesa1;
	protected Mesa mesa2;
	protected int numeroRodada;
	protected boolean rendeuSe;
	protected boolean vencedor;

    public EstadoDoJogo(Mesa mesa1, Mesa mesa2, boolean rendeuSe, boolean vencedor){
        super();
        this.mesa1 = mesa1;
        this.mesa2 = mesa2;
        this.rendeuSe = rendeuSe;
        this.vencedor = vencedor;

    }
    
    public Mesa getMesa1() {
    	return mesa1;
    }
    
    public void setMesa1(Mesa mesa1) {
    	this.mesa1 = mesa1;
    }
    
    public Mesa getMesa2() {
    	return mesa2;
    }
    
    public void setMesa2(Mesa mesa2) {
    	this.mesa2 = mesa2;
    }
    
    public boolean isRendeuSe() {
    	return rendeuSe;
    }
    
    
    public void setRendeuSe(boolean rendeuSe) {
    	this.rendeuSe = rendeuSe;
    }
    
    
    public boolean isVencedor() {
    	return vencedor;
    }
    
    public void setVencedor(boolean vencedor) {
    	this.vencedor = vencedor;
    
	}


    
    
}
    
    
    
    
    


























    

    

    
    
    
    
    

    
    
    
    

