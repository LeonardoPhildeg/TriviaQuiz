package views;


import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;

import br.ufsc.inf.leobr.cliente.exception.NaoConectadoException;
import controladores.Mesa;

import java.awt.event.ActionEvent;

import javax.swing.JOptionPane;
import javax.swing.LayoutStyle.ComponentPlacement;
import rede.AtorJogador;
import rede.EstadoDoJogo;
import controladores.Mesa;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;

public class TelaPrincipal extends javax.swing.JFrame {

	private static final long serialVersionUID = 1L;
	
	protected AtorJogador atorJogador;
    
    public TelaPrincipal(AtorJogador atorJogador) {
    	setResizable(false);
    	setTitle("Trivia Quiz");
        this.atorJogador = atorJogador;
        initComponents();
        this.setLocationRelativeTo(null);
    }


    private void initComponents() {
        jMenuItem1 = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jLabelJogador1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabelJogador2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButtonSortearPergunta = new javax.swing.JButton();
        jButtonRenderSe = new javax.swing.JButton();
        jLabelPontosGanharJog1 = new javax.swing.JLabel();
        jLabelPontosGanhosJog1 = new javax.swing.JLabel();
        jLabelPontosGanharJog2 = new javax.swing.JLabel();
        jLabelPontosGanhosJog2 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuPartida = new javax.swing.JMenu();
        jMenuItemIniciarPartida = new javax.swing.JMenuItem();

        JMenuItemDesconectar = new javax.swing.JMenuItem();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabelJogador1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
        jLabelJogador1.setText("Jogador1");

        jLabel2.setFont(new Font("Tahoma", Font.PLAIN, 16));
        jLabel2.setText("Pontos a Ganhar:");

        jLabel3.setFont(new Font("Tahoma", Font.PLAIN, 16));
        jLabel3.setText("Pontos Ganhos:");

        jLabelJogador2.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
        jLabelJogador2.setText("Jogador2");

        jLabel5.setFont(new Font("Tahoma", Font.PLAIN, 16));
        jLabel5.setText("Pontos a Ganhar:");

        jLabel6.setFont(new Font("Tahoma", Font.PLAIN, 16));
        jLabel6.setText("Pontos Ganhos:");

        jButtonSortearPergunta.setFont(new java.awt.Font("Tahoma", 1, 14));
        jButtonSortearPergunta.setText("SORTEAR PERGUNTA");
        jButtonSortearPergunta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSortearPerguntaActionPerformed(evt);
            }
        });

        jButtonRenderSe.setFont(new java.awt.Font("Tahoma", 1, 11));
        jButtonRenderSe.setText("Render-se");
        jButtonRenderSe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRenderSeActionPerformed(evt);
            }
        });

        jLabelPontosGanharJog1.setFont(new Font("Tahoma", Font.BOLD, 16));
        jLabelPontosGanharJog1.setText("pontos");
        jLabelPontosGanharJog1.setToolTipText("");

        jLabelPontosGanhosJog1.setFont(new Font("Tahoma", Font.BOLD, 16));
        jLabelPontosGanhosJog1.setText("pontos");

        jLabelPontosGanharJog2.setFont(new Font("Tahoma", Font.BOLD, 16));
        jLabelPontosGanharJog2.setText("pontos");

        jLabelPontosGanhosJog2.setFont(new Font("Tahoma", Font.BOLD, 16));
        jLabelPontosGanhosJog2.setText("pontos");
        
        labelImagem = new JLabel("");
        labelImagem.setHorizontalAlignment(SwingConstants.CENTER);
        labelImagem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bla.png"))); 

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1Layout.setHorizontalGroup(
        	jPanel1Layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(jPanel1Layout.createSequentialGroup()
        			.addContainerGap()
        			.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
        				.addComponent(jLabelJogador1, GroupLayout.PREFERRED_SIZE, 171, GroupLayout.PREFERRED_SIZE)
        				.addGroup(jPanel1Layout.createSequentialGroup()
        					.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
        						.addComponent(jLabel2)
        						.addComponent(jLabel3))
        					.addPreferredGap(ComponentPlacement.UNRELATED)
        					.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
        						.addComponent(jLabelPontosGanhosJog1)
        						.addComponent(jLabelPontosGanharJog1, GroupLayout.DEFAULT_SIZE, 73, Short.MAX_VALUE))))
        			.addGap(87)
        			.addComponent(labelImagem)
        			.addGap(115)
        			.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
        				.addGroup(jPanel1Layout.createSequentialGroup()
        					.addComponent(jLabel5)
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addComponent(jLabelPontosGanharJog2))
        				.addComponent(jLabelJogador2, GroupLayout.PREFERRED_SIZE, 173, GroupLayout.PREFERRED_SIZE)
        				.addGroup(jPanel1Layout.createSequentialGroup()
        					.addComponent(jLabel6)
        					.addPreferredGap(ComponentPlacement.UNRELATED)
        					.addComponent(jLabelPontosGanhosJog2)))
        			.addGap(57))
        		.addGroup(jPanel1Layout.createSequentialGroup()
        			.addGap(92)
        			.addComponent(jButtonSortearPergunta, GroupLayout.PREFERRED_SIZE, 504, GroupLayout.PREFERRED_SIZE)
        			.addContainerGap(147, Short.MAX_VALUE))
        		.addGroup(jPanel1Layout.createSequentialGroup()
        			.addContainerGap()
        			.addComponent(jButtonRenderSe, GroupLayout.PREFERRED_SIZE, 116, GroupLayout.PREFERRED_SIZE)
        			.addContainerGap(617, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
        	jPanel1Layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(jPanel1Layout.createSequentialGroup()
        			.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
        				.addGroup(jPanel1Layout.createSequentialGroup()
        					.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
        						.addGroup(jPanel1Layout.createSequentialGroup()
        							.addGap(20)
        							.addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE)
        								.addComponent(jLabelJogador1)
        								.addComponent(jLabelJogador2))
        							.addPreferredGap(ComponentPlacement.UNRELATED)
        							.addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE)
        								.addComponent(jLabel2)
        								.addComponent(jLabel5)
        								.addComponent(jLabelPontosGanharJog2)
        								.addComponent(jLabelPontosGanharJog1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        							.addPreferredGap(ComponentPlacement.UNRELATED)
        							.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
        								.addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE)
        									.addComponent(jLabelPontosGanhosJog1)
        									.addComponent(jLabel3))
        								.addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE)
        									.addComponent(jLabel6)
        									.addComponent(jLabelPontosGanhosJog2)))
        							.addGap(136))
        						.addGroup(jPanel1Layout.createSequentialGroup()
        							.addGap(28)
        							.addComponent(labelImagem)
        							.addPreferredGap(ComponentPlacement.RELATED)))
        					.addGap(178))
        				.addGroup(Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
        					.addContainerGap()
        					.addComponent(jButtonSortearPergunta, GroupLayout.PREFERRED_SIZE, 66, GroupLayout.PREFERRED_SIZE)
        					.addGap(123)))
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addComponent(jButtonRenderSe, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE))
        );
        jPanel1.setLayout(jPanel1Layout);

        jMenuPartida.setText("Partida");

        jMenuItemIniciarPartida.setText("Iniciar Partida");
        jMenuItemIniciarPartida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemIniciarPartidaActionPerformed(evt);
            }
        });
        
        JMenuItemDesconectar.setText("Desconectar");
        JMenuItemDesconectar.addActionListener(new java.awt.event.ActionListener() {

			public void actionPerformed(ActionEvent e) {
				try {
					atorJogador.desconectar();
					JMenuItemDesconectar.setEnabled(false);
					jMenuItemIniciarPartida.setEnabled(true);
					JOptionPane.showMessageDialog(null,"Conexão encerrada com sucesso! Por favor, para voltar ao jogo abra uma nova janela");
				} catch (Exception ex) {
					JOptionPane.showMessageDialog(null, ex.getMessage());
					ex.printStackTrace();
				}
				
			}
        	
        });
        
        jMenuPartida.add(jMenuItemIniciarPartida);
        jMenuPartida.add(JMenuItemDesconectar);

        jMenuBar1.add(jMenuPartida);
        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        layout.setHorizontalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addComponent(jPanel1, GroupLayout.DEFAULT_SIZE, 743, Short.MAX_VALUE)
        			.addContainerGap())
        );
        layout.setVerticalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addComponent(jPanel1, GroupLayout.DEFAULT_SIZE, 490, Short.MAX_VALUE)
        			.addContainerGap())
        );
        getContentPane().setLayout(layout);

        pack();
    }

    private void jButtonSortearPerguntaActionPerformed(java.awt.event.ActionEvent evt) {                                                       
    	desabilitaBotaoRenderSe();
    	atorJogador.sortearPergunta();
    	desabilitaBotaoSortear();
    }

    private void jButtonRenderSeActionPerformed(java.awt.event.ActionEvent evt) {                                                
		int result = JOptionPane.showConfirmDialog(this, "Você tem certeza de que deseja se render?", "Fechar jogo", JOptionPane.YES_NO_OPTION);
		if (result == JOptionPane.YES_OPTION) {
			atorJogador.renderSe();
		}
    }

    private void jMenuItemIniciarPartidaActionPerformed(java.awt.event.ActionEvent evt) {                                                        
    	atorJogador.iniciarPartidaPedido();
    }

    private void jMenuItemDesconectarActionPerformed(java.awt.event.ActionEvent evt) {                                                     
    	atorJogador.desconectar();
    } 


    private javax.swing.JButton jButtonRenderSe;
    private javax.swing.JButton jButtonSortearPergunta;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabelJogador1;
    private javax.swing.JLabel jLabelJogador2;
    private javax.swing.JLabel jLabelPontosGanharJog1;
    private javax.swing.JLabel jLabelPontosGanharJog2;
    private javax.swing.JLabel jLabelPontosGanhosJog1;
    private javax.swing.JLabel jLabelPontosGanhosJog2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItemIniciarPartida;
    private javax.swing.JMenu jMenuPartida;
    private javax.swing.JPanel jPanel1;

    private javax.swing.JMenuItem JMenuItemDesconectar;
    private JLabel labelImagem;
    // End of variables declaration//GEN-END:variables


    public void showDialog(String msg) {
        JOptionPane.showMessageDialog(this, msg);
    }

	public String showNameQuestion() {
		return JOptionPane.showInputDialog(this, "Escolha seu nome:");
	}

    public void atualizarNomeJogador1(String str, boolean eu) {
	jLabelJogador1.setText(str+(eu ? " (Eu)" : ""));
    }
	
    public void atualizarNomeJogador2(String str, boolean eu) {
        jLabelJogador2.setText(str+(eu ? " (Eu)" : ""));
    }

    public void exibeTela() {
        setVisible(true);
    }

	public void desabilitarIniciarPartida() {
		jMenuItemIniciarPartida.setEnabled(false);
	}
	
	public void habilitarIniciarPartida(){
		jMenuItemIniciarPartida.setEnabled(true);
	}
	
	public void atualizarInterface(EstadoDoJogo estado){
		Mesa mesa1 = estado.getMesa1();
		Mesa mesa2 = estado.getMesa2();
		
		jLabelPontosGanharJog1.setText(String.valueOf(mesa1.getPontosAGanhar()));
		jLabelPontosGanharJog2.setText(String.valueOf(mesa2.getPontosAGanhar()));
		
		jLabelPontosGanhosJog1.setText(String.valueOf(mesa1.getPontosGanhos()));
		jLabelPontosGanhosJog2.setText(String.valueOf(mesa2.getPontosGanhos()));

		
	}
	
	public void habilitaBotaoSortear(){
		jButtonSortearPergunta.setEnabled(true);
	}
	
	public void desabilitaBotaoSortear(){
		jButtonSortearPergunta.setEnabled(false);
	}
	
	public void habilitaBotaoRenderSe(){
		jButtonRenderSe.setEnabled(true);
	}
	
	public void desabilitaBotaoRenderSe(){
		jButtonRenderSe.setEnabled(false);
	}
		

}
