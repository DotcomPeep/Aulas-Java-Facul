
package telas;

import persistencia.AlunoDao;
import negocios.AlunoService;
import javax.swing.JOptionPane;
import persistencia.Aluno;

public class TelaAlunos extends javax.swing.JFrame {

    public TelaAlunos() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblNome = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        lblRa = new javax.swing.JLabel();
        lblDisciplina = new javax.swing.JLabel();
        txtDisciplina = new javax.swing.JTextField();
        lblNota1 = new javax.swing.JLabel();
        txtNota1 = new javax.swing.JTextField();
        lblIcone = new javax.swing.JLabel();
        lblNota2 = new javax.swing.JLabel();
        txtNota2 = new javax.swing.JTextField();
        txtRa = new javax.swing.JTextField();
        btnMedia = new javax.swing.JButton();
        lblMedia = new javax.swing.JLabel();
        lblIfCond = new javax.swing.JLabel();
        lblCurso = new javax.swing.JLabel();
        txtCurso = new javax.swing.JTextField();
        btnSalvar = new javax.swing.JButton();
        btnConsultar = new javax.swing.JButton();
        barMenu = new javax.swing.JMenuBar();
        mnuOperacoes = new javax.swing.JMenu();
        itmCalcularMedia = new javax.swing.JMenuItem();
        itmLimparCampos = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        itmSair = new javax.swing.JMenuItem();
        mnuBancoDados = new javax.swing.JMenu();
        mnuAjuda = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Controle de Alunos");

        lblNome.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lblNome.setText("Nome");

        txtNome.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        lblRa.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lblRa.setText("RA");

        lblDisciplina.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lblDisciplina.setText("Disciplina");

        txtDisciplina.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        lblNota1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lblNota1.setText("Nota 1");

        txtNota1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        lblIcone.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lblIcone.setText("*Icone qualquer*");

        lblNota2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lblNota2.setText("Nota 2");

        txtNota2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        txtRa.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        btnMedia.setBackground(new java.awt.Color(140, 140, 255));
        btnMedia.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        btnMedia.setText("Calcular Média");
        btnMedia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMediaActionPerformed(evt);
            }
        });

        lblMedia.setBackground(new java.awt.Color(153, 0, 153));
        lblMedia.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lblMedia.setForeground(new java.awt.Color(0, 0, 0));
        lblMedia.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        lblIfCond.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        lblCurso.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lblCurso.setText("Curso");

        txtCurso.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        btnSalvar.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        btnConsultar.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        btnConsultar.setText("Consultar");
        btnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarActionPerformed(evt);
            }
        });

        mnuOperacoes.setMnemonic('O');
        mnuOperacoes.setText("Operações");

        itmCalcularMedia.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_M, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        itmCalcularMedia.setText("Calcular Média");
        itmCalcularMedia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmCalcularMediaActionPerformed(evt);
            }
        });
        mnuOperacoes.add(itmCalcularMedia);

        itmLimparCampos.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.ALT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        itmLimparCampos.setText("Limpar campos");
        itmLimparCampos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmLimparCamposActionPerformed(evt);
            }
        });
        mnuOperacoes.add(itmLimparCampos);
        mnuOperacoes.add(jSeparator1);

        itmSair.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_ESCAPE, 0));
        itmSair.setText("sair");
        itmSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmSairActionPerformed(evt);
            }
        });
        mnuOperacoes.add(itmSair);

        barMenu.add(mnuOperacoes);

        mnuBancoDados.setMnemonic('B');
        mnuBancoDados.setText("Banco de dados");
        barMenu.add(mnuBancoDados);

        mnuAjuda.setMnemonic('u');
        mnuAjuda.setText("Ajuda");
        barMenu.add(mnuAjuda);

        setJMenuBar(barMenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblIcone, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnMedia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblNota1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblDisciplina, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblRa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblNome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblCurso, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblNota2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(22, 22, 22)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txtNota1)
                        .addComponent(txtNome)
                        .addComponent(txtCurso, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                        .addComponent(txtRa)
                        .addComponent(txtDisciplina)
                        .addComponent(txtNota2))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblMedia, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSalvar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnConsultar)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(57, Short.MAX_VALUE)
                .addComponent(lblIfCond, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblIcone, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNome, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)))
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtRa, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblRa, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDisciplina, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDisciplina, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNota1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNota1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNota2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNota2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(btnMedia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblMedia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnSalvar)
                        .addComponent(btnConsultar)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblIfCond, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );

        setSize(new java.awt.Dimension(493, 423));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnMediaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMediaActionPerformed
  
        //lblMedia.setText(String.valueOf((Double.parseDouble(txtNota1.getText()) + Double.parseDouble(txtNota2.getText())) / 2));
        
        String resultado;
        double nota1, nota2, media;
        //Capturei as notas da av1 e av2 como double
        nota1 = Double.parseDouble(txtNota1.getText());
        nota2 = Double.parseDouble(txtNota2.getText());
        //chamei o método da classe AlunoService para calcular a média
        media = AlunoService.calcularMedia(nota1, nota2);
       //exibindo a média no campo do formulário
        lblMedia.setText(String.valueOf(media));
        //chamando o método para verificar aprovação na classe AlunoService
        resultado = AlunoService.verificarAprovacao(media);
        //Exibindo se o aluno foi aprovado ou reprovado
        JOptionPane.showMessageDialog(null, resultado);
        
/*        
        double nota1, nota2, media;
        
        nota1 = Double.parseDouble (txtNota1.getText());
        nota2 = Double.parseDouble (txtNota2.getText());
        media = (nota1 + nota2) / 2;
        if (media < 6) {
            lblIfCond.setText("Infelizmente você não alcançou a média exigida para esta disciplina :/");
        } else {
            lblIfCond.setText("Parabéns você foi aprovado :D");
        }
                        
        lblMedia.setText (String.valueOf(media));
*/        
    }//GEN-LAST:event_btnMediaActionPerformed

    private void itmCalcularMediaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmCalcularMediaActionPerformed
        
        //lblMedia.setText(String.valueOf((Double.parseDouble(txtNota1.getText()) + Double.parseDouble(txtNota2.getText())) / 2));
        
        btnMedia.doClick();
        
    }//GEN-LAST:event_itmCalcularMediaActionPerformed

    private void itmLimparCamposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmLimparCamposActionPerformed
        
        Limpar();
        
    }//GEN-LAST:event_itmLimparCamposActionPerformed

    private void Limpar(){
        
        txtRa.setText("");
        txtNome.setText("");
        txtDisciplina.setText("");
        txtCurso.setText("");
        txtNota1.setText("");
        txtNota2.setText("");
        lblMedia.setText("");
        txtNome.requestFocus();
        
    }
    
    private void itmSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmSairActionPerformed
        
        dispose();
        
    }//GEN-LAST:event_itmSairActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        //Declaração de variáveis    
        Aluno aluno;
        AlunoDao dao;
        boolean retorno;
        //Pegar os dados do form e encapsular no objeto aluno da classe Aluno
        aluno = new Aluno();
        aluno.setNome(txtNome.getText());
        aluno.setRa(txtRa.getText());
        aluno.setCurso(txtCurso.getText());
        aluno.setDisciplina(txtDisciplina.getText());
        aluno.setNota1(Double.parseDouble(txtNota1.getText()));
        aluno.setNota2(Double.parseDouble(txtNota2.getText()));
        //Agora precisa jogar o objeto aluno para a 
        //tabela aluno do Banco de dados
        //conectar com o banco de dados
        dao = new AlunoDao();
        retorno = dao.conectar();
        if (retorno == true){//se conseguir conectar 
            int r = dao.salvar(aluno);
             if(r == 1){ //se salvou no banco de dados
                 JOptionPane.showMessageDialog(null, "Dados salvos");
                 Limpar();
             } else if(r ==1062) {
                 JOptionPane.showMessageDialog(null, "Este RA já está cadastrado");
             }else{
                 JOptionPane.showMessageDialog(null, "Erro ao salvar os dados");
             }
        } else{//se não conseguir conectar
            JOptionPane.showMessageDialog(null, "Erro na conexão");
        }
        
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed
        String ra; // pegar o RA digitado nno formulário
        AlunoDao dao; // chamar os métodos conectar e consultar
        boolean retorno; // guardar o que retorna do método conectar
        Aluno aluno; // para receber o aluno consultado no BD
        
        // Pegar o RA que está no txtRa;
        ra = txtRa.getText();
        
        // conectar com o BD
        dao = new AlunoDao();
        retorno = dao.conectar();
        if(retorno == true){ // connectou com o BD
            aluno = dao.consultar(ra);
            if (aluno != null){ // diferente de nulo
               txtNome.setText(aluno.getNome());
               txtCurso.setText(aluno.getCurso());
               txtDisciplina.setText(aluno.getDisciplina());
               txtNota1.setText(String.valueOf(aluno.getNota1()));
               txtNota2.setText(String.valueOf(aluno.getNota2()));
            }else{
                JOptionPane.showMessageDialog(null,"Aluno não encontrado");
            }
        } else{
            JOptionPane.showMessageDialog(null,"Erro na conexão");
        }
        //se conectou, chama o método consultar
        
    }//GEN-LAST:event_btnConsultarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaAlunos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaAlunos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaAlunos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaAlunos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaAlunos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar barMenu;
    private javax.swing.JButton btnConsultar;
    private javax.swing.JButton btnMedia;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JMenuItem itmCalcularMedia;
    private javax.swing.JMenuItem itmLimparCampos;
    private javax.swing.JMenuItem itmSair;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JLabel lblCurso;
    private javax.swing.JLabel lblDisciplina;
    private javax.swing.JLabel lblIcone;
    private javax.swing.JLabel lblIfCond;
    private javax.swing.JLabel lblMedia;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblNota1;
    private javax.swing.JLabel lblNota2;
    private javax.swing.JLabel lblRa;
    private javax.swing.JMenu mnuAjuda;
    private javax.swing.JMenu mnuBancoDados;
    private javax.swing.JMenu mnuOperacoes;
    private javax.swing.JTextField txtCurso;
    private javax.swing.JTextField txtDisciplina;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtNota1;
    private javax.swing.JTextField txtNota2;
    private javax.swing.JTextField txtRa;
    // End of variables declaration//GEN-END:variables
}
