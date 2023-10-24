/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
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

    public boolean cadastraUsuario(Usuario novoUsuario) {
        String sql = "INSERT INTO lemonrate.usuario(nome, email, senha) VALUES(?,?,?);";

        try ( PreparedStatement trans = this.conexaoBanco.prepareStatement(sql)) {
            trans.setString(1, novoUsuario.getNome());
            trans.setString(2, novoUsuario.getEmail());
            trans.setString(3, novoUsuario.getSenha());
            trans.executeUpdate();
            return true;
        } catch (SQLException ex) {
            System.err.println("Erro ao cadastrar!");
            return false;
        }
        }

    public boolean logaUsuario(String email, String senha) {
        String sql = "SELECT email,senha FROM lemonrate.usuario WHERE email = '" + email + "' AND senha = '" + senha + "';";
        try ( PreparedStatement trans = this.conexaoBanco.prepareStatement(sql)) {
            ResultSet resultadoBD = trans.executeQuery();

            if (resultadoBD.next()) {
                return true;
            } else {

                return false;
            }
        } catch (SQLException ex) {
            System.err.println("Erro ao logar");
            return false;
        }
        }


    public Usuario getUsuario(String email, String senha) {
        String sql = "SELECT * FROM lemonrate.usuario WHERE email = '" + email + "' AND senha = '" + senha + "';";
        try ( PreparedStatement trans = this.conexaoBanco.prepareStatement(sql)) {
            ResultSet resultadoBD = trans.executeQuery();

            if (resultadoBD.next()) {
                String nome = resultadoBD.getString("nome");
                int id = resultadoBD.getInt("id");
                String desc = resultadoBD.getString("sobremim");
                String genero = "";
                String url = resultadoBD.getString("urlfoto");
                genero = resultadoBD.getString("genero");
                char gen = genero.charAt(0);
                Date data = resultadoBD.getDate("datanascimento");
                Usuario usuarioSelecionado = new Usuario(nome, email, senha);
                usuarioSelecionado.setId(id);
                usuarioSelecionado.setDescricao(desc);
                usuarioSelecionado.setNascimento(data);
                usuarioSelecionado.setGenero(gen);
                usuarioSelecionado.setUrlFoto(url);
                
                return usuarioSelecionado;
            } else {
                
                return null;
            }
        } catch (SQLException ex) {
            
            return null;
        }
    }
    public boolean updateUsuario(int id, String nome, Date data, char genero, String email, String descricao, String url){
        java.sql.Date dataSql = new java.sql.Date(data.getTime());
        String sql = "UPDATE lemonrate.usuario SET "
                + "nome = ?, "
                + "email = ?, "
                + "genero = ?, "
                + "sobremim = ?,"
                + "datanascimento = ?,"
                + "urlfoto = ?"
                + "WHERE id = " + id;
        try ( PreparedStatement trans = this.conexaoBanco.prepareStatement(sql)){
            trans.setString(1, nome);
            trans.setString(2, email);
            trans.setString(3, String.valueOf(genero));
            trans.setString(4, descricao);
            trans.setDate(5, dataSql);
            trans.setString(6, url);
            trans.executeUpdate();
            return true;
        } catch (SQLException ex){
            return false;
        }
    }
    
    public boolean verificaEmail(String email){
        String sql = "SELECT * FROM lemonrate.usuario WHERE email = '" + email + "';";
        try ( PreparedStatement trans = this.conexaoBanco.prepareStatement(sql)) {
            ResultSet resultadoBD = trans.executeQuery();
            if(resultadoBD.next()) {
                return false;
            } else {
                return true;
            }
        } catch (SQLException ex){
            return false;
        }
    }
}
