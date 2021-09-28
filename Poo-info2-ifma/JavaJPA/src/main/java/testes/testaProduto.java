/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testes;

import classes.Categoria;
import classes.Produto;
import dao.ProdutoDAO;

/**
 *
 * @author ve495
 */
public class testaProduto {
    
    public static void main(String[] args) {
        ProdutoDAO dao = new ProdutoDAO();
        
        Produto p1 = (Produto) dao.findByID(3);
        
        System.out.println("descrição: " + p1.getDescricao() + "\n" +
                "Quantidade: " + p1.getQtd() + "\n" +
                "Valor: " + p1.getValor() + "\n" +
                "Categoria: " + p1.getCategoria().getDescricao());
       
        
        
        
        
        //Produto produto2 = new Produto();
        
    }
    
    
    
}
