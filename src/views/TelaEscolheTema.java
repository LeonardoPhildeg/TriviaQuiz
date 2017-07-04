package views;

import javax.swing.SwingConstants;
import rede.AtorJogador;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Component;


public class TelaEscolheTema extends javax.swing.JFrame {

	private static final long serialVersionUID = 1L;
	
	protected AtorJogador atorJogador;
	
    public TelaEscolheTema(AtorJogador atorJogador) {
    	setResizable(false);
    	setTitle("Escolha de tema");
        this.atorJogador = atorJogador;
    	initComponents();
        this.setLocationRelativeTo(null);
    }


    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButtonHistoria = new javax.swing.JButton();
        jButtonGeografia = new javax.swing.JButton();
        jButtonEsportes = new javax.swing.JButton();
        jButtonCiencias = new javax.swing.JButton();
        jButtonIngles = new javax.swing.JButton();
        jButtonEntretenimento = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButtonHistoria.setText("HISTÓRIA");
        jButtonHistoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atorJogador.sortearPerguntaById(0);
                fechaTelaEscolheTema();
            }
        });

        jButtonGeografia.setText("GEOGRAFIA");
        jButtonGeografia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	atorJogador.sortearPerguntaById(1);
            	fechaTelaEscolheTema();
            }
        });

        jButtonEsportes.setText("ESPORTES");
        jButtonEsportes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	atorJogador.sortearPerguntaById(2);
            	fechaTelaEscolheTema();
            }
        });

        jButtonCiencias.setText("CIÊNCIAS");
        jButtonCiencias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	atorJogador.sortearPerguntaById(3);
            	fechaTelaEscolheTema();
            }
        });

        jButtonIngles.setText("INGLÊS");
        jButtonIngles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	atorJogador.sortearPerguntaById(4);
            	fechaTelaEscolheTema();
            }
        });

        jButtonEntretenimento.setText("ENTRETENIMENTO");
        jButtonEntretenimento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	atorJogador.sortearPerguntaById(5);
            	fechaTelaEscolheTema();
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18));
        jLabel1.setText("Escolha um tema para superar");
        jLabel1.setHorizontalAlignment(SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1Layout.setHorizontalGroup(
        	jPanel1Layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
        			.addGap(49)
        			.addGroup(jPanel1Layout.createParallelGroup(Alignment.TRAILING)
        				.addComponent(jLabel1, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 408, Short.MAX_VALUE)
        				.addGroup(jPanel1Layout.createSequentialGroup()
        					.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
        						.addComponent(jButtonEsportes, GroupLayout.PREFERRED_SIZE, 138, GroupLayout.PREFERRED_SIZE)
        						.addComponent(jButtonHistoria, GroupLayout.PREFERRED_SIZE, 137, GroupLayout.PREFERRED_SIZE)
        						.addComponent(jButtonGeografia, GroupLayout.PREFERRED_SIZE, 137, GroupLayout.PREFERRED_SIZE))
        					.addPreferredGap(ComponentPlacement.RELATED, 110, Short.MAX_VALUE)
        					.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
        						.addComponent(jButtonCiencias, Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 149, GroupLayout.PREFERRED_SIZE)
        						.addComponent(jButtonEntretenimento, Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 149, GroupLayout.PREFERRED_SIZE)
        						.addComponent(jButtonIngles, Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 149, GroupLayout.PREFERRED_SIZE))))
        			.addGap(70))
        );
        jPanel1Layout.setVerticalGroup(
        	jPanel1Layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(jPanel1Layout.createSequentialGroup()
        			.addGap(26)
        			.addComponent(jLabel1, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
        			.addGap(38)
        			.addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jButtonHistoria, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE)
        				.addComponent(jButtonEntretenimento, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE))
        			.addGap(37)
        			.addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jButtonGeografia, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE)
        				.addComponent(jButtonCiencias, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE))
        			.addGap(46)
        			.addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jButtonEsportes, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE)
        				.addComponent(jButtonIngles))
        			.addGap(47))
        );
        jPanel1Layout.linkSize(SwingConstants.VERTICAL, new Component[] {jButtonHistoria, jButtonGeografia, jButtonEsportes, jButtonCiencias, jButtonIngles, jButtonEntretenimento});
        jPanel1Layout.linkSize(SwingConstants.HORIZONTAL, new Component[] {jButtonHistoria, jButtonGeografia, jButtonEsportes, jButtonIngles});
        jPanel1.setLayout(jPanel1Layout);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }
    
    
    private javax.swing.JButton jButtonCiencias;
    private javax.swing.JButton jButtonEntretenimento;
    private javax.swing.JButton jButtonEsportes;
    private javax.swing.JButton jButtonGeografia;
    private javax.swing.JButton jButtonHistoria;
    private javax.swing.JButton jButtonIngles;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    
    
    public void exibeTelaEscolheTema() {
        setVisible(true);
    }
    
    public void fechaTelaEscolheTema(){
    	setVisible(false);
    }
    
}


	





