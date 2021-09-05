/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.k19.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

/**
 *
 * @author ve495
 */
public class InsereLivro {
    public static void main ( String [] args ) {
        Connection conexao = null;
        PreparedStatement comando = null;
        Scanner entrada = new Scanner (System.in);

        try {
            System.out.println("Abrindo conexão ...");
            conexao = ConnectionFactory.createConnection();
    
            System.out.println("Digite titulo do livro: ") ;
            String titulo = entrada.nextLine () ;
            
            System.out.println("Digite o preço do livro: ");
            double preco = entrada.nextDouble();
            
            System.out.println("Digite o id da editora: ");
            int editora_id = entrada.nextInt();

            String sql = "INSERT INTO Livro (titulo , preco, editora_id )" +
            " VALUES ('" + titulo + "', '" + preco + "', '" + editora_id + "')";
           
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
