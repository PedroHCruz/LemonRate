/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tools;

import java.net.InetAddress;
import java.net.UnknownHostException;
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
    private static String USER = "aula";
    private static String PASS = "aula";

    public static void getIP() {
        InetAddress addr;
        try {
            addr = InetAddress.getLocalHost();
        } catch (UnknownHostException ex) {
            return;
        }
        String ip = addr.getHostAddress();
        if (ip.contains("10.90")) {
            URL = "jdbc:postgresql://10.90.24.56:5432/aula";
        } else {
            URL = "jdbc:postgresql://200.18.128.56:5432/aula";
        }
    }

    public static Connection getConexaoPostgres() {
        getIP();
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
