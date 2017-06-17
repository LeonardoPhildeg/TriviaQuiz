package rede;

//import br.ufsc.inf.leobr.cliente.exception.ArquivoMultiplayerException;
//import br.ufsc.inf.leobr.cliente.exception.JahConectadoException;
//import br.ufsc.inf.leobr.cliente.exception.NaoConectadoException;
//import br.ufsc.inf.leobr.cliente.exception.NaoPossivelConectarException;
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
        this.telaPrincipal.exibeTela();
        this.showNameQuestion();
        atorNetGames = new AtorNetGames(this);
        
    }
    
	private void showNameQuestion() {
		this.nome = this.telaPrincipal.showNameQuestion();
		if (this.nome.isEmpty()) {
			this.nome = "Anônimo";
		}
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
    
    public void iniciarPartidaResposta(boolean comecoJogando){
    	telaPrincipal.desabilitarIniciarPartida();
    	String nomeOutroJogador = atorNetGames.obterNomeAdversario();
        jogo = new Controlador(this);
        
        System.out.println("chegou aqui");
        if(comecoJogando){
            jogo.criarJogador(this.nome, true);
            jogo.criarJogador(nomeOutroJogador, false);
            this.telaPrincipal.showDialog("Jogo iniciado!\nVocê começa jogando!");
            this.telaPrincipal.atualizarNomeJogador1(this.nome, true);
            this.telaPrincipal.atualizarNomeJogador2(nomeOutroJogador, false);
            telaPrincipal.habilitaBotaoSortear();
            telaPrincipal.habilitaBotaoRenderSe();
        
        }else{
            jogo.criarJogador(nomeOutroJogador, false);
            jogo.criarJogador(this.nome, true);
            this.telaPrincipal.showDialog("Jogo iniciado!\nAguarde a jogada de seu adversário.");
            this.telaPrincipal.atualizarNomeJogador1(nomeOutroJogador, false);
            this.telaPrincipal.atualizarNomeJogador2(this.nome, true);
            telaPrincipal.desabilitaBotaoSortear();
            telaPrincipal.desabilitaBotaoRenderSe();
        }
    }
    
    public void sortearPergunta(){
    	if(atorNetGames.ehMinhaVez()){
    		System.out.println("Oi LINDO!");
    		
    	}else{
    		telaPrincipal.showDialog("Não é a sua vez!");
    	}
    }
        
        
        
    
    public void receberJogada(EstadoDoJogo estado){
        
    }
    
    public void renderSe(){
        
    }
    
	public void conectar()  {
		atorNetGames.conectar(nome, "localhost");
	}
    
    public void iniciarPartidaPedido() {
        atorNetGames.iniciarPartidaRede();
    }
    
    
    
    public void desconectar(){
        atorNetGames.desconectar();
    }
    
    
    public boolean avaliarInterrupcao(){
        return false;
    }

    void receberEstado(EstadoDoJogo estado) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    

}
