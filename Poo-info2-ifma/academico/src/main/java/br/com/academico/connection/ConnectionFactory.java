/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.academico.connection;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author victor
 */
public class ConnectionFactory {
    private static final EntityManagerFactory emf = Persistence.createEntityManagerFactory("meuPU");
    
    public EntityManager getConnection(){
        return emf.createEntityManager();
    }
}