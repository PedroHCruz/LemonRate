/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

import dao.UsuarioDAO;
import java.util.regex.*;
import javax.swing.JOptionPane;
import model.Usuario;

public class UsuarioControl {
    private UsuarioDAO dao;

    public UsuarioControl() {
        this.dao = new UsuarioDAO();
    }
    
    public boolean cadastraUsuario(String nome, String email, String senha){
        if(nome.isEmpty() || nome.length() < 3 || nome.equalsIgnoreCase("seunome")){
            JOptionPane.showMessageDialog(null, "O nome deve conter no mínimo 3 letras!", "Erro", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        if(email.isEmpty() || !email.contains("@") || !email.contains(".com") || email.equalsIgnoreCase("seuemail@gmail.com")){
            JOptionPane.showMessageDialog(null, "Insira um email válido!", "Erro", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        if(senha.isEmpty() || senha.length() < 8 || senha.equalsIgnoreCase("suasenha") ||
                !Pattern.compile("[A-Z]").matcher(senha).find() ||
                !Pattern.compile("[a-z]").matcher(senha).find() ||
                !Pattern.compile("[0-9]").matcher(senha).find() ||
                !Pattern.compile("[A-Za-z]").matcher(senha).find() ||
                !Pattern.compile("[^a-zA-Z0-9\\s]").matcher(senha).find()){
            JOptionPane.showMessageDialog(null, "Sua senha deve conter 8 caracteres, incluindo letra maiúscula e minúscula, número, e um caracter especial!", "Erro", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        Usuario novoUsuario = new Usuario(nome, email, senha);
        return this.dao.cadastraUsuario(novoUsuario);
    }
    public boolean logaUsuario(String email, String senha){
        if(!email.equalsIgnoreCase("seuemail@gmail.com") && !senha.equalsIgnoreCase("suasenha")){
        if(email.isEmpty()){
            JOptionPane.showMessageDialog(null, "Insira um email válido!", "Erro", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        if(senha.isEmpty()){
            JOptionPane.showMessageDialog(null, "Sua senha deve conter no minimo 8 de tamanho, letra maiúscula e minúscula, número, e um caracter especial!", "Erro", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        return this.dao.logaUsuario(email, senha);
        } else {
            JOptionPane.showMessageDialog(null, "Preencha todos os campos!", "ERROR", JOptionPane.INFORMATION_MESSAGE);
        }
        return false;
    }
    
}
