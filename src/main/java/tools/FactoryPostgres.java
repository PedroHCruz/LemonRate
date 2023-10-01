/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tools;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author l a w t
 */
public class FactoryPostgres {

    private static Connection conexaoBD;
    private static String URL = "";
    private static String USER = "";
    private static String PASS = "";

    public static Connection getConexaoPostgres() {
        if (conexaoBD == null) {
            try {
                conexaoBD = DriverManager.getConnection(URL, USER, PASS);
            } catch (SQLException ex) {
                System.err.println("Erro na conexao com o banco");
                return null;
            }
        }
        return conexaoBD;
    }

}
