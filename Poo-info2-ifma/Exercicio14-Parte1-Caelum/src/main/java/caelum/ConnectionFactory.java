/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caelum;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
/**
 *
 * @author ve495
 */
public class ConnectionFactory {
    //private static final String DRIVER = "com.mysql.cj.jdbc.Drive";
    private static final String URL = "jdbc:mysql://localhost:3306/bdteste";
    private static final String USER = "root";
    private static final String PASS = "Vic@05My";
    
    public static Connection getConnection() {
        try {
            //Class.forName(DRIVER);
            return DriverManager.getConnection(URL, USER, PASS);
        } catch (SQLException ex) {
            throw new RuntimeException("Erro na conecção: ", ex);
        }

    }
}