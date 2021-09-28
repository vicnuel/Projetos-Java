/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;
import classes.Contato;
import connection.ConnectionFactory;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 *
 * @author ve495
 */
public class ContatoDAO extends DAO{

    public ContatoDAO() {
        super(Contato.class);
    }
    
    public List<Contato> findByName (String nome){
        EntityManager em = new ConnectionFactory().getConnection();
        List<Contato> contatos = null;
        
        try {
            Query query = em.createQuery("select c from Contato c where c.nome like :nome");
            query.setParameter("nome", "%" + nome+ "%");
            contatos = query.getResultList();
        }catch (Exception e) {
            System.out.println(e);
        }finally{
            em.close();
        }
        return contatos;
    }
    
    @Override
    public List<Contato> findAll(){
        EntityManager em = new ConnectionFactory().getConnection();
        
        List<Contato> contatos = null;
        
        try {
            
            contatos = em.createQuery("from Contato c order by c.nome").getResultList();
            
        } catch (Exception e) {
            System.out.println(e);
        }finally{
            em.close();
        }
        
        return contatos;
    }
    
}
