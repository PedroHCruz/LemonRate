/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Date;

public class Midia {

    private String nome;
    private String descricao;
    private String genero;
    private String plataforma;
    private String criador;
    private Date dataLancamento;
    private Date dataUpload;
    private int tipo_midia;
    private int classificacao;
    private int avaliacao;
    private int id_usuario;

    public Midia(String nome, String descricao, String genero, String plataforma, String criador, Date dataLancamento, int tipo_midia, int classificacao, int avaliacao, int id_usuario) {
        this.nome = nome;
        this.descricao = descricao;
        this.genero = genero;
        this.plataforma = plataforma;
        this.criador = criador;
        this.dataLancamento = dataLancamento;
        this.tipo_midia = tipo_midia;
        this.classificacao = classificacao;
        this.avaliacao = avaliacao;
        this.dataUpload = new Date();
        this.id_usuario = id_usuario;
    }

    public Midia() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }

    public String getCriador() {
        return criador;
    }

    public void setCriador(String criador) {
        this.criador = criador;
    }

    public Date getDataLancamento() {
        return dataLancamento;
    }

    public void setDataLancamento(Date dataLancamento) {
        this.dataLancamento = dataLancamento;
    }

    public Date getDataUpload() {
        return dataUpload;
    }

    public void setDataUpload(Date dataUpload) {
        this.dataUpload = dataUpload;
    }

    public int getTipo_midia() {
        return tipo_midia;
    }

    public void setTipo_midia(int tipo_midia) {
        this.tipo_midia = tipo_midia;
    }

    public int getClassificacao() {
        return classificacao;
    }

    public void setClassificacao(int classificacao) {
        this.classificacao = classificacao;
    }

    public int getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(int avaliacao) {
        this.avaliacao = avaliacao;
    }

    public int getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    @Override
    public String toString() {
        String tipo = "";
        switch (tipo_midia) {
            case 1:
                tipo = "Filme";
                break;
            case 2:
                tipo = "Série";
                break;
            case 3:
                tipo = "Livro";
                break;

        }
        return nome + " | " + tipo + " | " + dataUpload;
    }

    public String getTipoMidiaString() {
        String tipo = "";
        switch (tipo_midia) {
            case 1:
                tipo = "Filme";
                break;
            case 2:
                tipo = "Série";
                break;
            case 3:
                tipo = "Livro";
                break;

        }
        return tipo;

    }

}
