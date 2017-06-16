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
    
    
    
    public AtorNetGames(AtorJogador atorJogador){
        this.atorJogador = atorJogador;
        proxy = Proxy.getInstance();
        //Essa merda de NetBeans pediu pra fazer esse Cast. Nos outros trabalhos não tinha
        proxy.addOuvinte((OuvidorProxy) this);
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
    }
    

    @Override
    public void finalizarPartidaComErro(String message) {
        atorJogador.getTelaPrincipal().showDialog(message);
    }


    @Override
    public void receberJogada(Jogada jogada) {
        //Temos que ver esse método com mais precisão
        EstadoDoJogo estado = (EstadoDoJogo) jogada;
        atorJogador.receberEstado(estado);
        
    }

    @Override
    public void tratarConexaoPerdida() {
        atorJogador.getTelaPrincipal().showDialog("A conexão com o servidor foi perdida");
    }

    @Override
    public void tratarPartidaNaoIniciada(String message) {
        atorJogador.getTelaPrincipal().showDialog("Não foi possível iniciar a conversa");
    }
    
    
    
    
    @Override
    public void receberMensagem(String msg) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
            
    
}
