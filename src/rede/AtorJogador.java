/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rede;

import controladores.Controlador;
import views.TelaPrincipal;

/**
 *
 * @author Leonardo
 */
public class AtorJogador {
    
    protected String nome;
    protected Controlador jogo;
    protected AtorNetGames atorNetGames;
    protected TelaPrincipal telaPrincipal;
    
    public AtorJogador(){
        this.telaPrincipal = new TelaPrincipal(this);
        atorNetGames = new AtorNetGames(this);
        
    }
    
    public TelaPrincipal getTelaPrincipal(){
        return telaPrincipal;
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
    
    public void iniciarNovaRede(boolean comecoJogando){
        
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

    void receberEstado(EstadoDoJogo estado) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
