/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package view;

import control.UsuarioControl;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import model.Usuario;

/**
 *
 * @author 0068961
 */
public class Login extends javax.swing.JPanel {

    private static UsuarioControl usuarioControl;

    public Login() {
        initComponents();
        this.usuarioControl = new UsuarioControl();
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        bemvindoTxt = new javax.swing.JLabel();
        emailF = new javax.swing.JTextField();
        entrarBTN = new javax.swing.JButton();
        senhaF = new javax.swing.JPasswordField();
        membroTxt = new javax.swing.JLabel();
        cadastroTxt = new javax.swing.JLabel();
        emailTxt = new javax.swing.JLabel();
        senhaTxt = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(398, 598));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        bemvindoTxt.setBackground(new java.awt.Color(102, 102, 102));
        bemvindoTxt.setFont(new java.awt.Font("SansSerif", 0, 36)); // NOI18N
        bemvindoTxt.setForeground(new java.awt.Color(102, 102, 102));
        bemvindoTxt.setText("Bem vindo");

        emailF.setBackground(new java.awt.Color(230, 230, 230));
        emailF.setForeground(new java.awt.Color(153, 153, 153));
        emailF.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        emailF.setText("seuemail@gmail.com");
        emailF.setBorder(null);
        emailF.setPreferredSize(new java.awt.Dimension(80, 80));
        emailF.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                emailFFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                emailFFocusLost(evt);
            }
        });

        entrarBTN.setBackground(new java.awt.Color(230, 230, 230));
        entrarBTN.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        entrarBTN.setForeground(new java.awt.Color(102, 102, 102));
        entrarBTN.setText("Entrar");
        entrarBTN.setBorder(null);
        entrarBTN.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        entrarBTN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                entrarBTNMouseClicked(evt);
            }
        });
        entrarBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                entrarBTNActionPerformed(evt);
            }
        });

        senhaF.setBackground(new java.awt.Color(230, 230, 230));
        senhaF.setForeground(new java.awt.Color(153, 153, 153));
        senhaF.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        senhaF.setText("suasenha");
        senhaF.setBorder(null);
        senhaF.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                senhaFFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                senhaFFocusLost(evt);
            }
        });
        senhaF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                senhaFActionPerformed(evt);
            }
        });

        membroTxt.setBackground(new java.awt.Color(153, 153, 153));
        membroTxt.setForeground(new java.awt.Color(153, 153, 153));
        membroTxt.setText("Não é um membro?");

        cadastroTxt.setBackground(new java.awt.Color(51, 255, 51));
        cadastroTxt.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        cadastroTxt.setForeground(new java.awt.Color(51, 255, 51));
        cadastroTxt.setText("Cadastre-se agora");
        cadastroTxt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cadastroTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cadastroTxtMouseClicked(evt);
            }
        });

        emailTxt.setBackground(new java.awt.Color(153, 153, 153));
        emailTxt.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        emailTxt.setForeground(new java.awt.Color(153, 153, 153));
        emailTxt.setText("Email");

        senhaTxt.setBackground(new java.awt.Color(153, 153, 153));
        senhaTxt.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        senhaTxt.setForeground(new java.awt.Color(153, 153, 153));
        senhaTxt.setText("Senha");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(senhaTxt)
                    .addComponent(emailTxt)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(membroTxt)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cadastroTxt))
                    .addComponent(bemvindoTxt)
                    .addComponent(emailF, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(senhaF, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 340, Short.MAX_VALUE)
                        .addComponent(entrarBTN, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(30, 30, 30))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(bemvindoTxt)
                .addGap(89, 89, 89)
                .addComponent(emailTxt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(emailF, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60)
                .addComponent(senhaTxt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(senhaF, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58)
                .addComponent(entrarBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cadastroTxt)
                    .addComponent(membroTxt))
                .addContainerGap(113, Short.MAX_VALUE))
        );

        bemvindoTxt.grabFocus();
        senhaF.setEchoChar((char)0);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void senhaFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_senhaFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_senhaFActionPerformed

    private void cadastroTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cadastroTxtMouseClicked
        FrameApp_Login.trocaPainel("Cadastro", new Cadastro());
    }//GEN-LAST:event_cadastroTxtMouseClicked

    private void emailFFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_emailFFocusGained
        if (this.emailF.getText().equals("seuemail@gmail.com")) {
            this.emailF.setText("");
            this.emailF.setForeground(new Color(51, 51, 51));
        }
    }//GEN-LAST:event_emailFFocusGained

    private void emailFFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_emailFFocusLost
        if (this.emailF.getText().equals("")) {
            this.emailF.setText("seuemail@gmail.com");
            this.emailF.setForeground(new Color(153, 153, 153));
        }
    }//GEN-LAST:event_emailFFocusLost

    private void senhaFFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_senhaFFocusGained
        this.senhaF.setEchoChar('*');
        String password = String.valueOf(senhaF.getPassword());
        if (password.toLowerCase().equals("suasenha")) {
            this.senhaF.setText("");
            this.senhaF.setForeground(new Color(51, 51, 51));
        }
    }//GEN-LAST:event_senhaFFocusGained

    private void senhaFFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_senhaFFocusLost
        String password = String.valueOf(senhaF.getPassword());
        if (password.equalsIgnoreCase("")) {
            this.senhaF.setEchoChar((char) 0);
            if (password.toLowerCase().equals("")) {
                this.senhaF.setText("suasenha");
                this.senhaF.setForeground(new Color(153, 153, 153));
            }
        }
    }//GEN-LAST:event_senhaFFocusLost

    private void entrarBTNMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_entrarBTNMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_entrarBTNMouseClicked

    private void entrarBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_entrarBTNActionPerformed
        String email = emailF.getText();
        String senha = String.valueOf(senhaF.getPassword());
        boolean ok = this.usuarioControl.logaUsuario(email, senha);

        if (ok == true) {
            Usuario userLogado;
            userLogado = this.usuarioControl.getUsuario(email, senha);
            FrameApp_pages janela = new FrameApp_pages(userLogado);
            janela.setVisible(true);
            JFrame frameParent = (JFrame) SwingUtilities.getWindowAncestor(this);
            frameParent.dispose();

        } else {

        }
    }//GEN-LAST:event_entrarBTNActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bemvindoTxt;
    private javax.swing.JLabel cadastroTxt;
    private javax.swing.JTextField emailF;
    private javax.swing.JLabel emailTxt;
    private javax.swing.JButton entrarBTN;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel membroTxt;
    private javax.swing.JPasswordField senhaF;
    private javax.swing.JLabel senhaTxt;
    // End of variables declaration//GEN-END:variables
}
