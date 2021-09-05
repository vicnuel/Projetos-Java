/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.k19.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author ve495
 */
public class ConnectionFactory {
    public static Connection createConnection () {
        String stringDeConexao = "jdbc:mysql://localhost:3306/livraria";
        String usuario = "root";
        String senha = "Vic@05My";
        
        Connection conexao = null ;
        
        try {
            conexao = DriverManager.getConnection(stringDeConexao, usuario, senha) ;
        } catch ( SQLException e ) {
            e.printStackTrace () ;
        }
        return conexao ;
    }
}
