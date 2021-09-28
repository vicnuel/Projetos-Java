/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;
import classes.Categoria;
/*

import connection.ConnectionFactory;
import java.util.List;
import javax.persistence.EntityManager;*/
/**
 *
 * @author ve495
 */
public class CategoriaDAO extends DAO{

    public CategoriaDAO() {
        super(Categoria.class);
    }
    
    /*
    public Categoria save (Categoria categoria){
        EntityManager em = new ConnectionFactory().getConnection();
        
        try {
            em.getTransaction().begin();
            if(categoria.getId() == null){
               em.persist(categoria);
            }
            else{
                em.merge(categoria);
            }
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
        }finally{
            em.close();
        }
        return categoria;
    }
    
    public Categoria findByID (Integer id){
        EntityManager em = new ConnectionFactory().getConnection();
        Categoria categoria = null;
        
        try {
            categoria = em.find(Categoria.class, id);
        } catch (Exception e) {
            System.out.println(e);
        }finally{
            em.close();
        }
        return categoria;
    }
    
    public List<Categoria> findAll(){
        EntityManager em = new ConnectionFactory().getConnection();
        
        List<Categoria> categoria = null;
        
        try {
            
            categoria = em.createQuery("from Categoria c").getResultList();
            
        } catch (Exception e) {
            System.out.println(e);
        }finally{
            em.close();
        }
        
        return categoria;
    }
    
    public Categoria remove(Integer id){
        EntityManager em = new ConnectionFactory().getConnection();
        Categoria categoria = null;
        
        try {
            categoria = em.find(Categoria.class, id);
            
            em.getTransaction().begin();
            em.remove(categoria);
            em.getTransaction().commit();
            
        } catch (Exception e) {
            System.out.println(e);
        }finally{
            em.close();
        }
        return categoria;
    }
*/
}
