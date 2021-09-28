/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;
import connection.ConnectionFactory;
import java.util.List;
import javax.persistence.EntityManager;

/**
 *
 * @author ve495
 * @param <T>
 */
public class DAO<T>{
    private final Class<T> classe;
    
    /**
     *
     * @param classe
     */
    public DAO (Class<T> classe){
        this.classe = classe;
    }
    
    /**
     *
     * @param t
     */
    public void save(T t){
         EntityManager em = new ConnectionFactory().getConnection();
         try {
            em.getTransaction().begin();
            
            em.persist(t);
            em.getTransaction().commit();
        } catch (Exception e) {
             System.out.println(e);
            em.getTransaction().rollback();
        }finally{
            em.close();
        }
        
    }
    public void alter (T t){
        EntityManager em = new ConnectionFactory().getConnection();
        try {
           em.getTransaction().begin();
            
           em.merge(t);
           em.getTransaction().commit();
        }catch (Exception e) {
            System.out.println(e);
            em.getTransaction().rollback();
        }finally{
            em.close();
        }
    }
     
    public T findByID (long id){
        EntityManager em = new ConnectionFactory().getConnection();
        T t = null;
        
        try {
           t = em.find(classe, id);
           
        }catch (Exception e) {
            System.out.println(e);
        }finally{
            em.close();
        }
        return t;
    }
    public List<T> findAll(){
        EntityManager em = new ConnectionFactory().getConnection();
        
        List<T> t = null;
        
        try {
            
            t = em.createQuery(String.format("from %s c", this.classe.getName())).getResultList();
            
        } catch (Exception e) {
            System.out.println(e);
        }finally{
            em.close();
        }
        
        return t;
    }
    public void remove(Integer id){
        EntityManager em = new ConnectionFactory().getConnection();
        T t = null;
        
        try {
            t = em.find(classe, id);
            
            em.getTransaction().begin();
            em.remove(t);
            em.getTransaction().commit();

        } catch (Exception e) {
            System.out.println(e);
        }finally{
            em.close();
        }
   
    }
}
