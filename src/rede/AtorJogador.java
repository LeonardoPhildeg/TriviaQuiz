package rede;

//import br.ufsc.inf.leobr.cliente.exception.ArquivoMultiplayerException;
//import br.ufsc.inf.leobr.cliente.exception.JahConectadoException;
//import br.ufsc.inf.leobr.cliente.exception.NaoConectadoException;
//import br.ufsc.inf.leobr.cliente.exception.NaoPossivelConectarException;
import controladores.Controlador;
import entidades.Pergunta;
import views.TelaEscolheTema;
import views.TelaPergunta;
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
    protected TelaPergunta telaPergunta;
    protected TelaEscolheTema telaEscolheTema;
    
    public AtorJogador(){
        this.telaPrincipal = new TelaPrincipal(this);
        this.telaPergunta = new TelaPergunta(this);
        this.telaEscolheTema = new TelaEscolheTema(this);
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
        this.telaPrincipal.atualizarInterface(jogo.getEstado());
    }
    
    public void sortearPergunta(){
    	if(atorNetGames.ehMinhaVez()){
            Pergunta pergunta = jogo.sortearPergunta();
            
            if (pergunta!=null) {
	            String[] alternativas = new String[4];
	            alternativas[0] = pergunta.getAlternativa1();
	            alternativas[1] = pergunta.getAlternativa2();
	            alternativas[2] = pergunta.getAlternativa3();
	            alternativas[3] = pergunta.getAlternativa4();
	           // int resposta = pergunta.getRespostaCerta();
	            jogo.setPerguntaDaVez(pergunta);
	            telaPergunta.exibirTela(pergunta.getEnunciado(),alternativas);
	            
	            /*if(jogo.conferirResposta(pergunta, respostaJogador)) {
	            	jogo.addAcertosRodada();
	            	telaPrincipal.showDialog("Acerto");
	            	this.telaPrincipal.atualizarInterface(jogo.getEstado());
	            	//atualizar a tela principal
	            } else {
	            	telaPrincipal.showDialog("Errado");
	            	//passar a vez
	            }*/
            } else {
            	this.telaPrincipal.showDialog("BUG NA PERGUNTA");
            }    
    	} else{
            telaPrincipal.showDialog("Não é a sua vez!");
    	}
    }
        
        
      public void renderSe(){
        if(atorNetGames.ehMinhaVez()){
            jogo.renderSe();
       	    this.enviarEstado();
            telaPrincipal.atualizarInterface(jogo.getEstado());
            this.telaPrincipal.showDialog("Você se rendeu.\nO jogo acabou.");
            telaPrincipal.desabilitaBotaoRenderSe();
            telaPrincipal.habilitarIniciarPartida();
        } else {
            telaPrincipal.showDialog("Não é a sua vez!");
        }
    }
    
	public void avisarRendeuSe() {
		telaPrincipal.desabilitaBotaoSortear();
		telaPrincipal.desabilitaBotaoRenderSe();
		this.telaPrincipal.showDialog("O outro jogador se rendeu.\nParabéns! Você é o vencedor! ;)\nO jogo acabou.");
	}
	
	public void avisarVencedor() {
		telaPrincipal.desabilitaBotaoSortear();
		telaPrincipal.desabilitaBotaoRenderSe();
		telaPrincipal.habilitarIniciarPartida();
		this.telaPrincipal.showDialog("Parabéns! Você é o vencedor! ;)\nO jogo acabou.");
	}
	
	public void avisarPerdedor() {
		telaPrincipal.desabilitaBotaoSortear();
		telaPrincipal.desabilitaBotaoRenderSe();
		this.telaPrincipal.showDialog("Você perdeu :(\nO jogo acabou.");
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

    public void enviarEstado(){
    	telaPrincipal.desabilitaBotaoSortear();
    	atorNetGames.enviarEstado(jogo.getEstado());
    }
    
    public void receberEstado(EstadoDoJogo estado) {
		telaPrincipal.atualizarInterface(estado);
		if (!jogo.setEstado(estado)) {
			telaPrincipal.desabilitaBotaoSortear();
			telaPrincipal.desabilitaBotaoRenderSe();
			telaPrincipal.habilitarIniciarPartida();
		} else {
			telaPrincipal.habilitaBotaoSortear();
			telaPrincipal.habilitaBotaoRenderSe();
		}
    }
    
    public void conferirResposta(int respostaJogador) {
    	boolean acerto = jogo.conferirResposta(respostaJogador);
    	if (acerto) {
    		jogo.addAcertosRodada();
    		telaPergunta.acertou();
    		if(jogo.getAcertosRodada() == 2){
    			telaEscolheTema.exibeTelaEscolheTema();
    			jogo.zerarAcertosRodada();
    		}
    		telaPrincipal.atualizarInterface(jogo.getEstado());
    	} else {
    		telaPergunta.errou();
    		jogo.zerarAcertosRodada();
    		this.enviarEstado();
    		telaPrincipal.atualizarInterface(jogo.getEstado());
    	}

    }
    
}
