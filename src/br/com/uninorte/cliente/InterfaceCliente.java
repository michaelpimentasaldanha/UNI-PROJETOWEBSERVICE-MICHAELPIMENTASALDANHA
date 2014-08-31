package br.com.uninorte.cliente;

import javax.swing.JOptionPane;

	@SuppressWarnings("serial")
	public class InterfaceCliente extends javax.swing.JFrame {
		ControleUsuario controleUsuario = new ControleUsuarioService().getControleUsuarioPort();
		Usuario usuario = new Usuario();
		Usuario user = new Usuario();
		public InterfaceCliente() {
	        initComponents();
	    }
	    private void initComponents() {
	    	
	    	 jScrollPane2 = new javax.swing.JScrollPane();
	         jTable1 = new javax.swing.JTable();
	         jPanel1 = new javax.swing.JPanel();
	         txNome = new javax.swing.JLabel();
	         txCPF = new javax.swing.JLabel();
	         txTelefone = new javax.swing.JLabel();
	         txfNome = new javax.swing.JTextField();
	         txfCPF = new javax.swing.JTextField();
	         txfTelefone = new javax.swing.JTextField();
	         btCadastrar = new javax.swing.JButton();
	         txEmail = new javax.swing.JLabel();
	         txfEmail = new javax.swing.JTextField();
	         txFuncao = new javax.swing.JLabel();
	         txfFuncao = new javax.swing.JTextField();
	         txfMunicipio = new javax.swing.JTextField();
	         txMunicipio = new javax.swing.JLabel();
	         btEditar = new javax.swing.JButton();
	         btExcluir = new javax.swing.JButton();
	         btBuscarUsuario = new javax.swing.JButton();
	         btLimpar = new javax.swing.JButton();
	         txCadastroDeUsuario = new javax.swing.JLabel();
	         btSair = new javax.swing.JButton();
	         txPerfil = new javax.swing.JLabel();
	         txfPerfil = new javax.swing.JTextField();

	         jScrollPane2.setViewportView(jTable1);
	         
	         setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

	         setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

	         jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Cadastrar novo usuário"));

	         txNome.setText("Nome");

	         txCPF.setText("CPF");

	         txTelefone.setText("Telefone");
	        
	         txfNome.addActionListener(new java.awt.event.ActionListener() {
	             public void actionPerformed(java.awt.event.ActionEvent evt) {
	                
	             }
	         });

	         txfTelefone.addActionListener(new java.awt.event.ActionListener() {
	             public void actionPerformed(java.awt.event.ActionEvent evt) {
	             }
	         });

	         btCadastrar.setText("Cadastrar");
	         btCadastrar.addActionListener(new java.awt.event.ActionListener() {
	             public void actionPerformed(java.awt.event.ActionEvent evt) {
	                 btCadastrarActionPerformed(evt);
	             }
	         });

	         txEmail.setText("Email");

	         txFuncao.setText("Função");

	         txfFuncao.addActionListener(new java.awt.event.ActionListener() {
	             public void actionPerformed(java.awt.event.ActionEvent evt) {
	             }
	         });
	         
	         txMunicipio.setText("Municipio");

	         btEditar.setText("Editar");
	         btEditar.addActionListener(new java.awt.event.ActionListener() {
	             public void actionPerformed(java.awt.event.ActionEvent evt) {
	                 btEditarActionPerformed(evt);
	             }
	         });

	         btExcluir.setText("Excluir");
	         btExcluir.addActionListener(new java.awt.event.ActionListener() {
	             public void actionPerformed(java.awt.event.ActionEvent evt) {
	            	 btExcluirActionPerformed(evt);
	             }
	         });

	         btBuscarUsuario.setText("Buscar Usuario");
	         btBuscarUsuario.addActionListener(new java.awt.event.ActionListener() {
	             public void actionPerformed(java.awt.event.ActionEvent evt) {
	                 btBuscarUsuarioActionPerformed(evt);
	             }
	         });
	         
	         btLimpar.setText("Limpar");
	         btLimpar.addActionListener(new java.awt.event.ActionListener() {
	             public void actionPerformed(java.awt.event.ActionEvent evt) {
	                 btLimparActionPerformed(evt);
	             }
	         });
	         
	         txPerfil.setText("Perfil");
	         
	         txfPerfil.addActionListener(new java.awt.event.ActionListener() {
	             public void actionPerformed(java.awt.event.ActionEvent evt) {
	             }
	         });

	         javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
	         jPanel1.setLayout(jPanel1Layout);
	         jPanel1Layout.setHorizontalGroup(
	             jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	             .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
	                 .addContainerGap()
	                 .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
	                     .addGroup(jPanel1Layout.createSequentialGroup()
	                         .addGap(0, 0, Short.MAX_VALUE)
	                         .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
	                             .addGroup(jPanel1Layout.createSequentialGroup()
	                                 .addComponent(btCadastrar)
	                                 .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
	                                 .addComponent(btEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
	                                 .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
	                                 .addComponent(btExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
	                             .addGroup(jPanel1Layout.createSequentialGroup()
	                                 .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                                     .addComponent(txCPF)
	                                     .addComponent(txTelefone)
	                                     .addComponent(txNome)
	                                     .addComponent(txEmail)
	                                     .addComponent(txFuncao))
	                                 .addGap(19, 19, 19)
	                                 .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
	                                     .addComponent(txfNome, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 217, Short.MAX_VALUE)
	                                     .addComponent(txfCPF)
	                                     .addComponent(txfTelefone)
	                                     .addComponent(txfEmail, javax.swing.GroupLayout.Alignment.TRAILING)
	                                     .addComponent(txfFuncao, javax.swing.GroupLayout.Alignment.TRAILING)))))
	                     .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
	                         .addComponent(txMunicipio)
	                         .addGap(18, 18, 18)
	                         .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                             .addComponent(txfPerfil)
	                             .addComponent(txfMunicipio))))
	                 .addGap(126, 126, 126))
	             .addGroup(jPanel1Layout.createSequentialGroup()
	                 .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                     .addGroup(jPanel1Layout.createSequentialGroup()
	                         .addGap(73, 73, 73)
	                         .addComponent(btBuscarUsuario)
	                         .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
	                         .addComponent(btLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
	                     .addGroup(jPanel1Layout.createSequentialGroup()
	                         .addContainerGap()
	                         .addComponent(txPerfil)))
	                 .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
	         );
	         jPanel1Layout.setVerticalGroup(
	             jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	             .addGroup(jPanel1Layout.createSequentialGroup()
	                 .addContainerGap()
	                 .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
	                     .addComponent(txNome)
	                     .addComponent(txfNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
	                 .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
	                 .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
	                     .addComponent(txCPF)
	                     .addComponent(txfCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
	                 .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
	                 .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
	                     .addComponent(txTelefone)
	                     .addComponent(txfTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
	                 .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
	                 .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                     .addComponent(txEmail)
	                     .addComponent(txfEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
	                 .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
	                 .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                     .addComponent(txFuncao)
	                     .addComponent(txfFuncao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
	                 .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
	                 .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
	                     .addComponent(txfMunicipio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
	                     .addComponent(txMunicipio))
	                 .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
	                 .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
	                     .addComponent(txPerfil)
	                     .addComponent(txfPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
	                 .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
	                 .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
	                     .addComponent(btCadastrar)
	                     .addComponent(btEditar)
	                     .addComponent(btExcluir))
	                 .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
	                 .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
	                     .addComponent(btLimpar)
	                     .addComponent(btBuscarUsuario)))
	         );

	         txCadastroDeUsuario.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
	         txCadastroDeUsuario.setText("Cadastro de Usuário");

	         btSair.setText("Sair");
	         btSair.addActionListener(new java.awt.event.ActionListener() {
	             public void actionPerformed(java.awt.event.ActionEvent evt) {
	                 btSairActionPerformed(evt);
	             }
	         });

	         javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
	         getContentPane().setLayout(layout);
	         layout.setHorizontalGroup(
	             layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	             .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
	                 .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	                 .addComponent(btSair, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
	                 .addGap(105, 105, 105))
	             .addGroup(layout.createSequentialGroup()
	                 .addContainerGap()
	                 .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                     .addGroup(layout.createSequentialGroup()
	                         .addComponent(txCadastroDeUsuario)
	                         .addGap(0, 161, Short.MAX_VALUE))
	                     .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
	                 .addContainerGap())
	         );
	         layout.setVerticalGroup(
	             layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	             .addGroup(layout.createSequentialGroup()
	                 .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	                 .addComponent(txCadastroDeUsuario)
	                 .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
	                 .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
	                 .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
	                 .addComponent(btSair)
	                 .addContainerGap())
	         );

	         pack();
	    }
 	    private void btCadastrarActionPerformed(java.awt.event.ActionEvent evt) {                                       

	        Usuario usuario = new Usuario();
	        usuario.setNome(txfNome.getText());
			usuario.setCpf(txfCPF.getText());
			usuario.setEmail(txfEmail.getText());
			usuario.setFuncao(txfFuncao.getText());
			usuario.setTelefone(txfTelefone.getText());
			usuario.setMunicipio(txfMunicipio.getText());
			usuario.setPerfil(txfPerfil.getText());
		      // fazendo a validação dos dados
			if (txfNome.getText().isEmpty() || (txfCPF.getText().isEmpty())
	        									|| (txfEmail.getText().isEmpty())
	        									|| (txfFuncao.getText().isEmpty())
	        									|| (txfTelefone.getText().isEmpty())
	        									|| (txfMunicipio.getText().isEmpty())
	        									|| (txfPerfil.getText().isEmpty())
	        	) {
	            JOptionPane.showMessageDialog(null, "Os campos não podem retornar vazios!");
	        } else {
	            controleUsuario.conectarcontrole();
	            controleUsuario.inserirusuariocontrole(usuario);
	            JOptionPane.showMessageDialog(null, "Usuário " + txfNome.getText() + " Inseridos com sucesso!");
	        }
	        txfNome.setText("");
	        txfCPF.setText("");
	        txfEmail.setText("");
	        txfFuncao.setText("");
	        txfTelefone.setText("");
	        txfMunicipio.setText("");
	        txfPerfil.setText("");
	    }
	    private void btSairActionPerformed(java.awt.event.ActionEvent evt) {                                       
	        System.exit(0);
	    }                                     
	    private void btLimparActionPerformed(java.awt.event.ActionEvent evt) {                                         
	        txfNome.setText("");
	        txfCPF.setText("");
	        txfTelefone.setText("");
	        txfEmail.setText("");
	        txfFuncao.setText("");
	        txfMunicipio.setText("");
	        txfPerfil.setText("");
	    }      
	    private void btBuscarUsuarioActionPerformed(java.awt.event.ActionEvent evt) { 
	    	
	    	String cpf = (JOptionPane.showInputDialog(null,"Digite o cpf do Usuario"));
	    	controleUsuario.buscarUsuario(cpf, user);
	    	txfNome.setText(user.getNome());
	    	txfCPF.setText(user.getCpf());
	    	txfTelefone.setText(user.getTelefone());
	    	txfEmail.setText(user.getEmail());
	    	txfFuncao.setText(user.getFuncao());
	    	txfMunicipio.setText(user.getMunicipio());
	    	txfPerfil.setText(user.getPerfil());
	    }
	    private void btExcluirActionPerformed(java.awt.event.ActionEvent evt) {                                         
	       controleUsuario.apagarusuariocontrole(txfCPF.getText());
	    }
	    private void btEditarActionPerformed(java.awt.event.ActionEvent evt) { 
	    	controleUsuario.editarusuariocontrole(txfNome.getText(),txfCPF.getText(),txfTelefone.getText()
					 ,txfEmail.getText(),txfFuncao.getText(),txfMunicipio.getText(),txfPerfil.getText());	    
}
	    public static void main(String args[]) {
	        try {
	            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
	                if ("Nimbus".equals(info.getName())) {
	                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
	                    break;
	                }
	            }
	        } catch (ClassNotFoundException ex) {
	            java.util.logging.Logger.getLogger(InterfaceCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	        } catch (InstantiationException ex) {
	            java.util.logging.Logger.getLogger(InterfaceCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	        } catch (IllegalAccessException ex) {
	            java.util.logging.Logger.getLogger(InterfaceCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
	            java.util.logging.Logger.getLogger(InterfaceCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	        }
	        //</editor-fold>

	        /* Create and display the form */
	        java.awt.EventQueue.invokeLater(new Runnable() {
	            public void run() {
	                new InterfaceCliente().setVisible(true);
	            }
	        });
	    }
	    private javax.swing.JButton btBuscarUsuario;
	    private javax.swing.JButton btCadastrar;
	    private javax.swing.JButton btEditar;
	    private javax.swing.JButton btExcluir;
	    private javax.swing.JButton btLimpar;
	    private javax.swing.JButton btSair;
	    private javax.swing.JPanel jPanel1;
	    private javax.swing.JScrollPane jScrollPane2;
	    private javax.swing.JTable jTable1;
	    private javax.swing.JLabel txCPF;
	    private javax.swing.JLabel txCadastroDeUsuario;
	    private javax.swing.JLabel txEmail;
	    private javax.swing.JLabel txFuncao;
	    private javax.swing.JLabel txMunicipio;
	    private javax.swing.JLabel txNome;
	    private javax.swing.JLabel txPerfil;
	    private javax.swing.JLabel txTelefone;
	    private javax.swing.JTextField txfPerfil;
	    private javax.swing.JTextField txfCPF;
	    private javax.swing.JTextField txfEmail;
	    private javax.swing.JTextField txfFuncao;
	    private javax.swing.JTextField txfMunicipio;
	    private javax.swing.JTextField txfNome;
	    private javax.swing.JTextField txfTelefone;          
	}

