/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.k19.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

/**
 *
 * @author ve495
 */
public class ListaLivros {
    public static void main ( String [] args ) {
        Connection conexao = null;
        PreparedStatement comando = null;
        ResultSet resultado = null;
        Scanner entrada = new Scanner (System.in);

        try {
            System.out.println("Abrindo conexão ...");
            conexao = ConnectionFactory.createConnection();
    
            String sql = "select l.id, l.titulo, l.preco, e.nome from livro as l join editora as e on l.editora_id = e.id order by l.id;";
            comando = conexao.prepareStatement(sql);
            System.out.println("Executando comando ... ") ;
            resultado = comando.executeQuery() ;
            
            System.out.println("Resultados encontrados:\n") ;
            while ( resultado.next()) {
                //não vou usar o %f para o preço, pois o intuito é apenas mostra o valor do livro, e não definir esse valor n em uma variavel floot o double.
                //Caso seja colocado %f para preço será necessario formatar o numero, pois um número double tem varios Zeros depois da virgula(ou ponto).
                System.out.printf ("%d : %s - R$ %s, %s\n", resultado.getInt("id"), resultado.getString("titulo"), resultado.getString("preco"),
                        resultado.getString("nome"));
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
