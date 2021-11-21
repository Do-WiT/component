/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentservice;

import entity.Student;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author wit_w
 */
public class DatabaseControl {

    EntityManagerFactory emf = Persistence.createEntityManagerFactory("StudentPU");

    
    public static void persist(Object object) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("StudentPU");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        try {
            em.persist(object);
            em.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            em.getTransaction().rollback();
        } finally {
            em.close();
        }
    }
    
        public static void update(Object object) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("StudentPU");
        EntityManager em = emf.createEntityManager();
        
        Student new_std = ((Student)object);
        
        Student std = em.find(new_std.getClass(), new_std.getId());
        std.setName(new_std.getName());
        std.setGpa(new_std.getGpa());
        em.getTransaction().begin();
        
        try {
            em.persist(std);
            em.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            em.getTransaction().rollback();
        } finally {
            em.close();
        }
    }
        
    public static void remove(Object object) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("StudentPU");
        EntityManager em = emf.createEntityManager();
        Student new_std = ((Student)object);
        Student std = em.find(new_std.getClass(), new_std.getId());
        em.getTransaction().begin();
        try {
            em.remove(std);
            em.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            em.getTransaction().rollback();
        } finally {
            em.close();
        }
    }
    
    
}
