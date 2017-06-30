/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores;

import entidades.Jogador;
import entidades.Pergunta;
import rede.AtorJogador;
import rede.EstadoDoJogo;

/**
 *
 * @author Leonardo
 */
public class Controlador {
    
	protected Jogador jogador1;
	protected Jogador jogador2;
    protected AtorJogador atorJogador;
    protected boolean jogadorDaVezVenceu;
    protected boolean jogadorDaVezRendeuSe;
    protected EstadoDoJogo estadoJogo;
    protected BancoPerguntas bancoPerguntas;
    protected Pergunta perguntaDaVez;
    protected boolean partidaEmAndamento;
    
    
    public Controlador(AtorJogador atorJogador){
        this.atorJogador = atorJogador;
        this.bancoPerguntas = new BancoPerguntas(this);
        bancoPerguntas.instanciarPerguntas();
    }
    

    public void renderSe(){
        this.jogadorDaVezRendeuSe = true;
    }
    
    //Verificar a lógica desse método, está com base no método do tribal wars
    public boolean verificarVencedor(){
    	Mesa mesaLocal = getJogadorLocal().getMesa();
    	if(mesaLocal.pontosAGanhar == 0){
    		this.atorJogador.avisarVencedor();
    		this.jogadorDaVezVenceu = true;
    		return true;
    	}	
    	return false;
    }		
    	
//    	if(jogadorRemoto.getVila().getPontosDeVida() <= 0){
//    		this.atorJogador.avisarVencedor();
//   			this.jogadorDaVezEhVencedor = true;
    		
 
    
    public Pergunta sortearPergunta(){
        return bancoPerguntas.sortearPergunta();
    }
    
    public void exibirTelaPergunta(){
        
    }
    public boolean conferirResposta(int respostaJogador) {
        if (this.perguntaDaVez.getRespostaCerta() == respostaJogador) {
        	return true;
        } 
//        else {
//        	//passar a vez
//        }
        return false;
    }
    
    public void addAcertosRodada(){
    	Mesa mesaLocal = getJogadorLocal().getMesa();
    	//mesaLocal.incrementarPontosGanhos();
    	mesaLocal.incrementarAcertosRodada();
    	if(mesaLocal.acertosRodada ==  2){
    		System.out.println("cfasfdsadsadasdasdasda");
    	}
    }
    
    public int getPontosGanhos(){
    	Mesa mesaLocal = getJogadorLocal().getMesa();
    	return mesaLocal.getPontosGanhos();
    }
    
    public void addPontosGanhos(){
    	Mesa mesaLocal = getJogadorLocal().getMesa();
    	mesaLocal.incrementarPontosGanhos();
    	mesaLocal.decrementarPontosAGanhar();
    }

    
    public int getAcertosRodada(){
    	Mesa mesaLocal = getJogadorLocal().getMesa();
    	return mesaLocal.getAcertosRodada();
    }
    
    public void zerarAcertosRodada(){
    	Mesa mesaLocal = getJogadorLocal().getMesa();
    	mesaLocal.zerarAcertosRodada();
    }
    
    public Pergunta sortearPerguntaByIdTema(int tema){
        return null;
    }
    

    
    
    public void informarVencedor(Jogador jogadorDaVez){
        
    }
    
    
	public Jogador getJogador1() {
		return jogador1;
	}

	public void setJogador1(Jogador jogador1) {
		this.jogador1 = jogador1;
	}

	public Jogador getJogador2() {
		return jogador2;
	}

	public void setJogador2(Jogador jogador2) {
		this.jogador2 = jogador2;
	}
    
	
	public void criarJogador(String nome, boolean jogadorLocal) {
		if (jogador1 == null) {
			jogador1 = new Jogador(nome, jogadorLocal);
		} else if (jogador2 == null) {
			jogador2 = new Jogador(nome, jogadorLocal);
			}
	}
	
	public Jogador getJogadorLocal(){
		return jogador1.isJogadorLocal() ? jogador1 : jogador2;
	}
	
	public Jogador getJogadorRemoto(){
		return jogador1.isJogadorLocal() ? jogador2 : jogador1;
	}
	
	
	
	//get e set EstadoDoJogo
	public EstadoDoJogo getEstado(){
		EstadoDoJogo estado = new EstadoDoJogo(jogador1.getMesa(), jogador2.getMesa(), jogadorDaVezRendeuSe, jogadorDaVezVenceu);
		return estado;
	}
	
	public boolean setEstado(EstadoDoJogo estado){
		jogador1.setMesa(estado.getMesa1());
		jogador2.setMesa(estado.getMesa2());
				
		if(estado.isVencedor()){
			atorJogador.avisarPerdedor();
			return false;
		}
		
		if(estado.isRendeuSe()){
			atorJogador.avisarRendeuSe();
			return false;
		}

		return true;
	}


	public void setPerguntaDaVez(Pergunta pergunta) {
		this.perguntaDaVez = pergunta;
	}
	
	
	public Pergunta sortearById(int num){
		return bancoPerguntas.sortearPerguntaByID(num);
	}
	
    
    
    
    
}
