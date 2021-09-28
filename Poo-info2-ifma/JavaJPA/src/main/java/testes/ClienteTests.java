/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testes;

import classes.Cliente;
import dao.ClienteDAO;

/**
 *
 * @author ve495
 */
public class ClienteTests {
    public static void main(String[] args) {
        ClienteDAO cDAO = new ClienteDAO();
        
        Cliente c1 = new Cliente();
        c1.setNome("Fulano");
        c1.setEmail("fulan@fula.com.br");
        
        cDAO.save(c1);
    }
}
