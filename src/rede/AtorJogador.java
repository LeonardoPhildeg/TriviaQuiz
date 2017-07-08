package rede;

import controladores.Controlador;
import entidades.Pergunta;
import views.TelaEscolheTema;
import views.TelaPergunta;
import views.TelaPerguntaByTemaEscolhido;
import views.TelaPrincipal;


public class AtorJogador {
    
    protected String nome;
    protected Controlador jogo;
    protected AtorNetGames atorNetGames;
    protected TelaPrincipal telaPrincipal;
    protected TelaPergunta telaPergunta;
    protected TelaEscolheTema telaEscolheTema;
    protected TelaPerguntaByTemaEscolhido telaPerguntaByTemaEscolhido;
    
    
    public AtorJogador(){
        this.telaPrincipal = new TelaPrincipal(this);
        this.telaPergunta = new TelaPergunta(this);
        this.telaEscolheTema = new TelaEscolheTema(this);
        this.telaPerguntaByTemaEscolhido = new TelaPerguntaByTemaEscolhido(this);
        exibeTela();
        this.showNameQuestion();
        atorNetGames = new AtorNetGames(this);
      
    }
    
    private void showNameQuestion() {
    this.nome = this.telaPrincipal.showNameQuestion();
        if (this.nome.isEmpty()) {
            this.nome = "Anônimo";
        }
    }
    
    public void exibeTela(){
    	this.telaPrincipal.exibeTela();
    	telaPrincipal.desabilitaBotaoSortear();
    	telaPrincipal.desabilitaBotaoRenderSe();
    }
    
    
    public TelaPrincipal getTelaPrincipal(){
        return telaPrincipal;
    }
        
    public void iniciarPartidaResposta(boolean comecoJogando){
    	telaPrincipal.desabilitarIniciarPartida();
    	String nomeOutroJogador = atorNetGames.obterNomeAdversario();
        jogo = new Controlador(this);
        
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
            this.telaPrincipal.showDialog("Jogo iniciado!\nAguarde a jogada do seu adversário.");
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
	            jogo.setPerguntaDaVez(pergunta);
	            telaPergunta.exibirTela(pergunta.getEnunciado(), alternativas);
            }    
    	}
    	else{
    		telaPrincipal.showDialog("Não é a sua vez!");
    	}
    }
	            

             
    
    public void sortearPerguntaById(int num){
    	if(atorNetGames.ehMinhaVez()){
    		Pergunta pergunta = jogo.sortearById(num);
    		if(pergunta != null){
    			String[] alternativas = new String[4];
    			alternativas[0] = pergunta.getAlternativa1();
    			alternativas[1] = pergunta.getAlternativa2();
    			alternativas[2] = pergunta.getAlternativa3();
    			alternativas[3] = pergunta.getAlternativa4();
    			jogo.setPerguntaDaVez(pergunta);
    			telaPerguntaByTemaEscolhido.exibirTela(pergunta.getEnunciado(),alternativas);
    		}
    		
    	}
    }
    
    		
        
    public void renderSe(){
        if(atorNetGames.ehMinhaVez()){
            jogo.renderSe();
       	    this.enviarEstado();
            this.telaPrincipal.atualizarInterface(jogo.getEstado());
            this.telaPrincipal.showDialog("Você se rendeu.\nO jogo acabou.");
            this.telaPrincipal.desabilitaBotaoRenderSe();
            this.telaPrincipal.habilitarIniciarPartida();
        } else {
            this.telaPrincipal.showDialog("Não é a sua vez!");
        }
    }
    
	public void avisarRendeuSe() {
		this.telaPrincipal.desabilitaBotaoSortear();
		this.telaPrincipal.desabilitaBotaoRenderSe();
		this.telaPrincipal.showDialog("O outro jogador se rendeu.\nParabéns! Você é o vencedor! ;)\nO jogo acabou.");
	}
	
	public void avisarVencedor() {
		this.telaPrincipal.desabilitaBotaoSortear();
		this.telaPrincipal.desabilitaBotaoRenderSe();
		this.telaPrincipal.habilitarIniciarPartida();
		this.telaPrincipal.showDialog("Parabéns! Você é o vencedor! ;)\nO jogo acabou.");
	}
	
	public void avisarPerdedor() {
		this.telaPrincipal.desabilitaBotaoSortear();
		this.telaPrincipal.desabilitaBotaoRenderSe();
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

    public void enviarEstado(){
    	this.telaPrincipal.desabilitaBotaoSortear();
    	atorNetGames.enviarEstado(jogo.getEstado());
    }
    
    public void receberEstado(EstadoDoJogo estado) {
		this.telaPrincipal.atualizarInterface(estado);
		if (!jogo.setEstado(estado)) {
			this.telaPrincipal.desabilitaBotaoSortear();
			this.telaPrincipal.desabilitaBotaoRenderSe();
			this.telaPrincipal.habilitarIniciarPartida();
		} else {
			this.telaPrincipal.habilitaBotaoSortear();
			this.telaPrincipal.habilitaBotaoRenderSe();
		}
    }
    
    public void conferirResposta(int respostaJogador) {
    	boolean acerto = jogo.conferirResposta(respostaJogador);
    	if (acerto) {
    		jogo.addAcertosRodada();
    		this.telaPergunta.acertou();
    		if(jogo.getAcertosRodada() == 2){
    			telaEscolheTema.exibeTelaEscolheTema();
    			jogo.zerarAcertosRodada();
    		}
    		telaPrincipal.atualizarInterface(jogo.getEstado());
    	} else {
    		this.telaPrincipal.desabilitaBotaoSortear();
    		this.telaPergunta.errou();
    		jogo.zerarAcertosRodada();
    		this.enviarEstado();
    		this.telaPrincipal.atualizarInterface(jogo.getEstado());
    	}
    }
    	

    
    
    public void conferirRespostaById(int respostaJogador){
    	boolean acerto = jogo.conferirResposta(respostaJogador);
    	if(acerto){
    		jogo.addPontosGanhos();
    		telaPerguntaByTemaEscolhido.acertou();
    		if(jogo.verificarVencedor()){
    			this.enviarEstado();
    		}
    		
			jogo.addPontosConsecutivos();
			
			if(jogo.getPontosConsecutivos() == 3 ){
				this.telaPrincipal.showDialog("Você não pode ganhar 3 pontos seguidos! \nAgora é a vez do seu adversário.");
				jogo.zerarPontosConsecutivos();
				this.enviarEstado();
				this.telaPrincipal.atualizarInterface(jogo.getEstado());
			}
			telaPrincipal.atualizarInterface(jogo.getEstado());
    	}
    	else{
    		telaPerguntaByTemaEscolhido.errou();
    		this.enviarEstado();
    		telaPrincipal.atualizarInterface(jogo.getEstado());
    	}
    }
				

    	
    		
    
}
