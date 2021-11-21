/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contextAttribute;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 *
 * @author wit_w
 */
public class MyServletContextListener implements ServletContextListener{
    
    @Override
    public void contextInitialized(ServletContextEvent sce){
        
        ServletContext sc = sce.getServletContext();
        StudentQueue queue = new StudentQueue();
        sc.setAttribute("studentQueue", queue);
        
        
    }
    
    @Override
    public void contextDestroyed(ServletContextEvent sce){
        throw  new UnsupportedOperationException("Not pupported yet.");
    }

    
    
}
