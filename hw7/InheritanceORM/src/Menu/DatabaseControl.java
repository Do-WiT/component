/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Menu;

import InheritanceORM.FulltimeEmployee;
import InheritanceORM.ParttimeEmployee;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author wit_w
 */
public class DatabaseControl {
    public static void add(Object object) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("InheritanceORMPU");
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
     
    public static void update(FulltimeEmployee fulltimeEm) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("InheritanceORMPU");
        EntityManager em = emf.createEntityManager();
        FulltimeEmployee emp = em.find(FulltimeEmployee.class, fulltimeEm.getId());
        emp.setName(fulltimeEm.getName());
        emp.setSalary(fulltimeEm.getSalary());
        em.getTransaction().begin();
        try {
            em.persist(emp);
            em.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            em.getTransaction().rollback();
        } finally {
            em.close();
        }
    }
    
    public static void update(ParttimeEmployee parttimeEm) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("InheritanceORMPU");
        EntityManager em = emf.createEntityManager();
        ParttimeEmployee emp = em.find(ParttimeEmployee.class, parttimeEm.getId());
        emp.setName(parttimeEm.getName());
        emp.setHoursWork(parttimeEm.getHoursWork());
        em.getTransaction().begin();
        try {
            em.persist(emp);
            em.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            em.getTransaction().rollback();
        } finally {
            em.close();
        }
    }
    
    public static FulltimeEmployee findFulltimeEmployeeById(Long id) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("InheritanceORMPU");
        EntityManager em = emf.createEntityManager();
        FulltimeEmployee emp = em.find(FulltimeEmployee.class, id);
        em.close();
        return emp;
    }

    public static ParttimeEmployee findParttimeEmployeeById(Long id) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("InheritanceORMPU");
        EntityManager em = emf.createEntityManager();
        ParttimeEmployee emp = em.find(ParttimeEmployee.class, id);
        em.close();
        return emp;
    }
    
    public static void removeFulltimeEmployee(FulltimeEmployee emp) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("InheritanceORMPU");
        EntityManager em = emf.createEntityManager();
        FulltimeEmployee fromDb = em.find(FulltimeEmployee.class, emp.getId());
        em.getTransaction().begin();
        try {
            em.remove(fromDb);
            em.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            em.getTransaction().rollback();
        } finally {
            em.close();
        }
    }
    
    public static void removeParttimeEmployee(ParttimeEmployee emp) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("InheritanceORMPU");
        EntityManager em = emf.createEntityManager();
        ParttimeEmployee fromDb = em.find(ParttimeEmployee.class, emp.getId());
        em.getTransaction().begin();
        try {
            em.remove(fromDb);
            em.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            em.getTransaction().rollback();
        } finally {
            em.close();
        }
    }
    
}
