/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

import dao.MidiaDAO;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import model.Midia;

/**
 *
 * @author 0068961
 */
public class MidiaControl {

    private MidiaDAO dao;

    public MidiaControl() {
        this.dao = new MidiaDAO();
    }

    public ArrayList<String> ListaCategorias() {
        return this.dao.ListaCategorias();
    }

    public boolean CadastraMidia(String nome, String descricao,
            String plataforma, String criador, Date dataLancamento, int tipo_midia,
            int classificacao, int avaliacao, int id_usuario) {

        if (nome.equals("") || descricao.equals("")) {
            JOptionPane.showMessageDialog(null, "Preencha todos os campos obrigatorios (*)!");
            return false;
        }

        return this.dao.CadastraMidia(nome, descricao, plataforma, criador, dataLancamento, tipo_midia, classificacao, avaliacao, id_usuario);

    }
    
    public int IdGenero(String genero){
        return this.dao.IdGenero(genero);
    }
    
    public int IdMidia(String nome){
        return this.dao.IdMidia(nome);
    }
    
    public boolean CadastraMidiaCategoria(int id_midia, int id_categoria){
        return this.dao.CadastraCategoriaMidia(id_midia, id_categoria);
        
    }
    
    public ArrayList<Midia> ListaMidiasUsuario(int id_usuario){
        return this.dao.ListaMidiasUsuario(id_usuario);
        
    }
    
    public ArrayList<Midia> ListaTodasMidias(){
        return this.dao.ListaTodasMidias();
    }
    
    public boolean AtualizaMidia(Midia novaMidia, String nome){
        return this.dao.AtualizaMidia(novaMidia, nome);
    }
    public String getNomeUsuario(int id_usuario){
        return this.dao.getNomeUsuario(id_usuario);
    }
}
