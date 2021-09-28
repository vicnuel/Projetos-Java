/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testes;

import classes.Categoria;
import dao.*;

/**
 *
 * @author ve495
 */
public class CategoriaTests {
    public static void main(String[] args) {
        /*Categoria c = new Categoria();
        c.setId(2);
        c.setDescricao("Salgados");
        */
        
        
        
        /*CategoriaDAO dao = new CategoriaDAO();
        //dao.remove(2);
        for (Categoria c: dao.findAll()) {
            System.out.println("Descrição: " + c.getDescricao());
        }*/
        
        DAO cat = new DAO(Categoria.class);
        
        Categoria c = new Categoria();
        
        c.setDescricao("Alimentos");
        cat.save(c);
        
        Categoria c1 = new Categoria();
        c1.setDescricao("Bebidas");
        cat.save(c1);

        
       
    }
}
