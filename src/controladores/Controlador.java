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
       // this.bancoPerguntas = new BancoPerguntas(this);
       // bancoPerguntas.instanciarPerguntas();
    }
    
    private void iniciar() {
        
    }
    
    
    public Pergunta sortearPergunta(){
        return null;
    }
    
    public void exibirTelaPergunta(){
        
    }
    
    public void conferirResposta(){
        
    }
    
    public void addAcertosRodada(){
        
    }
    
    public Pergunta sortearPerguntaByIdTema(int tema){
        return null;
    }
    
    public void atualizaEstadoJogador(Jogador jogadorDaVez){
        
    }
    
    public void verificarVencedor(){
        
    }
    
    public void informarVencedor(Jogador jogadorDaVez){
        
    }
    
    public Jogador getJogadorDaVez(){
        return null;
    }
    
    public void enviarJogada(){
        
    }
    
    public void receberJogada(EstadoDoJogo estado){
        
    }
    
    
    public void setPartidaEmAndamento(boolean partidaEmAndamento){
        
    }
    
    public void renderSe(){
        
    }
    
    public boolean informarConectado(){
        return false;
    }
    
    public void estabelecerConectado(boolean valor){
        
    }
    
    public void estabelecerDesconectado(boolean valor){
        
    }
    
    
    public boolean verificarPartidaEmAndamento(){
        return false;
    }
    
//    public static void main(String[] args) {
//        Controlador controlador = new Controlador()
//        controlador.iniciar();
//        
//    }
    
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
    
//	 public void criarJogador(String nome, boolean jogadorLocal){
//		 estadoJogo.criarJogador(nome, jogadorLocal);
//	 }
	
	public void criarJogador(String nome, boolean jogadorLocal) {
		if (jogador1 == null) {
			jogador1 = new Jogador(nome, jogadorLocal);
		} else if (jogador2 == null) {
			jogador2 = new Jogador(nome, jogadorLocal);
			}
		}
	

	
    
    
    
    
}
