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
    
    protected AtorJogador atorJogador;
    protected boolean jogadorDaVezVenceu;
    protected boolean jogadorDaVezRendeuSe;
    protected EstadoDoJogo estadoJogo;
    protected BancoPerguntas bancoPerguntas;
    protected Pergunta perguntaDaVez;
    protected boolean partidaEmAndamento;
    
    
    public Controlador(){
        this.bancoPerguntas = new BancoPerguntas(this);
        bancoPerguntas.instanciarPerguntas();
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
    
    public void setJogador1(Jogador jogador){
        
    }
    
    public void setJogador2(Jogador jogador){
        
    }
    
    public Jogador getJogador2(){
        return null;
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
    
    public void instanciarJogadores(){
        
    }
    
    public boolean verificarPartidaEmAndamento(){
        return false;
    }
    
    public static void main(String[] args) {
        Controlador controlador = new Controlador();
        controlador.iniciar();
    }

    
    
}
