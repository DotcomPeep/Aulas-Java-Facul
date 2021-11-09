/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import java.sql.SQLException;

/**
 *
 * @author leona
 */
public class TelaCadastroUsuario extends javax.swing.JFrame {

    /**
     * Creates new form TelaCadastroUsuario
     */
    public TelaCadastroUsuario() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblUsuario = new javax.swing.JLabel();
        lblSenha = new javax.swing.JLabel();
        lblNome = new javax.swing.JLabel();
        lblCargo = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        txtSenha = new javax.swing.JTextField();
        txtNome = new javax.swing.JTextField();
        cmbCargo = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        lblUsuario.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lblUsuario.setText("Usuário");
        lblUsuario.setPreferredSize(new java.awt.Dimension(40, 25));
        getContentPane().add(lblUsuario);
        lblUsuario.setBounds(21, 27, 44, 25);

        lblSenha.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lblSenha.setText("Senha");
        getContentPane().add(lblSenha);
        lblSenha.setBounds(21, 70, 44, 25);

        lblNome.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lblNome.setText("Nome");
        lblNome.setPreferredSize(new java.awt.Dimension(27, 25));
        getContentPane().add(lblNome);
        lblNome.setBounds(21, 113, 44, 25);

        lblCargo.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lblCargo.setText("Cargo");
        getContentPane().add(lblCargo);
        lblCargo.setBounds(21, 156, 44, 25);

        txtUsuario.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtUsuario.setPreferredSize(new java.awt.Dimension(300, 25));
        getContentPane().add(txtUsuario);
        txtUsuario.setBounds(83, 27, 300, 25);

        txtSenha.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtSenha.setPreferredSize(new java.awt.Dimension(300, 25));
        getContentPane().add(txtSenha);
        txtSenha.setBounds(83, 70, 300, 25);

        txtNome.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtNome.setPreferredSize(new java.awt.Dimension(300, 25));
        getContentPane().add(txtNome);
        txtNome.setBounds(83, 113, 300, 25);

        cmbCargo.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        cmbCargo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Estagiário", "vendedor", "gerente", "diretor" }));
        getContentPane().add(cmbCargo);
        cmbCargo.setBounds(83, 157, 84, 23);

        jButton1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jButton1.setText("Salvar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(21, 220, 84, 35);

        setSize(new java.awt.Dimension(455, 332));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //Conectar com o BD
        Connection con;
        PreparedStatement st;
        TelaLogin  tela;

        try {

            try {
                Class.forName("com.mysql.jdbc.Driver");
            } catch (ClassNotFoundException ex) {
                JOptionPane.showMessageDialog(null, "ERROR!!! Entre em contato com o administrador do sistema e informe o código do erro " + ex.getMessage());
            }
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/acesso", "root", "987543@#Leo");

            st = con.prepareStatement("INSERT INTO usuario VALUES(?, ?, ?, ?)");
            st.setString(1, txtUsuario.getText());
            st.setString(2, txtSenha.getText());
            st.setString(3, txtNome.getText());
            st.setString(4, cmbCargo.getSelectedItem().toString());
            
            
            if(!txtUsuario.getText().equals("") && !txtSenha.getText().equals("")) {
            st.executeUpdate();
            JOptionPane.showMessageDialog(null, "cadastro realizado com sucesso");
            txtUsuario.setText("");
        } else {
                JOptionPane.showMessageDialog(null, "Preencha o nome do usuário e a senha");
            }
            
            txtUsuario.setText("");
            txtSenha.setText("");
            txtNome.setText("");
            dispose();
            tela = new TelaLogin();
            tela.setVisible(true);

        } catch (SQLException ex) {
            if (ex.getErrorCode()==1062){
             JOptionPane.showMessageDialog(null,"Este usuário/senha já está cadastrado");
             txtUsuario.requestFocus();
           }else{
               JOptionPane.showMessageDialog(null,"Erro ao tentar salvar os dados. Entre em contato com o administrador do sistema e informe o erro  " + ex.getErrorCode());
           }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(TelaCadastroUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCadastroUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cmbCargo;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel lblCargo;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblSenha;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtSenha;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
