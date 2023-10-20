/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package view;

import java.awt.Color;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import model.Usuario;

/**
 *
 * @author 0068961
 */
public class Menu extends javax.swing.JPanel {

    
    Usuario userselecionado;
    
    public Menu() {
        initComponents();
    }

    public Menu(Usuario userSelecionado) {
        this.userselecionado = userSelecionado;
        initComponents();
        config(userselecionado);
    }

    public void config(Usuario userSelecionado) {
        String nomeUsuario = userSelecionado.getNome();
        String primeiroNome = nomeUsuario.split(" ")[0];
        ImageIcon imgLogo = new ImageIcon(System.getProperty("user.dir") + "\\src\\main\\java\\resources\\logo.png");
        lbl_logo.setIcon(imgLogo);
        nomeTxt.setText(primeiroNome);
    }

    /*
    ## METODO IMAGE PARA BYTES<
    private byte[] imgByte(File file) {
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        try {
            FileInputStream fis = new FileInputStream(file);

            byte[] buf = new byte[1024];
            for (int readNum; (readNum = fis.read(buf)) != -1;) {
                bos.write(buf, 0, readNum);
            }
        } catch (FileNotFoundException ex) {
            return null;
        } catch (IOException ex) {
            return null;
        }
        byte[] bytes = bos.toByteArray();
        return bytes;
    }>
     */
    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        lbl_logo = new javax.swing.JLabel();
        nomeTxt = new javax.swing.JLabel();
        menuTxt = new javax.swing.JLabel();
        deslogarTxt = new javax.swing.JLabel();
        olaTxt = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();

        setPreferredSize(new java.awt.Dimension(1270, 3000));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(102, 102, 102));
        jPanel1.setPreferredSize(new java.awt.Dimension(1250, 3000));

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_logo.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.add(lbl_logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(475, 6, 300, 167));

        nomeTxt.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        nomeTxt.setForeground(new java.awt.Color(255, 255, 255));
        nomeTxt.setText("<Nome do Usuário>");
        jPanel2.add(nomeTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 70, -1, -1));

        menuTxt.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        menuTxt.setForeground(new java.awt.Color(255, 255, 255));
        menuTxt.setText("Meu Perfil");
        menuTxt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menuTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuTxtMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                menuTxtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                menuTxtMouseExited(evt);
            }
        });
        jPanel2.add(menuTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 70, -1, -1));

        deslogarTxt.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        deslogarTxt.setForeground(new java.awt.Color(255, 255, 255));
        deslogarTxt.setText("Sair");
        deslogarTxt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        deslogarTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deslogarTxtMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                deslogarTxtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                deslogarTxtMouseExited(evt);
            }
        });
        jPanel2.add(deslogarTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, -1, -1));

        olaTxt.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        olaTxt.setForeground(new java.awt.Color(255, 255, 255));
        olaTxt.setText("Olá,");
        jPanel2.add(olaTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, -1, -1));

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));

        jPanel4.setBackground(new java.awt.Color(102, 102, 102));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 619, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 550, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 612, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(13, Short.MAX_VALUE))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 2259, Short.MAX_VALUE))
        );

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void menuTxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuTxtMouseEntered
        this.menuTxt.setForeground(new Color(153, 153, 153));
    }//GEN-LAST:event_menuTxtMouseEntered

    private void menuTxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuTxtMouseExited
        this.menuTxt.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_menuTxtMouseExited

    private void deslogarTxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deslogarTxtMouseEntered
        this.deslogarTxt.setForeground(Color.red);
    }//GEN-LAST:event_deslogarTxtMouseEntered

    private void deslogarTxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deslogarTxtMouseExited
        this.deslogarTxt.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_deslogarTxtMouseExited

    private void deslogarTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deslogarTxtMouseClicked
        fecharJanela();
        FrameApp_Login janelaLogin = new FrameApp_Login();
        janelaLogin.setVisible(true);
    }//GEN-LAST:event_deslogarTxtMouseClicked

    private void menuTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuTxtMouseClicked

        FrameApp_home.trocaPanel("Perfil", new Perfil(userselecionado));
        JFrame parentFrame = (JFrame) SwingUtilities.getWindowAncestor(this);
        FrameApp_home.desabilitaScroll();
    }//GEN-LAST:event_menuTxtMouseClicked

    private void fecharJanela() {
        JFrame parentFrame = (JFrame) SwingUtilities.getWindowAncestor(this);
        parentFrame.dispose();
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel deslogarTxt;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel lbl_logo;
    private javax.swing.JLabel menuTxt;
    private javax.swing.JLabel nomeTxt;
    private javax.swing.JLabel olaTxt;
    // End of variables declaration//GEN-END:variables
}
