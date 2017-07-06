package controladores;

import br.ufsc.inf.leobr.cliente.Jogada;

public class Mesa implements Jogada {

	
	protected int pontosAGanhar;
	protected int pontosGanhos;
	protected int acertosRodada;
	
	
	public Mesa(){
		this.pontosAGanhar = 5;
		this.pontosGanhos = 0;
		this.acertosRodada = 0;
	}
	
	
	public int getPontosAGanhar() {
		return pontosAGanhar;
	}
	
	
	public int getPontosGanhos() {
		return pontosGanhos;
	}
	
	public int getAcertosRodada(){
		return acertosRodada;
	}

	public void decrementarPontosAGanhar(){
		this.pontosAGanhar = this.pontosAGanhar - 1;
	}
	
	public void incrementarPontosGanhos(){
		this.pontosGanhos = this.pontosGanhos + 1;
	}
	
	public void incrementarAcertosRodada(){
		this.acertosRodada = this.acertosRodada + 1;
	}
	
	public void zerarAcertosRodada(){
		this.acertosRodada = 0;
	}	
	
}
