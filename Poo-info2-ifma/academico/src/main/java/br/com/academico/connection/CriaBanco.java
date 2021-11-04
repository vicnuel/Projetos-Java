/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.academico.connection;
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