package view;

import control.MidiaControl;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import javax.swing.JTable;
import javax.swing.table.AbstractTableModel;
import model.Midia;

public class MidiaTableModelPesquisa extends AbstractTableModel {

    private ArrayList<Midia> MidiasUsuario;
    private String nomeColunas[] = {"Usuario", "Nome", "Tipo", "Data Lancamento", "Avaliação", "Data Upload"};

    private MidiaControl midiaControl;
    private JTable TabelaGUI;

    public MidiaTableModelPesquisa(JTable TabelaGUI, String nome_usuario, int id_tipo, int id_usuario) {
        this.midiaControl = new MidiaControl();
        CarregaMidias(nome_usuario, id_tipo, id_usuario);
        this.TabelaGUI = TabelaGUI;

    }

    public void CarregaMidias(String nome_usuario, int id_tipo, int id_usuario) {
        this.MidiasUsuario = new ArrayList<>();
        if (nome_usuario.equalsIgnoreCase("")) {
            if (id_tipo == 0) {
                this.MidiasUsuario = this.midiaControl.ListaTodasMidias();
            } else {
                if(id_tipo == 1){
                    this.MidiasUsuario = this.midiaControl.getFiltroMidia(nome_usuario, id_tipo);
                }
                if(id_tipo == 2){
                    this.MidiasUsuario = this.midiaControl.getFiltroMidia(nome_usuario, id_tipo);
                }
                if(id_tipo == 3){
                    this.MidiasUsuario = this.midiaControl.getFiltroMidia(nome_usuario, id_tipo);
                }
            }
        } else {
            if (id_tipo == 0) {
                this.MidiasUsuario = this.midiaControl.ListaMidiasUsuario(id_usuario);
            }
            if (id_tipo == 1) {
                this.MidiasUsuario = this.midiaControl.getFiltroUsuario(nome_usuario, id_tipo);
            }
            if (id_tipo == 2) {
                this.MidiasUsuario = this.midiaControl.getFiltroUsuario(nome_usuario, id_tipo);
            }
            if (id_tipo == 3) {
                this.MidiasUsuario = this.midiaControl.getFiltroUsuario(nome_usuario, id_tipo);
            }
        }
    }

    @Override
    public int getRowCount() {
        return this.MidiasUsuario.size();
    }

    @Override
    public int getColumnCount() {
        return 6;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Midia midia = this.MidiasUsuario.get(rowIndex);

        switch (columnIndex) {
            case 0:
                String nome = this.midiaControl.getNomeUsuario(midia.getId_usuario());
                return nome;
            case 1:
                return midia.getNome();
            case 2:
                return midia.getTipoMidiaString();
            case 3:
                return midia.getDataLancamento();
            case 4:
                return midia.getAvaliacao();
            case 5:
                return midia.getDataUpload();
            default:
                throw new AssertionError();
        }
    }

    @Override
    public String getColumnName(int column) {
        return nomeColunas[column];
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        switch (columnIndex) {
            case 0:
                return String.class;
            case 1:
                return String.class;
            case 2:
                return String.class;
            case 3:
                return Date.class;
            case 4:
                return Integer.class;
            case 5:
                return Date.class;
            default:
                return Integer.class;
        }
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return false;
    }

}
