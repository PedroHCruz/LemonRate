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
    
    public ArrayList<String> ListaCategorias(){
        ArrayList<String> Categorias = new ArrayList<>();
        String sql = "SELECT * FROM lemonrate.categorias C ORDER BY nome ASC;";
        
        try(PreparedStatement trans = conexaoBanco.prepareStatement(sql)){
            ResultSet resultadoBD = trans.executeQuery();
            
            while(resultadoBD.next()){
                String categoria = resultadoBD.getString("nome");
                Categorias.add(categoria);
            }
        } catch (SQLException ex){
            ex.printStackTrace();
            return null;
        }
        return Categorias;
    }
    
}