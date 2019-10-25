package br.com.cruzeireodosul.tgi.view;


import br.com.cruzeirodosul.tgi.dao.ClienteDAO;
import br.com.cruzeirodosul.tgi.model.Cliente;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.GraphicsConfiguration;
import java.awt.HeadlessException;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class Login extends javax.swing.JFrame {
   
    
  
    private ClienteDAO clienteDAO = new ClienteDAO();
    
    public Login() {
        initComponents();
            }
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtCodAcesso = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtSenha = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        btnLoga = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setOpaque(false);
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel1.setText("Faça seu Login");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(220, 170, 130, 22);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Login:");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(140, 220, 120, 14);

        txtCodAcesso.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtCodAcessoMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtCodAcessoMousePressed(evt);
            }
        });
        txtCodAcesso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodAcessoActionPerformed(evt);
            }
        });
        jPanel1.add(txtCodAcesso);
        txtCodAcesso.setBounds(140, 240, 290, 30);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("Senha:");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(140, 280, 120, 20);

        txtSenha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtSenhaKeyPressed(evt);
            }
        });
        jPanel1.add(txtSenha);
        txtSenha.setBounds(140, 300, 290, 30);

        jLabel4.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        jLabel4.setText("Esqueceu a senha ?");
        jLabel4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel4MouseExited(evt);
            }
        });
        jPanel1.add(jLabel4);
        jLabel4.setBounds(320, 330, 100, 40);

        btnLoga.setText("Acessar");
        btnLoga.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLoga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogaActionPerformed(evt);
            }
        });
        btnLoga.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnLogaKeyPressed(evt);
            }
        });
        jPanel1.add(btnLoga);
        btnLoga.setBounds(140, 370, 290, 30);

        jLabel5.setBackground(new java.awt.Color(0, 0, 0));
        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Cadastrar Usuário");
        jLabel5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel5);
        jLabel5.setBounds(140, 340, 130, 20);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/cruzeirodosul/tgi/view/img/usr.png"))); // NOI18N
        jPanel1.add(jLabel7);
        jLabel7.setBounds(250, 60, 54, 100);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(20, 20, 550, 460);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/cruzeirodosul/tgi/view/img/fundo-azul.jpg"))); // NOI18N
        getContentPane().add(jLabel8);
        jLabel8.setBounds(0, -160, 600, 740);

        setSize(new java.awt.Dimension(603, 539));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
   
    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
   
        CadastrarUsuario usuario = new CadastrarUsuario();
        usuario.setVisible(true);
    }//GEN-LAST:event_jLabel5MouseClicked

    private void btnLogaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogaActionPerformed

        Cliente cliente = new Cliente();
        
         if (txtCodAcesso.getText().equals("") && new String(txtSenha.getPassword()).equals("")){
             JOptionPane.showMessageDialog(null, "Digite seu usuário e a senha.");
         }
         
         else if (txtCodAcesso.getText().equals("")){
             JOptionPane.showMessageDialog(null, "Digite seu usuario.");         
         }
         
         else if (new String(txtSenha.getPassword()).equals("")){
             JOptionPane.showMessageDialog(null, "Digite sua senha.");         
         }
         else {
         cliente.setLoginCliente(txtCodAcesso.getText());
         cliente.setSenhaCliente(new String(txtSenha.getPassword()));
            try {
                if(clienteDAO.autentificar(cliente.getLoginCliente(), cliente.getSenhaCliente())){
                   JOptionPane.showMessageDialog(null, "Autentificado com sucesso");         
                   Menu menu = new Menu();
                   menu.setVisible(true);
                   limpar ();
                }
                else{
                  JOptionPane.showMessageDialog(null, "Erro ao se autentificar");    
                  limpar ();
                }
            } catch (Exception ex) {
               JOptionPane.showMessageDialog(null, "Erro" + ex);         
               limpar (); 
            }
            
         }
    }//GEN-LAST:event_btnLogaActionPerformed

    private void jLabel4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseExited
        getContentPane().setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
    }//GEN-LAST:event_jLabel4MouseExited

    private void jLabel4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseEntered
        getContentPane().setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_jLabel4MouseEntered

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
   
        EsqueciSenha esqueci = new EsqueciSenha();
        esqueci.setVisible(true);
    }//GEN-LAST:event_jLabel4MouseClicked

    private void txtCodAcessoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodAcessoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodAcessoActionPerformed

    private void txtCodAcessoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtCodAcessoMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodAcessoMousePressed

    private void txtCodAcessoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtCodAcessoMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodAcessoMouseClicked

    private void btnLogaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnLogaKeyPressed


       
    }//GEN-LAST:event_btnLogaKeyPressed

    private void txtSenhaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSenhaKeyPressed
       
    }//GEN-LAST:event_txtSenhaKeyPressed

    
    
    public void limpar (){
      txtCodAcesso.setText("");
      txtSenha.setText("");
    }
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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLoga;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtCodAcesso;
    private javax.swing.JPasswordField txtSenha;
    // End of variables declaration//GEN-END:variables
}
