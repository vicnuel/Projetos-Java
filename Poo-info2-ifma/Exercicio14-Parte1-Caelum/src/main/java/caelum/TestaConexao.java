/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caelum;

import java.sql.Connection;
import java.sql.SQLException;
/**
 *
 * @author ve495
 */
public class TestaConexao {
    public static void main(String[] args) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        System.out.println("Conexão aberta!");
        connection.close();
    }
    
}
