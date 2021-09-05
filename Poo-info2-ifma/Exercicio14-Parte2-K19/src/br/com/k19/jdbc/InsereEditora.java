/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.k19.jdbc;

import java.sql.Connection ;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

/**
 *
 * @author ve495
 */
public class InsereEditora {
    public static void main ( String [] args ) {
        Connection conexao = null;
        PreparedStatement comando = null;
        Scanner entrada = new Scanner (System.in);

        try {
            System.out.println("Abrindo conexão ...");
            conexao = ConnectionFactory.createConnection();
    
            System.out.println("Digite o nome da editora: ") ;
            String nome = entrada.nextLine () ;
            
            System.out.println("Digite o email da editora: ");
            String email = entrada.nextLine();

            String sql = "INSERT INTO Editora (nome , email )" +
            " VALUES ('" + nome + "', '" + email + "')";
           
            comando = conexao.prepareStatement(sql);
            System.out.println("Executando comando ... ");
            comando.execute();
            
            System.out.println("Fechando conexão ...");
            conexao.close();
        } catch ( Exception  e) {
            e.printStackTrace () ;
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
        }
    }
}
