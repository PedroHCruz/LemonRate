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
    private static String URL = "jdbc:postgresql://10.90.24.56:5432/aula";
    private static String USER = "aula";
    private static String PASS = "aula";

    public static Connection getConexaoPostgres() {
        if (conexaoBD == null) {
            try {
                conexaoBD = DriverManager.getConnection(URL, USER, PASS);
                System.out.println("conectou");
            } catch (SQLException ex) {
                System.err.println("Erro na conexao com o banco");
                ex.printStackTrace();
                return null;
            }
        }
        return conexaoBD;
    }

}
