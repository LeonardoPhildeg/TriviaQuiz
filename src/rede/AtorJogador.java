/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rede;

import controladores.Controlador;

/**
 *
 * @author Leonardo
 */
public class AtorJogador {
    
    protected String nome;
    protected Controlador jogo;
    protected AtorNetGames atorNetGames;
    
    public AtorJogador(){
        
    }
    
    
    public int escolherTema(){
        return 0;
    }
    
    public int clickEscolherTema(int idTema){
        return 0;
    }
    
    public String notificarVencedor(String mensagem){
        return"";
    }
    
    public void iniciarNovaPartida(){
        
    }
    
    public void receberJogada(EstadoDoJogo estado){
        
    }
    
    public void renderSe(){
        
    }
    
    public int conectar(){
        return 0;
    }
    
    public String obterDadosConexao(){
        return "";
    }
    
    public int desconectar(){
        return 0;
    }
    
    public int iniciarPartida(){
        //É NECESSÁRIO??????
        return 0;
    }
    
    public boolean avaliarInterrupcao(){
        return false;
    }
    
}
