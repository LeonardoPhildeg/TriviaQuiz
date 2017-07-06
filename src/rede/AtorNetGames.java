package rede;
import br.ufsc.inf.leobr.cliente.Jogada;
import br.ufsc.inf.leobr.cliente.OuvidorProxy;
import br.ufsc.inf.leobr.cliente.Proxy;
import br.ufsc.inf.leobr.cliente.exception.NaoConectadoException;
import br.ufsc.inf.leobr.cliente.exception.NaoJogandoException;


public class AtorNetGames implements OuvidorProxy{
    

    protected AtorJogador atorJogador;
    protected Proxy proxy;
    protected boolean minhaVez = false;
    
    public AtorNetGames(AtorJogador atorJogador){
        super();
        this.atorJogador = atorJogador;
        proxy = Proxy.getInstance();
        proxy.addOuvinte(this);
    }

    
    public void conectar(String idJogador, String servidor)  {
        try {
            proxy.conectar(servidor, idJogador);
            atorJogador.getTelaPrincipal().showDialog("Conexão estabelecida com sucesso!");
        }catch (Exception msg) {
            atorJogador.getTelaPrincipal().showDialog(msg.getMessage());
        }
    }
    
    public void desconectar()  {
        try {
            proxy.desconectar();
        } catch (NaoConectadoException e) {
            e.printStackTrace();
		}
    }
    
    public void iniciarPartidaRede(){
        try{
            proxy.iniciarPartida(2);
        }catch(NaoConectadoException e){
            atorJogador.getTelaPrincipal().showDialog(e.getMessage());
            e.printStackTrace();
        }
    }    
        
        
    @Override
    public void iniciarNovaPartida(Integer posicao) {
    	minhaVez = posicao == 1 ? true : false;
    	atorJogador.iniciarPartidaResposta(minhaVez);
    }
    

    @Override
    public void finalizarPartidaComErro(String message) {
        atorJogador.getTelaPrincipal().showDialog(message);
    }
    
    public void enviarEstado(EstadoDoJogo mensagem){
        try{
            proxy.enviaJogada(mensagem);
            minhaVez = false;
        }catch (NaoJogandoException e){
            atorJogador.getTelaPrincipal().showDialog(e.getMessage());
        }
    }

    @Override
    public void receberJogada(Jogada jogada) {
        EstadoDoJogo estado = (EstadoDoJogo) jogada;
        atorJogador.receberEstado(estado);
        minhaVez = true;
        
    }

    @Override
    public void tratarConexaoPerdida() {
        atorJogador.getTelaPrincipal().showDialog("A conexão com o servidor foi perdida!");
    }

    @Override
    public void tratarPartidaNaoIniciada(String message) {
        atorJogador.getTelaPrincipal().showDialog("Não foi possível iniciar a partida! \nProvavelmente não há outro jogador conectado.");
    }
    
    public boolean ehMinhaVez(){
        return minhaVez;
    }
    
    public String obterNomeAdversario() {
        String nome = "";
        if (minhaVez) {
            nome = proxy.obterNomeAdversario(2);
        }else {
            nome = proxy.obterNomeAdversario(1);
        }
        return nome;
	}
    
    
    @Override
    public void receberMensagem(String msg) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    
            
    
}
