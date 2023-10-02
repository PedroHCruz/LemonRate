/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import model.Usuario;
import tools.FactoryPostgres;

/**
 *
 * @author 0068961
 */
public class UsuarioDAO {
    private Connection conexaoBanco;

    public UsuarioDAO() {
        this.conexaoBanco = FactoryPostgres.getConexaoPostgres();
    }
    
    public boolean cadastraUsuario(Usuario novoUsuario){
        String sql = "INSERT INTO usuario(nome, email, senha) VALUES(?,?,?);";
        
        try(PreparedStatement trans = this.conexaoBanco.prepareStatement(sql)){
            trans.setString(1, novoUsuario.getNome());
            trans.setString(2, novoUsuario.getEmail());
            trans.setString(3, novoUsuario.getSenha());
            trans.executeUpdate();
            return true;
        } catch (SQLException ex){
            System.err.println("Erro ao cadastrar!");
            return false;
        }
    }
}