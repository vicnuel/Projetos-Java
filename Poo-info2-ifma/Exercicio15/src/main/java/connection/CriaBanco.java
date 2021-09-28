/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connection;

import javax.persistence.EntityManager;

/**
 *
 * @author ve495
 */
public class CriaBanco {
    public static void main(String[] args) {
        EntityManager em = new ConnectionFactory().getConnection();
        em.close();
    }
}
