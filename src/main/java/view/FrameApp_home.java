/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.ScrollPane;
import java.util.Hashtable;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import model.Usuario;

/**
 *
 * @author 0068961
 */
public class FrameApp_home extends javax.swing.JFrame {

    private static JScrollPane painelRolagem;
    private static CardLayout baralhoPanel;
    private static JPanel panelTroca;
    private static Hashtable<String, JPanel> historicoPanel;
    private static Usuario usuarioSelecionado;

    public FrameApp_home() {
        initComponents();
    }

    public FrameApp_home(Usuario userSelecionado) {
        this.usuarioSelecionado = userSelecionado;
        initComponents();
        config();
        trocaPanel("home", new Menu(this.usuarioSelecionado));
    }

    public void config() {
        this.setLayout(new BorderLayout());
        baralhoPanel = new CardLayout();
        painelRolagem = new JScrollPane();
        panelTroca = new JPanel(baralhoPanel);
        historicoPanel = new Hashtable<>();
        this.add(painelRolagem);
        painelRolagem.setViewportView(this.panelTroca);
        painelRolagem.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        painelRolagem.getVerticalScrollBar().setUnitIncrement(25);
    }

    public static void trocaPanel(String nome, JPanel novoPainel) {
        if (!historicoPanel.containsKey(nome)) {
            panelTroca.add(novoPainel, nome);
            baralhoPanel.show(panelTroca, nome);
            panelTroca.setPreferredSize(novoPainel.getPreferredSize());
            historicoPanel.put(nome, novoPainel);
        } else {
            baralhoPanel.show(panelTroca, nome);
            panelTroca.setPreferredSize(historicoPanel.get(nome).getPreferredSize());
        }
    }
    public static void desabilitaScroll(){
        painelRolagem.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        painelRolagem.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_NEVER);
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1270, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 788, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrameApp_home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameApp_home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameApp_home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameApp_home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameApp_home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}