/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.k19.jdbc;

import java.sql.Connection ;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.Scanner;


/**
 *
 * @author ve495
 */
public class ListaEditoras {
    public static void main ( String [] args ) {
        Connection conexao = null;
        PreparedStatement comando = null;
        ResultSet resultado = null;
        Scanner entrada = new Scanner (System.in);

        try {
            System.out.println("Abrindo conexão ...");
            conexao = ConnectionFactory.createConnection();
    
            String sql = "SELECT * FROM Editora;";
            comando = conexao.prepareStatement(sql);
            System.out.println("Executando comando ... ") ;
            resultado = comando.executeQuery() ;
            
            System.out.println("Resultados encontrados:\n") ;
            while ( resultado.next()) {
                System.out.printf ("%d : %s - %s\n", resultado.getInt("id"), resultado.getString("nome"),
                        resultado.getString("email"));
            }

            System.out.println("\nFechando conexão...") ;
            
        } catch ( Exception  e) {
            e.printStackTrace() ;
        } finally{
            if(conexao != null){
                try {
                    conexao.close();
                } catch (SQLException ex) {
                System.out.println("Erro ao fechar conexão: " + ex);
                }
            }
            if(comando != null){
                try {
                    comando.close();
                } catch (SQLException ex) {
                    System.err.println("Erro: " + ex);
                }
            }
            if(resultado != null){
                try {
                    resultado.close();
                } catch (SQLException ex) {
                    System.err.println("Erro: " + ex);
                }
            }
        }
    }
}
