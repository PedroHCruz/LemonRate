/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package view;

import control.UsuarioControl;
import java.awt.Color;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import model.Usuario;

/**
 *
 * @author 0068961
 */
public class Perfil extends javax.swing.JPanel {

    Usuario userSelecionado;
    private static UsuarioControl usuarioControl;
    ImageIcon fotoVazia;

    public Perfil() {
        initComponents();
    }

    public Perfil(Usuario userSelecionado) {
        this.userSelecionado = userSelecionado;
        initComponents();
        config(this.userSelecionado);
        this.usuarioControl = new UsuarioControl();
    }

    public void config(Usuario userSelecionado) {
        String nomeUsuario = userSelecionado.getNome();
        String emailUsuario = userSelecionado.getEmail();
        String desc = userSelecionado.getDescricao();
        String url = userSelecionado.getUrlFoto();
        this.nomeTxt.setText(nomeUsuario);
        fotoVazia = new ImageIcon(System.getProperty("user.dir") + "\\src\\main\\java\\resources\\profile_pic.png");
        fotoVazia.setImage(fotoVazia.getImage().getScaledInstance(
                128, 128, 100));
        this.Fnome.setText(nomeUsuario);
        this.Femail.setText(emailUsuario);
        this.FsobreMim.setText(desc);
        this.Furl.setText(url);
        if (userSelecionado.getNascimento() != null) {
            this.Fdata.setText(converteDataString(userSelecionado.getNascimento()));
        }
        switch (userSelecionado.getGenero()) {
            case 'M':
                Fmasculino.setSelected(true);
                break;
            case 'F':
                Ffeminino.setSelected(true);
                break;
            case 'O':
                Foutro.setSelected(true);
                break;
        }
        if (userSelecionado.getUrlFoto() == null) {
            this.fotoPerfil.setText("");
            this.fotoPerfil.setIcon(fotoVazia);
        } else {
            URL urlBruto;
            try {
                urlBruto = new URL(userSelecionado.getUrlFoto());
            } catch (MalformedURLException ex) {
                JOptionPane.showMessageDialog(null, "Erro ao fazer as alterações", "Erro", JOptionPane.ERROR_MESSAGE);
                return;
            }
            ImageIcon fotoP = new ImageIcon(urlBruto);
            fotoP.setImage(fotoP.getImage().getScaledInstance(
                    128, 128, 100));
            this.fotoPerfil.setText("");
            this.fotoPerfil.setIcon(fotoP);
        }
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

        sexoGroup = new javax.swing.ButtonGroup();
        jPanel3 = new javax.swing.JPanel();
        fotoPerfil = new javax.swing.JLabel();
        fundo = new javax.swing.JPanel();
        nomeTxt = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        midiaTxt = new javax.swing.JLabel();
        btn_cadastroMidia = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        txtNome = new javax.swing.JLabel();
        Femail = new javax.swing.JTextField();
        Fdata = new javax.swing.JFormattedTextField();
        txtData = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        Fmasculino = new javax.swing.JRadioButton();
        Ffeminino = new javax.swing.JRadioButton();
        Foutro = new javax.swing.JRadioButton();
        Fnome = new javax.swing.JTextField();
        txtEmail = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        FsobreMim = new javax.swing.JTextArea();
        txtSobreMim = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaMidia = new javax.swing.JList<>();
        btn_salvar = new javax.swing.JButton();
        btn_editar = new javax.swing.JButton();
        btn_verDetalhes = new javax.swing.JButton();
        Furl = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(1270, 788));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(250, 250, 250));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        fotoPerfil.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fotoPerfil.setText("foto");
        fotoPerfil.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.add(fotoPerfil, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, 128, 128));

        fundo.setBackground(new java.awt.Color(51, 51, 51));

        javax.swing.GroupLayout fundoLayout = new javax.swing.GroupLayout(fundo);
        fundo.setLayout(fundoLayout);
        fundoLayout.setHorizontalGroup(
            fundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        fundoLayout.setVerticalGroup(
            fundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 175, Short.MAX_VALUE)
        );

        jPanel3.add(fundo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1270, -1));

        nomeTxt.setFont(new java.awt.Font("SansSerif", 0, 48)); // NOI18N
        nomeTxt.setText("<NOME USUÁRIO>");
        jPanel3.add(nomeTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 180, -1, -1));

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel3.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 260, 10, 500));

        midiaTxt.setFont(new java.awt.Font("SansSerif", 0, 36)); // NOI18N
        midiaTxt.setText("Mídias Cadastradas");
        jPanel3.add(midiaTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 250, -1, -1));

        btn_cadastroMidia.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        btn_cadastroMidia.setText("Cadastrar Mídia");
        btn_cadastroMidia.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btn_cadastroMidia.setContentAreaFilled(false);
        btn_cadastroMidia.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_cadastroMidia.setFocusable(false);
        btn_cadastroMidia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cadastroMidiaActionPerformed(evt);
            }
        });
        jPanel3.add(btn_cadastroMidia, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 720, 190, 30));
        jPanel3.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 250, 700, 10));
        jPanel3.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 530, 10));

        txtNome.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        txtNome.setText("Nome*:");
        jPanel3.add(txtNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, -1, -1));

        Femail.setBackground(new java.awt.Color(250, 250, 250));
        Femail.setEnabled(false);
        jPanel3.add(Femail, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 430, 500, -1));

        Fdata.setBackground(new java.awt.Color(250, 250, 250));
        try {
            Fdata.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        Fdata.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Fdata.setEnabled(false);
        jPanel3.add(Fdata, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 370, 130, -1));

        txtData.setText("Data de nascimento*:");
        jPanel3.add(txtData, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, -1, -1));

        jLabel1.setText("Sexo:");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 350, -1, -1));

        Fmasculino.setBackground(new java.awt.Color(250, 250, 250));
        sexoGroup.add(Fmasculino);
        Fmasculino.setText("Masculino");
        Fmasculino.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Fmasculino.setEnabled(false);
        Fmasculino.setFocusable(false);
        jPanel3.add(Fmasculino, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 370, -1, -1));

        Ffeminino.setBackground(new java.awt.Color(250, 250, 250));
        sexoGroup.add(Ffeminino);
        Ffeminino.setText("Feminino");
        Ffeminino.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Ffeminino.setEnabled(false);
        Ffeminino.setFocusable(false);
        jPanel3.add(Ffeminino, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 370, -1, -1));

        Foutro.setBackground(new java.awt.Color(250, 250, 250));
        sexoGroup.add(Foutro);
        Foutro.setText("Outro");
        Foutro.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Foutro.setEnabled(false);
        Foutro.setFocusable(false);
        jPanel3.add(Foutro, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 370, -1, -1));

        Fnome.setBackground(new java.awt.Color(250, 250, 250));
        Fnome.setEnabled(false);
        jPanel3.add(Fnome, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, 500, -1));

        txtEmail.setText("Email*:");
        jPanel3.add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 410, -1, -1));

        FsobreMim.setBackground(new java.awt.Color(250, 250, 250));
        FsobreMim.setColumns(20);
        FsobreMim.setRows(5);
        FsobreMim.setEnabled(false);
        jScrollPane2.setViewportView(FsobreMim);

        jPanel3.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 530, 500, 150));

        txtSobreMim.setText("Sobre mim:");
        jPanel3.add(txtSobreMim, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 510, -1, -1));

        jScrollPane1.setBackground(new java.awt.Color(250, 250, 250));
        jScrollPane1.setBorder(null);

        listaMidia.setBackground(new java.awt.Color(250, 250, 250));
        listaMidia.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        listaMidia.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(listaMidia);

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 300, 680, 410));

        btn_salvar.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        btn_salvar.setText("Salvar");
        btn_salvar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btn_salvar.setContentAreaFilled(false);
        btn_salvar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_salvar.setEnabled(false);
        btn_salvar.setFocusable(false);
        btn_salvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_salvarActionPerformed(evt);
            }
        });
        jPanel3.add(btn_salvar, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 720, 150, 30));

        btn_editar.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        btn_editar.setText("Editar");
        btn_editar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btn_editar.setContentAreaFilled(false);
        btn_editar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_editar.setFocusable(false);
        btn_editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_editarActionPerformed(evt);
            }
        });
        jPanel3.add(btn_editar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 720, 160, 30));

        btn_verDetalhes.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        btn_verDetalhes.setText("Ver Detalhes/Editar");
        btn_verDetalhes.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btn_verDetalhes.setContentAreaFilled(false);
        btn_verDetalhes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_verDetalhes.setEnabled(false);
        btn_verDetalhes.setFocusable(false);
        btn_verDetalhes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_verDetalhesActionPerformed(evt);
            }
        });
        jPanel3.add(btn_verDetalhes, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 720, 190, 30));

        Furl.setBackground(new java.awt.Color(250, 250, 250));
        Furl.setEnabled(false);
        jPanel3.add(Furl, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 480, 500, -1));

        jLabel2.setText("Foto URL:");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 460, -1, -1));

        add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1270, 790));
    }// </editor-fold>//GEN-END:initComponents

    private void btn_cadastroMidiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cadastroMidiaActionPerformed
        FrameApp_home.trocaPanel("CadastroMidia", new CadastroMidia());
    }//GEN-LAST:event_btn_cadastroMidiaActionPerformed

    private void btn_salvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salvarActionPerformed
        try {
            this.Fnome.setEnabled(false);
            this.Femail.setEnabled(false);
            this.Fdata.setEnabled(false);
            this.Fmasculino.setEnabled(false);
            this.Ffeminino.setEnabled(false);
            this.Foutro.setEnabled(false);
            this.FsobreMim.setEnabled(false);
            this.btn_salvar.setEnabled(false);
            this.Furl.setEnabled(false);
            this.btn_editar.setEnabled(true);
            String novoNome, novoEmail, novaFoto;
            int id = userSelecionado.getId();
            char novoGenero = 'N';
            novoNome = Fnome.getText();
            novoEmail = Femail.getText();
            novaFoto = Furl.getText();
            String novaDesc = FsobreMim.getText();
            Date data = new Date();
            if (!Fdata.getText().equals("  /  /    ")) {
                DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
                data = dateFormat.parse(Fdata.getText());
            } else {
                data = null;
            }
            novoGenero = Fmasculino.isSelected() ? 'M' : novoGenero;
            novoGenero = Ffeminino.isSelected() ? 'F' : novoGenero;
            novoGenero = Foutro.isSelected() ? 'O' : novoGenero;
            boolean ok = usuarioControl.uptadeUsuario(novoNome, novoEmail, id, novoGenero, novaDesc, data, novaFoto);
            if (ok == true) {
                this.nomeTxt.setText(novoNome);
                if (userSelecionado.getUrlFoto() == null) {
                    this.fotoPerfil.setText("");
                    this.fotoPerfil.setIcon(fotoVazia);
                } else {
                    URL urlBruto;
                    try {
                        urlBruto = new URL(novaFoto);
                    } catch (MalformedURLException ex) {
                        JOptionPane.showMessageDialog(null, "Erro ao fazer as alterações", "Erro", JOptionPane.ERROR_MESSAGE);
                        return;
                    }
                    ImageIcon fotoP = new ImageIcon(urlBruto);
                    fotoP.setImage(fotoP.getImage().getScaledInstance(
                            128, 128, 100));
                    this.fotoPerfil.setText("");
                    this.fotoPerfil.setIcon(fotoP);
                }
                JOptionPane.showMessageDialog(null, "Alterações salvas", "Salvo", JOptionPane.INFORMATION_MESSAGE);
            } else {
                btn_editarActionPerformed(evt);
                JOptionPane.showMessageDialog(null, "Erro ao fazer as alterações,"
                        + "preencha todos os campos com *", "Não Salvo",
                        JOptionPane.ERROR_MESSAGE);
            }
        } catch (ParseException ex) {
            System.err.println("Erro conversão");
        }
    }//GEN-LAST:event_btn_salvarActionPerformed

    private void btn_editarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_editarActionPerformed
        this.Fnome.setEnabled(true);
        this.Femail.setEnabled(true);
        this.Fdata.setEnabled(true);
        this.Fmasculino.setEnabled(true);
        this.Ffeminino.setEnabled(true);
        this.Foutro.setEnabled(true);
        this.FsobreMim.setEnabled(true);
        this.btn_salvar.setEnabled(true);
        this.Furl.setEnabled(true);
        this.btn_editar.setEnabled(false);
    }//GEN-LAST:event_btn_editarActionPerformed

    private void btn_verDetalhesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_verDetalhesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_verDetalhesActionPerformed

    public String converteDataString(Date data) {
        DateFormat dateformat = new SimpleDateFormat("dd/MM/yyyy");
        String dataFormatada = dateformat.format(data);
        return dataFormatada;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFormattedTextField Fdata;
    private javax.swing.JTextField Femail;
    private javax.swing.JRadioButton Ffeminino;
    private javax.swing.JRadioButton Fmasculino;
    private javax.swing.JTextField Fnome;
    private javax.swing.JRadioButton Foutro;
    private javax.swing.JTextArea FsobreMim;
    private javax.swing.JTextField Furl;
    private javax.swing.JButton btn_cadastroMidia;
    private javax.swing.JButton btn_editar;
    private javax.swing.JButton btn_salvar;
    private javax.swing.JButton btn_verDetalhes;
    private javax.swing.JLabel fotoPerfil;
    private javax.swing.JPanel fundo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JList<String> listaMidia;
    private javax.swing.JLabel midiaTxt;
    private javax.swing.JLabel nomeTxt;
    private javax.swing.ButtonGroup sexoGroup;
    private javax.swing.JLabel txtData;
    private javax.swing.JLabel txtEmail;
    private javax.swing.JLabel txtNome;
    private javax.swing.JLabel txtSobreMim;
    // End of variables declaration//GEN-END:variables
}
