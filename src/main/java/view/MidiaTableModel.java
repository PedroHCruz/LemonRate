package view;

import control.MidiaControl;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import javax.swing.JTable;
import javax.swing.table.AbstractTableModel;
import model.Midia;

public class MidiaTableModel extends AbstractTableModel {

    private ArrayList<Midia> MidiasUsuario;
    private String nomeColunas[] = {"Nome", "Tipo", "Data Lancamento", "Avaliação", "Data Upload"};

    private MidiaControl midiaControl;
    private JTable TabelaGUI;

    public MidiaTableModel(JTable TabelaGUI, int id_usuario) {
        this.midiaControl = new MidiaControl();
        CarregaMidias(id_usuario);
        this.TabelaGUI = TabelaGUI;
    }
    

    public void CarregaMidias(int id_usuario) {
        this.MidiasUsuario = new ArrayList<>();
        this.MidiasUsuario = this.midiaControl.ListaMidiasUsuario(id_usuario);
        
    }

    @Override
    public int getRowCount() {
        return this.MidiasUsuario.size();
    }

    @Override
    public int getColumnCount() {
        return 5;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Midia midia = this.MidiasUsuario.get(rowIndex);

        switch (columnIndex) {
            case 0:
                return midia.getNome();
            case 1:
                return midia.getTipoMidiaString();
            case 2:
                return midia.getDataLancamento();
            case 3:
                return midia.getAvaliacao();
            case 4:
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
        switch(columnIndex){
            case 0:
                return String.class;
            case 1:
                return String.class;
            case 2:
                return Date.class;
            case 3:
                return Integer.class;
            case 4:
                return Date.class;
            default:
                return Integer.class;
        }
    }
    
    
    
    

}
