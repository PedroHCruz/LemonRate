/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import model.Usuario;
import tools.FactoryPostgres;

/**
 *
 * @author 0068961
 */
public class MidiaDAO {

    private Connection conexaoBanco;

    public MidiaDAO() {
        this.conexaoBanco = FactoryPostgres.getConexaoPostgres();
    }

    public ArrayList<String> ListaCategorias() {
        ArrayList<String> Categorias = new ArrayList<>();
        String sql = "SELECT * FROM lemonrate.categorias C ORDER BY nome ASC;";

        try (PreparedStatement trans = conexaoBanco.prepareStatement(sql)) {
            ResultSet resultadoBD = trans.executeQuery();

            while (resultadoBD.next()) {
                String categoria = resultadoBD.getString("nome");
                Categorias.add(categoria);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            return null;
        }
        return Categorias;
    }

    public boolean CadastraMidia(String nome, String descricao,
            String plataforma, String criador, Date dataLancamento, int tipo_midia,
            int classificacao, int avaliacao, int id_usuario) {
        String sql = "INSERT INTO lemonrate.midia (nome,descricao,plataforma,"
                + "criador,datalancamento,id_tipo,id_classificacao,avaliacao,"
                + "id_usuario, dataupload)"
                + " VALUES (?,?,?,?,?,?,?,?,?,?);";
        
        
        
        Date dataParaSql = new Date();
        java.sql.Date dataLan = new java.sql.Date(dataLancamento.getTime());
        java.sql.Date data = new java.sql.Date(dataParaSql.getTime());
        try(PreparedStatement trans = conexaoBanco.prepareStatement(sql)){
            trans.setString(1, nome);
            trans.setString(2, descricao);
            trans.setString(3, plataforma);
            trans.setString(4, criador);
            trans.setDate(5, dataLan);
            trans.setInt(6, tipo_midia);
            trans.setInt(7,classificacao);
            trans.setInt(8, avaliacao);
            trans.setInt(9, id_usuario);
            trans.setDate(10, data);
            
            trans.executeUpdate();
            return true;
        } catch (SQLException ex) {
            System.err.println("Erro banco");
            ex.printStackTrace();
            return false;
        }
    }
}
