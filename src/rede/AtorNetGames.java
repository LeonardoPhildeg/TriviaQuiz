package rede;
import br.ufsc.inf.leobr.cliente.Jogada;
import br.ufsc.inf.leobr.cliente.OuvidorProxy;
import br.ufsc.inf.leobr.cliente.Proxy;
import br.ufsc.inf.leobr.cliente.exception.NaoConectadoException;
import br.ufsc.inf.leobr.cliente.exception.NaoJogandoException;

/**
 *
 * @author Leonardo
 */
public class AtorNetGames implements OuvidorProxy{
    
    protected AtorJogador atorJogador;
    protected Proxy proxy;
    protected boolean minhaVez = false;
    
    
    
    public AtorNetGames(AtorJogador atorJogador){
        super();
        this.atorJogador = atorJogador;
        proxy = Proxy.getInstance();
        //Essa merda de NetBeans pediu pra fazer esse Cast. Nos outros trabalhos não tinha
        proxy.addOuvinte(this);
    }

    
    public void conectar(String idJogador, String servidor) throws Exception {
        proxy.conectar(servidor, idJogador);
    }
    
    public void desconectar() throws NaoConectadoException {
        proxy.desconectar();
    }
    
    public void iniciarPartida() throws NaoConectadoException{
        proxy.iniciarPartida(2);
    }    
        
        
    @Override
    public void iniciarNovaPartida(Integer posicao) {
        if(posicao ==1){
            minhaVez = true;
        }
        else if(posicao == 2){
            minhaVez = false;
        }
        atorJogador.iniciarNovaRede(minhaVez);
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
        //Temos que ver esse método com mais precisão
        EstadoDoJogo estado = (EstadoDoJogo) jogada;
        atorJogador.receberEstado(estado);
        minhaVez = true;
        
    }

    @Override
    public void tratarConexaoPerdida() {
        atorJogador.getTelaPrincipal().showDialog("A conexão com o servidor foi perdida");
    }

    @Override
    public void tratarPartidaNaoIniciada(String message) {
        atorJogador.getTelaPrincipal().showDialog("Não foi possível iniciar a partida");
    }
    
    public boolean ehMinhaVez(){
        return minhaVez;
    }
    
    
    @Override
    public void receberMensagem(String msg) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
            
    
}
