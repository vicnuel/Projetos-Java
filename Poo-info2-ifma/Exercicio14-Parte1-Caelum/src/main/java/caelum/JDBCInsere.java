/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caelum;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Calendar;


/**
 *
 * @author ve495
 */
public class JDBCInsere {
    public static void main(String[] args) {
        try ( Connection con = ConnectionFactory.getConnection()) {
            //criaumpreparedStatement
            String sql= "insert into contatos"+
                    "(nome,email,endereco,dataNascimento)"+
                    "values(?,?,?,?)";
            
            PreparedStatement stmt =con.prepareStatement(sql);
            //preencheosvalores
            stmt.setString(1,"Caelum");
            stmt.setString(2,"contato@caelum.com.br");
            stmt.setString(3,"R.Vergueiro3185cj57");
            stmt.setDate(4,new java.sql.Date(                 
                    Calendar.getInstance().getTimeInMillis()));
            
            //executa
            stmt.execute();
            stmt.close();
            System.out.println("Gravado!");
        } catch (SQLException ex) {
            System.out.println("Erro na conecção: " + ex);
        }
    }
}
