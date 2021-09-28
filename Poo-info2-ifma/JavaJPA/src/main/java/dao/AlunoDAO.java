/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import classesCurso.Aluno;
import connection.ConnectionFactory;
import java.util.Date;
import javax.persistence.EntityManager;

/**
 *
 * @author ve495
 */
public class AlunoDAO extends DAO{

    public AlunoDAO() {
        super(Aluno.class);
    }
    
    public void save(Aluno aluno){
         EntityManager em = new ConnectionFactory().getConnection();
         try {
            em.getTransaction().begin();
            if (aluno.getDtNacimento() == null) {
                aluno.setDtNacimento(new Date());
            }
            em.persist(aluno);
            em.getTransaction().commit();
        } catch (Exception e) {
             System.out.println(e);
            em.getTransaction().rollback();
        }finally{
            em.close();
        }
        
    } 
}
