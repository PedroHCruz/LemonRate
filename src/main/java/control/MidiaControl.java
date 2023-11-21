/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

import java.util.ArrayList;

/**
 *
 * @author 0068961
 */
public class MidiaControl {

    private MidiaControl dao;

    public MidiaControl() {
        this.dao = new MidiaControl();
    }
    
    public ArrayList<String> ListaCategorias(){
        return this.dao.ListaCategorias();
    }
}
